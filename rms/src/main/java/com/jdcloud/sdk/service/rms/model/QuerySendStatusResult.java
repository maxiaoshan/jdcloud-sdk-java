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
 * Send-Message-Related-APIs
 * 富媒体短信发送相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.rms.model.QuerySendStatus;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取发送状态
 */
public class QuerySendStatusResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private List<QuerySendStatus> data;

    /**
     * 请求状态
     */
    private Boolean status;

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误消息
     */
    private String message;


    /**
     * get data
     *
     * @return
     */
    public List<QuerySendStatus> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<QuerySendStatus> data) {
        this.data = data;
    }

    /**
     * get 请求状态
     *
     * @return
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * set 请求状态
     *
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * get 错误码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 错误码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * get 错误消息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 错误消息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * set data
     *
     * @param data
     */
    public QuerySendStatusResult data(List<QuerySendStatus> data) {
        this.data = data;
        return this;
    }

    /**
     * set 请求状态
     *
     * @param status
     */
    public QuerySendStatusResult status(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * set 错误码
     *
     * @param code
     */
    public QuerySendStatusResult code(String code) {
        this.code = code;
        return this;
    }

    /**
     * set 错误消息
     *
     * @param message
     */
    public QuerySendStatusResult message(String message) {
        this.message = message;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(QuerySendStatus data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}