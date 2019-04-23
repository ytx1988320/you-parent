/**
 * Copyright (C), 2019
 * FileName: PasswordUtil
 * Author:   york
 * Date:     2019/3/28 10:33
 */
package com.you.you.page.common.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * 〈一句话功能简述〉<br> 
 * 〈密码验证〉
 *
 * @author york
 * @create 2019/3/28
 * @since 1.0.0
 */
public class PasswordUtil {

    /**
     * 检查密码是否正确
     * @param dbPassword 数据库密码
     * @param username  用户名
     * @param password  用户输入密码
     * @param salt  加盐
     * @return
     */
    public static boolean checkPassWord(String dbPassword ,String username,String password,String salt){
        if(StringUtils.isBlank(dbPassword)){
            return  false;
        }
        return dbPassword.equals(encryptPassword(username, password, salt));
    }

    /**
     * 加密密码
     * @param username 用户名
     * @param password 密码
     * @param salt 盐码
     * @return
     */
    public static String encryptPassword(String username, String password, String salt)
    {
        if(StringUtils.isBlank(salt)){
            salt="111111";
        }
        return new Md5Hash(username + password + salt).toHex().toString();
    }

}