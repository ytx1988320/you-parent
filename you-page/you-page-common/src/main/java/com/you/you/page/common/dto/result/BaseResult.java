package com.you.you.page.common.dto.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 *
 * @date 2018/4/16
 */
public class BaseResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成功标志 true-成功 false-失败
     */
    @ApiModelProperty(value = "成功标志 true-成功 false-失败", name = "success")
    private boolean success;

    /**
     * 信息码 参照ResultCode枚举
     */
    @ApiModelProperty(value = "信息码 参照ResultCode枚举", name = "code")
    private String code;

    /**
     * 成功/失败描述
     */
    @ApiModelProperty(value = "成功/失败描述", name = "description")
    private String description;


    public BaseResult() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
        this.code= ResultCode.SUCCESS.getCode();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "BaseResult{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
