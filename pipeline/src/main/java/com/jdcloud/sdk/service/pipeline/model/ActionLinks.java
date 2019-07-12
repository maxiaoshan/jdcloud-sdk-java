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

package com.jdcloud.sdk.service.pipeline.model;


/**
 * actionLinks
 */
public class ActionLinks  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * provider
     */
    private ActionLink provider;

    /**
     * status
     */
    private ActionLink status;

    /**
     * detail
     */
    private ActionLink detail;


    /**
     * get provider
     *
     * @return
     */
    public ActionLink getProvider() {
        return provider;
    }

    /**
     * set provider
     *
     * @param provider
     */
    public void setProvider(ActionLink provider) {
        this.provider = provider;
    }

    /**
     * get status
     *
     * @return
     */
    public ActionLink getStatus() {
        return status;
    }

    /**
     * set status
     *
     * @param status
     */
    public void setStatus(ActionLink status) {
        this.status = status;
    }

    /**
     * get detail
     *
     * @return
     */
    public ActionLink getDetail() {
        return detail;
    }

    /**
     * set detail
     *
     * @param detail
     */
    public void setDetail(ActionLink detail) {
        this.detail = detail;
    }


    /**
     * set provider
     *
     * @param provider
     */
    public ActionLinks provider(ActionLink provider) {
        this.provider = provider;
        return this;
    }

    /**
     * set status
     *
     * @param status
     */
    public ActionLinks status(ActionLink status) {
        this.status = status;
        return this;
    }

    /**
     * set detail
     *
     * @param detail
     */
    public ActionLinks detail(ActionLink detail) {
        this.detail = detail;
        return this;
    }


}