package com.titan.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.titan.constant.CommonConstant;
import com.titan.constant.MessageConstant;
import com.titan.constant.RedisConstant;
import com.titan.pojo.entity.RootInfoEntity;
import com.titan.pojo.vo.BaseVo;
import com.titan.service.RootInfoIService;
import com.titan.utils.RedisUtils;
import com.titan.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;


/**
 * 前端交互層
 * @author yigeoooo
 * @since date 2023/12/16
 */
@RestController
@RequestMapping("/api/rootInfo")
public class RootInfoController {

    @Autowired
    private RootInfoIService rootInfoIService;

    @Autowired
    private RedisUtils redisUtils;

    /**
     * 修改root密碼
     * @param baseVo
     * @return Result
     */
    @PostMapping("/password")
    public Result updatePassword(@RequestBody BaseVo baseVo) {
       return Result.build(rootInfoIService.updatePassword(baseVo));
    }

    /**
     * 獲取admin用戶詳細信息
     * @param request
     * @return Result
     */
    @GetMapping("/info")
    public Result info(HttpServletRequest request) {
        return Result.build(rootInfoIService.info(request));
    }

    /**
     * 修改或新增admin信息
     * @param rootInfoEntity
     * @param request
     * @return Result
     */
    @PostMapping("/update")
    public Result updateInfo(@RequestBody RootInfoEntity rootInfoEntity, HttpServletRequest request) {
        QueryWrapper<RootInfoEntity> query = new QueryWrapper<>();
        String id = request.getAttribute(MessageConstant.ID).toString();
        LocalDate dateTime = LocalDate.now();
        rootInfoEntity.setUpdateTime(dateTime);
        rootInfoEntity.setRootId(id);
        query.eq(CommonConstant.Root.ROOT_ID, id);
        boolean bo = rootInfoIService.saveOrUpdate(rootInfoEntity, query);
        //獲得管理員key,更新redis数据
        Object obj = request.getAttribute(MessageConstant.ID);
        String key = RedisConstant.ROOT_ID + ":" + (String)obj;
        redisUtils.delete(key);
        if (bo) {
            return Result.build(true);
        }
        return Result.build(false);
    }



}
