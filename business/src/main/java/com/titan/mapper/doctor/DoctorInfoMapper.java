package com.titan.mapper.doctor;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.titan.pojo.entity.DoctorInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 醫生信息持久層
 * @author yigeoooo
 * @since date 2023/12/16
 */
@Mapper
public interface DoctorInfoMapper extends BaseMapper<DoctorInfoEntity> {
}
