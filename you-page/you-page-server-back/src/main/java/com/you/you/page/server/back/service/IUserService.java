/**
 * Copyright (C), 2019
 * FileName: IUserService
 * Author:   york
 * Date:     2019/4/23 11:11
 */
package com.you.you.page.server.back.service;

import com.you.you.page.common.dto.request.PagedRequest;
import com.you.you.page.common.dto.result.PagedResult;
import com.you.you.page.common.dto.vo.back.user.UserResultDto;
import com.you.you.page.common.dto.vo.back.user.UserSearchDto;
import com.you.you.page.server.back.dao.User;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户服务类〉
 *
 * @author york
 * @create 2019/4/23
 * @since 1.0.0
 */
public interface IUserService {

    public int save(User user);

    public PagedResult<UserResultDto> list(PagedRequest<UserSearchDto> request, PagedResult.Builder<UserResultDto> builder);
}