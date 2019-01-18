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

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;

/**
 * RDS实例上的数据库信息
 */
public class RdsDBInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库名称
     */
    private String name;

    /**
     * 数据库状态
     */
    private String status;

    /**
     * 字符集
     */
    private String characterSetName;

    /**
     * accountPrivileges
     */
    private List<RdsDBAccessPrivilege> accountPrivileges;

    /**
     * 所属云提供商ID
     */
    private String cloudID;


    /**
     * get 数据库名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 数据库名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 数据库状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 数据库状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 字符集
     *
     * @return
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * set 字符集
     *
     * @param characterSetName
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * get accountPrivileges
     *
     * @return
     */
    public List<RdsDBAccessPrivilege> getAccountPrivileges() {
        return accountPrivileges;
    }

    /**
     * set accountPrivileges
     *
     * @param accountPrivileges
     */
    public void setAccountPrivileges(List<RdsDBAccessPrivilege> accountPrivileges) {
        this.accountPrivileges = accountPrivileges;
    }

    /**
     * get 所属云提供商ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }


    /**
     * set 数据库名称
     *
     * @param name
     */
    public RdsDBInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 数据库状态
     *
     * @param status
     */
    public RdsDBInfo status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 字符集
     *
     * @param characterSetName
     */
    public RdsDBInfo characterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * set accountPrivileges
     *
     * @param accountPrivileges
     */
    public RdsDBInfo accountPrivileges(List<RdsDBAccessPrivilege> accountPrivileges) {
        this.accountPrivileges = accountPrivileges;
        return this;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public RdsDBInfo cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }


    /**
     * add item to accountPrivileges
     *
     * @param accountPrivilege
     */
    public void addAccountPrivilege(RdsDBAccessPrivilege accountPrivilege) {
        if (this.accountPrivileges == null) {
            this.accountPrivileges = new ArrayList<>();
        }
        this.accountPrivileges.add(accountPrivilege);
    }

}