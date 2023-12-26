package com.titan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.constant.CommonConstant;
import com.titan.constant.MessageConstant;
import com.titan.mapper.DoctorInfoMapper;
import com.titan.mapper.DoctorMapper;
import com.titan.pojo.entity.DoctorEntity;
import com.titan.pojo.entity.DoctorInfoEntity;
import com.titan.pojo.vo.BaseVo;
import com.titan.service.DoctorIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 医生登录信息服务层
 * @author yigeoooo
 * @since date 2023/12/20
 */
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, DoctorEntity> implements DoctorIService {

    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private DoctorInfoMapper doctorInfoMapper;

    @Override
    @Transactional(rollbackFor=RuntimeException.class)
    public void reset(BaseVo baseVo) {
        //判断用户名是否中存在
        String doctorId = baseVo.getOldId();
        String id = baseVo.getId();
        QueryWrapper<DoctorEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(CommonConstant.Doctor.DOCTOR_ID, doctorId);
        Long count = doctorMapper.selectCount(queryWrapper);
        if (MessageConstant.ZERO == count) {
            //不存在则插入密码信息
            DoctorEntity doctorEntity = new DoctorEntity();
            doctorEntity.setDoctorId(baseVo.getId());
            doctorEntity.setPassword(baseVo.getPassword());
            doctorMapper.insert(doctorEntity);
        } else {
            //更新密码信息
            DoctorEntity doctorEntity = new DoctorEntity();
            doctorEntity.setDoctorId(baseVo.getId());
            doctorEntity.setPassword(baseVo.getPassword());
            doctorMapper.update(doctorEntity, queryWrapper);
            //更新doctorInfo表信息
            QueryWrapper<DoctorInfoEntity> query = new QueryWrapper<>();
            query.eq(CommonConstant.Doctor.DOCTOR_ID, doctorId);
            DoctorInfoEntity doctorInfoEntity = new DoctorInfoEntity();
            doctorInfoEntity.setDoctorId(id);
            doctorInfoMapper.update(doctorInfoEntity, query);
        }
    }
}
