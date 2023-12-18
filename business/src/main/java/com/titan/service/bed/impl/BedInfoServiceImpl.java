package com.titan.service.bed.impl;

import com.alibaba.nacos.shaded.org.checkerframework.checker.units.qual.A;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.mapper.bed.BedInfoMapper;
import com.titan.mapper.nurse.NurseInfoMapper;
import com.titan.mapper.ward.WardInfoMapper;
import com.titan.pojo.entity.BedInfoEntity;
import com.titan.pojo.entity.NurseInfoEntity;
import com.titan.pojo.entity.WardInfoEntity;
import com.titan.pojo.vo.BedInfoVo;
import com.titan.service.bed.BedInfoIService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
@Service
public class BedInfoServiceImpl extends ServiceImpl<BedInfoMapper, BedInfoEntity> implements BedInfoIService {

    @Autowired
    private BedInfoMapper bedInfoMapper;

    @Autowired
    private NurseInfoMapper nurseInfoMapper;

    @Autowired
    private WardInfoMapper wardInfoMapper;

    @Override
    public Map<String, List<String>> nurseAndAddress(String department) {
        //查询科室所属下的护士信息列表
        QueryWrapper<NurseInfoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("department", department);
        List<NurseInfoEntity> nurses = nurseInfoMapper.selectList(queryWrapper);
        //封装护士信息名字
        List<String> nurseList = new ArrayList<>();
        nurses.forEach(item->{
            nurseList.add(item.getNurseName());
        });

        //查询科室所属下的病房信息
        QueryWrapper<WardInfoEntity> query = new QueryWrapper();
        query.eq("department", department);
        List<WardInfoEntity> wards = wardInfoMapper.selectList(query);
        //封装地址信息
        List<String> addressList = new ArrayList<>();
        wards.forEach(item->{
            addressList.add(item.getAddress());
        });
        //封装病房地址与护士姓名集合
        Map<String, List<String>> map = new HashMap<>();
        map.put("nurse", nurseList);
        map.put("address", addressList);
        return map;
    }

    @Override
    public void insert(BedInfoEntity bedInfoDo) {
        //根据护士名查询护士联系方式
        String managerNurse = bedInfoDo.getManagerNurse();
        QueryWrapper<NurseInfoEntity> query = new QueryWrapper<>();
        query.eq("nurse_name", managerNurse);
        NurseInfoEntity nurse = nurseInfoMapper.selectOne(query);
        //封装新增信息
        bedInfoDo.setPhoneNumber(nurse.getPhoneNumber());
        //新增病床信息
        bedInfoMapper.insert(bedInfoDo);
    }

    @Override
    public Page<BedInfoEntity> page(BedInfoVo bedInfoVo) {
        //构建分页信息
        Page<BedInfoEntity> page = new Page<>(bedInfoVo.getPage(), bedInfoVo.getSize());
        //构建查询条件
        QueryWrapper<BedInfoEntity> query = new QueryWrapper<>();
        if (!StringUtils.isBlank(bedInfoVo.getDepartment())) {
            query.eq("department", bedInfoVo.getDepartment());
        }
        if (!StringUtils.isBlank(bedInfoVo.getManagerNurse())) {
            query.eq("manager_nurse", bedInfoVo.getManagerNurse());
        }
        Page<BedInfoEntity> bedInfoDoPage = bedInfoMapper.selectPage(page, query);
        return bedInfoDoPage;
    }
}
