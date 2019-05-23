/**
 * Copyright (C), 2019
 * FileName: UserController
 * Author:   york
 * Date:     2019/4/23 10:54
 */
package com.you.you.page.server.consul.controller;

import com.you.you.page.common.dto.request.PagedRequest;
import com.you.you.page.common.dto.request.Request;
import com.you.you.page.common.dto.result.PagedResult;
import com.you.you.page.common.dto.result.Result;
import com.you.you.page.common.dto.result.ResultCode;
import com.you.you.page.common.dto.vo.back.user.UserResultDto;
import com.you.you.page.common.dto.vo.back.user.UserSearchDto;
import com.you.you.page.common.util.ValidatorUtils;
import com.you.you.page.server.consul.service.IUserService;
import com.you.you.page.server.consul.feign.IUserServiceFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户控制〉
 *
 * @author york
 * @create 2019/4/23
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户控制" ,tags = "用户控制")
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IUserServiceFeign userServiceFeign;

    @PostMapping("/save")
    @ApiOperation(value = "新增用户", httpMethod = "POST", notes = "新增用户")
    public Result save(@RequestBody @ApiParam(name="请求对象",value="传入json格式",required=true) Request request){
        Result result = Result.create();
        return result;
    }

    @PostMapping("/list")
    @ApiOperation(value = "列表查询", httpMethod = "POST", notes = "列表查询")
    public PagedResult<UserResultDto> list(@RequestBody @ApiParam(name="请求对象",value="传入json格式",required=true) PagedRequest<UserSearchDto> request){
        PagedResult.Builder<UserResultDto> build = PagedResult.Builder.build(request);
        ValidatorUtils.ValidatorResult validatorResult = ValidatorUtils.validate(request);
        if (!validatorResult.getSuccess()) {
            return build.buildForFailed(ResultCode.PARAM_ERROR.getCode(), validatorResult.getDescription());
        }
        return userServiceFeign.getUserInfoList(request);
    }
}