package com.titan.controller;

import com.titan.pojo.vo.BaseVo;
import com.titan.service.DoctorIService;
import com.titan.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 医生登录信息交互层
 * @author yigeoooo
 * @since date 2023/12/20
 */
@RestController
@RequestMapping("/api/doctor")
public class DoctorController {

    @Autowired
    private DoctorIService doctorIService;

    /**
     * 重置医生登录密码
     * @param baseVo
     * @return Result
     */
    @PostMapping("/reset")
    public Result reset(@RequestBody BaseVo baseVo) {
        doctorIService.reset(baseVo);
        return Result.build(true);
    }

}
