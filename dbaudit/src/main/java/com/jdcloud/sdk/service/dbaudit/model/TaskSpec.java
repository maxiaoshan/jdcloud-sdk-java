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

package com.jdcloud.sdk.service.dbaudit.model;


/**
 * taskSpec
 */
public class TaskSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报表任务名称，长度限制32字节，允许英文字母,数字,下划线,中划线和中文
     */
    private String taskName;

    /**
     * 报表任务描述，长度限制128字节
     */
    private String taskDesc;

    /**
     * 数据库审计实例ID
     */
    private String insId;

    /**
     * 审计数据库ID(默认为空,代表全部数据据库)
     */
    private String dbId;

    /**
     * 0,1,2,3,4,5,6,7,8(0:立即实行,1-7为每周特定日期执行,8为每天执行)
     */
    private Integer execDate;

    /**
     * 报表统计开始时间(execDate &#x3D;0立即执行时必传)
     */
    private String startTime;

    /**
     * 报表统计结束时间(execDate &#x3D;0立即执行时必传)
     */
    private String endTime;


    /**
     * get 报表任务名称，长度限制32字节，允许英文字母,数字,下划线,中划线和中文
     *
     * @return
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * set 报表任务名称，长度限制32字节，允许英文字母,数字,下划线,中划线和中文
     *
     * @param taskName
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * get 报表任务描述，长度限制128字节
     *
     * @return
     */
    public String getTaskDesc() {
        return taskDesc;
    }

    /**
     * set 报表任务描述，长度限制128字节
     *
     * @param taskDesc
     */
    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    /**
     * get 数据库审计实例ID
     *
     * @return
     */
    public String getInsId() {
        return insId;
    }

    /**
     * set 数据库审计实例ID
     *
     * @param insId
     */
    public void setInsId(String insId) {
        this.insId = insId;
    }

    /**
     * get 审计数据库ID(默认为空,代表全部数据据库)
     *
     * @return
     */
    public String getDbId() {
        return dbId;
    }

    /**
     * set 审计数据库ID(默认为空,代表全部数据据库)
     *
     * @param dbId
     */
    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    /**
     * get 0,1,2,3,4,5,6,7,8(0:立即实行,1-7为每周特定日期执行,8为每天执行)
     *
     * @return
     */
    public Integer getExecDate() {
        return execDate;
    }

    /**
     * set 0,1,2,3,4,5,6,7,8(0:立即实行,1-7为每周特定日期执行,8为每天执行)
     *
     * @param execDate
     */
    public void setExecDate(Integer execDate) {
        this.execDate = execDate;
    }

    /**
     * get 报表统计开始时间(execDate &#x3D;0立即执行时必传)
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 报表统计开始时间(execDate &#x3D;0立即执行时必传)
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 报表统计结束时间(execDate &#x3D;0立即执行时必传)
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 报表统计结束时间(execDate &#x3D;0立即执行时必传)
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * set 报表任务名称，长度限制32字节，允许英文字母,数字,下划线,中划线和中文
     *
     * @param taskName
     */
    public TaskSpec taskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * set 报表任务描述，长度限制128字节
     *
     * @param taskDesc
     */
    public TaskSpec taskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
        return this;
    }

    /**
     * set 数据库审计实例ID
     *
     * @param insId
     */
    public TaskSpec insId(String insId) {
        this.insId = insId;
        return this;
    }

    /**
     * set 审计数据库ID(默认为空,代表全部数据据库)
     *
     * @param dbId
     */
    public TaskSpec dbId(String dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * set 0,1,2,3,4,5,6,7,8(0:立即实行,1-7为每周特定日期执行,8为每天执行)
     *
     * @param execDate
     */
    public TaskSpec execDate(Integer execDate) {
        this.execDate = execDate;
        return this;
    }

    /**
     * set 报表统计开始时间(execDate &#x3D;0立即执行时必传)
     *
     * @param startTime
     */
    public TaskSpec startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 报表统计结束时间(execDate &#x3D;0立即执行时必传)
     *
     * @param endTime
     */
    public TaskSpec endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


}