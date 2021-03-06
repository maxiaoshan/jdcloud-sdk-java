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

package com.jdcloud.sdk.service.apigateway.model;


/**
 * rateLimitPolicyView
 */
public class RateLimitPolicyView  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略名称
     */
    private String policyName;

    /**
     * 时间单位
     */
    private String timeUnit;

    /**
     * api流量限制次数
     */
    private Integer apiLimitCount;

    /**
     * 用户流量限制次数
     */
    private Integer userLimitCount;

    /**
     * 应用流量限制次数
     */
    private Integer appLimitCount;

    /**
     * 描述
     */
    private String description;


    /**
     * get 策略名称
     *
     * @return
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * set 策略名称
     *
     * @param policyName
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * get 时间单位
     *
     * @return
     */
    public String getTimeUnit() {
        return timeUnit;
    }

    /**
     * set 时间单位
     *
     * @param timeUnit
     */
    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * get api流量限制次数
     *
     * @return
     */
    public Integer getApiLimitCount() {
        return apiLimitCount;
    }

    /**
     * set api流量限制次数
     *
     * @param apiLimitCount
     */
    public void setApiLimitCount(Integer apiLimitCount) {
        this.apiLimitCount = apiLimitCount;
    }

    /**
     * get 用户流量限制次数
     *
     * @return
     */
    public Integer getUserLimitCount() {
        return userLimitCount;
    }

    /**
     * set 用户流量限制次数
     *
     * @param userLimitCount
     */
    public void setUserLimitCount(Integer userLimitCount) {
        this.userLimitCount = userLimitCount;
    }

    /**
     * get 应用流量限制次数
     *
     * @return
     */
    public Integer getAppLimitCount() {
        return appLimitCount;
    }

    /**
     * set 应用流量限制次数
     *
     * @param appLimitCount
     */
    public void setAppLimitCount(Integer appLimitCount) {
        this.appLimitCount = appLimitCount;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * set 策略名称
     *
     * @param policyName
     */
    public RateLimitPolicyView policyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * set 时间单位
     *
     * @param timeUnit
     */
    public RateLimitPolicyView timeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * set api流量限制次数
     *
     * @param apiLimitCount
     */
    public RateLimitPolicyView apiLimitCount(Integer apiLimitCount) {
        this.apiLimitCount = apiLimitCount;
        return this;
    }

    /**
     * set 用户流量限制次数
     *
     * @param userLimitCount
     */
    public RateLimitPolicyView userLimitCount(Integer userLimitCount) {
        this.userLimitCount = userLimitCount;
        return this;
    }

    /**
     * set 应用流量限制次数
     *
     * @param appLimitCount
     */
    public RateLimitPolicyView appLimitCount(Integer appLimitCount) {
        this.appLimitCount = appLimitCount;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public RateLimitPolicyView description(String description) {
        this.description = description;
        return this;
    }


}