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
 * 物模型信息
 */
public class ThingModelRespTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模型id
     */
    private String id;

    /**
     * 物模型名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 变更日志
     */
    private String changeLog;

    /**
     * 详细内容
     */
    private String content;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 是否为最新发布版本
     */
    private Integer latestPublish;

    /**
     * 发布状态
     */
    private Integer publishStatus;

    /**
     * 发布时间
     */
    private String publishTime;

    /**
     * 物模型版本号
     */
    private String thingModelVersion;

    /**
     * 物类型id
     */
    private String thingTypeCode;

    /**
     * 更新操作时间
     */
    private String updateTime;


    /**
     * get 模型id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 模型id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 物模型名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 物模型名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * get 变更日志
     *
     * @return
     */
    public String getChangeLog() {
        return changeLog;
    }

    /**
     * set 变更日志
     *
     * @param changeLog
     */
    public void setChangeLog(String changeLog) {
        this.changeLog = changeLog;
    }

    /**
     * get 详细内容
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 详细内容
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 是否为最新发布版本
     *
     * @return
     */
    public Integer getLatestPublish() {
        return latestPublish;
    }

    /**
     * set 是否为最新发布版本
     *
     * @param latestPublish
     */
    public void setLatestPublish(Integer latestPublish) {
        this.latestPublish = latestPublish;
    }

    /**
     * get 发布状态
     *
     * @return
     */
    public Integer getPublishStatus() {
        return publishStatus;
    }

    /**
     * set 发布状态
     *
     * @param publishStatus
     */
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * get 发布时间
     *
     * @return
     */
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * set 发布时间
     *
     * @param publishTime
     */
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * get 物模型版本号
     *
     * @return
     */
    public String getThingModelVersion() {
        return thingModelVersion;
    }

    /**
     * set 物模型版本号
     *
     * @param thingModelVersion
     */
    public void setThingModelVersion(String thingModelVersion) {
        this.thingModelVersion = thingModelVersion;
    }

    /**
     * get 物类型id
     *
     * @return
     */
    public String getThingTypeCode() {
        return thingTypeCode;
    }

    /**
     * set 物类型id
     *
     * @param thingTypeCode
     */
    public void setThingTypeCode(String thingTypeCode) {
        this.thingTypeCode = thingTypeCode;
    }

    /**
     * get 更新操作时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新操作时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 模型id
     *
     * @param id
     */
    public ThingModelRespTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 物模型名称
     *
     * @param name
     */
    public ThingModelRespTO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public ThingModelRespTO description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 变更日志
     *
     * @param changeLog
     */
    public ThingModelRespTO changeLog(String changeLog) {
        this.changeLog = changeLog;
        return this;
    }

    /**
     * set 详细内容
     *
     * @param content
     */
    public ThingModelRespTO content(String content) {
        this.content = content;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public ThingModelRespTO createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 是否为最新发布版本
     *
     * @param latestPublish
     */
    public ThingModelRespTO latestPublish(Integer latestPublish) {
        this.latestPublish = latestPublish;
        return this;
    }

    /**
     * set 发布状态
     *
     * @param publishStatus
     */
    public ThingModelRespTO publishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }

    /**
     * set 发布时间
     *
     * @param publishTime
     */
    public ThingModelRespTO publishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * set 物模型版本号
     *
     * @param thingModelVersion
     */
    public ThingModelRespTO thingModelVersion(String thingModelVersion) {
        this.thingModelVersion = thingModelVersion;
        return this;
    }

    /**
     * set 物类型id
     *
     * @param thingTypeCode
     */
    public ThingModelRespTO thingTypeCode(String thingTypeCode) {
        this.thingTypeCode = thingTypeCode;
        return this;
    }

    /**
     * set 更新操作时间
     *
     * @param updateTime
     */
    public ThingModelRespTO updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}