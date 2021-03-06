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

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * createTemplateRequestV2
 */
public class CreateTemplateRequestV2  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 幂等性校验参数,最长36位
     * Required:true
     */
    @Required
    private String clientToken;

    /**
     * 模板描述
     */
    private String description;

    /**
     * 模板资源类型下的维度，如果该资源分维度,则必须传入此参数
     */
    private String dimension;

    /**
     * 模板的资源类型
     * Required:true
     */
    @Required
    private String product;

    /**
     * 模板名称,长度1-32个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     * Required:true
     */
    @Required
    private String templateName;

    /**
     * 模板内包含的规则
     * Required:true
     */
    @Required
    private List<BasicRule> templateRules;


    /**
     * get 幂等性校验参数,最长36位
     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 幂等性校验参数,最长36位
     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * get 模板描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 模板描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 模板资源类型下的维度，如果该资源分维度,则必须传入此参数
     *
     * @return
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * set 模板资源类型下的维度，如果该资源分维度,则必须传入此参数
     *
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * get 模板的资源类型
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set 模板的资源类型
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get 模板名称,长度1-32个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 模板名称,长度1-32个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * get 模板内包含的规则
     *
     * @return
     */
    public List<BasicRule> getTemplateRules() {
        return templateRules;
    }

    /**
     * set 模板内包含的规则
     *
     * @param templateRules
     */
    public void setTemplateRules(List<BasicRule> templateRules) {
        this.templateRules = templateRules;
    }


    /**
     * set 幂等性校验参数,最长36位
     *
     * @param clientToken
     */
    public CreateTemplateRequestV2 clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set 模板描述
     *
     * @param description
     */
    public CreateTemplateRequestV2 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 模板资源类型下的维度，如果该资源分维度,则必须传入此参数
     *
     * @param dimension
     */
    public CreateTemplateRequestV2 dimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * set 模板的资源类型
     *
     * @param product
     */
    public CreateTemplateRequestV2 product(String product) {
        this.product = product;
        return this;
    }

    /**
     * set 模板名称,长度1-32个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @param templateName
     */
    public CreateTemplateRequestV2 templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * set 模板内包含的规则
     *
     * @param templateRules
     */
    public CreateTemplateRequestV2 templateRules(List<BasicRule> templateRules) {
        this.templateRules = templateRules;
        return this;
    }


    /**
     * add item to 模板内包含的规则
     *
     * @param templateRule
     */
    public void addTemplateRule(BasicRule templateRule) {
        if (this.templateRules == null) {
            this.templateRules = new ArrayList<>();
        }
        this.templateRules.add(templateRule);
    }

}