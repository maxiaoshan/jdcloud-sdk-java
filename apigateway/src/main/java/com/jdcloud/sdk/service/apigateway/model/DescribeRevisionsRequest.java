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
 * 修订版本
 * 提供修订版本的创建、查询、删除、修改、查重功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询修订版本列表
 */
public class DescribeRevisionsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码, 默认为1, 取值范围：[1,∞)
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认为20，取值范围：[10,100]
     */
    private Integer pageSize;

    /**
     * revision - 修订版本号，精确匹配
environment - 发布环境，模糊匹配
revisionNote - 修订备注，精确匹配

     */
    private List<Filter> filters;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 分组ID
     * Required:true
     */
    @Required
    private String apiGroupId;


    /**
     * get 页码, 默认为1, 取值范围：[1,∞)
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为1, 取值范围：[1,∞)
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小，默认为20，取值范围：[10,100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get revision - 修订版本号，精确匹配
environment - 发布环境，模糊匹配
revisionNote - 修订备注，精确匹配

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set revision - 修订版本号，精确匹配
environment - 发布环境，模糊匹配
revisionNote - 修订备注，精确匹配

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 分组ID
     *
     * @return
     */
    public String getApiGroupId() {
        return apiGroupId;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public void setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
    }


    /**
     * set 页码, 默认为1, 取值范围：[1,∞)
     *
     * @param pageNumber
     */
    public DescribeRevisionsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public DescribeRevisionsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set revision - 修订版本号，精确匹配
environment - 发布环境，模糊匹配
revisionNote - 修订备注，精确匹配

     *
     * @param filters
     */
    public DescribeRevisionsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeRevisionsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public DescribeRevisionsRequest apiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }


    /**
     * add item to revision - 修订版本号，精确匹配
environment - 发布环境，模糊匹配
revisionNote - 修订备注，精确匹配

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