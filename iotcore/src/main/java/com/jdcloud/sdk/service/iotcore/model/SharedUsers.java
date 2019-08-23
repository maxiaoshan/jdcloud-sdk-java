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

package com.jdcloud.sdk.service.iotcore.model;


/**
 * sharedUsers
 */
public class SharedUsers  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户Pin信息
     */
    private Integer userPin;

    /**
     * 用户对应的资源编号
     */
    private Integer sourceId;

    /**
     * 用户所属region
     */
    private Integer regionName;

    /**
     * 用户开通时间
     */
    private Integer createTime;

    /**
     * 租户状态[0-正常使用，1-欠费停服，2-软删除保护期]
     */
    private Integer tenantStatus;

    /**
     * 在线设备书
     */
    private Integer onDevices;

    /**
     * 日消息条数
     */
    private Integer dailyMessages;

    /**
     * 总消息条数
     */
    private Integer totalMessages;


    /**
     * get 用户Pin信息
     *
     * @return
     */
    public Integer getUserPin() {
        return userPin;
    }

    /**
     * set 用户Pin信息
     *
     * @param userPin
     */
    public void setUserPin(Integer userPin) {
        this.userPin = userPin;
    }

    /**
     * get 用户对应的资源编号
     *
     * @return
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * set 用户对应的资源编号
     *
     * @param sourceId
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * get 用户所属region
     *
     * @return
     */
    public Integer getRegionName() {
        return regionName;
    }

    /**
     * set 用户所属region
     *
     * @param regionName
     */
    public void setRegionName(Integer regionName) {
        this.regionName = regionName;
    }

    /**
     * get 用户开通时间
     *
     * @return
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * set 用户开通时间
     *
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * get 租户状态[0-正常使用，1-欠费停服，2-软删除保护期]
     *
     * @return
     */
    public Integer getTenantStatus() {
        return tenantStatus;
    }

    /**
     * set 租户状态[0-正常使用，1-欠费停服，2-软删除保护期]
     *
     * @param tenantStatus
     */
    public void setTenantStatus(Integer tenantStatus) {
        this.tenantStatus = tenantStatus;
    }

    /**
     * get 在线设备书
     *
     * @return
     */
    public Integer getOnDevices() {
        return onDevices;
    }

    /**
     * set 在线设备书
     *
     * @param onDevices
     */
    public void setOnDevices(Integer onDevices) {
        this.onDevices = onDevices;
    }

    /**
     * get 日消息条数
     *
     * @return
     */
    public Integer getDailyMessages() {
        return dailyMessages;
    }

    /**
     * set 日消息条数
     *
     * @param dailyMessages
     */
    public void setDailyMessages(Integer dailyMessages) {
        this.dailyMessages = dailyMessages;
    }

    /**
     * get 总消息条数
     *
     * @return
     */
    public Integer getTotalMessages() {
        return totalMessages;
    }

    /**
     * set 总消息条数
     *
     * @param totalMessages
     */
    public void setTotalMessages(Integer totalMessages) {
        this.totalMessages = totalMessages;
    }


    /**
     * set 用户Pin信息
     *
     * @param userPin
     */
    public SharedUsers userPin(Integer userPin) {
        this.userPin = userPin;
        return this;
    }

    /**
     * set 用户对应的资源编号
     *
     * @param sourceId
     */
    public SharedUsers sourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * set 用户所属region
     *
     * @param regionName
     */
    public SharedUsers regionName(Integer regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * set 用户开通时间
     *
     * @param createTime
     */
    public SharedUsers createTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 租户状态[0-正常使用，1-欠费停服，2-软删除保护期]
     *
     * @param tenantStatus
     */
    public SharedUsers tenantStatus(Integer tenantStatus) {
        this.tenantStatus = tenantStatus;
        return this;
    }

    /**
     * set 在线设备书
     *
     * @param onDevices
     */
    public SharedUsers onDevices(Integer onDevices) {
        this.onDevices = onDevices;
        return this;
    }

    /**
     * set 日消息条数
     *
     * @param dailyMessages
     */
    public SharedUsers dailyMessages(Integer dailyMessages) {
        this.dailyMessages = dailyMessages;
        return this;
    }

    /**
     * set 总消息条数
     *
     * @param totalMessages
     */
    public SharedUsers totalMessages(Integer totalMessages) {
        this.totalMessages = totalMessages;
        return this;
    }


}