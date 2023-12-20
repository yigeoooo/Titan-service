package com.titan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.titan.pojo.entity.DoctorEntity;
import com.titan.pojo.vo.BaseVo;

/**
 * 医生登录信息服务层接口
 * @author yigeoooo
 * @since date 2023/12/20
 */
public interface DoctorIService extends IService<DoctorEntity> {

    /**
     * 重置医生密码
     * @param baseVo
     */
    void reset(BaseVo baseVo);

}
