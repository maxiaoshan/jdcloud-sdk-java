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

package com.jdcloud.sdk.service.domain.model;


/**
 * templateInfo
 */
public class TemplateInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 联系人姓名(中文)
     */
    private String userNameCh;

    /**
     * 联系人姓(英文)
     */
    private String userNameEn1;

    /**
     * 联系人名(英文)
     */
    private String userNameEn2;

    /**
     * 域名所有者或所有者单位名称(中文)
     */
    private String ownerNameCh;

    /**
     * 域名所有者或所有者单位名称(英文)
     */
    private String ownerNameEn;

    /**
     * 国家及地区（中文）
     */
    private String nationCodeCh;

    /**
     * 国家及地区（英文）
     */
    private String nationCodeEn;

    /**
     * 省份（中文）
     */
    private String provinceCodeCh;

    /**
     * 省份（英文）
     */
    private String provinceCodeEn;

    /**
     * 城市（中文）
     */
    private String cityCodeCh;

    /**
     * 城市（英文）
     */
    private String cityCodeEn;

    /**
     * 通信地址（中文）
     */
    private String addressCh;

    /**
     * 通信地址（英文）
     */
    private String addressEn;

    /**
     * 邮编 6位数字
     */
    private String zipCode;

    /**
     * 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     */
    private String phone;

    /**
     * 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     */
    private String fax;

    /**
     * 邮件
     */
    private String email;

    /**
     * 所有者类型  1个人 2企业
     */
    private Integer ownerType;

    /**
     * 实名认证状态 0未实名认证 1已实名认证 2审核中 3审核失败 4实名资料上传注册局失败
     */
    private Integer certificateStatus;

    /**
     * 实名认证失败原因
     */
    private String certificateUnpassReason;

    /**
     * 修改时间
     */
    private String modified;


    /**
     * get 联系人姓名(中文)
     *
     * @return
     */
    public String getUserNameCh() {
        return userNameCh;
    }

    /**
     * set 联系人姓名(中文)
     *
     * @param userNameCh
     */
    public void setUserNameCh(String userNameCh) {
        this.userNameCh = userNameCh;
    }

    /**
     * get 联系人姓(英文)
     *
     * @return
     */
    public String getUserNameEn1() {
        return userNameEn1;
    }

    /**
     * set 联系人姓(英文)
     *
     * @param userNameEn1
     */
    public void setUserNameEn1(String userNameEn1) {
        this.userNameEn1 = userNameEn1;
    }

    /**
     * get 联系人名(英文)
     *
     * @return
     */
    public String getUserNameEn2() {
        return userNameEn2;
    }

    /**
     * set 联系人名(英文)
     *
     * @param userNameEn2
     */
    public void setUserNameEn2(String userNameEn2) {
        this.userNameEn2 = userNameEn2;
    }

    /**
     * get 域名所有者或所有者单位名称(中文)
     *
     * @return
     */
    public String getOwnerNameCh() {
        return ownerNameCh;
    }

    /**
     * set 域名所有者或所有者单位名称(中文)
     *
     * @param ownerNameCh
     */
    public void setOwnerNameCh(String ownerNameCh) {
        this.ownerNameCh = ownerNameCh;
    }

    /**
     * get 域名所有者或所有者单位名称(英文)
     *
     * @return
     */
    public String getOwnerNameEn() {
        return ownerNameEn;
    }

    /**
     * set 域名所有者或所有者单位名称(英文)
     *
     * @param ownerNameEn
     */
    public void setOwnerNameEn(String ownerNameEn) {
        this.ownerNameEn = ownerNameEn;
    }

    /**
     * get 国家及地区（中文）
     *
     * @return
     */
    public String getNationCodeCh() {
        return nationCodeCh;
    }

    /**
     * set 国家及地区（中文）
     *
     * @param nationCodeCh
     */
    public void setNationCodeCh(String nationCodeCh) {
        this.nationCodeCh = nationCodeCh;
    }

    /**
     * get 国家及地区（英文）
     *
     * @return
     */
    public String getNationCodeEn() {
        return nationCodeEn;
    }

    /**
     * set 国家及地区（英文）
     *
     * @param nationCodeEn
     */
    public void setNationCodeEn(String nationCodeEn) {
        this.nationCodeEn = nationCodeEn;
    }

    /**
     * get 省份（中文）
     *
     * @return
     */
    public String getProvinceCodeCh() {
        return provinceCodeCh;
    }

    /**
     * set 省份（中文）
     *
     * @param provinceCodeCh
     */
    public void setProvinceCodeCh(String provinceCodeCh) {
        this.provinceCodeCh = provinceCodeCh;
    }

    /**
     * get 省份（英文）
     *
     * @return
     */
    public String getProvinceCodeEn() {
        return provinceCodeEn;
    }

    /**
     * set 省份（英文）
     *
     * @param provinceCodeEn
     */
    public void setProvinceCodeEn(String provinceCodeEn) {
        this.provinceCodeEn = provinceCodeEn;
    }

    /**
     * get 城市（中文）
     *
     * @return
     */
    public String getCityCodeCh() {
        return cityCodeCh;
    }

    /**
     * set 城市（中文）
     *
     * @param cityCodeCh
     */
    public void setCityCodeCh(String cityCodeCh) {
        this.cityCodeCh = cityCodeCh;
    }

    /**
     * get 城市（英文）
     *
     * @return
     */
    public String getCityCodeEn() {
        return cityCodeEn;
    }

    /**
     * set 城市（英文）
     *
     * @param cityCodeEn
     */
    public void setCityCodeEn(String cityCodeEn) {
        this.cityCodeEn = cityCodeEn;
    }

    /**
     * get 通信地址（中文）
     *
     * @return
     */
    public String getAddressCh() {
        return addressCh;
    }

    /**
     * set 通信地址（中文）
     *
     * @param addressCh
     */
    public void setAddressCh(String addressCh) {
        this.addressCh = addressCh;
    }

    /**
     * get 通信地址（英文）
     *
     * @return
     */
    public String getAddressEn() {
        return addressEn;
    }

    /**
     * set 通信地址（英文）
     *
     * @param addressEn
     */
    public void setAddressEn(String addressEn) {
        this.addressEn = addressEn;
    }

    /**
     * get 邮编 6位数字
     *
     * @return
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * set 邮编 6位数字
     *
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * get 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * get 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @return
     */
    public String getFax() {
        return fax;
    }

    /**
     * set 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * get 邮件
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮件
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get 所有者类型  1个人 2企业
     *
     * @return
     */
    public Integer getOwnerType() {
        return ownerType;
    }

    /**
     * set 所有者类型  1个人 2企业
     *
     * @param ownerType
     */
    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }

    /**
     * get 实名认证状态 0未实名认证 1已实名认证 2审核中 3审核失败 4实名资料上传注册局失败
     *
     * @return
     */
    public Integer getCertificateStatus() {
        return certificateStatus;
    }

    /**
     * set 实名认证状态 0未实名认证 1已实名认证 2审核中 3审核失败 4实名资料上传注册局失败
     *
     * @param certificateStatus
     */
    public void setCertificateStatus(Integer certificateStatus) {
        this.certificateStatus = certificateStatus;
    }

    /**
     * get 实名认证失败原因
     *
     * @return
     */
    public String getCertificateUnpassReason() {
        return certificateUnpassReason;
    }

    /**
     * set 实名认证失败原因
     *
     * @param certificateUnpassReason
     */
    public void setCertificateUnpassReason(String certificateUnpassReason) {
        this.certificateUnpassReason = certificateUnpassReason;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getModified() {
        return modified;
    }

    /**
     * set 修改时间
     *
     * @param modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }


    /**
     * set 联系人姓名(中文)
     *
     * @param userNameCh
     */
    public TemplateInfo userNameCh(String userNameCh) {
        this.userNameCh = userNameCh;
        return this;
    }

    /**
     * set 联系人姓(英文)
     *
     * @param userNameEn1
     */
    public TemplateInfo userNameEn1(String userNameEn1) {
        this.userNameEn1 = userNameEn1;
        return this;
    }

    /**
     * set 联系人名(英文)
     *
     * @param userNameEn2
     */
    public TemplateInfo userNameEn2(String userNameEn2) {
        this.userNameEn2 = userNameEn2;
        return this;
    }

    /**
     * set 域名所有者或所有者单位名称(中文)
     *
     * @param ownerNameCh
     */
    public TemplateInfo ownerNameCh(String ownerNameCh) {
        this.ownerNameCh = ownerNameCh;
        return this;
    }

    /**
     * set 域名所有者或所有者单位名称(英文)
     *
     * @param ownerNameEn
     */
    public TemplateInfo ownerNameEn(String ownerNameEn) {
        this.ownerNameEn = ownerNameEn;
        return this;
    }

    /**
     * set 国家及地区（中文）
     *
     * @param nationCodeCh
     */
    public TemplateInfo nationCodeCh(String nationCodeCh) {
        this.nationCodeCh = nationCodeCh;
        return this;
    }

    /**
     * set 国家及地区（英文）
     *
     * @param nationCodeEn
     */
    public TemplateInfo nationCodeEn(String nationCodeEn) {
        this.nationCodeEn = nationCodeEn;
        return this;
    }

    /**
     * set 省份（中文）
     *
     * @param provinceCodeCh
     */
    public TemplateInfo provinceCodeCh(String provinceCodeCh) {
        this.provinceCodeCh = provinceCodeCh;
        return this;
    }

    /**
     * set 省份（英文）
     *
     * @param provinceCodeEn
     */
    public TemplateInfo provinceCodeEn(String provinceCodeEn) {
        this.provinceCodeEn = provinceCodeEn;
        return this;
    }

    /**
     * set 城市（中文）
     *
     * @param cityCodeCh
     */
    public TemplateInfo cityCodeCh(String cityCodeCh) {
        this.cityCodeCh = cityCodeCh;
        return this;
    }

    /**
     * set 城市（英文）
     *
     * @param cityCodeEn
     */
    public TemplateInfo cityCodeEn(String cityCodeEn) {
        this.cityCodeEn = cityCodeEn;
        return this;
    }

    /**
     * set 通信地址（中文）
     *
     * @param addressCh
     */
    public TemplateInfo addressCh(String addressCh) {
        this.addressCh = addressCh;
        return this;
    }

    /**
     * set 通信地址（英文）
     *
     * @param addressEn
     */
    public TemplateInfo addressEn(String addressEn) {
        this.addressEn = addressEn;
        return this;
    }

    /**
     * set 邮编 6位数字
     *
     * @param zipCode
     */
    public TemplateInfo zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * set 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param phone
     */
    public TemplateInfo phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * set 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param fax
     */
    public TemplateInfo fax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * set 邮件
     *
     * @param email
     */
    public TemplateInfo email(String email) {
        this.email = email;
        return this;
    }

    /**
     * set 所有者类型  1个人 2企业
     *
     * @param ownerType
     */
    public TemplateInfo ownerType(Integer ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * set 实名认证状态 0未实名认证 1已实名认证 2审核中 3审核失败 4实名资料上传注册局失败
     *
     * @param certificateStatus
     */
    public TemplateInfo certificateStatus(Integer certificateStatus) {
        this.certificateStatus = certificateStatus;
        return this;
    }

    /**
     * set 实名认证失败原因
     *
     * @param certificateUnpassReason
     */
    public TemplateInfo certificateUnpassReason(String certificateUnpassReason) {
        this.certificateUnpassReason = certificateUnpassReason;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param modified
     */
    public TemplateInfo modified(String modified) {
        this.modified = modified;
        return this;
    }


}