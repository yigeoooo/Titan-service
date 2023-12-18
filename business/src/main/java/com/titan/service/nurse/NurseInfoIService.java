package com.titan.service.nurse;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.titan.pojo.entity.NurseInfoEntity;
import com.titan.pojo.vo.NurseInfoVo;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
public interface NurseInfoIService extends IService<NurseInfoEntity> {

    Page<NurseInfoEntity> page(NurseInfoVo nurseInfoVo);

    void insert(NurseInfoEntity nurseInfoDo);
}
