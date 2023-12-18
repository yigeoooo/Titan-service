package com.titan.xss;

/**
 * redis常量
 * @author yigeoooo
 * @since date 2023/12/18
 */
public class RedisConstant {

    /**  默認過期時長，單位：秒 */
    public final static long DEFAULT_EXPIRE = 60 * 60 * 24;

    /**  默認過期時長，單位：秒 */
    public final static long NORMAL_EXPIRE = 60 * 60;

    /**  不設置過期時長 */
    public final static long NOT_EXPIRE = -1;



    /**  管理員key */
    public final static String ROOT_ID = "root_id";

}
