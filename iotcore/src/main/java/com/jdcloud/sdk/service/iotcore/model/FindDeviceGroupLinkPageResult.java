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
 * deviceGroup
 * 设备分组模块
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iotcore.model.DeviceGroupInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取分组列表
 */
public class FindDeviceGroupLinkPageResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pageSize
     */
    private Integer pageSize;

    /**
     * nowPage
     */
    private Integer nowPage;

    /**
     * totalSize
     */
    private Integer totalSize;

    /**
     * totalPage
     */
    private Integer totalPage;

    /**
     * data
     */
    private List<DeviceGroupInfo> data;


    /**
     * get pageSize
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set pageSize
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get nowPage
     *
     * @return
     */
    public Integer getNowPage() {
        return nowPage;
    }

    /**
     * set nowPage
     *
     * @param nowPage
     */
    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }

    /**
     * get totalSize
     *
     * @return
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    /**
     * set totalSize
     *
     * @param totalSize
     */
    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * get totalPage
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * set totalPage
     *
     * @param totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * get data
     *
     * @return
     */
    public List<DeviceGroupInfo> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<DeviceGroupInfo> data) {
        this.data = data;
    }


    /**
     * set pageSize
     *
     * @param pageSize
     */
    public FindDeviceGroupLinkPageResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set nowPage
     *
     * @param nowPage
     */
    public FindDeviceGroupLinkPageResult nowPage(Integer nowPage) {
        this.nowPage = nowPage;
        return this;
    }

    /**
     * set totalSize
     *
     * @param totalSize
     */
    public FindDeviceGroupLinkPageResult totalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * set totalPage
     *
     * @param totalPage
     */
    public FindDeviceGroupLinkPageResult totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set data
     *
     * @param data
     */
    public FindDeviceGroupLinkPageResult data(List<DeviceGroupInfo> data) {
        this.data = data;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(DeviceGroupInfo data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}