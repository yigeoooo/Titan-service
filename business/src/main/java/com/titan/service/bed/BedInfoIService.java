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

    Map<String, List<String>> nurseAndAddress(String department);

    void insert(BedInfoEntity bedInfoDo);

    Page<BedInfoEntity> page(BedInfoVo bedInfoVo);
}
