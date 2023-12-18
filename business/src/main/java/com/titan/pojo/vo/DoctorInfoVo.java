package com.titan.pojo.vo;
import lombok.Data;


/**
 * <p>
 *     DoctorInfoVo,接受前端传送的数据并封装
 * </p>
 * @author yigeoooo
 * @since date 2023/11/30
 */
@Data
public class DoctorInfoVo extends PageVo {


    /**
     * 主鍵
     */
    private String id;
    /**
     * 醫生姓名
     */
    private String doctorName;
    /**
     * 醫生科室
     */
    private String department;

}
