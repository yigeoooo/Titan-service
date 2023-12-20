package com.titan.controller;

import com.titan.pojo.entity.WardInfoEntity;
import com.titan.pojo.vo.WardInfoVo;
import com.titan.service.WardInfoIService;
import com.titan.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
@RestController
@RequestMapping("/api/wardInfo")
public class WardInfoController {

    @Autowired
    private WardInfoIService wardInfoIservice;

    /**
     * 插入病房信息
     * @param wardInfoDo
     * @return Result
     */
    @PostMapping("/insert")
    public Result insert(@RequestBody WardInfoEntity wardInfoDo){
        wardInfoIservice.insert(wardInfoDo);
        return Result.build(true);
    }

    /**
     * 分页条件拆线呢病房信息
     * @param wardInfoVo
     * @return Result
     */
    @PostMapping("/page")
    public Result page(@RequestBody WardInfoVo wardInfoVo) {
        return Result.build(wardInfoIservice.page(wardInfoVo));
    }


    /**
     * 查询病房总数
     * @return Result
     */
    @GetMapping("/count")
    public Result count() {
        return Result.build(wardInfoIservice.count());
    }

    /**
     * 逻辑删除病房信息
     * @param id
     * @return Result
     */
    @GetMapping("/delete")
    public Result delete(String id) {
        return Result.build(wardInfoIservice.removeById(id));
    }

    /**
     * 更新病房信息
     * @param wardInfoDo
     * @return Result
     */
    @PostMapping("/update")
    public Result update(@RequestBody WardInfoEntity wardInfoDo) {
        wardInfoIservice.update(wardInfoDo);
        return Result.build(true);
    }
}
