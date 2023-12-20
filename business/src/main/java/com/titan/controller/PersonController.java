package com.titan.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.titan.constant.CommonConstant;
import com.titan.pojo.entity.PersonEntity;
import com.titan.pojo.entity.RootEntity;
import com.titan.pojo.vo.BaseVo;
import com.titan.service.PersonIService;
import com.titan.utils.JwtUtils;
import com.titan.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 患者登录信息交互层
 * @author yigeoooo
 * @since date 2023/12/20
 */
@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonIService personIService;

    /**
     * 患者登录
     * @param baseVo
     * @return Result
     */
    @PostMapping("/login")
    public Result login (@RequestBody BaseVo baseVo) {
        QueryWrapper<PersonEntity> query = new QueryWrapper<>();
        query.eq(CommonConstant.Person.PERSON_ID, baseVo.getId())
                .eq(CommonConstant.Person.PASSWORD, baseVo.getPassword());
        long count = personIService.count(query);
        if (count != 1) {
            return Result.build(false);
        }
        String token = JwtUtils.generateToken(baseVo.getId());
        return Result.build(token);
    }

    /**
     * 患者账号注册
     * @param baseVo
     * @return Result
     */
    @PostMapping("/register")
    public Result register(@RequestBody BaseVo baseVo) {
        personIService.register(baseVo);
        return Result.build(true);
    }

    /**
     * 验证密码是否一致
     * @param baseVo
     * @return Result
     */
    @PostMapping("/verify")
    public Result verify(@RequestBody BaseVo baseVo) {
        return Result.build(personIService.verify(baseVo));
    }
}
