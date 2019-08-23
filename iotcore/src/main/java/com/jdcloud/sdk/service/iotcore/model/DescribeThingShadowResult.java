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
 * DeviceInfo
 * device管理模块
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看设备影子
 */
public class DescribeThingShadowResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备状态
     */
    private Object state;

    /**
     * 当用户更新设备状态文档后，设备影子服务会自动更新metadata的值。设备状态的元数据的信息包含以 Epoch 时间表示的每个属性的时间戳，用来获取准确的更新时间。
     */
    private Object metadata;

    /**
     * 设备影子版本
     */
    private Integer version;

    /**
     * 设备影子更新时间
     */
    private Long timestamp;


    /**
     * get 设备状态
     *
     * @return
     */
    public Object getState() {
        return state;
    }

    /**
     * set 设备状态
     *
     * @param state
     */
    public void setState(Object state) {
        this.state = state;
    }

    /**
     * get 当用户更新设备状态文档后，设备影子服务会自动更新metadata的值。设备状态的元数据的信息包含以 Epoch 时间表示的每个属性的时间戳，用来获取准确的更新时间。
     *
     * @return
     */
    public Object getMetadata() {
        return metadata;
    }

    /**
     * set 当用户更新设备状态文档后，设备影子服务会自动更新metadata的值。设备状态的元数据的信息包含以 Epoch 时间表示的每个属性的时间戳，用来获取准确的更新时间。
     *
     * @param metadata
     */
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
     * get 设备影子版本
     *
     * @return
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * set 设备影子版本
     *
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * get 设备影子更新时间
     *
     * @return
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * set 设备影子更新时间
     *
     * @param timestamp
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * set 设备状态
     *
     * @param state
     */
    public DescribeThingShadowResult state(Object state) {
        this.state = state;
        return this;
    }

    /**
     * set 当用户更新设备状态文档后，设备影子服务会自动更新metadata的值。设备状态的元数据的信息包含以 Epoch 时间表示的每个属性的时间戳，用来获取准确的更新时间。
     *
     * @param metadata
     */
    public DescribeThingShadowResult metadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * set 设备影子版本
     *
     * @param version
     */
    public DescribeThingShadowResult version(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * set 设备影子更新时间
     *
     * @param timestamp
     */
    public DescribeThingShadowResult timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }


}