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
 * 相关接口
 * API related to order
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.order.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * listOrderRequest
 */
public class ListOrderRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务线
     */
    private String appCode;

    /**
     * 计费类型(CONFIG-按配置,FLOW-按用量MONTHLY-包年包月,ONCE-按次付费)
     */
    private String chargeMode;

    /**
     * 查询订单开始时间戳
     */
    private Long startTime;

    /**
     * 查询订单结束时间戳
     */
    private Long endTime;

    /**
     * 购买订单类型(NEW-新购,RENEW-续费,RESIZE_FORMULA-配置变更,TEMP_UPGRADE-临时升配)
     */
    private String orderType;

    /**
     * 分页：订单第几页
     */
    private Integer pageNumber;

    /**
     * 分页：订单条数
     */
    private Integer pageSize;

    /**
     * 付费类型(PRE_PAID-预付费,POST_PAID-后付费)
     */
    private String payType;

    /**
     * 产品线
     */
    private String serviceCode;

    /**
     * 订单状态（PAID-已支付,CANCELED-已取消,NO_PAY-未支付,FAILED-失败,DEALING-处理中,REFUND_PART-部分退款,REFUND_ALL-全部退款）
     */
    private String status;


    /**
     * get 业务线
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 业务线
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get 计费类型(CONFIG-按配置,FLOW-按用量MONTHLY-包年包月,ONCE-按次付费)
     *
     * @return
     */
    public String getChargeMode() {
        return chargeMode;
    }

    /**
     * set 计费类型(CONFIG-按配置,FLOW-按用量MONTHLY-包年包月,ONCE-按次付费)
     *
     * @param chargeMode
     */
    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    /**
     * get 查询订单开始时间戳
     *
     * @return
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * set 查询订单开始时间戳
     *
     * @param startTime
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询订单结束时间戳
     *
     * @return
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * set 查询订单结束时间戳
     *
     * @param endTime
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * get 购买订单类型(NEW-新购,RENEW-续费,RESIZE_FORMULA-配置变更,TEMP_UPGRADE-临时升配)
     *
     * @return
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * set 购买订单类型(NEW-新购,RENEW-续费,RESIZE_FORMULA-配置变更,TEMP_UPGRADE-临时升配)
     *
     * @param orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * get 分页：订单第几页
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 分页：订单第几页
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页：订单条数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页：订单条数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 付费类型(PRE_PAID-预付费,POST_PAID-后付费)
     *
     * @return
     */
    public String getPayType() {
        return payType;
    }

    /**
     * set 付费类型(PRE_PAID-预付费,POST_PAID-后付费)
     *
     * @param payType
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * get 产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 订单状态（PAID-已支付,CANCELED-已取消,NO_PAY-未支付,FAILED-失败,DEALING-处理中,REFUND_PART-部分退款,REFUND_ALL-全部退款）
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 订单状态（PAID-已支付,CANCELED-已取消,NO_PAY-未支付,FAILED-失败,DEALING-处理中,REFUND_PART-部分退款,REFUND_ALL-全部退款）
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set 业务线
     *
     * @param appCode
     */
    public ListOrderRequest appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set 计费类型(CONFIG-按配置,FLOW-按用量MONTHLY-包年包月,ONCE-按次付费)
     *
     * @param chargeMode
     */
    public ListOrderRequest chargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * set 查询订单开始时间戳
     *
     * @param startTime
     */
    public ListOrderRequest startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询订单结束时间戳
     *
     * @param endTime
     */
    public ListOrderRequest endTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 购买订单类型(NEW-新购,RENEW-续费,RESIZE_FORMULA-配置变更,TEMP_UPGRADE-临时升配)
     *
     * @param orderType
     */
    public ListOrderRequest orderType(String orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * set 分页：订单第几页
     *
     * @param pageNumber
     */
    public ListOrderRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页：订单条数
     *
     * @param pageSize
     */
    public ListOrderRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 付费类型(PRE_PAID-预付费,POST_PAID-后付费)
     *
     * @param payType
     */
    public ListOrderRequest payType(String payType) {
        this.payType = payType;
        return this;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public ListOrderRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 订单状态（PAID-已支付,CANCELED-已取消,NO_PAY-未支付,FAILED-失败,DEALING-处理中,REFUND_PART-部分退款,REFUND_ALL-全部退款）
     *
     * @param status
     */
    public ListOrderRequest status(String status) {
        this.status = status;
        return this;
    }


}