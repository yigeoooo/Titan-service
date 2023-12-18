package com.titan.controller.doctor;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.titan.pojo.entity.DoctorInfoEntity;
import com.titan.pojo.vo.DoctorInfoVo;
import com.titan.service.doctor.DoctorInfoIService;
import com.titan.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

/**
 * 醫生信息交互層
 * @author yigeoooo
 * @since date 2023/12/16
 */
@RestController
@RequestMapping("/api/doctorInfo")
public class DoctorInfoController {

    @Autowired
    private DoctorInfoIService doctorInfoIService;

    /**
     * 增加醫生信息
     * @param doctorInfoEntity
     * @return Result
     */
    @PostMapping("/add")
    public Result addDoctor(@RequestBody DoctorInfoEntity doctorInfoEntity){
        try {
            doctorInfoIService.add(doctorInfoEntity);
            return Result.build(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.build(500, "500", "出現異常", false);
    }


    /**
     * 查詢醫生信息總數
     * @return Result
     */
    @GetMapping("/count")
    public Result count(){
        long count = doctorInfoIService.count();
        return Result.build(count);
    }

    /**
     * 分頁條件查詢醫生信息
     * @param doctorInfoVo
     * @return Result
     */
    @PostMapping ("/page")
    public Result selectPage(@RequestBody DoctorInfoVo doctorInfoVo){
        Page<DoctorInfoEntity> page = doctorInfoIService.page(doctorInfoVo);
        return Result.build(doctorInfoIService.page(doctorInfoVo));
    }


    /**
     * 邏輯刪除醫生信息
     * @param id
     * @return Result
     */
    @GetMapping("/remove")
    public Result deleteDoctor(String id){
        return Result.build(doctorInfoIService.removeById(id));
    }

    /**
     * 修改醫生信息
     * @param doctorInfoEntity
     * @return Result
     */
    @PostMapping("/update")
    public Result saveDoctor(@RequestBody DoctorInfoEntity doctorInfoEntity){
        doctorInfoEntity.setUpdateTime(LocalDate.now());
        return Result.build(doctorInfoIService.updateById(doctorInfoEntity));
    }

    /**
     * 獲取醫生詳細信息
     * @param doctorInfoVo
     * @return ResultInfo
     */
    @PostMapping("/info")
    public Result info(@RequestBody DoctorInfoVo doctorInfoVo){
        return Result.build(doctorInfoIService.getById(doctorInfoVo.getId()));
    }

    /**
     * 獲取男女比例
     * @return ResultInfo
     */
    @GetMapping("/sexRatio")
    public Result sexRatio(){
        return Result.build(doctorInfoIService.sexRatio());
    }

    /**
     * 查询所属部门医生信息
     * @param department
     * @return ResultInfo
     */
    @GetMapping("/list")
    public Result getDoctors(String department) {
        return Result.build(doctorInfoIService.doctors(department));
    }
}
