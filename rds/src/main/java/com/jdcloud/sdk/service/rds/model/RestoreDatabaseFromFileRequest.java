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
 * 从用户通过单库上云工具上传到云上的备份文件中恢复单个数据库&lt;br&gt;- 仅支持SQL Server
 */
public class RestoreDatabaseFromFileRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 共享文件的全局ID，可从上传文件查询接口[describeImportFiles](../Cloud-on-Single-Database/describeImportFiles.md)获取；如果该文件不是共享文件，则不用输入该参数
     */
    private String sharedFileGid;

    /**
     * 用户上传的备份文件名称（包括文件后缀名），例如mydb1.bak
     * Required:true
     */
    @Required
    private String fileName;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
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
     * get 共享文件的全局ID，可从上传文件查询接口[describeImportFiles](../Cloud-on-Single-Database/describeImportFiles.md)获取；如果该文件不是共享文件，则不用输入该参数
     *
     * @return
     */
    public String getSharedFileGid() {
        return sharedFileGid;
    }

    /**
     * set 共享文件的全局ID，可从上传文件查询接口[describeImportFiles](../Cloud-on-Single-Database/describeImportFiles.md)获取；如果该文件不是共享文件，则不用输入该参数
     *
     * @param sharedFileGid
     */
    public void setSharedFileGid(String sharedFileGid) {
        this.sharedFileGid = sharedFileGid;
    }

    /**
     * get 用户上传的备份文件名称（包括文件后缀名），例如mydb1.bak
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * set 用户上传的备份文件名称（包括文件后缀名），例如mydb1.bak
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
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
     * set 共享文件的全局ID，可从上传文件查询接口[describeImportFiles](../Cloud-on-Single-Database/describeImportFiles.md)获取；如果该文件不是共享文件，则不用输入该参数
     *
     * @param sharedFileGid
     */
    public RestoreDatabaseFromFileRequest sharedFileGid(String sharedFileGid) {
        this.sharedFileGid = sharedFileGid;
        return this;
    }

    /**
     * set 用户上传的备份文件名称（包括文件后缀名），例如mydb1.bak
     *
     * @param fileName
     */
    public RestoreDatabaseFromFileRequest fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public RestoreDatabaseFromFileRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public RestoreDatabaseFromFileRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 库名称
     *
     * @param dbName
     */
    public RestoreDatabaseFromFileRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


}