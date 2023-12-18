package com.titan.service.doctor.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.mapper.doctor.DoctorInfoMapper;
import com.titan.pojo.entity.DoctorInfoEntity;
import com.titan.pojo.vo.DoctorInfoVo;
import com.titan.pojo.vo.PageVo;
import com.titan.service.doctor.DoctorInfoIService;
import com.titan.utils.Result;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * 醫生信息服務層實現類
 * @author yigeoooo
 * @since date 2023/12/16
 */
@Service
public class DoctorInfoServiceImpl extends ServiceImpl<DoctorInfoMapper, DoctorInfoEntity> implements DoctorInfoIService {

    @Autowired
    private DoctorInfoMapper doctorInfoMapper;

    @Override
    public void add(DoctorInfoEntity doctorInfoEntity) {
        UUID uuid = UUID.randomUUID();
        doctorInfoEntity.setDoctorId(uuid.toString());
        doctorInfoMapper.insert(doctorInfoEntity);
    }

    @Override
    public Page<DoctorInfoEntity> page(DoctorInfoVo doctorInfoVo) {
        Page<DoctorInfoEntity> page = new Page<>(doctorInfoVo.getPage(), doctorInfoVo.getSize());
        DoctorInfoEntity doctorInfoDo = new DoctorInfoEntity();
        doctorInfoDo.setDoctorName(doctorInfoVo.getDoctorName());
        doctorInfoDo.setDepartment(doctorInfoVo.getDepartment());
        //判斷查詢信息
        QueryWrapper queryWrapper = new QueryWrapper();
        //判斷姓名
        if (!StringUtils.isBlank(doctorInfoDo.getDoctorName())){
            queryWrapper.eq("doctor_name", doctorInfoDo.getDoctorName());
        }
        //科室判斷
        if (!StringUtils.isBlank(doctorInfoDo.getDepartment())){
            queryWrapper.eq("department", doctorInfoDo.getDepartment());
        }
        return doctorInfoMapper.selectPage(page, queryWrapper);
    }

    @Override
    public String sexRatio() {
        //構建條件
        QueryWrapper<DoctorInfoEntity> query = new QueryWrapper<>();
        query.eq("doctor_gender", "男");

        QueryWrapper<DoctorInfoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("doctor_gender", "女");

        Long manCount = doctorInfoMapper.selectCount(query);
        Long womanCount = doctorInfoMapper.selectCount(queryWrapper);

        String str = manCount.toString() + "/" + womanCount.toString();
        return str;
    }

}
