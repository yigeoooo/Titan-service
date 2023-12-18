package com.titan.mapper.department;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.titan.pojo.entity.DepartmentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 科室持久層
 * @author yigeoooo
 * @since date 2023/12/16
 */
@Mapper
public interface DepartmentMapper extends BaseMapper<DepartmentEntity> {
}
