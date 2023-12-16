package com.titan.service.root.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.mapper.root.RootMapper;
import com.titan.pojo.entity.RootEntity;
import com.titan.service.root.RootIService;
import org.springframework.stereotype.Service;

/**
 * @author yigeoooo
 * @description root服務層
 * @since date 2023/12/16
 */
@Service
public class RootServiceImpl extends ServiceImpl<RootMapper, RootEntity> implements RootIService {
}
