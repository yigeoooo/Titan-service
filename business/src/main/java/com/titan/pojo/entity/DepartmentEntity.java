package com.titan.pojo.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDate;



/**
*
* @TableName department
*/
@Data
@TableName("department")
public class DepartmentEntity implements Serializable {

    /**
    * 主鍵id
    */
    @TableId
    private String id;
    /**
    * 科室名
    */

    private String departmentName;
    /**
    * 科室編碼
    */

    private String departmentCode;
    /**
    * 主管醫生
    */

    private String manager;
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
