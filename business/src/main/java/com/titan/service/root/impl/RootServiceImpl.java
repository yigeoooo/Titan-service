package com.titan.service.root.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.mapper.root.RootInfoMapper;
import com.titan.mapper.root.RootMapper;
import com.titan.pojo.entity.RootEntity;
import com.titan.pojo.entity.RootInfoEntity;
import com.titan.service.root.RootIService;
import com.titan.utils.RedisUtils;
import com.titan.utils.StringUtils;
import com.titan.xss.RedisConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yigeoooo
 * @description root服務層
 * @since date 2023/12/16
 */
@Service
public class RootServiceImpl extends ServiceImpl<RootMapper, RootEntity> implements RootIService {
}
