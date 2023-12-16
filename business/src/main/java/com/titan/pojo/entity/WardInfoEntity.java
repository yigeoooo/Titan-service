package com.titan.pojo.entity;



import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

import java.util.Date;


/**
*
* @TableName ward_info
*/
@Data
@TableName("ward_info")
public class WardInfoEntity implements Serializable {

    /**
    * 主鍵id
    */
    @TableId
    private String id;
    /**
    * 病房id
    */

    private String wardCode;
    /**
    * 病房科室
    */

    private String department;
    /**
    * 主管醫生
    */

    private String manager;
    /**
    * 主管醫生聯繫電話
    */

    private String phoneNumber;
    /**
    * 病房地址
    */

    private String address;
    /**
    * 病房數量
    */

    private String bedCount;
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
