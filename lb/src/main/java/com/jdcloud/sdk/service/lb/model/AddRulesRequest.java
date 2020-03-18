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
 * Forwarding-Rules-Group
 * 转发规则组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.lb.model.RuleSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 往转发规则组加入转发规则
 */
public class AddRulesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 转发规则的信息
     * Required:true
     */
    @Required
    private List<RuleSpec> ruleSpecs;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 转发规则组Id
     * Required:true
     */
    @Required
    private String urlMapId;


    /**
     * get 转发规则的信息
     *
     * @return
     */
    public List<RuleSpec> getRuleSpecs() {
        return ruleSpecs;
    }

    /**
     * set 转发规则的信息
     *
     * @param ruleSpecs
     */
    public void setRuleSpecs(List<RuleSpec> ruleSpecs) {
        this.ruleSpecs = ruleSpecs;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 转发规则组Id
     *
     * @return
     */
    public String getUrlMapId() {
        return urlMapId;
    }

    /**
     * set 转发规则组Id
     *
     * @param urlMapId
     */
    public void setUrlMapId(String urlMapId) {
        this.urlMapId = urlMapId;
    }


    /**
     * set 转发规则的信息
     *
     * @param ruleSpecs
     */
    public AddRulesRequest ruleSpecs(List<RuleSpec> ruleSpecs) {
        this.ruleSpecs = ruleSpecs;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public AddRulesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 转发规则组Id
     *
     * @param urlMapId
     */
    public AddRulesRequest urlMapId(String urlMapId) {
        this.urlMapId = urlMapId;
        return this;
    }


    /**
     * add item to 转发规则的信息
     *
     * @param ruleSpec
     */
    public void addRuleSpec(RuleSpec ruleSpec) {
        if (this.ruleSpecs == null) {
            this.ruleSpecs = new ArrayList<>();
        }
        this.ruleSpecs.add(ruleSpec);
    }

}