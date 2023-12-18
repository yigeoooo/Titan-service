package com.titan.pojo.vo;

import lombok.Data;

/**
 * <p>
 *      科室Vo實體類
 * </p>
 *
 * @author yigeoooo
 * @since date 2023/12/8
 */
@Data
public class DepartmentVo extends PageVo{

    /**
     * 科室編碼
     */
    private String departmentCode;
    /**
     * 科室名
     */
    private String departmentName;
    /**
     * 科室負責醫生
     */
    private String manager;
    /**
     * id
     */
    private String id;
}
