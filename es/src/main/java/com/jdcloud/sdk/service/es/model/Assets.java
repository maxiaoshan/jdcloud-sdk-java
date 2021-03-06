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

package com.jdcloud.sdk.service.es.model;

import java.util.List;
import java.util.ArrayList;

/**
 * assets
 */
public class Assets  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * es实例ID
     */
    private String instanceId;

    /**
     * es实例名称
     */
    private String instanceName;

    /**
     * es实例版本
     */
    private String instanceVersion;

    /**
     * es http endpoint
     */
    private String endpoint;

    /**
     * 资源信息
     */
    private List<Resource> resources;

    /**
     * es实例是否开启鉴权
     */
    private Boolean isAuth;


    /**
     * get es实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set es实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get es实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set es实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get es实例版本
     *
     * @return
     */
    public String getInstanceVersion() {
        return instanceVersion;
    }

    /**
     * set es实例版本
     *
     * @param instanceVersion
     */
    public void setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
    }

    /**
     * get es http endpoint
     *
     * @return
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * set es http endpoint
     *
     * @param endpoint
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * get 资源信息
     *
     * @return
     */
    public List<Resource> getResources() {
        return resources;
    }

    /**
     * set 资源信息
     *
     * @param resources
     */
    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    /**
     * get es实例是否开启鉴权
     *
     * @return
     */
    public Boolean getIsAuth() {
        return isAuth;
    }

    /**
     * set es实例是否开启鉴权
     *
     * @param isAuth
     */
    public void setIsAuth(Boolean isAuth) {
        this.isAuth = isAuth;
    }


    /**
     * set es实例ID
     *
     * @param instanceId
     */
    public Assets instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set es实例名称
     *
     * @param instanceName
     */
    public Assets instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set es实例版本
     *
     * @param instanceVersion
     */
    public Assets instanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }

    /**
     * set es http endpoint
     *
     * @param endpoint
     */
    public Assets endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * set 资源信息
     *
     * @param resources
     */
    public Assets resources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * set es实例是否开启鉴权
     *
     * @param isAuth
     */
    public Assets isAuth(Boolean isAuth) {
        this.isAuth = isAuth;
        return this;
    }


    /**
     * add item to 资源信息
     *
     * @param resource
     */
    public void addResource(Resource resource) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resource);
    }

}