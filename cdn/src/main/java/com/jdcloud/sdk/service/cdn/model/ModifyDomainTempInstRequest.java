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
 * 域名模板管理接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建修改模板实例
 */
public class ModifyDomainTempInstRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板id，预留字段
     */
    private Long tempId;

    /**
     * 模板实例id，修改时必传
     */
    private Long instId;

    /**
     * 模板实例名称
     */
    private String instName;

    /**
     * 查询结果,类型为Map&lt;String,Map&lt;String,Object&gt;&gt;
     */
    private Object instProInfoMap;


    /**
     * get 模板id，预留字段
     *
     * @return
     */
    public Long getTempId() {
        return tempId;
    }

    /**
     * set 模板id，预留字段
     *
     * @param tempId
     */
    public void setTempId(Long tempId) {
        this.tempId = tempId;
    }

    /**
     * get 模板实例id，修改时必传
     *
     * @return
     */
    public Long getInstId() {
        return instId;
    }

    /**
     * set 模板实例id，修改时必传
     *
     * @param instId
     */
    public void setInstId(Long instId) {
        this.instId = instId;
    }

    /**
     * get 模板实例名称
     *
     * @return
     */
    public String getInstName() {
        return instName;
    }

    /**
     * set 模板实例名称
     *
     * @param instName
     */
    public void setInstName(String instName) {
        this.instName = instName;
    }

    /**
     * get 查询结果,类型为Map&lt;String,Map&lt;String,Object&gt;&gt;
     *
     * @return
     */
    public Object getInstProInfoMap() {
        return instProInfoMap;
    }

    /**
     * set 查询结果,类型为Map&lt;String,Map&lt;String,Object&gt;&gt;
     *
     * @param instProInfoMap
     */
    public void setInstProInfoMap(Object instProInfoMap) {
        this.instProInfoMap = instProInfoMap;
    }


    /**
     * set 模板id，预留字段
     *
     * @param tempId
     */
    public ModifyDomainTempInstRequest tempId(Long tempId) {
        this.tempId = tempId;
        return this;
    }

    /**
     * set 模板实例id，修改时必传
     *
     * @param instId
     */
    public ModifyDomainTempInstRequest instId(Long instId) {
        this.instId = instId;
        return this;
    }

    /**
     * set 模板实例名称
     *
     * @param instName
     */
    public ModifyDomainTempInstRequest instName(String instName) {
        this.instName = instName;
        return this;
    }

    /**
     * set 查询结果,类型为Map&lt;String,Map&lt;String,Object&gt;&gt;
     *
     * @param instProInfoMap
     */
    public ModifyDomainTempInstRequest instProInfoMap(Object instProInfoMap) {
        this.instProInfoMap = instProInfoMap;
        return this;
    }


}