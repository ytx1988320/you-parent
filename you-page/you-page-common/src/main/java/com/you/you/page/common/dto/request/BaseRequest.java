package com.you.you.page.common.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @date 2018/4/16
 */
@Data
public class BaseRequest implements Serializable {

    private static final long serialVersionUID = 478976166112073925L;

    @ApiModelProperty(value = "请求来源(pc/h5/app/)", name = "source")
    private String source;

    @ApiModelProperty(value = "接口版本(如:1.0.0)", name = "version")
    private String version;
}
