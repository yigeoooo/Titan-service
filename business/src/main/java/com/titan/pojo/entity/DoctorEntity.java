package com.titan.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;

/**
 * 医生登录信息实体类
 * @author yigeoooo
 * @since date 2023/12/20
 */
@Data
@TableName("doctor")
public class DoctorEntity {

    /**
     * 主鍵id
     */
    @TableId
    private String id;

    /**
     * 用戶名
     */
    private String doctorId;


    /**
     * 密碼
     */
    private String password;

    /**
     * 排序標識符
     */
    private long sort;

    /**
     * 插入時間
     */
    private LocalDate insertTime;

    /**
     * 更新時間
     */
    private LocalDate updateTime;

    /**
     * 邏輯刪除標識符
     */
    @TableLogic
    private int isDeleted;

}
