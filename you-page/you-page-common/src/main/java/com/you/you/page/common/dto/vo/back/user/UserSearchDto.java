/**
 * Copyright (C), 2019
 * FileName: UserSearchDto
 * Author:   york
 * Date:     2019/4/23 11:30
 */
package com.you.you.page.common.dto.vo.back.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户搜索dto〉
 *
 * @author york
 * @create 2019/4/23
 * @since 1.0.0
 */
@ApiModel(value ="用户搜索dto" )
@Data
public class UserSearchDto  implements Serializable {

    @ApiModelProperty(value = "用户昵称",name = "nickname")
    private String nickname;
}