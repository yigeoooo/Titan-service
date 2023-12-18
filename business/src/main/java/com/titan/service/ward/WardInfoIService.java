package com.titan.service.ward;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.titan.pojo.entity.WardInfoEntity;
import com.titan.pojo.vo.WardInfoVo;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
public interface WardInfoIService extends IService<WardInfoEntity> {

    void insert(WardInfoEntity wardInfoDo);

    Page<WardInfoEntity> page(WardInfoVo wardInfoVo);

    void update(WardInfoEntity wardInfoDo);
}
