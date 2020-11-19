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
 * 集群管理
 * JMR集群管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.jmr.model.ClusterSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建集群
 */
public class CreateClusterRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 描述集群配置
     * Required:true
     */
    @Required
    private ClusterSpec clusterSpec;

    /**
     * 用于保证请求的幂等性。由客户端生成，长度不能超过64个字符。

     */
    private String clientToken;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 描述集群配置
     *
     * @return
     */
    public ClusterSpec getClusterSpec() {
        return clusterSpec;
    }

    /**
     * set 描述集群配置
     *
     * @param clusterSpec
     */
    public void setClusterSpec(ClusterSpec clusterSpec) {
        this.clusterSpec = clusterSpec;
    }

    /**
     * get 用于保证请求的幂等性。由客户端生成，长度不能超过64个字符。

     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 用于保证请求的幂等性。由客户端生成，长度不能超过64个字符。

     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 描述集群配置
     *
     * @param clusterSpec
     */
    public CreateClusterRequest clusterSpec(ClusterSpec clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }

    /**
     * set 用于保证请求的幂等性。由客户端生成，长度不能超过64个字符。

     *
     * @param clientToken
     */
    public CreateClusterRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateClusterRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}