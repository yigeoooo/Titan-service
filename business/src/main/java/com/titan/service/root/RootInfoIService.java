package com.titan.service.root;

import com.baomidou.mybatisplus.extension.service.IService;
import com.titan.pojo.entity.RootInfoEntity;
import com.titan.utils.Result;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yigeoooo
 * @since date 2023/12/16
 */
public interface RootInfoIService extends IService<RootInfoEntity> {

    /**
     * 獲取admin用戶詳細信息
     * @return Result
     */
    Result info(HttpServletRequest request);
}
