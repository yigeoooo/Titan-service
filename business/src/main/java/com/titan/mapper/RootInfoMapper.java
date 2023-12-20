package com.titan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.titan.pojo.entity.RootInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * root信息持久層
 * @author yigeoooo
 * @since date 2023/12/16
 */
@Mapper
public interface RootInfoMapper extends BaseMapper<RootInfoEntity> {
}
