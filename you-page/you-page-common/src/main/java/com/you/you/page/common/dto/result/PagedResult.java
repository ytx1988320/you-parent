package com.you.you.page.common.dto.result;

import com.you.you.page.common.dto.request.PagedRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页请求结果
 *
 *
 * @date 2018/4/16
 */
@ApiModel(value = "分页请求结果", description = "分页请求结果")
public class PagedResult<T> extends Result<List<T>> {

    private static final long serialVersionUID = 1L;

    /**
     * 是否查询全部 此参数为true，则会忽略page和pageSize参数
     */
    @ApiModelProperty(value = "是否查询全部 此参数为true，则会忽略page和pageSize参数", name = "fetchAll")
    private boolean fetchAll = false;

    /**
     * 当前页 默认第1页
     */
    @ApiModelProperty(value = "当前页 默认第1页", name = "currentPage")
    private int currentPage;

    /**
     * 当前页大小 默认10条
     */
    @ApiModelProperty(value = "当前页大小 默认10条", name = "pageSize")
    private int pageSize;

    /**
     * 总页数
     */
    @ApiModelProperty(value = "总页数", name = "totalPage")
    private int totalPage;

    /**
     * 总条数
     */
    @ApiModelProperty(value = "总条数", name = "totalCount")
    private long totalCount;

    /**
     * 构建请使用PagedResult.Builder构建
     */
    public PagedResult() {
    }

    public boolean isFetchAll() {
        return fetchAll;
    }

    public void setFetchAll(boolean fetchAll) {
        this.fetchAll = fetchAll;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public static class Builder<T> {

        private PagedResult<T> pagedResult;

        public Builder() {
            this.pagedResult = new PagedResult<T>();
        }

        public static <T> Builder build(PagedRequest request) {
            return new Builder<T>()
                    .currentPage(request.getCurrentPage())
                    .pageSize(request.getPageSize());
        }

        public Builder<T> fetchAll(boolean fetchAll) {
            this.pagedResult.setFetchAll(fetchAll);
            return this;
        }

        public Builder<T> currentPage(int currentPage) {
            if (currentPage < 1) {
                throw new IllegalArgumentException("currentPage must be greater than 1 but " + currentPage);
            }
            this.pagedResult.setCurrentPage(currentPage);
            return this;
        }


        public Builder<T> pageSize(int pageSize) {
            if (pageSize < 1) {
                throw new IllegalArgumentException("pageSize must be greater than 1 but " + pageSize);
            }
            this.pagedResult.setPageSize(pageSize);
            return this;
        }

        public PagedResult<T> buildForFailed(ResultCode resultCode) {
            this.buildForEmpty();
            this.pagedResult.fail(resultCode.getCode(), resultCode.getMessage());

            return this.pagedResult;
        }

        public PagedResult<T> buildForFailed(String code, String description) {
            this.buildForEmpty();
            this.pagedResult.fail(code, description);

            return this.pagedResult;
        }

        public PagedResult<T> buildForSuccess(int totalPage, long totalCount, List<T> data) {
            if (null == data) {
                return this.buildForEmpty();
            }

            if (totalPage < 0) {
                throw new IllegalArgumentException("totalPage must be greater than 0 but " + totalPage);
            }
            this.pagedResult.setTotalPage(totalPage);
            if (totalCount < 0) {
                throw new IllegalArgumentException("totalCount must be greater than 0 but " + totalCount);
            }
            this.pagedResult.setTotalCount(totalCount);

            this.pagedResult.success(data);
            return this.pagedResult;
        }

        public PagedResult<T> buildForEmpty() {
            this.pagedResult.setTotalPage(0);
            this.pagedResult.setTotalCount(0);
            this.pagedResult.success(new ArrayList<T>());

            return this.pagedResult;
        }

    }

    @Override
    public String toString() {
        return "PagedResult{" +
                "fetchAll=" + fetchAll +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                ", totalCount=" + totalCount +
                '}';
    }
}
