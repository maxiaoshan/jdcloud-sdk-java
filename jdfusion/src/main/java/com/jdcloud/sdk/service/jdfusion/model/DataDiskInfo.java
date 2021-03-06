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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * 数据盘配置
 */
public class DataDiskInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 硬盘ID
     */
    private String diskId;

    /**
     * 硬盘大小
     */
    private Integer diskSize;

    /**
     * 磁盘介质分类，目前为预留，可以为空
     */
    private String diskMediumType;

    /**
     * 磁盘名称
     */
    private String diskName;

    /**
     * 磁盘是否随主机一起删除
     */
    private String autoDelete;

    /**
     * 磁盘状态
     */
    private String status;


    /**
     * get 硬盘ID
     *
     * @return
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * set 硬盘ID
     *
     * @param diskId
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * get 硬盘大小
     *
     * @return
     */
    public Integer getDiskSize() {
        return diskSize;
    }

    /**
     * set 硬盘大小
     *
     * @param diskSize
     */
    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    /**
     * get 磁盘介质分类，目前为预留，可以为空
     *
     * @return
     */
    public String getDiskMediumType() {
        return diskMediumType;
    }

    /**
     * set 磁盘介质分类，目前为预留，可以为空
     *
     * @param diskMediumType
     */
    public void setDiskMediumType(String diskMediumType) {
        this.diskMediumType = diskMediumType;
    }

    /**
     * get 磁盘名称
     *
     * @return
     */
    public String getDiskName() {
        return diskName;
    }

    /**
     * set 磁盘名称
     *
     * @param diskName
     */
    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * get 磁盘是否随主机一起删除
     *
     * @return
     */
    public String getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 磁盘是否随主机一起删除
     *
     * @param autoDelete
     */
    public void setAutoDelete(String autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get 磁盘状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 磁盘状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set 硬盘ID
     *
     * @param diskId
     */
    public DataDiskInfo diskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * set 硬盘大小
     *
     * @param diskSize
     */
    public DataDiskInfo diskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * set 磁盘介质分类，目前为预留，可以为空
     *
     * @param diskMediumType
     */
    public DataDiskInfo diskMediumType(String diskMediumType) {
        this.diskMediumType = diskMediumType;
        return this;
    }

    /**
     * set 磁盘名称
     *
     * @param diskName
     */
    public DataDiskInfo diskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * set 磁盘是否随主机一起删除
     *
     * @param autoDelete
     */
    public DataDiskInfo autoDelete(String autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set 磁盘状态
     *
     * @param status
     */
    public DataDiskInfo status(String status) {
        this.status = status;
        return this;
    }


}