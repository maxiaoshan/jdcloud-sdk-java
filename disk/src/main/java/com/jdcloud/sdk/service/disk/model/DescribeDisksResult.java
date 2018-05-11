/*
 * Copyright 2018-2025 JDCLOUD.COM
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
 * 云硬盘相关接口
 * 云硬盘相关接口，提供批量创建云硬盘，查询云硬盘，删除云硬盘，对云硬盘进行扩容，修改云硬盘信息以及使用快照恢复云硬盘等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.disk.model.Disk;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询云硬盘列表
 */
public class DescribeDisksResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * disks
     */
    private List<Disk> disks;

    /**
     * 查询的云硬盘数目
     */
    private Integer totalCount;


    /**
     * get disks
     *
     * @return
     */
    public List<Disk> getDisks() {
        return disks;
    }

    /**
     * set disks
     *
     * @param disks
     */
    public void setDisks(List<Disk> disks) {
        this.disks = disks;
    }

    /**
     * get 查询的云硬盘数目
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 查询的云硬盘数目
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set disks
     *
     * @param disks
     */
    public DescribeDisksResult disks(List<Disk> disks) {
        this.disks = disks;
        return this;
    }

    /**
     * set 查询的云硬盘数目
     *
     * @param totalCount
     */
    public DescribeDisksResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to disks
     *
     * @param disk
     */
    public void addDisk(Disk disk) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disk);
    }

}