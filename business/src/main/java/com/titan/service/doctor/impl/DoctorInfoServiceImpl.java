package com.titan.service.doctor.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.mapper.doctor.DoctorInfoMapper;
import com.titan.pojo.entity.DoctorInfoEntity;
import com.titan.service.doctor.DoctorInfoIService;
import com.titan.utils.Result;
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
}
