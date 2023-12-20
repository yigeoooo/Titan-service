package com.titan.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.titan.pojo.entity.DoctorInfoEntity;
import com.titan.pojo.vo.DoctorInfoVo;

import java.util.List;

/**
 * 醫生信息接口
 * @author yigeoooo
 * @since date 2023/12/16
 */
public interface DoctorInfoIService extends IService<DoctorInfoEntity> {

    /**
     * 增加醫生信息
     * @param doctorInfoEntity
     */
    void add(DoctorInfoEntity doctorInfoEntity);

    /**
     * 分頁條件查詢醫生信息
     * @param doctorInfoVo
     * @return Page
     */
    Page<DoctorInfoEntity> page(DoctorInfoVo doctorInfoVo);

    /**
     * 獲取男女比例
     * @return String
     */
    String sexRatio();

    /**
     * 查询所属部门医生信息
     * @param department
     * @return List
     */
    List<String> doctors(String department);
}
