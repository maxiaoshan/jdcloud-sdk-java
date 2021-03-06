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
 * 监控项相关接口，提供自定义监控数据上报功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitorcm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.monitorcm.model.MetricData;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 上报用户自定义监控数据
 */
public class PutMetricDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据参数
     * Required:true
     */
    @Required
    private List<MetricData> metricDataList;


    /**
     * get 数据参数
     *
     * @return
     */
    public List<MetricData> getMetricDataList() {
        return metricDataList;
    }

    /**
     * set 数据参数
     *
     * @param metricDataList
     */
    public void setMetricDataList(List<MetricData> metricDataList) {
        this.metricDataList = metricDataList;
    }


    /**
     * set 数据参数
     *
     * @param metricDataList
     */
    public PutMetricDataRequest metricDataList(List<MetricData> metricDataList) {
        this.metricDataList = metricDataList;
        return this;
    }


    /**
     * add item to 数据参数
     *
     * @param metricDataList
     */
    public void addMetricDataList(MetricData metricDataList) {
        if (this.metricDataList == null) {
            this.metricDataList = new ArrayList<>();
        }
        this.metricDataList.add(metricDataList);
    }

}