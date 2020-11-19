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

package com.jdcloud.sdk.service.waf.model;


/**
 * warnContactor
 */
public class WarnContactor  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 联系人/群组Id
     */
    private Integer contactId;

    /**
     * 名称
     */
    private String name;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 邮箱
     */
    private String email;


    /**
     * get 联系人/群组Id
     *
     * @return
     */
    public Integer getContactId() {
        return contactId;
    }

    /**
     * set 联系人/群组Id
     *
     * @param contactId
     */
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 手机号
     *
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * set 手机号
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * get 邮箱
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * set 联系人/群组Id
     *
     * @param contactId
     */
    public WarnContactor contactId(Integer contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public WarnContactor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 手机号
     *
     * @param phoneNumber
     */
    public WarnContactor phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public WarnContactor email(String email) {
        this.email = email;
        return this;
    }


}