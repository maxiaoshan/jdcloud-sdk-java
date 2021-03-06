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
 * 设备拓扑关系查询请求
 */
public class DeviceTopoPageBO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备标识Id
     */
    private String deviceId;

    /**
     * 子设备标识Id
     */
    private String subDeviceId;

    /**
     * 子设备名
     */
    private String subDeviceName;

    /**
     * 排序方式;升序-ASC,降序-DESC
     */
    private String order;

    /**
     * 排序方式;升序-ASC,降序-DESC
     */
    private Object orders;

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 每页条数
     */
    private Integer pageSize;


    /**
     * get 设备标识Id
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 设备标识Id
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * get 子设备标识Id
     *
     * @return
     */
    public String getSubDeviceId() {
        return subDeviceId;
    }

    /**
     * set 子设备标识Id
     *
     * @param subDeviceId
     */
    public void setSubDeviceId(String subDeviceId) {
        this.subDeviceId = subDeviceId;
    }

    /**
     * get 子设备名
     *
     * @return
     */
    public String getSubDeviceName() {
        return subDeviceName;
    }

    /**
     * set 子设备名
     *
     * @param subDeviceName
     */
    public void setSubDeviceName(String subDeviceName) {
        this.subDeviceName = subDeviceName;
    }

    /**
     * get 排序方式;升序-ASC,降序-DESC
     *
     * @return
     */
    public String getOrder() {
        return order;
    }

    /**
     * set 排序方式;升序-ASC,降序-DESC
     *
     * @param order
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * get 排序方式;升序-ASC,降序-DESC
     *
     * @return
     */
    public Object getOrders() {
        return orders;
    }

    /**
     * set 排序方式;升序-ASC,降序-DESC
     *
     * @param orders
     */
    public void setOrders(Object orders) {
        this.orders = orders;
    }

    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * set 页码
     *
     * @param pageNo
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * get 每页条数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页条数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * set 设备标识Id
     *
     * @param deviceId
     */
    public DeviceTopoPageBO deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * set 子设备标识Id
     *
     * @param subDeviceId
     */
    public DeviceTopoPageBO subDeviceId(String subDeviceId) {
        this.subDeviceId = subDeviceId;
        return this;
    }

    /**
     * set 子设备名
     *
     * @param subDeviceName
     */
    public DeviceTopoPageBO subDeviceName(String subDeviceName) {
        this.subDeviceName = subDeviceName;
        return this;
    }

    /**
     * set 排序方式;升序-ASC,降序-DESC
     *
     * @param order
     */
    public DeviceTopoPageBO order(String order) {
        this.order = order;
        return this;
    }

    /**
     * set 排序方式;升序-ASC,降序-DESC
     *
     * @param orders
     */
    public DeviceTopoPageBO orders(Object orders) {
        this.orders = orders;
        return this;
    }

    /**
     * set 页码
     *
     * @param pageNo
     */
    public DeviceTopoPageBO pageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set 每页条数
     *
     * @param pageSize
     */
    public DeviceTopoPageBO pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


}