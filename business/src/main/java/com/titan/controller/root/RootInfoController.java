package com.titan.controller.root;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.titan.pojo.entity.RootInfoEntity;
import com.titan.pojo.vo.BaseVo;
import com.titan.service.root.RootInfoIService;
import com.titan.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

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

    /**
     * 修改root密碼
     * @param baseVo
     * @return
     */
    @PostMapping("/password")
    public Result updatePassword(@RequestBody BaseVo baseVo) {
        //TODO 密碼邏輯修改
       return null;
    }

    /**
     * 獲取admin用戶詳細信息
     *
     * @return Result
     */
    @GetMapping("/info")
    public Result getAdminInfo(HttpServletRequest request) {
        return Result.build(rootInfoIService.info(request));
    }

    /**
     * 修改或新增admin信息
     *
     * @param rootInfoEntity
     * @return Result
     */
    @PostMapping("/update")
    public Result updateInfo(@RequestBody RootInfoEntity rootInfoEntity, HttpServletRequest request) {
        QueryWrapper<RootInfoEntity> query = new QueryWrapper<>();
        String id = request.getAttribute("id").toString();
        LocalDateTime dateTime = LocalDateTime.now();
        rootInfoEntity.setUpdateTime(dateTime);
        rootInfoEntity.setRootId(id);
        query.eq("admin_id", id);
        boolean bo = rootInfoIService.saveOrUpdate(rootInfoEntity, query);
        if (bo) {
            return Result.build(true);
        }
        return Result.build(false);
    }



}
