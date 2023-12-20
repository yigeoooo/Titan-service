package com.titan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.titan.pojo.entity.PersonEntity;
import com.titan.pojo.vo.BaseVo;

/**
 * 患者登录服务层接口
 * @author yigeoooo
 * @since date 2023/12/20
 */
public interface PersonIService extends IService<PersonEntity> {

    /**
     * 患者账号注册
     * @param baseVo
     */
    void register(BaseVo baseVo);

    /**
     * 验证密码是否一致
     * @param baseVo
     * @return boolean
     */
    boolean verify(BaseVo baseVo);

}
