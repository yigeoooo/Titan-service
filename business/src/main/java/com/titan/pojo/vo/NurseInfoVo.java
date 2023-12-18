package com.titan.pojo.vo;

import lombok.Data;


/**
 * <p>
 *     NurseInfoVo,接受前端传送的数据并封装
 * </p>
 * @author yigeoooo
 * @since date 2023/11/30
 */
@Data
public class NurseInfoVo extends PageVo {

    /**
     * 主鍵
     */
    private String id;
    /**
     * 护士姓名
     */
    private String nurseName;
    /**
     * 醫生科室
     */
    private String department;

}
