package com.you.you.page.common.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * 分页请求对象
 *
 *
 * @date 2018/4/16
 */
@ApiModel(value = "分页请求对象", description = "分页请求对象")
public class PagedRequest<T> extends BaseRequest {

    private static final long serialVersionUID = -1669589036953854905L;

    public static final int DEFAULT_CURRENT_PAGE = 1;
    public static final int DEFAULT_PAGE_SIZE = 10;

    private T data;
    /**
     * 当前页 默认第1页
     */
    @ApiModelProperty(value = "当前页 默认第1页", name = "currentPage")
    private int currentPage = DEFAULT_CURRENT_PAGE;

    /**
     * 当前页大小 默认10条
     */
    @ApiModelProperty(value = "当前页大小 默认10条", name = "pageSize")
    private int pageSize = DEFAULT_PAGE_SIZE;


    public PagedRequest() {
    }


    public void setPageParam(int currentPage, int pageSize, boolean fetchAll) {
        setCurrentPage(currentPage);
        setPageSize(pageSize);
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = resolveCurrentPage(currentPage);
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = resolvePageSize(pageSize);
    }


    public int resolvePageSize(int pageSize) {
        if (pageSize <= 0) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        return pageSize;
    }

    public int resolveCurrentPage(int currentPage) {
        if (currentPage <= 0) {
            currentPage = 1;
        }
        return currentPage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
