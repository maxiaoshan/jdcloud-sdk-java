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
 * 集群管理
 * JMR集群管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询用户集群的列表

 */
public class DescribeClustersRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域
     */
    private String dataCenter;

    /**
     * 集群状态，CREATING，RUNNING，RELEASED，FAILED等
     */
    private String status;

    /**
     * 集群名称
     */
    private String clusterName;

    /**
     * 排序，比如 id desc
     */
    private String orderBy;

    /**
     * 页数，默认为1
     */
    private Integer pageNum;

    /**
     * 每页数目，默认为10
     */
    private Integer pageSize;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 地域
     *
     * @return
     */
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * set 地域
     *
     * @param dataCenter
     */
    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    /**
     * get 集群状态，CREATING，RUNNING，RELEASED，FAILED等
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 集群状态，CREATING，RUNNING，RELEASED，FAILED等
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 集群名称
     *
     * @return
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * set 集群名称
     *
     * @param clusterName
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * get 排序，比如 id desc
     *
     * @return
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * set 排序，比如 id desc
     *
     * @param orderBy
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * get 页数，默认为1
     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 页数，默认为1
     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * get 每页数目，默认为10
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页数目，默认为10
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 地域
     *
     * @param dataCenter
     */
    public DescribeClustersRequest dataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * set 集群状态，CREATING，RUNNING，RELEASED，FAILED等
     *
     * @param status
     */
    public DescribeClustersRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 集群名称
     *
     * @param clusterName
     */
    public DescribeClustersRequest clusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * set 排序，比如 id desc
     *
     * @param orderBy
     */
    public DescribeClustersRequest orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * set 页数，默认为1
     *
     * @param pageNum
     */
    public DescribeClustersRequest pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * set 每页数目，默认为10
     *
     * @param pageSize
     */
    public DescribeClustersRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeClustersRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}