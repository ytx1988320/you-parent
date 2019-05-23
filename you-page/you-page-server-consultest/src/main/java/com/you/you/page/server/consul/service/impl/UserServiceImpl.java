/**
 * Copyright (C), 2019
 * FileName: UserServiceImpl
 * Author:   york
 * Date:     2019/4/23 11:12
 */
package com.you.you.page.server.consul.service.impl;

import com.you.you.page.common.dto.request.PagedRequest;
import com.you.you.page.common.dto.result.PagedResult;
import com.you.you.page.common.dto.vo.back.user.UserResultDto;
import com.you.you.page.common.dto.vo.back.user.UserSearchDto;
import com.you.you.page.server.consul.dao.User;
import com.you.you.page.server.consul.service.IUserService;
import org.springframework.stereotype.Service;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author york
 * @create 2019/4/23
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements IUserService {


    @Override
    public int save(User user) {
        return 0;
    }

    @Override
    public PagedResult<UserResultDto> list(PagedRequest<UserSearchDto> request, PagedResult.Builder<UserResultDto> builder) {
        return builder.buildForEmpty();
    }
}