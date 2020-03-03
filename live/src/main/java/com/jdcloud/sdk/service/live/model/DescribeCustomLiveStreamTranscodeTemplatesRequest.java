/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.live.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询用户自定义转码模板列表

 */
public class DescribeCustomLiveStreamTranscodeTemplatesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
- 取值范围 [1, 100000]

     */
    private Integer pageNum;

    /**
     * 分页大小
- 取值范围 [10, 100]

     */
    private Integer pageSize;

    /**
     * 转码模板查询过滤条件:
  - name:   template 转码模板自定义名称
  - value:  如果参数为空，则查询全部
  - 如果为空,则表示查询该用下所有自定义的转码模板

     */
    private List<Filter> filters;


    /**
     * get 页码
- 取值范围 [1, 100000]

     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 页码
- 取值范围 [1, 100000]

     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * get 分页大小
- 取值范围 [10, 100]

     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
- 取值范围 [10, 100]

     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 转码模板查询过滤条件:
  - name:   template 转码模板自定义名称
  - value:  如果参数为空，则查询全部
  - 如果为空,则表示查询该用下所有自定义的转码模板

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set 转码模板查询过滤条件:
  - name:   template 转码模板自定义名称
  - value:  如果参数为空，则查询全部
  - 如果为空,则表示查询该用下所有自定义的转码模板

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * set 页码
- 取值范围 [1, 100000]

     *
     * @param pageNum
     */
    public DescribeCustomLiveStreamTranscodeTemplatesRequest pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * set 分页大小
- 取值范围 [10, 100]

     *
     * @param pageSize
     */
    public DescribeCustomLiveStreamTranscodeTemplatesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 转码模板查询过滤条件:
  - name:   template 转码模板自定义名称
  - value:  如果参数为空，则查询全部
  - 如果为空,则表示查询该用下所有自定义的转码模板

     *
     * @param filters
     */
    public DescribeCustomLiveStreamTranscodeTemplatesRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * add item to 转码模板查询过滤条件:
  - name:   template 转码模板自定义名称
  - value:  如果参数为空，则查询全部
  - 如果为空,则表示查询该用下所有自定义的转码模板

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}