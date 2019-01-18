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
 * 源数据配置
 */
public class DataMediaInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * cloud
     */
    private CloudInfo cloud;

    /**
     * datasource
     */
    private DatasourceInfo datasource;

    /**
     * schema
     */
    private String schema;

    /**
     * table
     */
    private List<String> tables;


    /**
     * get cloud
     *
     * @return
     */
    public CloudInfo getCloud() {
        return cloud;
    }

    /**
     * set cloud
     *
     * @param cloud
     */
    public void setCloud(CloudInfo cloud) {
        this.cloud = cloud;
    }

    /**
     * get datasource
     *
     * @return
     */
    public DatasourceInfo getDatasource() {
        return datasource;
    }

    /**
     * set datasource
     *
     * @param datasource
     */
    public void setDatasource(DatasourceInfo datasource) {
        this.datasource = datasource;
    }

    /**
     * get schema
     *
     * @return
     */
    public String getSchema() {
        return schema;
    }

    /**
     * set schema
     *
     * @param schema
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * get table
     *
     * @return
     */
    public List<String> getTables() {
        return tables;
    }

    /**
     * set table
     *
     * @param tables
     */
    public void setTables(List<String> tables) {
        this.tables = tables;
    }


    /**
     * set cloud
     *
     * @param cloud
     */
    public DataMediaInfo cloud(CloudInfo cloud) {
        this.cloud = cloud;
        return this;
    }

    /**
     * set datasource
     *
     * @param datasource
     */
    public DataMediaInfo datasource(DatasourceInfo datasource) {
        this.datasource = datasource;
        return this;
    }

    /**
     * set schema
     *
     * @param schema
     */
    public DataMediaInfo schema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * set table
     *
     * @param tables
     */
    public DataMediaInfo tables(List<String> tables) {
        this.tables = tables;
        return this;
    }


    /**
     * add item to table
     *
     * @param table
     */
    public void addTable(String table) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(table);
    }

}