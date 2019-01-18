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
 * 监控项相关接口
 * 监控项相关接口，提供可用监控项列表查询和监控数据查询等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.TagFilter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看某资源多个监控项数据，metric介绍1：&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/metrics&quot;&gt;Metrics&lt;/a&gt;
 */
public class DescribeMetricDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 聚合方式，默认等于downSampleType或avg，可选值参考http://opentsdb.net/docs/build/html/user_guide/query/aggregators.html?highlight&#x3D;zimsum#available-aggregators
     */
    private String aggrType;

    /**
     * 采样方式，默认等于aggrType或avg，可选值参考http://opentsdb.net/docs/build/html/user_guide/query/aggregators.html?highlight&#x3D;avg#available-aggregators
     */
    private String downSampleType;

    /**
     * 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     */
    private String startTime;

    /**
     * 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
     */
    private String endTime;

    /**
     * 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval默认为1h，当前时间往 前1h
     */
    private String timeInterval;

    /**
     * 自定义标签/tag；至少要传一个tag，且tag.Values不为空
     */
    private List<TagFilter> tags;

    /**
     * 是否对查询的tags分组
     */
    private Boolean groupBy;

    /**
     * 是否求速率
     */
    private Boolean rate;

    /**
     * 资源的类型，取值vm, lb, ip, database 等
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 资源的uuid
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 监控项英文标识(id)
     * Required:true
     */
    @Required
    private String metric;


    /**
     * get 聚合方式，默认等于downSampleType或avg，可选值参考http://opentsdb.net/docs/build/html/user_guide/query/aggregators.html?highlight&#x3D;zimsum#available-aggregators
     *
     * @return
     */
    public String getAggrType() {
        return aggrType;
    }

    /**
     * set 聚合方式，默认等于downSampleType或avg，可选值参考http://opentsdb.net/docs/build/html/user_guide/query/aggregators.html?highlight&#x3D;zimsum#available-aggregators
     *
     * @param aggrType
     */
    public void setAggrType(String aggrType) {
        this.aggrType = aggrType;
    }

    /**
     * get 采样方式，默认等于aggrType或avg，可选值参考http://opentsdb.net/docs/build/html/user_guide/query/aggregators.html?highlight&#x3D;avg#available-aggregators
     *
     * @return
     */
    public String getDownSampleType() {
        return downSampleType;
    }

    /**
     * set 采样方式，默认等于aggrType或avg，可选值参考http://opentsdb.net/docs/build/html/user_guide/query/aggregators.html?highlight&#x3D;avg#available-aggregators
     *
     * @param downSampleType
     */
    public void setDownSampleType(String downSampleType) {
        this.downSampleType = downSampleType;
    }

    /**
     * get 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval默认为1h，当前时间往 前1h
     *
     * @return
     */
    public String getTimeInterval() {
        return timeInterval;
    }

    /**
     * set 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval默认为1h，当前时间往 前1h
     *
     * @param timeInterval
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

    /**
     * get 自定义标签/tag；至少要传一个tag，且tag.Values不为空
     *
     * @return
     */
    public List<TagFilter> getTags() {
        return tags;
    }

    /**
     * set 自定义标签/tag；至少要传一个tag，且tag.Values不为空
     *
     * @param tags
     */
    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
    }

    /**
     * get 是否对查询的tags分组
     *
     * @return
     */
    public Boolean getGroupBy() {
        return groupBy;
    }

    /**
     * set 是否对查询的tags分组
     *
     * @param groupBy
     */
    public void setGroupBy(Boolean groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * get 是否求速率
     *
     * @return
     */
    public Boolean getRate() {
        return rate;
    }

    /**
     * set 是否求速率
     *
     * @param rate
     */
    public void setRate(Boolean rate) {
        this.rate = rate;
    }

    /**
     * get 资源的类型，取值vm, lb, ip, database 等
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 资源的类型，取值vm, lb, ip, database 等
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 资源的uuid
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源的uuid
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
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
     * get 监控项英文标识(id)
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项英文标识(id)
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }


    /**
     * set 聚合方式，默认等于downSampleType或avg，可选值参考http://opentsdb.net/docs/build/html/user_guide/query/aggregators.html?highlight&#x3D;zimsum#available-aggregators
     *
     * @param aggrType
     */
    public DescribeMetricDataRequest aggrType(String aggrType) {
        this.aggrType = aggrType;
        return this;
    }

    /**
     * set 采样方式，默认等于aggrType或avg，可选值参考http://opentsdb.net/docs/build/html/user_guide/query/aggregators.html?highlight&#x3D;avg#available-aggregators
     *
     * @param downSampleType
     */
    public DescribeMetricDataRequest downSampleType(String downSampleType) {
        this.downSampleType = downSampleType;
        return this;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public DescribeMetricDataRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
     *
     * @param endTime
     */
    public DescribeMetricDataRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval默认为1h，当前时间往 前1h
     *
     * @param timeInterval
     */
    public DescribeMetricDataRequest timeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * set 自定义标签/tag；至少要传一个tag，且tag.Values不为空
     *
     * @param tags
     */
    public DescribeMetricDataRequest tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 是否对查询的tags分组
     *
     * @param groupBy
     */
    public DescribeMetricDataRequest groupBy(Boolean groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * set 是否求速率
     *
     * @param rate
     */
    public DescribeMetricDataRequest rate(Boolean rate) {
        this.rate = rate;
        return this;
    }

    /**
     * set 资源的类型，取值vm, lb, ip, database 等
     *
     * @param serviceCode
     */
    public DescribeMetricDataRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 资源的uuid
     *
     * @param resourceId
     */
    public DescribeMetricDataRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public DescribeMetricDataRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 监控项英文标识(id)
     *
     * @param metric
     */
    public DescribeMetricDataRequest metric(String metric) {
        this.metric = metric;
        return this;
    }


    /**
     * add item to 自定义标签/tag；至少要传一个tag，且tag.Values不为空
     *
     * @param tag
     */
    public void addTag(TagFilter tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}