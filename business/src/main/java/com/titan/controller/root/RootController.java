package com.titan.controller.root;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.titan.pojo.entity.RootEntity;
import com.titan.pojo.vo.BaseVo;
import com.titan.service.root.RootIService;
import com.titan.utils.JwtUtils;
import com.titan.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登錄交互層
 * @author yigeoooo
 * @since date 2023/12/16
 */
@RestController
@RequestMapping("/api/root")
public class RootController {

    @Autowired
    private RootIService rootIService;

    /**
     * 驗證登錄
     * @param baseVo
     * @return Result
     */
    @PostMapping("/login")
    public Result rootLogin(@RequestBody BaseVo baseVo) {
        RootEntity root = new RootEntity();
        QueryWrapper<RootEntity> query = new QueryWrapper<>();
        query.eq("root_id", baseVo.getId())
                .eq("password", baseVo.getPassword());
        long count = rootIService.count(query);
        if (count != 1) {
            return Result.build(false);
        }
        String token = JwtUtils.generateToken(baseVo.getId());
        return Result.build(token);
    }

}
