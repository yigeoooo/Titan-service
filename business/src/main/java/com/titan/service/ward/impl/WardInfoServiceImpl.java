package com.titan.service.ward.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.mapper.doctor.DoctorInfoMapper;
import com.titan.mapper.ward.WardInfoMapper;
import com.titan.pojo.entity.DoctorInfoEntity;
import com.titan.pojo.entity.WardInfoEntity;
import com.titan.pojo.vo.WardInfoVo;
import com.titan.service.ward.WardInfoIService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
@Service
public class WardInfoServiceImpl extends ServiceImpl<WardInfoMapper, WardInfoEntity> implements WardInfoIService {

    @Autowired
    private WardInfoMapper wardInfoMapper;

    @Autowired
    private DoctorInfoMapper doctorInfoMapper;

    @Override
    public void insert(WardInfoEntity wardInfoDo) {
        //根据医生姓名查询医生联系电话
        String doctor = wardInfoDo.getManager();
        QueryWrapper<DoctorInfoEntity> query = new QueryWrapper<>();
        query.eq("doctor_name", doctor);
        DoctorInfoEntity doctorInfoDo = doctorInfoMapper.selectOne(query);
        String phoneNumber = doctorInfoDo.getPhoneNumber();
        wardInfoDo.setPhoneNumber(phoneNumber);
        //插入病房信息
        wardInfoMapper.insert(wardInfoDo);
    }

    @Override
    public Page<WardInfoEntity> page(WardInfoVo wardInfoVo) {
        //构建分页条件
        Page<WardInfoEntity> page = new Page<>(wardInfoVo.getPage(), wardInfoVo.getSize());
        //条件判断
        QueryWrapper<WardInfoEntity> query = new QueryWrapper<>();
        if (!StringUtils.isBlank(wardInfoVo.getDepartment())) {
            query.eq("department", wardInfoVo.getDepartment());
        }
        if (!StringUtils.isBlank(wardInfoVo.getManager())) {
            query.eq("manager", wardInfoVo.getManager());
        }
        Page<WardInfoEntity> wardInfoDoPage = wardInfoMapper.selectPage(page, query);
        return wardInfoDoPage;
    }

    @Override
    public void update(WardInfoEntity wardInfoDo) {
        //根据医生姓名查询医生电话
        String doctor = wardInfoDo.getManager();
        //创建条件构造器
        QueryWrapper<DoctorInfoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("doctor_name", doctor);
        DoctorInfoEntity doctorInfoDo = doctorInfoMapper.selectOne(queryWrapper);
        //获取更新后的医生电话号码
        String phoneNumber = doctorInfoDo.getPhoneNumber();
        wardInfoDo.setPhoneNumber(phoneNumber);
        //更新时间
        wardInfoDo.setUpdateTime(LocalDate.now());
        //更新病房信息
        wardInfoMapper.updateById(wardInfoDo);
    }
}
