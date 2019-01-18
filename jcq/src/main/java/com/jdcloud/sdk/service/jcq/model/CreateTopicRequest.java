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
 * Topic
 * Topic相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jcq.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建一个指定名称的topic
 */
public class CreateTopicRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * topic名称
     * Required:true
     */
    @Required
    private String topicName;

    /**
     * 类型，[normal,global_order]
     * Required:true
     */
    @Required
    private String type;

    /**
     * 描述，长度不大于255
     */
    private String description;

    /**
     * 所在区域的Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get topic名称
     *
     * @return
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * set topic名称
     *
     * @param topicName
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * get 类型，[normal,global_order]
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 类型，[normal,global_order]
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get 描述，长度不大于255
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述，长度不大于255
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 所在区域的Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 所在区域的Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set topic名称
     *
     * @param topicName
     */
    public CreateTopicRequest topicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * set 类型，[normal,global_order]
     *
     * @param type
     */
    public CreateTopicRequest type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set 描述，长度不大于255
     *
     * @param description
     */
    public CreateTopicRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 所在区域的Region ID
     *
     * @param regionId
     */
    public CreateTopicRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}