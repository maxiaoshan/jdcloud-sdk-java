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
 * yunding-rds
 * 云鼎-云数据库管理相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.yunding.model.DeleteRdsDatabaseResponse;

/**
 * 从RDS实例中删除数据库。为便于管理和数据恢复，RDS对用户权限进行了控制，用户仅能通过控制台或本接口删除数据库 [MFA enabled]
 */
class DeleteRdsDatabaseExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "DELETE";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/ydRdsInstances/{instanceId}/databases/{dbName}";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DeleteRdsDatabaseResponse.class;
    }
}
