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
 * 修订版本
 * 提供修订版本的创建、查询、删除、修改、查重功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.apigateway.model.RevisionList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询分组内全部修订版本号
 */
public class GetRevisionIdsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * revisions
     */
    private List<RevisionList> revisions;


    /**
     * get revisions
     *
     * @return
     */
    public List<RevisionList> getRevisions() {
        return revisions;
    }

    /**
     * set revisions
     *
     * @param revisions
     */
    public void setRevisions(List<RevisionList> revisions) {
        this.revisions = revisions;
    }


    /**
     * set revisions
     *
     * @param revisions
     */
    public GetRevisionIdsResult revisions(List<RevisionList> revisions) {
        this.revisions = revisions;
        return this;
    }


    /**
     * add item to revisions
     *
     * @param revision
     */
    public void addRevision(RevisionList revision) {
        if (this.revisions == null) {
            this.revisions = new ArrayList<>();
        }
        this.revisions.add(revision);
    }

}