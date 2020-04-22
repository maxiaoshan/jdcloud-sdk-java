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

package com.jdcloud.sdk.service.sms.model;


/**
 * createInstanceNotPayResp
 */
public class CreateInstanceNotPayResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 购买ID
     */
    private String buyId;

    /**
     * 订单确认URL
     */
    private String forwardUrl;


    /**
     * get 购买ID
     *
     * @return
     */
    public String getBuyId() {
        return buyId;
    }

    /**
     * set 购买ID
     *
     * @param buyId
     */
    public void setBuyId(String buyId) {
        this.buyId = buyId;
    }

    /**
     * get 订单确认URL
     *
     * @return
     */
    public String getForwardUrl() {
        return forwardUrl;
    }

    /**
     * set 订单确认URL
     *
     * @param forwardUrl
     */
    public void setForwardUrl(String forwardUrl) {
        this.forwardUrl = forwardUrl;
    }


    /**
     * set 购买ID
     *
     * @param buyId
     */
    public CreateInstanceNotPayResp buyId(String buyId) {
        this.buyId = buyId;
        return this;
    }

    /**
     * set 订单确认URL
     *
     * @param forwardUrl
     */
    public CreateInstanceNotPayResp forwardUrl(String forwardUrl) {
        this.forwardUrl = forwardUrl;
        return this;
    }


}