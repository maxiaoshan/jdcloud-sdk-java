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
 * DeviceManager
 * 用于完成设备全生命周期管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 客户用该接口可以查询设备命令列表

 */
public class QueryDeviceCommandsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Device 唯一标识
     * Required:true
     */
    @Required
    private String deviceId;


    /**
     * get Device 唯一标识
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set Device 唯一标识
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * set Device 唯一标识
     *
     * @param deviceId
     */
    public QueryDeviceCommandsRequest deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }


}