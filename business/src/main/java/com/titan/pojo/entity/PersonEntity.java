package com.titan.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;

/**
 * 患者登录实体类
 * @author yigeoooo
 * @since date 2023/12/20
 */
@Data
@TableName("person")
public class PersonEntity {

    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 登录id
     */
    private String personId;

    /**
     * 密码
     */
    private String password;

    /**
     * 排序标识符
     */
    private Long sort;

    /**
     * 插入时间
     */
    private LocalDate insertTime;

    /**
     * 更新时间
     */
    private LocalDate updateTime;

    /**
     * 逻辑删除标识符
     */
    private int isDeleted;
}
