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

package com.jdcloud.sdk.service.jcq.model;


/**
 * permission
 */
public class Permission  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * userId
     */
    private String userId;

    /**
     * permission, [SUB, PUB, PUBSUB]
     */
    private String permission;


    /**
     * get userId
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set userId
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * get permission, [SUB, PUB, PUBSUB]
     *
     * @return
     */
    public String getPermission() {
        return permission;
    }

    /**
     * set permission, [SUB, PUB, PUBSUB]
     *
     * @param permission
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }


    /**
     * set userId
     *
     * @param userId
     */
    public Permission userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * set permission, [SUB, PUB, PUBSUB]
     *
     * @param permission
     */
    public Permission permission(String permission) {
        this.permission = permission;
        return this;
    }


}