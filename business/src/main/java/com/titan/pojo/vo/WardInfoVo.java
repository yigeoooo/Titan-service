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
public class WardInfoVo extends PageVo {
    /**
     * 所属科室
     */
    private String department;

    /**
     * 负责医生
     */
    private String manager;
}
