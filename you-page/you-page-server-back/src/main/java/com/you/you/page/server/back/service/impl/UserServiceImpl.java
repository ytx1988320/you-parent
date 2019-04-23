/**
 * Copyright (C), 2019
 * FileName: UserServiceImpl
 * Author:   york
 * Date:     2019/4/23 11:12
 */
package com.you.you.page.server.back.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.you.you.page.common.dto.request.PagedRequest;
import com.you.you.page.common.dto.result.PagedResult;
import com.you.you.page.common.dto.vo.back.user.UserResultDto;
import com.you.you.page.common.dto.vo.back.user.UserSearchDto;
import com.you.you.page.server.back.dao.User;
import com.you.you.page.server.back.dao.UserExample;
import com.you.you.page.server.back.mapper.UserMapper;
import com.you.you.page.server.back.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public PagedResult<UserResultDto> list(PagedRequest<UserSearchDto> request, PagedResult.Builder<UserResultDto> builder) {
        PageHelper.startPage(request.getCurrentPage(), request.getPageSize());
        UserExample example =new UserExample();
        User u =new User();
        if(!Objects.isNull(request.getData())){
            BeanUtils.copyProperties(request.getData(),u);
        }
        List<UserResultDto> userInfoPos = userMapper.selectList(u);
        PageInfo page = new PageInfo(userInfoPos);
        return builder.buildForSuccess(page.getPages(),page.getTotal(),userInfoPos);
    }
}