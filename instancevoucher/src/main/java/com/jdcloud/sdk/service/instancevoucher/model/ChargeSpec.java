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

package com.jdcloud.sdk.service.instancevoucher.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * chargeSpec
 */
public class ChargeSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 计费单位，取值为：month、year，默认为month
     * Required:true
     */
    @Required
    private String chargeUnit;

    /**
     * 计费时长。当chargeUnit为month时取值为：1 ~ 9，当chargeUnit为year时取值为：1、2、3
     * Required:true
     */
    @Required
    private Integer chargeDuration;

    /**
     * True&#x3D;：OPEN——开通自动续费、False&#x3D;CLOSE—— 不开通自动续费，默认为CLOSE
     */
    private Boolean autoRenew;


    /**
     * get 计费单位，取值为：month、year，默认为month
     *
     * @return
     */
    public String getChargeUnit() {
        return chargeUnit;
    }

    /**
     * set 计费单位，取值为：month、year，默认为month
     *
     * @param chargeUnit
     */
    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    /**
     * get 计费时长。当chargeUnit为month时取值为：1 ~ 9，当chargeUnit为year时取值为：1、2、3
     *
     * @return
     */
    public Integer getChargeDuration() {
        return chargeDuration;
    }

    /**
     * set 计费时长。当chargeUnit为month时取值为：1 ~ 9，当chargeUnit为year时取值为：1、2、3
     *
     * @param chargeDuration
     */
    public void setChargeDuration(Integer chargeDuration) {
        this.chargeDuration = chargeDuration;
    }

    /**
     * get True&#x3D;：OPEN——开通自动续费、False&#x3D;CLOSE—— 不开通自动续费，默认为CLOSE
     *
     * @return
     */
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    /**
     * set True&#x3D;：OPEN——开通自动续费、False&#x3D;CLOSE—— 不开通自动续费，默认为CLOSE
     *
     * @param autoRenew
     */
    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }


    /**
     * set 计费单位，取值为：month、year，默认为month
     *
     * @param chargeUnit
     */
    public ChargeSpec chargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
        return this;
    }

    /**
     * set 计费时长。当chargeUnit为month时取值为：1 ~ 9，当chargeUnit为year时取值为：1、2、3
     *
     * @param chargeDuration
     */
    public ChargeSpec chargeDuration(Integer chargeDuration) {
        this.chargeDuration = chargeDuration;
        return this;
    }

    /**
     * set True&#x3D;：OPEN——开通自动续费、False&#x3D;CLOSE—— 不开通自动续费，默认为CLOSE
     *
     * @param autoRenew
     */
    public ChargeSpec autoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }


}