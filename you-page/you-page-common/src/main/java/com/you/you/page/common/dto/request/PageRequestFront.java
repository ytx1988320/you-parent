/**
 * Copyright (C), 2019
 * FileName: RequestFront
 * Author:   york
 * Date:     2019/4/9 15:53
 */
package com.you.you.page.common.dto.request;

import com.you.you.page.common.dto.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 〈一句话功能简述〉<br> 
 * 〈app/h5请求对象〉
 *
 * @author york
 * @create 2019/4/9
 * @since 1.0.0
 */
@ApiModel(value = "app/h5请求对象", description = "app/h5请求对象")
public class PageRequestFront<T> extends BaseRequest {

    private static final long serialVersionUID = 313587517018946869L;

    /**
     * 请求参数，可为基本类型（包装类），可以为其它可序列化对象
     */
    @ApiModelProperty(value = "请求参数，可为基本类型（包装类），可以为其它可序列化对象", name = "data")
    @Valid
    private T data;

    public static final int DEFAULT_CURRENT_PAGE = 1;
    public static final int DEFAULT_PAGE_SIZE = 10;

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


    public PageRequestFront() {
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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

    @Override
    public String toString() {
        return "PageRequestFront{" +
                "data=" + data +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}