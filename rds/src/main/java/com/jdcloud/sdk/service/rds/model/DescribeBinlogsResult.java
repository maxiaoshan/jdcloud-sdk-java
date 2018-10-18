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
 * binlog日志
 * binlog日志相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.rds.model.Binlog;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取MySQL实例中binlog的详细信息&lt;br&gt;- 仅支持MySQL
 */
public class DescribeBinlogsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总记录数
     */
    private Integer totalCount;

    /**
     * binlogs
     */
    private List<Binlog> binlogs;


    /**
     * get 总记录数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总记录数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get binlogs
     *
     * @return
     */
    public List<Binlog> getBinlogs() {
        return binlogs;
    }

    /**
     * set binlogs
     *
     * @param binlogs
     */
    public void setBinlogs(List<Binlog> binlogs) {
        this.binlogs = binlogs;
    }


    /**
     * set 总记录数
     *
     * @param totalCount
     */
    public DescribeBinlogsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set binlogs
     *
     * @param binlogs
     */
    public DescribeBinlogsResult binlogs(List<Binlog> binlogs) {
        this.binlogs = binlogs;
        return this;
    }


    /**
     * add item to binlogs
     *
     * @param binlog
     */
    public void addBinlog(Binlog binlog) {
        if (this.binlogs == null) {
            this.binlogs = new ArrayList<>();
        }
        this.binlogs.add(binlog);
    }

}