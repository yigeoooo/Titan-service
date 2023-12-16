package com.titan.pojo.entity;


import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
*
* @TableName doctor_info
*/
@Data
@TableName("doctor_info")
public class DoctorInfoEntity implements Serializable {

    /**
    * 主鍵id
    */
    @TableId
    private String id;
    /**
    * 醫生id
    */

    private String doctorId;
    /**
    * 醫生姓名
    */

    private String doctorName;
    /**
    * 醫生性別
    */

    private String doctorGender;
    /**
    * 醫生科室
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

    private Date insertTime;
    /**
    * 更新時間
    */

    private Date updateTime;
    /**
    * 邏輯刪除標識符
    */
   @TableLogic
    private Integer isDeleted;



}
