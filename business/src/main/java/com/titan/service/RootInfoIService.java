package com.titan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.titan.pojo.entity.RootInfoEntity;
import com.titan.pojo.vo.BaseVo;
import com.titan.utils.Result;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
public interface RootInfoIService extends IService<RootInfoEntity> {

    /**
     * 獲取root用戶詳細信息
     * @param request
     * @return RootInfoEntity
     */
    RootInfoEntity info(HttpServletRequest request);

    /**
     * 修改密码
     * @param baseVo
     * @return boolean
     */
    boolean updatePassword(BaseVo baseVo);
}
