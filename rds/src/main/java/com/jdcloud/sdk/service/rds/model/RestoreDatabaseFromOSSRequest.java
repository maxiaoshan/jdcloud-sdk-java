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
 * 数据库管理
 * 数据库管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 从OSS恢复SQL Server数据库&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
 */
public class RestoreDatabaseFromOSSRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户在单库上云中上传的文件地址
     * Required:true
     */
    @Required
    private String ossURL;

    /**
     * 区域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 库名称
     * Required:true
     */
    @Required
    private String dbName;


    /**
     * get 用户在单库上云中上传的文件地址
     *
     * @return
     */
    public String getOssURL() {
        return ossURL;
    }

    /**
     * set 用户在单库上云中上传的文件地址
     *
     * @param ossURL
     */
    public void setOssURL(String ossURL) {
        this.ossURL = ossURL;
    }

    /**
     * get 区域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 库名称
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 库名称
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }


    /**
     * set 用户在单库上云中上传的文件地址
     *
     * @param ossURL
     */
    public RestoreDatabaseFromOSSRequest ossURL(String ossURL) {
        this.ossURL = ossURL;
        return this;
    }

    /**
     * set 区域代码
     *
     * @param regionId
     */
    public RestoreDatabaseFromOSSRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public RestoreDatabaseFromOSSRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 库名称
     *
     * @param dbName
     */
    public RestoreDatabaseFromOSSRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


}