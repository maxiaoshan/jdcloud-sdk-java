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
 * Renew Management APIs
 * 续费管理相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.renewal.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.renewal.model.ListQuery;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 提供可续费的实例信息查询。
 */
public class QueryInstanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * listQueries
     */
    private List<ListQuery> listQueries;

    /**
     * 查询总数
     */
    private Integer totalCount;


    /**
     * get listQueries
     *
     * @return
     */
    public List<ListQuery> getListQueries() {
        return listQueries;
    }

    /**
     * set listQueries
     *
     * @param listQueries
     */
    public void setListQueries(List<ListQuery> listQueries) {
        this.listQueries = listQueries;
    }

    /**
     * get 查询总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 查询总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set listQueries
     *
     * @param listQueries
     */
    public QueryInstanceResult listQueries(List<ListQuery> listQueries) {
        this.listQueries = listQueries;
        return this;
    }

    /**
     * set 查询总数
     *
     * @param totalCount
     */
    public QueryInstanceResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to listQueries
     *
     * @param listQuerie
     */
    public void addListQuerie(ListQuery listQuerie) {
        if (this.listQueries == null) {
            this.listQueries = new ArrayList<>();
        }
        this.listQueries.add(listQuerie);
    }

}