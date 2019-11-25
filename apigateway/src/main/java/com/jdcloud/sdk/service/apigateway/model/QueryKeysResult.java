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
 * kms
 * key manager service
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.apigateway.model.KeyInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询key列表
 */
public class QueryKeysResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * total count
     */
    private Integer total;

    /**
     * data
     */
    private List<KeyInfo> data;


    /**
     * get total count
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set total count
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * get data
     *
     * @return
     */
    public List<KeyInfo> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<KeyInfo> data) {
        this.data = data;
    }


    /**
     * set total count
     *
     * @param total
     */
    public QueryKeysResult total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * set data
     *
     * @param data
     */
    public QueryKeysResult data(List<KeyInfo> data) {
        this.data = data;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(KeyInfo data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}