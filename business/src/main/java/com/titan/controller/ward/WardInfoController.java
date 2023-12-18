package com.titan.controller.ward;

import com.titan.pojo.entity.WardInfoEntity;
import com.titan.pojo.vo.WardInfoVo;
import com.titan.service.ward.WardInfoIService;
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
    private WardInfoIService wardInfoIService;

    /**
     * 插入病房信息
     * @param wardInfoDo
     * @return ResultInfo
     */
    @PostMapping("/insert")
    public Result insert(@RequestBody WardInfoEntity wardInfoDo){
        wardInfoIService.insert(wardInfoDo);
        return Result.build(true);
    }

    /**
     * 分页条件拆线呢病房信息
     * @param wardInfoVo
     * @return ResultInfo
     */
    @PostMapping("/page")
    public Result page(@RequestBody WardInfoVo wardInfoVo) {
        return Result.build(wardInfoIService.page(wardInfoVo));
    }


    /**
     * 查询病房总数
     * @return ResultInfo
     */
    @GetMapping("/count")
    public Result count() {
        return Result.build(wardInfoIService.count());
    }

    /**
     * 逻辑删除病房信息
     * @param id
     * @return ResultInfo
     */
    @GetMapping("/delete")
    public Result delete(String id) {
        return Result.build(wardInfoIService.removeById(id));
    }

    /**
     * 更新病房信息
     * @param wardInfoDo
     * @return ResultInfo
     */
    @PostMapping("/update")
    public Result update(@RequestBody WardInfoEntity wardInfoDo) {
        wardInfoIService.update(wardInfoDo);
        return Result.build(true);
    }
}
