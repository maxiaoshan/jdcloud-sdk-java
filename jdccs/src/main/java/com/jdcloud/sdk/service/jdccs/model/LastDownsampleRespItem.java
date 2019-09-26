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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 最后一个采样点数据
 */
public class LastDownsampleRespItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 监控项英文标识
     */
    private String metric;

    /**
     * 资源的uuid
     */
    private String resourceId;

    /**
     * 采样值
     */
    private Double value;


    /**
     * get 监控项英文标识
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项英文标识
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
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
     * get 采样值
     *
     * @return
     */
    public Double getValue() {
        return value;
    }

    /**
     * set 采样值
     *
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
    }


    /**
     * set 监控项英文标识
     *
     * @param metric
     */
    public LastDownsampleRespItem metric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * set 资源的uuid
     *
     * @param resourceId
     */
    public LastDownsampleRespItem resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 采样值
     *
     * @param value
     */
    public LastDownsampleRespItem value(Double value) {
        this.value = value;
        return this;
    }


}