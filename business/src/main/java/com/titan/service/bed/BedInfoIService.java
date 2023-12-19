package com.titan.service.bed;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.titan.pojo.entity.BedInfoEntity;
import com.titan.pojo.vo.BedInfoVo;

import java.util.List;
import java.util.Map;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
public interface BedInfoIService extends IService<BedInfoEntity> {
    /**
     * 获取护士姓名集合与病房地址集合
     * @param department
     * @return Map
     */
    Map<String, List<String>> nurseAndAddress(String department);

    /**
     * 插入病房信息
     * @param bedInfoDo
     */
    void insert(BedInfoEntity bedInfoDo);

    /**
     * 分页条件查询病床信息
     * @param bedInfoVo
     * @return Page
     */
    Page<BedInfoEntity> page(BedInfoVo bedInfoVo);
}
