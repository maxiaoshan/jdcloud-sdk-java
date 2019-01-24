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

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * createSlb
 */
public class CreateSlb  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 所属云ID
     */
    private String cloudID;

    /**
     * 负载均衡实例ID。
     */
    private String id;

    /**
     * 负载均衡实例的名称。
     */
    private String name;

    /**
     * 负载均衡实例状态
     */
    private String status;

    /**
     * 负载均衡实例的服务地址。
     */
    private String ipAddress;

    /**
     * 负载均衡实例的网络类型。
     */
    private String addressType;

    /**
     * 私网负载均衡实例的交换机ID。
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * 私网负载均衡实例的专有网络ID。
     */
    private String vpc;

    /**
     * 私网负载均衡实例的网络类型
     */
    private String networkType;

    /**
     * 实例的主可用区ID。
     */
    private String masterAz;

    /**
     * 实例的备可用区ID。
     */
    private String slaveAz;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 否  负载均衡实例的规格
     */
    private String loadBalancerSpec;


    /**
     * get 所属云ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 所属云ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }

    /**
     * get 负载均衡实例ID。
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 负载均衡实例ID。
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 负载均衡实例的名称。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 负载均衡实例的名称。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 负载均衡实例状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 负载均衡实例状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 负载均衡实例的服务地址。
     *
     * @return
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * set 负载均衡实例的服务地址。
     *
     * @param ipAddress
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * get 负载均衡实例的网络类型。
     *
     * @return
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * set 负载均衡实例的网络类型。
     *
     * @param addressType
     */
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    /**
     * get 私网负载均衡实例的交换机ID。
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 私网负载均衡实例的交换机ID。
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 私网负载均衡实例的专有网络ID。
     *
     * @return
     */
    public String getVpc() {
        return vpc;
    }

    /**
     * set 私网负载均衡实例的专有网络ID。
     *
     * @param vpc
     */
    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    /**
     * get 私网负载均衡实例的网络类型
     *
     * @return
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * set 私网负载均衡实例的网络类型
     *
     * @param networkType
     */
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * get 实例的主可用区ID。
     *
     * @return
     */
    public String getMasterAz() {
        return masterAz;
    }

    /**
     * set 实例的主可用区ID。
     *
     * @param masterAz
     */
    public void setMasterAz(String masterAz) {
        this.masterAz = masterAz;
    }

    /**
     * get 实例的备可用区ID。
     *
     * @return
     */
    public String getSlaveAz() {
        return slaveAz;
    }

    /**
     * set 实例的备可用区ID。
     *
     * @param slaveAz
     */
    public void setSlaveAz(String slaveAz) {
        this.slaveAz = slaveAz;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 否  负载均衡实例的规格
     *
     * @return
     */
    public String getLoadBalancerSpec() {
        return loadBalancerSpec;
    }

    /**
     * set 否  负载均衡实例的规格
     *
     * @param loadBalancerSpec
     */
    public void setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
    }


    /**
     * set 所属云ID
     *
     * @param cloudID
     */
    public CreateSlb cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }

    /**
     * set 负载均衡实例ID。
     *
     * @param id
     */
    public CreateSlb id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 负载均衡实例的名称。
     *
     * @param name
     */
    public CreateSlb name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 负载均衡实例状态
     *
     * @param status
     */
    public CreateSlb status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 负载均衡实例的服务地址。
     *
     * @param ipAddress
     */
    public CreateSlb ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * set 负载均衡实例的网络类型。
     *
     * @param addressType
     */
    public CreateSlb addressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * set 私网负载均衡实例的交换机ID。
     *
     * @param subnetId
     */
    public CreateSlb subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 私网负载均衡实例的专有网络ID。
     *
     * @param vpc
     */
    public CreateSlb vpc(String vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * set 私网负载均衡实例的网络类型
     *
     * @param networkType
     */
    public CreateSlb networkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * set 实例的主可用区ID。
     *
     * @param masterAz
     */
    public CreateSlb masterAz(String masterAz) {
        this.masterAz = masterAz;
        return this;
    }

    /**
     * set 实例的备可用区ID。
     *
     * @param slaveAz
     */
    public CreateSlb slaveAz(String slaveAz) {
        this.slaveAz = slaveAz;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public CreateSlb createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 否  负载均衡实例的规格
     *
     * @param loadBalancerSpec
     */
    public CreateSlb loadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }


}