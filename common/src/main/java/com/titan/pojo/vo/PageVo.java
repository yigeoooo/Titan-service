package com.titan.pojo.vo;

import lombok.Data;

/**
 * <p>
 *      基本分頁對象
 * </p>
 *
 * @author yigeoooo
 * @since date 2023/12/15
 */
@Data
public class PageVo {

    /**
     * 頁碼
     */
    private int page;
    /**
     * 每頁長度
     */
    private int size;
}
