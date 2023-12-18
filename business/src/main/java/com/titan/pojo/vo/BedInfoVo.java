package com.titan.pojo.vo;

import lombok.Data;

/**
 * <p>
 *  病房接收实体类
 * </p>
 *
 * @author yigeoooo
 * @since date 2023/12/9
 */
@Data
public class BedInfoVo extends PageVo {
    /**
     * 所属科室
     */
    private String department;

    /**
     * 负责护士
     */
    private String managerNurse;
}
