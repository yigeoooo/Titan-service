package com.titan.pojo.entity;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
*
* @TableName bed_info
*/
@Data
@TableName("bed_info")
public class BedInfoEntity implements Serializable {

    /**
    * 主鍵id
    */
   @TableId
    private String id;
    /**
    * 病床id
    */

    private String bedCode;
    /**
    * 病床科室
    */

    private String department;
    /**
    * 主管護士
    */

    private String managerNurse;
    /**
    * 主管護士聯繫電話
    */

    private String phoneNumber;
    /**
    * 病床地址
    */

    private String address;
    /**
    * 排序標識符
    */

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
