package com.titan.controller.nurse;

import com.titan.pojo.entity.NurseInfoEntity;
import com.titan.pojo.vo.NurseInfoVo;
import com.titan.service.nurse.NurseInfoIService;
import com.titan.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/**
 * 護士交互層
 * @author yigeoooo
 * @since date 2023/12/16
 */
@RestController
@RequestMapping("/api/nurse")
public class NurseInfoController {

    @Autowired
    private NurseInfoIService nurseInfoIService;


    /**
     * 分页条件查询nurse
     * @param nurseInfoVo
     * @return Result
     */
    @PostMapping("/page")
    public Result page(@RequestBody NurseInfoVo nurseInfoVo) {
        return Result.build(nurseInfoIService.page(nurseInfoVo));
    }

    /**
     * 新增护士信息
     * @param nurseInfoDo
     * @return Result
     */
    @PostMapping("/insert")
    public Result insert(@RequestBody NurseInfoEntity nurseInfoDo) {
        nurseInfoIService.insert(nurseInfoDo);
        return Result.build(true);
    }

    /**
     * 修改护士信息
     * @param nurseInfoDo
     * @return Result
     */
    @PostMapping("/update")
    public Result update(@RequestBody NurseInfoEntity nurseInfoDo) {
        nurseInfoDo.setUpdateTime(LocalDate.now());
        nurseInfoIService.updateById(nurseInfoDo);
        return Result.build(true);
    }

    /**
     * 逻辑删除护士信息
     * @param id
     * @return Result
     */
    @GetMapping("delete")
    public Result delete(String id) {
        nurseInfoIService.removeById(id);
        return Result.build(true);
    }

    /**
     * 获得护士总数
     * @return Result
     */
    @GetMapping("/count")
    public Result count() {
        long count = nurseInfoIService.count();
        return Result.build(count);
    }

    /**
     * 獲取醫生詳細信息
     * @param nurseInfoVo
     * @return Result
     */
    @PostMapping("/info")
    public Result info(@RequestBody NurseInfoVo nurseInfoVo){
        return Result.build(nurseInfoIService.getById(nurseInfoVo.getId()));
    }

}
