package com.titan.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDate;


/**
 * <p>
 *     admin_info表实体类
 * </p>
 * @author yigeoooo
 * @since date 2023/12/2
 */
@Data
@TableName("root_info")
public class RootInfoEntity {
    @TableId
    private String id;
    /**
     * adminID
     */
    private String rootId;
    /**
     * admin姓名
     */
    private String rootName;
    /**
     * admin性别
     */
    private String rootGender;
    /**
     * 身份證號
     */
    private String idCard;
    /**
     * 電弧號
     */
    private String phoneNumber;
    /**
     * 排序标识符
     */
    private String sort;
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
    @TableLogic
    private Integer isDeleted;
}
