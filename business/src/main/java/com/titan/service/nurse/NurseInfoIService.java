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
    /**
     * 分页条件查询nurse
     * @param nurseInfoVo
     * @return Page
     */
    Page<NurseInfoEntity> page(NurseInfoVo nurseInfoVo);

    /**
     * 新增护士信息
     * @param nurseInfoDo
     */
    void insert(NurseInfoEntity nurseInfoDo);
}
