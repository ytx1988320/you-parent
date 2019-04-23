package com.you.you.page.common.dto.result;

/**
 *
 * @date 2018/4/16
 */
public enum ResultCode {

    SUCCESS("0000", "成功"),

    UNKNOWN_ERROR("0001", "未知错误"),

    ACCESS_DENID("0002", "访问受限"),

    PARAM_ERROR("0003", "参数错误"),

    DATA_NOT_EXIST("0011", "数据不存在"),

    DATA_ERROR("0012", "数据异常"),

    AUTH_ERROR("401", "权限异常"),

    SYSTEM_ERROR("9999", "系统错误"),

    UNUSER_ERROR("601", "没有此用户"),

    NOLOGIN_ERROR("602", "未登陆");


    private String code;

    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static ResultCode errorOf(String code) {
        for (ResultCode en : values()) {
            if (en.getCode().equals(code)) {
                return en;
            }
        }
        return null;
    }
}
