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

package com.jdcloud.sdk.service.cdn.model;


/**
 * unForbiddenTaskItem
 */
public class UnForbiddenTaskItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名
     */
    private String domain;

    /**
     * url
     */
    private String url;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 状态描述
     */
    private String statusDesc;

    /**
     * 创建时间
     */
    private String createTime;


    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get 状态
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 状态描述
     *
     * @return
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * set 状态描述
     *
     * @param statusDesc
     */
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * set 域名
     *
     * @param domain
     */
    public UnForbiddenTaskItem domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set url
     *
     * @param url
     */
    public UnForbiddenTaskItem url(String url) {
        this.url = url;
        return this;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public UnForbiddenTaskItem status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 状态描述
     *
     * @param statusDesc
     */
    public UnForbiddenTaskItem statusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public UnForbiddenTaskItem createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}