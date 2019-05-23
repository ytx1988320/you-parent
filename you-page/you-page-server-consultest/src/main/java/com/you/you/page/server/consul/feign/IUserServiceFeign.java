package com.you.you.page.server.consul.feign;

import com.you.you.page.common.dto.request.PagedRequest;
import com.you.you.page.common.dto.result.PagedResult;
import com.you.you.page.common.dto.vo.back.user.UserResultDto;
import com.you.you.page.common.dto.vo.back.user.UserSearchDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "you-page-server-back")
public interface IUserServiceFeign {

    @PostMapping("/page-back/user/list")
    PagedResult<UserResultDto> getUserInfoList(PagedRequest<UserSearchDto> request);
}
