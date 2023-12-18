package com.titan.pojo.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


/**
*
* @TableName nurse_info
*/
@Data
@TableName("nurse_info")
public class NurseInfoEntity implements Serializable {

    /**
    * 主鍵id
    */
    @TableId
    private String id;
    /**
    * 護士id
    */
    private String nurseId;
    /**
    * 護士姓名
    */
    private String nurseName;
    /**
    * 護士性別
    */

    private String nurseGender;
    /**
    * 護士科室
    */

    private String department;
    /**
    * 身份證號
    */

    private String idCard;
    /**
    * 聯繫電話
    */

    private String phoneNumber;
    /**
    * 排序標識符
    */

    private Long sort;
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
    private Integer isDeleted;




}
