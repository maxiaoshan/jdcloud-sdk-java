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
 * Live API
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置录制回调通知
 */
public class SetLiveStreamRecordNotifyConfigRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 您的推流加速域名
     * Required:true
     */
    @Required
    private String publishDomain;

    /**
     * 设置直播流信息推送到的 URL 地址
     * Required:true
     */
    @Required
    private String notifyUrl;


    /**
     * get 您的推流加速域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 您的推流加速域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 设置直播流信息推送到的 URL 地址
     *
     * @return
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * set 设置直播流信息推送到的 URL 地址
     *
     * @param notifyUrl
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }


    /**
     * set 您的推流加速域名
     *
     * @param publishDomain
     */
    public SetLiveStreamRecordNotifyConfigRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 设置直播流信息推送到的 URL 地址
     *
     * @param notifyUrl
     */
    public SetLiveStreamRecordNotifyConfigRequest notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }


}