package com.you.you.page.common.dto.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 请求结果
 *
 *
 * @date 2018/4/16
 */
@ApiModel(value = "请求结果", description = "请求结果")
public class Result<T> extends BaseResult {

    private static final long serialVersionUID = 1L;



    /**
     * 返回数据，可为基本类型（包装类），可以为其它可序列化对象
     */
    @ApiModelProperty(value = "返回数据，可为基本类型（包装类），可以为其它可序列化对象", name = "data")
    private T data;

    public static <T> Result<T> create() {
        Result<T> result = new Result<T>();
        result.setSuccess(false);
        return result;
    }

    public Result<T> success() {
        setSuccess(true);
        return this;
    }

    public Result<T> success(T data) {
        setSuccess(true);
        setData(data);
        return this;
    }

    public Result<T> fail(String code, String description) {
        setSuccess(false);
        setCode(code);
        setDescription(description);
        return this;
    }

    public Result<T> fail(ResultCode resultCode) {
        setSuccess(false);
        setCode(resultCode.getCode());
        setDescription(resultCode.getMessage());
        return this;
    }

    public Result<T> code(String code) {
        setCode(code);
        return this;
    }

    public Result<T> description(String description) {
        setDescription(description);
        return this;
    }

    public Result<T> data(T data) {
        setData(data);
        return this;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "data=" + data +
                '}';
    }
}
