package com.titan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.titan.pojo.entity.PersonEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yigeoooo
 * @since date 2023/12/20
 */
@Mapper
public interface PersonMapper extends BaseMapper<PersonEntity> {
}
