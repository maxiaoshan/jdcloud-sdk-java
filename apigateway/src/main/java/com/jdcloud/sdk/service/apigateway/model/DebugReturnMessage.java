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
 * debugReturnMessage
 */
public class DebugReturnMessage  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 请求地址
     */
    private String requestUrl;

    /**
     * request中header信息
     */
    private String requestHeader;

    /**
     * request中body信息
     */
    private String requestBody;

    /**
     * 响应状态码
     */
    private String responseCodeStatus;

    /**
     * header返回值
     */
    private String responseHeaderValue;

    /**
     * body返回值
     */
    private String responseBody;


    /**
     * get 请求地址
     *
     * @return
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * set 请求地址
     *
     * @param requestUrl
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    /**
     * get request中header信息
     *
     * @return
     */
    public String getRequestHeader() {
        return requestHeader;
    }

    /**
     * set request中header信息
     *
     * @param requestHeader
     */
    public void setRequestHeader(String requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * get request中body信息
     *
     * @return
     */
    public String getRequestBody() {
        return requestBody;
    }

    /**
     * set request中body信息
     *
     * @param requestBody
     */
    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    /**
     * get 响应状态码
     *
     * @return
     */
    public String getResponseCodeStatus() {
        return responseCodeStatus;
    }

    /**
     * set 响应状态码
     *
     * @param responseCodeStatus
     */
    public void setResponseCodeStatus(String responseCodeStatus) {
        this.responseCodeStatus = responseCodeStatus;
    }

    /**
     * get header返回值
     *
     * @return
     */
    public String getResponseHeaderValue() {
        return responseHeaderValue;
    }

    /**
     * set header返回值
     *
     * @param responseHeaderValue
     */
    public void setResponseHeaderValue(String responseHeaderValue) {
        this.responseHeaderValue = responseHeaderValue;
    }

    /**
     * get body返回值
     *
     * @return
     */
    public String getResponseBody() {
        return responseBody;
    }

    /**
     * set body返回值
     *
     * @param responseBody
     */
    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }


    /**
     * set 请求地址
     *
     * @param requestUrl
     */
    public DebugReturnMessage requestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
        return this;
    }

    /**
     * set request中header信息
     *
     * @param requestHeader
     */
    public DebugReturnMessage requestHeader(String requestHeader) {
        this.requestHeader = requestHeader;
        return this;
    }

    /**
     * set request中body信息
     *
     * @param requestBody
     */
    public DebugReturnMessage requestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * set 响应状态码
     *
     * @param responseCodeStatus
     */
    public DebugReturnMessage responseCodeStatus(String responseCodeStatus) {
        this.responseCodeStatus = responseCodeStatus;
        return this;
    }

    /**
     * set header返回值
     *
     * @param responseHeaderValue
     */
    public DebugReturnMessage responseHeaderValue(String responseHeaderValue) {
        this.responseHeaderValue = responseHeaderValue;
        return this;
    }

    /**
     * set body返回值
     *
     * @param responseBody
     */
    public DebugReturnMessage responseBody(String responseBody) {
        this.responseBody = responseBody;
        return this;
    }


}