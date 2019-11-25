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
 * API
 * 关于api操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建API时，检查API名称是否重复,返回重复的apiId,如果没有返回空
 */
public class CheckApiNameExistRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * API名称
     * Required:true
     */
    @Required
    private String apiName;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 分组ID
     * Required:true
     */
    @Required
    private String apiGroupId;

    /**
     * 版本号
     * Required:true
     */
    @Required
    private String revision;


    /**
     * get API名称
     *
     * @return
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * set API名称
     *
     * @param apiName
     */
    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 分组ID
     *
     * @return
     */
    public String getApiGroupId() {
        return apiGroupId;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public void setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
    }

    /**
     * get 版本号
     *
     * @return
     */
    public String getRevision() {
        return revision;
    }

    /**
     * set 版本号
     *
     * @param revision
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }


    /**
     * set API名称
     *
     * @param apiName
     */
    public CheckApiNameExistRequest apiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CheckApiNameExistRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public CheckApiNameExistRequest apiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }

    /**
     * set 版本号
     *
     * @param revision
     */
    public CheckApiNameExistRequest revision(String revision) {
        this.revision = revision;
        return this;
    }


}