package com.titan.service.root.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.mapper.root.RootInfoMapper;
import com.titan.pojo.entity.RootInfoEntity;
import com.titan.service.root.RootInfoIService;
import com.titan.utils.Result;
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


    @Override
    public Result info(HttpServletRequest request) {
        String id = request.getAttribute("id").toString();
        QueryWrapper<RootInfoEntity> query = new QueryWrapper<>();
        query.eq("admin_id", id);
        RootInfoEntity rootInfo = rootInfoMapper.selectOne(query);
        if (rootInfo == null){
            log.error("查詢錯誤或未完善用戶信息");
            return Result.build(500, "500", "查詢錯誤或未完善用戶信息", false);
        }
        return Result.build(rootInfo);
    }
}
