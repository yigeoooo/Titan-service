package com.titan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.constant.CommonConstant;
import com.titan.constant.ExceptionConstant;
import com.titan.exception.BusinessException;
import com.titan.mapper.DepartmentMapper;
import com.titan.pojo.entity.DepartmentEntity;
import com.titan.pojo.vo.DepartmentVo;
import com.titan.service.DepartmentIService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
@Service
public class DepartmentImpl extends ServiceImpl<DepartmentMapper, DepartmentEntity> implements DepartmentIService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Page<DepartmentEntity> page(DepartmentVo departmentVo) {
        //構築分頁信息
        Page<DepartmentEntity> page = new Page<>();
        page.setCurrent(departmentVo.getPage());
        page.setSize(departmentVo.getSize());
        QueryWrapper<DepartmentEntity> query = new QueryWrapper<>();
        String code = departmentVo.getDepartmentCode();
        String name = departmentVo.getDepartmentName();
        String manager = departmentVo.getManager();
        //條件非空判斷
        if (!StringUtils.isBlank(code)){
            query.eq(CommonConstant.Department.DEPARTMENT_CODE, code);
        }
        if (!StringUtils.isBlank(name)){
            query.eq(CommonConstant.Department.DEPARTMENT_NAME, name);
        }
        if (!StringUtils.isBlank(manager)){
            query.eq(CommonConstant.Department.MANAGER, manager);
        }
        return departmentMapper.selectPage(page, query);
    }

    @Override
    public List<String> getDepartments() {
        //構築查詢信息
        QueryWrapper<DepartmentEntity> query = new QueryWrapper<>();
        query.select(CommonConstant.Department.DEPARTMENT_NAME);
        List<DepartmentEntity> departmentDos = departmentMapper.selectList(query);
        //封裝name信息
        List<String> list = new ArrayList<>();
        departmentDos.forEach(item ->{
            String departmentName = item.getDepartmentName();
            list.add(departmentName);
        });
        return list;
    }

    @Override
    public void insertDepartment(DepartmentVo departmentVo) {
        //條件非空判斷
        if (StringUtils.isBlank(departmentVo.getDepartmentName())){
            throw new BusinessException(ExceptionConstant.DEPARTMENT_NAME_CANNOT_BE_EMPTY);
        }
        if (StringUtils.isBlank(departmentVo.getDepartmentCode())){
            throw new BusinessException(ExceptionConstant.DEPARTMENT_CODE_CANNOT_BE_EMPTY);
        }
        //實體類封裝
        DepartmentEntity departmentDo = new DepartmentEntity();
        departmentDo.setDepartmentName(departmentVo.getDepartmentName());
        departmentDo.setDepartmentCode(departmentVo.getDepartmentCode());
        departmentMapper.insert(departmentDo);
    }

    @Override
    public void updateDepartment(DepartmentVo departmentVo) {
        //構築對象
        DepartmentEntity departmentDo = new DepartmentEntity();
        departmentDo.setId(departmentVo.getId());
        departmentDo.setDepartmentCode(departmentVo.getDepartmentCode());
        departmentDo.setUpdateTime(LocalDate.now());
        departmentDo.setDepartmentName(departmentVo.getDepartmentName());
        departmentDo.setManager(departmentVo.getManager());
        departmentMapper.updateById(departmentDo);
    }
}
