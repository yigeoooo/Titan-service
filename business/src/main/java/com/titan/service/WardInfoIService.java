package com.titan.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.titan.pojo.entity.WardInfoEntity;
import com.titan.pojo.vo.WardInfoVo;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
public interface WardInfoIService extends IService<WardInfoEntity> {
    /**
     * 插入
     * @param wardInfoDo
     */
    void insert(WardInfoEntity wardInfoDo);

    /**
     * 分页查询
     * @param wardInfoVo
     * @return Page
     */
    Page<WardInfoEntity> page(WardInfoVo wardInfoVo);

    /**
     * 更新
     * @param wardInfoDo
     */
    void update(WardInfoEntity wardInfoDo);
}
