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

/**
 * cloudMonitorAccessList
 */
public class CloudMonitorAccessList  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否允许选择全部
     */
    private Boolean allowedAll;

    /**
     * serviceCode列表
     */
    private List<CloudMonitorServiceCodeItem> serviceCodes;


    /**
     * get 是否允许选择全部
     *
     * @return
     */
    public Boolean getAllowedAll() {
        return allowedAll;
    }

    /**
     * set 是否允许选择全部
     *
     * @param allowedAll
     */
    public void setAllowedAll(Boolean allowedAll) {
        this.allowedAll = allowedAll;
    }

    /**
     * get serviceCode列表
     *
     * @return
     */
    public List<CloudMonitorServiceCodeItem> getServiceCodes() {
        return serviceCodes;
    }

    /**
     * set serviceCode列表
     *
     * @param serviceCodes
     */
    public void setServiceCodes(List<CloudMonitorServiceCodeItem> serviceCodes) {
        this.serviceCodes = serviceCodes;
    }


    /**
     * set 是否允许选择全部
     *
     * @param allowedAll
     */
    public CloudMonitorAccessList allowedAll(Boolean allowedAll) {
        this.allowedAll = allowedAll;
        return this;
    }

    /**
     * set serviceCode列表
     *
     * @param serviceCodes
     */
    public CloudMonitorAccessList serviceCodes(List<CloudMonitorServiceCodeItem> serviceCodes) {
        this.serviceCodes = serviceCodes;
        return this;
    }


    /**
     * add item to serviceCode列表
     *
     * @param serviceCode
     */
    public void addServiceCode(CloudMonitorServiceCodeItem serviceCode) {
        if (this.serviceCodes == null) {
            this.serviceCodes = new ArrayList<>();
        }
        this.serviceCodes.add(serviceCode);
    }

}