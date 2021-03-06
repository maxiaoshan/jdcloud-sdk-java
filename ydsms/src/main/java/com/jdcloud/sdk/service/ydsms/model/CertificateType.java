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

package com.jdcloud.sdk.service.ydsms.model;


/**
 * certificateType
 */
public class CertificateType  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 证明材料类型
     */
    private String certificateTypeName;

    /**
     * 证明材料类型id
     */
    private Integer id;

    /**
     * updateTime
     */
    private String updateTime;


    /**
     * get 证明材料类型
     *
     * @return
     */
    public String getCertificateTypeName() {
        return certificateTypeName;
    }

    /**
     * set 证明材料类型
     *
     * @param certificateTypeName
     */
    public void setCertificateTypeName(String certificateTypeName) {
        this.certificateTypeName = certificateTypeName;
    }

    /**
     * get 证明材料类型id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 证明材料类型id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 证明材料类型
     *
     * @param certificateTypeName
     */
    public CertificateType certificateTypeName(String certificateTypeName) {
        this.certificateTypeName = certificateTypeName;
        return this;
    }

    /**
     * set 证明材料类型id
     *
     * @param id
     */
    public CertificateType id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public CertificateType updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}