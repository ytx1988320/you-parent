/**
 * Copyright (C), 2019
 * FileName: BackConsts
 * Author:   york
 * Date:     2019/3/25 14:02
 */
package com.you.you.page.common.consts;

/**
 * 〈一句话功能简述〉<br> 
 * 〈后台管理常量〉
 *
 * @author york
 * @create 2019/3/25
 * @since 1.0.0
 */
public class BackConsts {
    /**
     * 后台session的key
     */
    public final  static String BACK_SESSION_KEY ="back_user_key";

    /** 菜单名称是否唯一的返回结果码 */
    public final static String MENU_NAME_UNIQUE = "0";
    public final static String MENU_NAME_NOT_UNIQUE = "1";

    /**
     * 放到request的userid
     */
    public static final String REQ_USER_ID_KEY = "user_id";

    /**
     * 用户的认证状态:0 一般客户，1 认证客户
     */
    public static final Integer USER_TYPE_REGISTER = 1;
    /**
     * 数据可用状态状态:0 正常，1 注销
     */
    public static final Integer USE_VISIBLE_OK = 0;
    public static final Integer USE_VISIBLE_NO = 1;


}