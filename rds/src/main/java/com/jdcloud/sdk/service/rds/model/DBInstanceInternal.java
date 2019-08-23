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

package com.jdcloud.sdk.service.rds.model;


/**
 * dBInstanceInternal
 */
public class DBInstanceInternal  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     */
    private String instanceName;

    /**
     * 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String engine;

    /**
     * 实例类别，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String instanceType;

    /**
     * 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String instanceStatus;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getEngine() {
        return engine;
    }

    /**
     * set 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * get 实例类别，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类别，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * set 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceStatus
     */
    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public DBInstanceInternal instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @param instanceName
     */
    public DBInstanceInternal instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param engine
     */
    public DBInstanceInternal engine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * set 实例类别，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceType
     */
    public DBInstanceInternal instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceStatus
     */
    public DBInstanceInternal instanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }


}