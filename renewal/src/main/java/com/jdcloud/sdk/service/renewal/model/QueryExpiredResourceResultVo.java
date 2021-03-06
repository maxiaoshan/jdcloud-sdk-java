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

package com.jdcloud.sdk.service.renewal.model;


/**
 * queryExpiredResourceResultVo
 */
public class QueryExpiredResourceResultVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源Id
     */
    private String resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 产品线
     */
    private String serviceCode;

    /**
     * 业务线
     */
    private String appCode;

    /**
     * 已过期天数
     */
    private Integer expiredDays;

    /**
     * 资源所在区域
     */
    private String regionId;

    /**
     * 计费类型
     */
    private Integer billingType;


    /**
     * get 资源Id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源Id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 资源名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * get 产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 业务线
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 业务线
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get 已过期天数
     *
     * @return
     */
    public Integer getExpiredDays() {
        return expiredDays;
    }

    /**
     * set 已过期天数
     *
     * @param expiredDays
     */
    public void setExpiredDays(Integer expiredDays) {
        this.expiredDays = expiredDays;
    }

    /**
     * get 资源所在区域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 资源所在区域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 计费类型
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }


    /**
     * set 资源Id
     *
     * @param resourceId
     */
    public QueryExpiredResourceResultVo resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public QueryExpiredResourceResultVo resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public QueryExpiredResourceResultVo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 业务线
     *
     * @param appCode
     */
    public QueryExpiredResourceResultVo appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set 已过期天数
     *
     * @param expiredDays
     */
    public QueryExpiredResourceResultVo expiredDays(Integer expiredDays) {
        this.expiredDays = expiredDays;
        return this;
    }

    /**
     * set 资源所在区域
     *
     * @param regionId
     */
    public QueryExpiredResourceResultVo regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public QueryExpiredResourceResultVo billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }


}