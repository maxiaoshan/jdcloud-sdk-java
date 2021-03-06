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

package com.jdcloud.sdk.service.antipro.model;

import java.util.List;
import java.util.ArrayList;

/**
 * instance
 */
public class Instance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 防护包实例 Id
     */
    private String id;

    /**
     * 防护包实例名称
     */
    private String name;

    /**
     * 防护包实例地域
     */
    private String region;

    /**
     * 套餐类型, 1: 独享 IP, 2: 共享 IP
     */
    private Integer type;

    /**
     * 可防护 IP 个数
     */
    private Integer ipCount;

    /**
     * 保底带宽, 单位 Gbps
     */
    private Integer basicBandwidth;

    /**
     * 弹性带宽, 单位 Gbps
     */
    private Integer elasticBandwidth;

    /**
     * 实例过期时间
     */
    private String expireTime;

    /**
     * 实例创建时间
     */
    private String createTime;

    /**
     * 防护对象
     */
    private List<ProtectedObject> protectedObjects;

    /**
     * 是否为试用防护包
     */
    private Boolean onTrial;

    /**
     * 资源 Id
     */
    private String resourceId;


    /**
     * get 防护包实例 Id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 防护包实例 Id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 防护包实例名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 防护包实例名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 防护包实例地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 防护包实例地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 套餐类型, 1: 独享 IP, 2: 共享 IP
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 套餐类型, 1: 独享 IP, 2: 共享 IP
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get 可防护 IP 个数
     *
     * @return
     */
    public Integer getIpCount() {
        return ipCount;
    }

    /**
     * set 可防护 IP 个数
     *
     * @param ipCount
     */
    public void setIpCount(Integer ipCount) {
        this.ipCount = ipCount;
    }

    /**
     * get 保底带宽, 单位 Gbps
     *
     * @return
     */
    public Integer getBasicBandwidth() {
        return basicBandwidth;
    }

    /**
     * set 保底带宽, 单位 Gbps
     *
     * @param basicBandwidth
     */
    public void setBasicBandwidth(Integer basicBandwidth) {
        this.basicBandwidth = basicBandwidth;
    }

    /**
     * get 弹性带宽, 单位 Gbps
     *
     * @return
     */
    public Integer getElasticBandwidth() {
        return elasticBandwidth;
    }

    /**
     * set 弹性带宽, 单位 Gbps
     *
     * @param elasticBandwidth
     */
    public void setElasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
    }

    /**
     * get 实例过期时间
     *
     * @return
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * set 实例过期时间
     *
     * @param expireTime
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * get 实例创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 实例创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 防护对象
     *
     * @return
     */
    public List<ProtectedObject> getProtectedObjects() {
        return protectedObjects;
    }

    /**
     * set 防护对象
     *
     * @param protectedObjects
     */
    public void setProtectedObjects(List<ProtectedObject> protectedObjects) {
        this.protectedObjects = protectedObjects;
    }

    /**
     * get 是否为试用防护包
     *
     * @return
     */
    public Boolean getOnTrial() {
        return onTrial;
    }

    /**
     * set 是否为试用防护包
     *
     * @param onTrial
     */
    public void setOnTrial(Boolean onTrial) {
        this.onTrial = onTrial;
    }

    /**
     * get 资源 Id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源 Id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * set 防护包实例 Id
     *
     * @param id
     */
    public Instance id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 防护包实例名称
     *
     * @param name
     */
    public Instance name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 防护包实例地域
     *
     * @param region
     */
    public Instance region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 套餐类型, 1: 独享 IP, 2: 共享 IP
     *
     * @param type
     */
    public Instance type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set 可防护 IP 个数
     *
     * @param ipCount
     */
    public Instance ipCount(Integer ipCount) {
        this.ipCount = ipCount;
        return this;
    }

    /**
     * set 保底带宽, 单位 Gbps
     *
     * @param basicBandwidth
     */
    public Instance basicBandwidth(Integer basicBandwidth) {
        this.basicBandwidth = basicBandwidth;
        return this;
    }

    /**
     * set 弹性带宽, 单位 Gbps
     *
     * @param elasticBandwidth
     */
    public Instance elasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
        return this;
    }

    /**
     * set 实例过期时间
     *
     * @param expireTime
     */
    public Instance expireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * set 实例创建时间
     *
     * @param createTime
     */
    public Instance createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 防护对象
     *
     * @param protectedObjects
     */
    public Instance protectedObjects(List<ProtectedObject> protectedObjects) {
        this.protectedObjects = protectedObjects;
        return this;
    }

    /**
     * set 是否为试用防护包
     *
     * @param onTrial
     */
    public Instance onTrial(Boolean onTrial) {
        this.onTrial = onTrial;
        return this;
    }

    /**
     * set 资源 Id
     *
     * @param resourceId
     */
    public Instance resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * add item to 防护对象
     *
     * @param protectedObject
     */
    public void addProtectedObject(ProtectedObject protectedObject) {
        if (this.protectedObjects == null) {
            this.protectedObjects = new ArrayList<>();
        }
        this.protectedObjects.add(protectedObject);
    }

}