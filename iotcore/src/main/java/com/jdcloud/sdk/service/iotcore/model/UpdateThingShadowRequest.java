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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更新设备影子的期望值
 */
public class UpdateThingShadowRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 运行状态
     */
    private Object state;

    /**
     * 设备影子版本,当前版本加1，当前版本默认其实版本为-1
用户主动更新版本号时，设备影子会检查请求中的主动更新版本号是否大于当前版本号。
如果大于当前版本号，则更新设备影子，并将影子版本值更新到请求的版本中，反之则会拒绝更新设备影子。
影子版本参数为Integer型
取值范围：0到2147483647(2的31次方-1)
当取值达到最大值2147483647(2的31次方-1)时，请求中的主动更新版本号应为-1

     */
    private Integer version;

    /**
     * 设备归属的实例ID
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 设备归属的实例所在区域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 设备唯一标识
     * Required:true
     */
    @Required
    private String identifier;

    /**
     * 产品Key
     * Required:true
     */
    @Required
    private String productKey;


    /**
     * get 运行状态
     *
     * @return
     */
    public Object getState() {
        return state;
    }

    /**
     * set 运行状态
     *
     * @param state
     */
    public void setState(Object state) {
        this.state = state;
    }

    /**
     * get 设备影子版本,当前版本加1，当前版本默认其实版本为-1
用户主动更新版本号时，设备影子会检查请求中的主动更新版本号是否大于当前版本号。
如果大于当前版本号，则更新设备影子，并将影子版本值更新到请求的版本中，反之则会拒绝更新设备影子。
影子版本参数为Integer型
取值范围：0到2147483647(2的31次方-1)
当取值达到最大值2147483647(2的31次方-1)时，请求中的主动更新版本号应为-1

     *
     * @return
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * set 设备影子版本,当前版本加1，当前版本默认其实版本为-1
用户主动更新版本号时，设备影子会检查请求中的主动更新版本号是否大于当前版本号。
如果大于当前版本号，则更新设备影子，并将影子版本值更新到请求的版本中，反之则会拒绝更新设备影子。
影子版本参数为Integer型
取值范围：0到2147483647(2的31次方-1)
当取值达到最大值2147483647(2的31次方-1)时，请求中的主动更新版本号应为-1

     *
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * get 设备归属的实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 设备归属的实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 设备归属的实例所在区域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 设备归属的实例所在区域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 设备唯一标识
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * set 设备唯一标识
     *
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * get 产品Key
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }


    /**
     * set 运行状态
     *
     * @param state
     */
    public UpdateThingShadowRequest state(Object state) {
        this.state = state;
        return this;
    }

    /**
     * set 设备影子版本,当前版本加1，当前版本默认其实版本为-1
用户主动更新版本号时，设备影子会检查请求中的主动更新版本号是否大于当前版本号。
如果大于当前版本号，则更新设备影子，并将影子版本值更新到请求的版本中，反之则会拒绝更新设备影子。
影子版本参数为Integer型
取值范围：0到2147483647(2的31次方-1)
当取值达到最大值2147483647(2的31次方-1)时，请求中的主动更新版本号应为-1

     *
     * @param version
     */
    public UpdateThingShadowRequest version(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * set 设备归属的实例ID
     *
     * @param instanceId
     */
    public UpdateThingShadowRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 设备归属的实例所在区域
     *
     * @param regionId
     */
    public UpdateThingShadowRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 设备唯一标识
     *
     * @param identifier
     */
    public UpdateThingShadowRequest identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public UpdateThingShadowRequest productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }


}