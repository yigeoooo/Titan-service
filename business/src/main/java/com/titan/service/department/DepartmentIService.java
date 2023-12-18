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

    Page<DepartmentEntity> page(DepartmentVo departmentVo);

    List<String> getDepartments();

    void insertDepartment(DepartmentVo departmentVo);

    void updateDepartment(DepartmentVo departmentVo);
}
