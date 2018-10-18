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
 * binlog日志
 * binlog日志相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取MySQL实例的binlog的下载链接&lt;br&gt;- 仅支持MySQL
 */
public class DescribeBinlogDownloadURLResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网下载链接
     */
    private String publicURL;

    /**
     * 内网下载链接
     */
    private String internalURL;


    /**
     * get 公网下载链接
     *
     * @return
     */
    public String getPublicURL() {
        return publicURL;
    }

    /**
     * set 公网下载链接
     *
     * @param publicURL
     */
    public void setPublicURL(String publicURL) {
        this.publicURL = publicURL;
    }

    /**
     * get 内网下载链接
     *
     * @return
     */
    public String getInternalURL() {
        return internalURL;
    }

    /**
     * set 内网下载链接
     *
     * @param internalURL
     */
    public void setInternalURL(String internalURL) {
        this.internalURL = internalURL;
    }


    /**
     * set 公网下载链接
     *
     * @param publicURL
     */
    public DescribeBinlogDownloadURLResult publicURL(String publicURL) {
        this.publicURL = publicURL;
        return this;
    }

    /**
     * set 内网下载链接
     *
     * @param internalURL
     */
    public DescribeBinlogDownloadURLResult internalURL(String internalURL) {
        this.internalURL = internalURL;
        return this;
    }


}