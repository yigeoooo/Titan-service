package com.titan.controller.bed;

import com.titan.pojo.entity.BedInfoEntity;
import com.titan.pojo.vo.BedInfoVo;
import com.titan.service.bed.BedInfoIService;
import com.titan.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
@RestController
@RequestMapping("/api/bedInfo")
public class BedInfoController {

    @Autowired
    private BedInfoIService bedInfoIService;

    /**
     * 获取护士姓名集合与病房地址集合
     * @param department
     * @return Result
     */
    @GetMapping("/map")
    public Result nurseAndAddress(String department) {
        Map<String, List<String>> map = bedInfoIService.nurseAndAddress(department);
        return Result.build(map);
    }

    /**
     * 插入病房信息
     * @param bedInfoDo
     * @return Result
     */
    @PostMapping("/insert")
    public Result insert(@RequestBody BedInfoEntity bedInfoDo) {
        bedInfoIService.insert(bedInfoDo);
        return Result.build(true);
    }

    /**
     * 分页条件查询病床信息
     * @param bedInfoVo
     * @return Result
     */
    @PostMapping("/page")
    public Result page(@RequestBody BedInfoVo bedInfoVo) {
        return Result.build(bedInfoIService.page(bedInfoVo));
    }

    /**
     * 查询病床总数
     * @return Result
     */
    @GetMapping("/count")
    public Result count() {
        return Result.build(bedInfoIService.count());
    }

    /**
     * 逻辑删除病房信息
     * @param id
     * @return Result
     */
    @GetMapping("/deleted")
    public Result delete(String id) {
        return Result.build(bedInfoIService.removeById(id));
    }
}
