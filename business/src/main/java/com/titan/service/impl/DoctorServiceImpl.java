package com.titan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.constant.CommonConstant;
import com.titan.constant.MessageConstant;
import com.titan.mapper.DoctorMapper;
import com.titan.pojo.entity.DoctorEntity;
import com.titan.pojo.vo.BaseVo;
import com.titan.service.DoctorIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 医生登录信息服务层
 * @author yigeoooo
 * @since date 2023/12/20
 */
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, DoctorEntity> implements DoctorIService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public void reset(BaseVo baseVo) {
        //创建对象
        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setDoctorId(baseVo.getId());
        doctorEntity.setPassword(baseVo.getPassword());
        doctorEntity.setId(baseVo.getKey());
        QueryWrapper<DoctorEntity> query = new QueryWrapper<>();
        query.eq(CommonConstant.Doctor.ID, doctorEntity.getId());
        //查询该账号是否存在
        Long count = doctorMapper.selectCount(query);
        if (MessageConstant.ZERO == count) {
            //不存在，插入
            doctorMapper.insert(doctorEntity);
            return;
        }
        //存在，修改账户或密码
        doctorMapper.updateById(doctorEntity);
    }
}
