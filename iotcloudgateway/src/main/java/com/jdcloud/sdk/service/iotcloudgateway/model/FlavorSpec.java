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

package com.jdcloud.sdk.service.iotcloudgateway.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * flavorSpec
 */
public class FlavorSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 副本集名称
     * Required:true
     */
    @Required
    private String rsname;

    /**
     * 副本规格
     * Required:true
     */
    @Required
    private String flavor;


    /**
     * get 副本集名称
     *
     * @return
     */
    public String getRsname() {
        return rsname;
    }

    /**
     * set 副本集名称
     *
     * @param rsname
     */
    public void setRsname(String rsname) {
        this.rsname = rsname;
    }

    /**
     * get 副本规格
     *
     * @return
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * set 副本规格
     *
     * @param flavor
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }


    /**
     * set 副本集名称
     *
     * @param rsname
     */
    public FlavorSpec rsname(String rsname) {
        this.rsname = rsname;
        return this;
    }

    /**
     * set 副本规格
     *
     * @param flavor
     */
    public FlavorSpec flavor(String flavor) {
        this.flavor = flavor;
        return this;
    }


}