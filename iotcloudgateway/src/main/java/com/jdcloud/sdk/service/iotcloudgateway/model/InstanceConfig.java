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

package com.jdcloud.sdk.service.iotcloudgateway.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * instanceConfig
 */
public class InstanceConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务id
     * Required:true
     */
    @Required
    private String serviceId;

    /**
     * 产品key
     * Required:true
     */
    @Required
    private String productKey;

    /**
     * 产品secret
     * Required:true
     */
    @Required
    private String productSecret;

    /**
     * 支持协议(jt808,gbt32960)
     * Required:true
     */
    @Required
    private String protocol;

    /**
     * hub mqtt地址
     * Required:true
     */
    @Required
    private String mqttAddr;

    /**
     * hub http地址
     * Required:true
     */
    @Required
    private String httpAddr;

    /**
     * redis地址
     * Required:true
     */
    @Required
    private String redisAddr;

    /**
     * 本地多媒体存放路径
     * Required:true
     */
    @Required
    private String mediaStore;

    /**
     * 网关设备ID
     * Required:true
     */
    @Required
    private String gwdevId;

    /**
     * 关联的OSS配置
     */
    private OssSpec ossSpec;

    /**
     * 关联的DW认证配置
     */
    private DwAuthSpec dwAuthSpec;


    /**
     * get 服务id
     *
     * @return
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * set 服务id
     *
     * @param serviceId
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * get 产品key
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 产品key
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    /**
     * get 产品secret
     *
     * @return
     */
    public String getProductSecret() {
        return productSecret;
    }

    /**
     * set 产品secret
     *
     * @param productSecret
     */
    public void setProductSecret(String productSecret) {
        this.productSecret = productSecret;
    }

    /**
     * get 支持协议(jt808,gbt32960)
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set 支持协议(jt808,gbt32960)
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * get hub mqtt地址
     *
     * @return
     */
    public String getMqttAddr() {
        return mqttAddr;
    }

    /**
     * set hub mqtt地址
     *
     * @param mqttAddr
     */
    public void setMqttAddr(String mqttAddr) {
        this.mqttAddr = mqttAddr;
    }

    /**
     * get hub http地址
     *
     * @return
     */
    public String getHttpAddr() {
        return httpAddr;
    }

    /**
     * set hub http地址
     *
     * @param httpAddr
     */
    public void setHttpAddr(String httpAddr) {
        this.httpAddr = httpAddr;
    }

    /**
     * get redis地址
     *
     * @return
     */
    public String getRedisAddr() {
        return redisAddr;
    }

    /**
     * set redis地址
     *
     * @param redisAddr
     */
    public void setRedisAddr(String redisAddr) {
        this.redisAddr = redisAddr;
    }

    /**
     * get 本地多媒体存放路径
     *
     * @return
     */
    public String getMediaStore() {
        return mediaStore;
    }

    /**
     * set 本地多媒体存放路径
     *
     * @param mediaStore
     */
    public void setMediaStore(String mediaStore) {
        this.mediaStore = mediaStore;
    }

    /**
     * get 网关设备ID
     *
     * @return
     */
    public String getGwdevId() {
        return gwdevId;
    }

    /**
     * set 网关设备ID
     *
     * @param gwdevId
     */
    public void setGwdevId(String gwdevId) {
        this.gwdevId = gwdevId;
    }

    /**
     * get 关联的OSS配置
     *
     * @return
     */
    public OssSpec getOssSpec() {
        return ossSpec;
    }

    /**
     * set 关联的OSS配置
     *
     * @param ossSpec
     */
    public void setOssSpec(OssSpec ossSpec) {
        this.ossSpec = ossSpec;
    }

    /**
     * get 关联的DW认证配置
     *
     * @return
     */
    public DwAuthSpec getDwAuthSpec() {
        return dwAuthSpec;
    }

    /**
     * set 关联的DW认证配置
     *
     * @param dwAuthSpec
     */
    public void setDwAuthSpec(DwAuthSpec dwAuthSpec) {
        this.dwAuthSpec = dwAuthSpec;
    }


    /**
     * set 服务id
     *
     * @param serviceId
     */
    public InstanceConfig serviceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * set 产品key
     *
     * @param productKey
     */
    public InstanceConfig productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * set 产品secret
     *
     * @param productSecret
     */
    public InstanceConfig productSecret(String productSecret) {
        this.productSecret = productSecret;
        return this;
    }

    /**
     * set 支持协议(jt808,gbt32960)
     *
     * @param protocol
     */
    public InstanceConfig protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set hub mqtt地址
     *
     * @param mqttAddr
     */
    public InstanceConfig mqttAddr(String mqttAddr) {
        this.mqttAddr = mqttAddr;
        return this;
    }

    /**
     * set hub http地址
     *
     * @param httpAddr
     */
    public InstanceConfig httpAddr(String httpAddr) {
        this.httpAddr = httpAddr;
        return this;
    }

    /**
     * set redis地址
     *
     * @param redisAddr
     */
    public InstanceConfig redisAddr(String redisAddr) {
        this.redisAddr = redisAddr;
        return this;
    }

    /**
     * set 本地多媒体存放路径
     *
     * @param mediaStore
     */
    public InstanceConfig mediaStore(String mediaStore) {
        this.mediaStore = mediaStore;
        return this;
    }

    /**
     * set 网关设备ID
     *
     * @param gwdevId
     */
    public InstanceConfig gwdevId(String gwdevId) {
        this.gwdevId = gwdevId;
        return this;
    }

    /**
     * set 关联的OSS配置
     *
     * @param ossSpec
     */
    public InstanceConfig ossSpec(OssSpec ossSpec) {
        this.ossSpec = ossSpec;
        return this;
    }

    /**
     * set 关联的DW认证配置
     *
     * @param dwAuthSpec
     */
    public InstanceConfig dwAuthSpec(DwAuthSpec dwAuthSpec) {
        this.dwAuthSpec = dwAuthSpec;
        return this;
    }


}