/**
 * Copyright (C), 2019
 * FileName: UserResultDto
 * Author:   york
 * Date:     2019/4/23 11:32
 */
package com.you.you.page.common.dto.vo.back.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户查询返回数据〉
 *
 * @author york
 * @create 2019/4/23
 * @since 1.0.0
 */
@ApiModel(value = "用户查询返回数据")
@Data
public class UserResultDto implements Serializable {

    private static final long serialVersionUID = -3604446963085052490L;

    @ApiModelProperty(value = "ID", name = "id")
    private Integer id;

    @ApiModelProperty(value = "weichatId", name = "weichatId")
    private String weichatId;
    /**
     * 昵称(微信昵称)
     */
    @ApiModelProperty(value = "用户昵称", name = "nickname")
    private String nickname;
    /**
     * 用户头像地址
     */
    @ApiModelProperty(value = "用户头像地址", name = "userImage")
    private String userImage;
    /**
     * 客户类型(0:一般客户,1:认证客户)
     */
    @ApiModelProperty(value = "客户类型(0:一般客户,1:认证客户)", name = "type")
    private Integer type;
    /**
     * 认证级别(0:一级,1:二级)
     */
    @ApiModelProperty(value = "认证级别(0:一级,1:二级)", name = "authLevel")
    private Integer authLevel;
    /**
     * 联系电话
     */
    @ApiModelProperty(value = "联系电话", name = "userPhone")
    private String userPhone;
    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名", name = "name")
    private String name;
    /**
     * 性别（0男 1女 2未知）
     */
    @ApiModelProperty(value = "性别（0男 1女 2未知）", name = "sex")
    private Integer sex;

    @ApiModelProperty(value = "省/市", name = "positionRrovince")
    private Integer positionProvince;

    @ApiModelProperty(value = "区/市/县", name = "positionCity")
    private Integer positionCity;

    @ApiModelProperty(value = "详细地址", name = "positionDetail")
    private String positionDetail;
    /*
        孩子姓名
     */
    @ApiModelProperty(value = "孩子姓名", name = "childName")
    private String childName;
    /*
        孩子年龄
     */
    @ApiModelProperty(value = "孩子年龄", name = "childAge")
    private Integer childAge;
    /*
        孩子性别（0男 1女 2未知）
     */
    @ApiModelProperty(value = "孩子性别（0男 1女 2未知）", name = "childSex")
    private Integer childSex;

    /*
       资金
    */
    @ApiModelProperty(value = "资金", name = "capital")
    private Integer capital;
    /*
    冻结资金
     */
    @ApiModelProperty(value = "冻结资金", name = "frozenCapital")
    private Integer frozenCapital;
    /*
    状态（0正常 1停用）
     */
    @ApiModelProperty(value = "状态（0正常 1停用）", name = "visible")
    private Integer visible;
    @ApiModelProperty(value = "创建时间", name = "createTime")
    private String createTime;
    @ApiModelProperty(value = "开始时间", name = "beginTime")
    private String beginTime;
    @ApiModelProperty(value = "结束时间", name = "endTime")
    private String endTime;

    @ApiModelProperty(value = "备注", name = "remark")
    private String remark;
}