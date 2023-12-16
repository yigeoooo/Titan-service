package com.titan.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author yigeoooo
 * @description root登錄信息實體類
 * @since date 2023/12/16
 */
@Data
@TableName("root")
public class RootEntity {
    /**
     * 主鍵id
     */
    @TableId
    private String id;

    /**
     * 用戶名
     */
    private String rootId;

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
