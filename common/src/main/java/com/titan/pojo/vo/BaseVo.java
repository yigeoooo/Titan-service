package com.titan.pojo.vo;

import lombok.Data;

/**
 * <p>
 *     分页属性父类封装，用于接受前端传入的分页信息，被实体类继承
 * </p>
 * @author yigeoooo
 * @since date 2023/11/30
 */
@Data
public class BaseVo {

    /**
     * 对应登录信息主键
     */
    private String key;
    /**
     * id
     */
    private String id;

    /**
     * 旧用户名
     */
    private String oldId;

    /**
     * 密碼
     */
    private String password;
    /**
     * 舊密碼
     */
    private String oldPassword;
    /**
     * 角色判斷
     */
    private String code;
}
