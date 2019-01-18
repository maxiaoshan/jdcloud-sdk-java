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

package com.jdcloud.sdk.service.clouddnsservice.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * importDNS
 */
public class ImportDNS  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 解析记录对应的域名的ID
     * Required:true
     */
    @Required
    private Integer domainId;

    /**
     * 主机记录
     * Required:true
     */
    @Required
    private String hostRecord;

    /**
     * 解析记录的值
     * Required:true
     */
    @Required
    private String hostValue;

    /**
     * 解析记录的ID
     */
    private Integer id;

    /**
     * 是否是京东云资源
     */
    private Boolean jcloudRes;

    /**
     * 优先级，只存在于MX, SRV解析记录类型
     */
    private Integer mxPriority;

    /**
     * 端口，只存在于SRV解析记录类型
     */
    private Integer port;

    /**
     * 解析记录的生存时间
     * Required:true
     */
    @Required
    private Integer ttl;

    /**
     * 解析的类型
     * Required:true
     */
    @Required
    private String type;

    /**
     * 解析记录的权重
     */
    private Integer weight;

    /**
     * 解析线路的ID，请调用getViewTree接口获取解析线路的ID。
     * Required:true
     */
    @Required
    private Integer viewValue;


    /**
     * get 解析记录对应的域名的ID
     *
     * @return
     */
    public Integer getDomainId() {
        return domainId;
    }

    /**
     * set 解析记录对应的域名的ID
     *
     * @param domainId
     */
    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    /**
     * get 主机记录
     *
     * @return
     */
    public String getHostRecord() {
        return hostRecord;
    }

    /**
     * set 主机记录
     *
     * @param hostRecord
     */
    public void setHostRecord(String hostRecord) {
        this.hostRecord = hostRecord;
    }

    /**
     * get 解析记录的值
     *
     * @return
     */
    public String getHostValue() {
        return hostValue;
    }

    /**
     * set 解析记录的值
     *
     * @param hostValue
     */
    public void setHostValue(String hostValue) {
        this.hostValue = hostValue;
    }

    /**
     * get 解析记录的ID
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 解析记录的ID
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 是否是京东云资源
     *
     * @return
     */
    public Boolean getJcloudRes() {
        return jcloudRes;
    }

    /**
     * set 是否是京东云资源
     *
     * @param jcloudRes
     */
    public void setJcloudRes(Boolean jcloudRes) {
        this.jcloudRes = jcloudRes;
    }

    /**
     * get 优先级，只存在于MX, SRV解析记录类型
     *
     * @return
     */
    public Integer getMxPriority() {
        return mxPriority;
    }

    /**
     * set 优先级，只存在于MX, SRV解析记录类型
     *
     * @param mxPriority
     */
    public void setMxPriority(Integer mxPriority) {
        this.mxPriority = mxPriority;
    }

    /**
     * get 端口，只存在于SRV解析记录类型
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set 端口，只存在于SRV解析记录类型
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * get 解析记录的生存时间
     *
     * @return
     */
    public Integer getTtl() {
        return ttl;
    }

    /**
     * set 解析记录的生存时间
     *
     * @param ttl
     */
    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    /**
     * get 解析的类型
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 解析的类型
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get 解析记录的权重
     *
     * @return
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * set 解析记录的权重
     *
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * get 解析线路的ID，请调用getViewTree接口获取解析线路的ID。
     *
     * @return
     */
    public Integer getViewValue() {
        return viewValue;
    }

    /**
     * set 解析线路的ID，请调用getViewTree接口获取解析线路的ID。
     *
     * @param viewValue
     */
    public void setViewValue(Integer viewValue) {
        this.viewValue = viewValue;
    }


    /**
     * set 解析记录对应的域名的ID
     *
     * @param domainId
     */
    public ImportDNS domainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * set 主机记录
     *
     * @param hostRecord
     */
    public ImportDNS hostRecord(String hostRecord) {
        this.hostRecord = hostRecord;
        return this;
    }

    /**
     * set 解析记录的值
     *
     * @param hostValue
     */
    public ImportDNS hostValue(String hostValue) {
        this.hostValue = hostValue;
        return this;
    }

    /**
     * set 解析记录的ID
     *
     * @param id
     */
    public ImportDNS id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 是否是京东云资源
     *
     * @param jcloudRes
     */
    public ImportDNS jcloudRes(Boolean jcloudRes) {
        this.jcloudRes = jcloudRes;
        return this;
    }

    /**
     * set 优先级，只存在于MX, SRV解析记录类型
     *
     * @param mxPriority
     */
    public ImportDNS mxPriority(Integer mxPriority) {
        this.mxPriority = mxPriority;
        return this;
    }

    /**
     * set 端口，只存在于SRV解析记录类型
     *
     * @param port
     */
    public ImportDNS port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * set 解析记录的生存时间
     *
     * @param ttl
     */
    public ImportDNS ttl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * set 解析的类型
     *
     * @param type
     */
    public ImportDNS type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set 解析记录的权重
     *
     * @param weight
     */
    public ImportDNS weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * set 解析线路的ID，请调用getViewTree接口获取解析线路的ID。
     *
     * @param viewValue
     */
    public ImportDNS viewValue(Integer viewValue) {
        this.viewValue = viewValue;
        return this;
    }


}