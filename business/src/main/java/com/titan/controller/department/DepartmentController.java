package com.titan.controller.department;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.titan.exception.BusinessException;
import com.titan.pojo.entity.DepartmentEntity;
import com.titan.pojo.vo.DepartmentVo;
import com.titan.service.department.DepartmentIService;
import com.titan.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 科室交互層
 * @author yigeoooo
 * @since date 2023/12/16
 */
@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentIService departmentIService;

    /**
     * 分頁查詢科室信息
     * @return ResultInfo
     */
    @PostMapping("/page")
    public Result getDepartmentList(@RequestBody DepartmentVo departmentVo){
        Page<DepartmentEntity> page = departmentIService.page(departmentVo);
        return Result.build(page);
    }

    /**
     * 新增醫生界面下拉框部門選擇
     * @return ResultInfo
     */
    @GetMapping("/names")
    public Result getDepartments(){
        List<String> departments = departmentIService.getDepartments();
        return Result.build(departments);
    }

    /**
     * 新增科室信息
     * @param departmentVo
     * @return ResultInfo
     */
    @PostMapping("/insert")
    public Result insertDepartment(@RequestBody DepartmentVo departmentVo){
        try {
            departmentIService.insertDepartment(departmentVo);
            return Result.build(true);
        } catch (BusinessException e) {
            e.printStackTrace();
            return Result.build(false);
        }
    }

    /**
     * 修改部門信息
     * @param departmentVo
     * @return ResultInfo
     */
    @PostMapping("/update")
    public Result updateDepartment(@RequestBody DepartmentVo departmentVo){
        departmentIService.updateDepartment(departmentVo);
        return Result.build(true);
    }

    /**
     * 邏輯刪除部門信息
     * @param id
     * @return ResultInfo
     */
    @GetMapping("/delete")
    public Result deleteDepartment(String id){
        return Result.build(departmentIService.removeById(id));
    }

    /**
     * 查詢科室總數
     * @return ResultInfo
     */
    @GetMapping("/count")
    public Result getCount(){
        return Result.build(departmentIService.count());
    }
}
