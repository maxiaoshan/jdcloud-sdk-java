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
 * Deployment
 * 与Deployment相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.jdfusion.model.DeploymentInfo;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建部署信息
 */
public class CreateDeploymentRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建deployment
     * Required:true
     */
    @Required
    private DeploymentInfo deployment;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 创建deployment
     *
     * @return
     */
    public DeploymentInfo getDeployment() {
        return deployment;
    }

    /**
     * set 创建deployment
     *
     * @param deployment
     */
    public void setDeployment(DeploymentInfo deployment) {
        this.deployment = deployment;
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
     * set 创建deployment
     *
     * @param deployment
     */
    public CreateDeploymentRequest deployment(DeploymentInfo deployment) {
        this.deployment = deployment;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateDeploymentRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}