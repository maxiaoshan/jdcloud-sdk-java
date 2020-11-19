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
 * 方法调用信息
 */
public class FunctionCallRecordVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 设备标识id
     */
    private String deviceId;

    /**
     * 方法名称
     */
    private String displayName;

    /**
     * 方法key
     */
    private String funcKey;

    /**
     * 方法调用参数 json格式
     */
    private String inParams;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 消息id
     */
    private String messageId;

    /**
     * 方法调用响应 json格式
     */
    private String outParams;

    /**
     * 请求时间
     */
    private Long reqTimestamp;

    /**
     * 响应时间
     */
    private Long respTimestamp;


    /**
     * get 响应码
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set 响应码
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * get 设备标识id
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 设备标识id
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * get 方法名称
     *
     * @return
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * set 方法名称
     *
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * get 方法key
     *
     * @return
     */
    public String getFuncKey() {
        return funcKey;
    }

    /**
     * set 方法key
     *
     * @param funcKey
     */
    public void setFuncKey(String funcKey) {
        this.funcKey = funcKey;
    }

    /**
     * get 方法调用参数 json格式
     *
     * @return
     */
    public String getInParams() {
        return inParams;
    }

    /**
     * set 方法调用参数 json格式
     *
     * @param inParams
     */
    public void setInParams(String inParams) {
        this.inParams = inParams;
    }

    /**
     * get 响应消息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 响应消息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get 消息id
     *
     * @return
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * set 消息id
     *
     * @param messageId
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * get 方法调用响应 json格式
     *
     * @return
     */
    public String getOutParams() {
        return outParams;
    }

    /**
     * set 方法调用响应 json格式
     *
     * @param outParams
     */
    public void setOutParams(String outParams) {
        this.outParams = outParams;
    }

    /**
     * get 请求时间
     *
     * @return
     */
    public Long getReqTimestamp() {
        return reqTimestamp;
    }

    /**
     * set 请求时间
     *
     * @param reqTimestamp
     */
    public void setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
    }

    /**
     * get 响应时间
     *
     * @return
     */
    public Long getRespTimestamp() {
        return respTimestamp;
    }

    /**
     * set 响应时间
     *
     * @param respTimestamp
     */
    public void setRespTimestamp(Long respTimestamp) {
        this.respTimestamp = respTimestamp;
    }


    /**
     * set 响应码
     *
     * @param code
     */
    public FunctionCallRecordVo code(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * set 设备标识id
     *
     * @param deviceId
     */
    public FunctionCallRecordVo deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * set 方法名称
     *
     * @param displayName
     */
    public FunctionCallRecordVo displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set 方法key
     *
     * @param funcKey
     */
    public FunctionCallRecordVo funcKey(String funcKey) {
        this.funcKey = funcKey;
        return this;
    }

    /**
     * set 方法调用参数 json格式
     *
     * @param inParams
     */
    public FunctionCallRecordVo inParams(String inParams) {
        this.inParams = inParams;
        return this;
    }

    /**
     * set 响应消息
     *
     * @param message
     */
    public FunctionCallRecordVo message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set 消息id
     *
     * @param messageId
     */
    public FunctionCallRecordVo messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * set 方法调用响应 json格式
     *
     * @param outParams
     */
    public FunctionCallRecordVo outParams(String outParams) {
        this.outParams = outParams;
        return this;
    }

    /**
     * set 请求时间
     *
     * @param reqTimestamp
     */
    public FunctionCallRecordVo reqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }

    /**
     * set 响应时间
     *
     * @param respTimestamp
     */
    public FunctionCallRecordVo respTimestamp(Long respTimestamp) {
        this.respTimestamp = respTimestamp;
        return this;
    }


}