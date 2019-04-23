/**
 * Copyright (C), 2019
 * FileName: UserDto
 * Author:   york
 * Date:     2019/4/23 11:02
 */
package com.you.you.page.common.dto.vo.back.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈新增用户dto〉
 *
 * @author york
 * @create 2019/4/23
 * @since 1.0.0
 */
@ApiModel(value ="新增用户dto" )
@Data
public class UserDto implements Serializable {

    private static final long serialVersionUID = -3737774834438516122L;
    @ApiModelProperty(value = "微信id", name = "weichatId" ,required = true)
    @NotBlank(message = "微信id不能为空")
    private String weichatId;
    /**
     * 昵称(微信昵称)
     */
    @ApiModelProperty(value = "用户昵称", name = "nickname" ,required = true)
    @NotBlank(message = "用户昵称不能为空")
    private String nickname;
    /**
     * 用户头像地址
     */
    @ApiModelProperty(value = "用户头像地址", name = "userImage")
    private String userImage;



}