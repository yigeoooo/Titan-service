package com.titan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.titan.pojo.entity.DoctorEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 医生登录信息持久层
 * @author yigeoooo
 * @since date 2023/12/20
 */
@Mapper
public interface DoctorMapper extends BaseMapper<DoctorEntity> {
}
