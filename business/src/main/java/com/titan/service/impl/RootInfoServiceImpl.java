package com.titan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.constant.CommonConstant;
import com.titan.constant.MessageConstant;
import com.titan.mapper.RootInfoMapper;
import com.titan.pojo.entity.RootInfoEntity;
import com.titan.service.RootInfoIService;
import com.titan.utils.RedisUtils;
import com.titan.constant.RedisConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
@Service
public class RootInfoServiceImpl extends ServiceImpl<RootInfoMapper, RootInfoEntity> implements RootInfoIService {

    @Autowired
    private RootInfoMapper rootInfoMapper;

    @Autowired
    private RedisUtils redisUtils;


    @Override
    public RootInfoEntity info(HttpServletRequest request) {
        Object obj = request.getAttribute(MessageConstant.ID);
        //獲得管理員key
        String key = RedisConstant.ROOT_ID + ":" + (String)obj;
        RootInfoEntity root = redisUtils.get(key, RootInfoEntity.class);
        //若redis中存在數據直接返回
        if (root != null) {
            return root;
        }
        //redis中不存在則查詢數據庫並寫入數據到redis
        QueryWrapper<RootInfoEntity> query = new QueryWrapper<>();
        query.eq(CommonConstant.Root.ROOT_ID, (String)obj);
        RootInfoEntity rootInfoEntity = rootInfoMapper.selectOne(query);
        redisUtils.set(key, rootInfoEntity, RedisConstant.NORMAL_EXPIRE);
        return rootInfoEntity;
    }
}
