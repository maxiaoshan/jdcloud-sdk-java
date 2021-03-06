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
 * Key Management Service
 * 基于硬件保护密钥的安全数据托管服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kms.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取非对称密钥的公钥
 */
public class GetPublicKeyResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公钥，PEM格式
     */
    private String publicKeyBlob;


    /**
     * get 公钥，PEM格式
     *
     * @return
     */
    public String getPublicKeyBlob() {
        return publicKeyBlob;
    }

    /**
     * set 公钥，PEM格式
     *
     * @param publicKeyBlob
     */
    public void setPublicKeyBlob(String publicKeyBlob) {
        this.publicKeyBlob = publicKeyBlob;
    }


    /**
     * set 公钥，PEM格式
     *
     * @param publicKeyBlob
     */
    public GetPublicKeyResult publicKeyBlob(String publicKeyBlob) {
        this.publicKeyBlob = publicKeyBlob;
        return this;
    }


}