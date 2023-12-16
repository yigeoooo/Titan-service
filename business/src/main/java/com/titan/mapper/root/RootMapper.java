package com.titan.mapper.root;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.titan.pojo.entity.RootEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yigeoooo
 * @description root持久層
 * @since date 2023/12/16
 */
@Mapper
public interface RootMapper extends BaseMapper<RootEntity> {
}
