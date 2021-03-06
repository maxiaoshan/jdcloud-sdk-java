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
 * SiteMonitor APIs
 * 站点监控相关接口，提供创建、查询、修改、删除站点监控等功能
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.detection.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 修改站点监控任务
 */
public class UpdateSiteMonitorResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * suc
     */
    private Boolean suc;


    /**
     * get suc
     *
     * @return
     */
    public Boolean getSuc() {
        return suc;
    }

    /**
     * set suc
     *
     * @param suc
     */
    public void setSuc(Boolean suc) {
        this.suc = suc;
    }


    /**
     * set suc
     *
     * @param suc
     */
    public UpdateSiteMonitorResult suc(Boolean suc) {
        this.suc = suc;
        return this;
    }


}