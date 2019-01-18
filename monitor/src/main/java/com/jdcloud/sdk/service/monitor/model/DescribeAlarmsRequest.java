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
 * Monitoring Rules APIs
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询规则, 查询参数组合及优先级从高到低为：
1：alarmId不为空
2：serviceCode不为空
2.1：serviceCode + resourceId
2.2: serviceCode + resourceIds
3：serviceCodes不为空
4: 所有规则
 */
public class DescribeAlarmsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前所在页，默认为1
     */
    private Long pageNumber;

    /**
     * 页面大小，默认为20；取值范围[1, 100]
     */
    private Long pageSize;

    /**
     * 产品名称
     */
    private String serviceCode;

    /**
     * 资源ID
     */
    private String resourceId;

    /**
     * 规则类型, 1表示资源监控，6表示站点监控,7表示可用性监控
     */
    private Long ruleType;

    /**
     * 规则报警状态, 1：正常, 2：报警，4：数据不足
     */
    private Long status;

    /**
     * 规则状态：1为启用，0为禁用
     */
    private Long enabled;

    /**
     * 是否为正在报警的规则，0为忽略，1为是，与 status 同时只能生效一个,isAlarming 优先生效
     */
    private Long isAlarming;

    /**
     * 规则的id
     */
    private String alarmId;

    /**
     * 服务码或资源Id列表
filter name 为serviceCodes表示查询多个产品线的规则
filter name 为resourceIds表示查询多个资源的规则
     */
    private List<Filter> filters;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 当前所在页，默认为1
     *
     * @return
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前所在页，默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 页面大小，默认为20；取值范围[1, 100]
     *
     * @return
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * set 页面大小，默认为20；取值范围[1, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 产品名称
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品名称
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 资源ID
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 规则类型, 1表示资源监控，6表示站点监控,7表示可用性监控
     *
     * @return
     */
    public Long getRuleType() {
        return ruleType;
    }

    /**
     * set 规则类型, 1表示资源监控，6表示站点监控,7表示可用性监控
     *
     * @param ruleType
     */
    public void setRuleType(Long ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * get 规则报警状态, 1：正常, 2：报警，4：数据不足
     *
     * @return
     */
    public Long getStatus() {
        return status;
    }

    /**
     * set 规则报警状态, 1：正常, 2：报警，4：数据不足
     *
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * get 规则状态：1为启用，0为禁用
     *
     * @return
     */
    public Long getEnabled() {
        return enabled;
    }

    /**
     * set 规则状态：1为启用，0为禁用
     *
     * @param enabled
     */
    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    /**
     * get 是否为正在报警的规则，0为忽略，1为是，与 status 同时只能生效一个,isAlarming 优先生效
     *
     * @return
     */
    public Long getIsAlarming() {
        return isAlarming;
    }

    /**
     * set 是否为正在报警的规则，0为忽略，1为是，与 status 同时只能生效一个,isAlarming 优先生效
     *
     * @param isAlarming
     */
    public void setIsAlarming(Long isAlarming) {
        this.isAlarming = isAlarming;
    }

    /**
     * get 规则的id
     *
     * @return
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * set 规则的id
     *
     * @param alarmId
     */
    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    /**
     * get 服务码或资源Id列表
filter name 为serviceCodes表示查询多个产品线的规则
filter name 为resourceIds表示查询多个资源的规则
     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set 服务码或资源Id列表
filter name 为serviceCodes表示查询多个产品线的规则
filter name 为resourceIds表示查询多个资源的规则
     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 当前所在页，默认为1
     *
     * @param pageNumber
     */
    public DescribeAlarmsRequest pageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 页面大小，默认为20；取值范围[1, 100]
     *
     * @param pageSize
     */
    public DescribeAlarmsRequest pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 产品名称
     *
     * @param serviceCode
     */
    public DescribeAlarmsRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public DescribeAlarmsRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 规则类型, 1表示资源监控，6表示站点监控,7表示可用性监控
     *
     * @param ruleType
     */
    public DescribeAlarmsRequest ruleType(Long ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * set 规则报警状态, 1：正常, 2：报警，4：数据不足
     *
     * @param status
     */
    public DescribeAlarmsRequest status(Long status) {
        this.status = status;
        return this;
    }

    /**
     * set 规则状态：1为启用，0为禁用
     *
     * @param enabled
     */
    public DescribeAlarmsRequest enabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 是否为正在报警的规则，0为忽略，1为是，与 status 同时只能生效一个,isAlarming 优先生效
     *
     * @param isAlarming
     */
    public DescribeAlarmsRequest isAlarming(Long isAlarming) {
        this.isAlarming = isAlarming;
        return this;
    }

    /**
     * set 规则的id
     *
     * @param alarmId
     */
    public DescribeAlarmsRequest alarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * set 服务码或资源Id列表
filter name 为serviceCodes表示查询多个产品线的规则
filter name 为resourceIds表示查询多个资源的规则
     *
     * @param filters
     */
    public DescribeAlarmsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public DescribeAlarmsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 服务码或资源Id列表
filter name 为serviceCodes表示查询多个产品线的规则
filter name 为resourceIds表示查询多个资源的规则
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