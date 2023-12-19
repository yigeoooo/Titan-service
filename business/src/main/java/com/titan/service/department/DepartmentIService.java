package com.titan.service.department;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.titan.pojo.entity.DepartmentEntity;
import com.titan.pojo.vo.DepartmentVo;

import java.util.List;

/**
 * 科室接口
 * @author yigeoooo
 * @since date 2023/12/16
 */
public interface DepartmentIService extends IService<DepartmentEntity> {
    /**
     * 分頁查詢科室信息
     * @param departmentVo
     * @return Page
     */
    Page<DepartmentEntity> page(DepartmentVo departmentVo);

    /**
     * 新增醫生界面下拉框部門選擇
     * @return List
     */
    List<String> getDepartments();

    /**
     * 新增科室信息
     * @param departmentVo
     */
    void insertDepartment(DepartmentVo departmentVo);

    /**
     * 修改部門信息
     * @param departmentVo
     */
    void updateDepartment(DepartmentVo departmentVo);
}
