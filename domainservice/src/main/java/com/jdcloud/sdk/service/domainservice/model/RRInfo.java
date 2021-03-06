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

package com.jdcloud.sdk.service.domainservice.model;

import java.util.List;
import java.util.ArrayList;

/**
 * rRInfo
 */
public class RRInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 线路名称
     */
    private String viewName;

    /**
     * 域名解析的唯一ID
     */
    private Integer id;

    /**
     * 主机记录
     */
    private String hostRecord;

    /**
     * 解析记录的值
     */
    private String hostValue;

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
     * 解析记录的生存时间，单位：秒
     */
    private Integer ttl;

    /**
     * 解析记录的类型，请参考&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/jd-cloud-dns/detailed-interpretation-of-parsed-records&quot;&gt;解析记录类型详解&lt;/a&gt;
     */
    private String type;

    /**
     * 解析记录的权重
     */
    private Integer weight;

    /**
     * 解析线路的ID
     */
    private List<Integer> viewValue;

    /**
     * 解析记录的状态，正常解析:2，暂停解析:4
     */
    private String resolvingStatus;

    /**
     * 解析记录更新的时间
     */
    private Long updateTime;


    /**
     * get 创建者
     *
     * @return
     */
    public String getCreator() {
        return creator;
    }

    /**
     * set 创建者
     *
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * get 线路名称
     *
     * @return
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * set 线路名称
     *
     * @param viewName
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    /**
     * get 域名解析的唯一ID
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 域名解析的唯一ID
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * get 解析记录的生存时间，单位：秒
     *
     * @return
     */
    public Integer getTtl() {
        return ttl;
    }

    /**
     * set 解析记录的生存时间，单位：秒
     *
     * @param ttl
     */
    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    /**
     * get 解析记录的类型，请参考&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/jd-cloud-dns/detailed-interpretation-of-parsed-records&quot;&gt;解析记录类型详解&lt;/a&gt;
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 解析记录的类型，请参考&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/jd-cloud-dns/detailed-interpretation-of-parsed-records&quot;&gt;解析记录类型详解&lt;/a&gt;
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
     * get 解析线路的ID
     *
     * @return
     */
    public List<Integer> getViewValue() {
        return viewValue;
    }

    /**
     * set 解析线路的ID
     *
     * @param viewValue
     */
    public void setViewValue(List<Integer> viewValue) {
        this.viewValue = viewValue;
    }

    /**
     * get 解析记录的状态，正常解析:2，暂停解析:4
     *
     * @return
     */
    public String getResolvingStatus() {
        return resolvingStatus;
    }

    /**
     * set 解析记录的状态，正常解析:2，暂停解析:4
     *
     * @param resolvingStatus
     */
    public void setResolvingStatus(String resolvingStatus) {
        this.resolvingStatus = resolvingStatus;
    }

    /**
     * get 解析记录更新的时间
     *
     * @return
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * set 解析记录更新的时间
     *
     * @param updateTime
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 创建者
     *
     * @param creator
     */
    public RRInfo creator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * set 线路名称
     *
     * @param viewName
     */
    public RRInfo viewName(String viewName) {
        this.viewName = viewName;
        return this;
    }

    /**
     * set 域名解析的唯一ID
     *
     * @param id
     */
    public RRInfo id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 主机记录
     *
     * @param hostRecord
     */
    public RRInfo hostRecord(String hostRecord) {
        this.hostRecord = hostRecord;
        return this;
    }

    /**
     * set 解析记录的值
     *
     * @param hostValue
     */
    public RRInfo hostValue(String hostValue) {
        this.hostValue = hostValue;
        return this;
    }

    /**
     * set 是否是京东云资源
     *
     * @param jcloudRes
     */
    public RRInfo jcloudRes(Boolean jcloudRes) {
        this.jcloudRes = jcloudRes;
        return this;
    }

    /**
     * set 优先级，只存在于MX, SRV解析记录类型
     *
     * @param mxPriority
     */
    public RRInfo mxPriority(Integer mxPriority) {
        this.mxPriority = mxPriority;
        return this;
    }

    /**
     * set 端口，只存在于SRV解析记录类型
     *
     * @param port
     */
    public RRInfo port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * set 解析记录的生存时间，单位：秒
     *
     * @param ttl
     */
    public RRInfo ttl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * set 解析记录的类型，请参考&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/jd-cloud-dns/detailed-interpretation-of-parsed-records&quot;&gt;解析记录类型详解&lt;/a&gt;
     *
     * @param type
     */
    public RRInfo type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set 解析记录的权重
     *
     * @param weight
     */
    public RRInfo weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * set 解析线路的ID
     *
     * @param viewValue
     */
    public RRInfo viewValue(List<Integer> viewValue) {
        this.viewValue = viewValue;
        return this;
    }

    /**
     * set 解析记录的状态，正常解析:2，暂停解析:4
     *
     * @param resolvingStatus
     */
    public RRInfo resolvingStatus(String resolvingStatus) {
        this.resolvingStatus = resolvingStatus;
        return this;
    }

    /**
     * set 解析记录更新的时间
     *
     * @param updateTime
     */
    public RRInfo updateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * add item to 解析线路的ID
     *
     * @param viewValue
     */
    public void addViewValue(Integer viewValue) {
        if (this.viewValue == null) {
            this.viewValue = new ArrayList<>();
        }
        this.viewValue.add(viewValue);
    }

}