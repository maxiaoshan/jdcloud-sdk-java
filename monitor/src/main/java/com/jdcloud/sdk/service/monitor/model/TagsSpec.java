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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * tagsSpec
 */
public class TagsSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 校验码。调用此API前需找云监控提供
     * Required:true
     */
    @Required
    private String appCode;

    /**
     * 服务码
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 组id,全局唯一，建议用那个UUID
     * Required:true
     */
    @Required
    private String groupCode;

    /**
     * 资源列表
     * Required:true
     */
    @Required
    private List<String> resourceIds;

    /**
     * 进行打tag的数据以及操作
     * Required:true
     */
    @Required
    private HandleTag tags;

    /**
     * 更详细过滤条件
     */
    private List<DataTag> filter;


    /**
     * get 校验码。调用此API前需找云监控提供
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 校验码。调用此API前需找云监控提供
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get 服务码
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 服务码
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 组id,全局唯一，建议用那个UUID
     *
     * @return
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * set 组id,全局唯一，建议用那个UUID
     *
     * @param groupCode
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * get 资源列表
     *
     * @return
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * set 资源列表
     *
     * @param resourceIds
     */
    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    /**
     * get 进行打tag的数据以及操作
     *
     * @return
     */
    public HandleTag getTags() {
        return tags;
    }

    /**
     * set 进行打tag的数据以及操作
     *
     * @param tags
     */
    public void setTags(HandleTag tags) {
        this.tags = tags;
    }

    /**
     * get 更详细过滤条件
     *
     * @return
     */
    public List<DataTag> getFilter() {
        return filter;
    }

    /**
     * set 更详细过滤条件
     *
     * @param filter
     */
    public void setFilter(List<DataTag> filter) {
        this.filter = filter;
    }


    /**
     * set 校验码。调用此API前需找云监控提供
     *
     * @param appCode
     */
    public TagsSpec appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set 服务码
     *
     * @param serviceCode
     */
    public TagsSpec serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 组id,全局唯一，建议用那个UUID
     *
     * @param groupCode
     */
    public TagsSpec groupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }

    /**
     * set 资源列表
     *
     * @param resourceIds
     */
    public TagsSpec resourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    /**
     * set 进行打tag的数据以及操作
     *
     * @param tags
     */
    public TagsSpec tags(HandleTag tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 更详细过滤条件
     *
     * @param filter
     */
    public TagsSpec filter(List<DataTag> filter) {
        this.filter = filter;
        return this;
    }


    /**
     * add item to 资源列表
     *
     * @param resourceId
     */
    public void addResourceId(String resourceId) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceId);
    }

    /**
     * add item to 更详细过滤条件
     *
     * @param filter
     */
    public void addFilter(DataTag filter) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        this.filter.add(filter);
    }

}