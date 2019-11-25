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
 * userBindedGroups
 */
public class UserBindedGroups  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分组ID
     */
    private String apiGroupId;

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 区域
     */
    private String region;

    /**
     * 授权时间
     */
    private String authtime;

    /**
     * 授权用户类型
     */
    private String authUserType;

    /**
     * Access Key
     */
    private String accessKey;

    /**
     * api调用者的appid
     */
    private String appId;

    /**
     * api部署的环境
     */
    private String environment;

    /**
     * api版本
     */
    private String revision;


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
     * get 分组名称
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * set 分组名称
     *
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * get 区域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 区域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 授权时间
     *
     * @return
     */
    public String getAuthtime() {
        return authtime;
    }

    /**
     * set 授权时间
     *
     * @param authtime
     */
    public void setAuthtime(String authtime) {
        this.authtime = authtime;
    }

    /**
     * get 授权用户类型
     *
     * @return
     */
    public String getAuthUserType() {
        return authUserType;
    }

    /**
     * set 授权用户类型
     *
     * @param authUserType
     */
    public void setAuthUserType(String authUserType) {
        this.authUserType = authUserType;
    }

    /**
     * get Access Key
     *
     * @return
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * set Access Key
     *
     * @param accessKey
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * get api调用者的appid
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set api调用者的appid
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get api部署的环境
     *
     * @return
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * set api部署的环境
     *
     * @param environment
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * get api版本
     *
     * @return
     */
    public String getRevision() {
        return revision;
    }

    /**
     * set api版本
     *
     * @param revision
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }


    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public UserBindedGroups apiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }

    /**
     * set 分组名称
     *
     * @param groupName
     */
    public UserBindedGroups groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * set 区域
     *
     * @param region
     */
    public UserBindedGroups region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 授权时间
     *
     * @param authtime
     */
    public UserBindedGroups authtime(String authtime) {
        this.authtime = authtime;
        return this;
    }

    /**
     * set 授权用户类型
     *
     * @param authUserType
     */
    public UserBindedGroups authUserType(String authUserType) {
        this.authUserType = authUserType;
        return this;
    }

    /**
     * set Access Key
     *
     * @param accessKey
     */
    public UserBindedGroups accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * set api调用者的appid
     *
     * @param appId
     */
    public UserBindedGroups appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set api部署的环境
     *
     * @param environment
     */
    public UserBindedGroups environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * set api版本
     *
     * @param revision
     */
    public UserBindedGroups revision(String revision) {
        this.revision = revision;
        return this;
    }


}