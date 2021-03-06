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
 * 报表类接口
 * 京东云内容安全-OpenAPI报表类接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.censor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * ossDataResult
 */
public class OssDataResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片或视频的短链
     */
    private String content;

    /**
     * taskId
     */
    private String taskId;

    /**
     * dataId
     */
    private String dataId;

    /**
     * 送审时间 2019-12-18 16:02:19（北京时间UTC+8）
     */
    private String time;

    /**
     * 日志落盘时间 2019-12-18 16:02:19（北京时间UTC+8）
     */
    private String logTime;

    /**
     * 识别结果
     */
    private String result;

    /**
     * 详情,见blockDetail中描述
     */
    private List<String> details;

    /**
     * 得分
     */
    private Score score;

    /**
     * 冻结处理，modify-修改权限，remove-移动，空字符串表示无处理
     */
    private String action;

    /**
     * oss中空间名
     */
    private String bucket;

    /**
     * oss中对象名
     */
    private String object;

    /**
     * 人工审核处理
     */
    private String reviewResult;


    /**
     * get 图片或视频的短链
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 图片或视频的短链
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * get taskId
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set taskId
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get dataId
     *
     * @return
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * set dataId
     *
     * @param dataId
     */
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * get 送审时间 2019-12-18 16:02:19（北京时间UTC+8）
     *
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * set 送审时间 2019-12-18 16:02:19（北京时间UTC+8）
     *
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * get 日志落盘时间 2019-12-18 16:02:19（北京时间UTC+8）
     *
     * @return
     */
    public String getLogTime() {
        return logTime;
    }

    /**
     * set 日志落盘时间 2019-12-18 16:02:19（北京时间UTC+8）
     *
     * @param logTime
     */
    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    /**
     * get 识别结果
     *
     * @return
     */
    public String getResult() {
        return result;
    }

    /**
     * set 识别结果
     *
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * get 详情,见blockDetail中描述
     *
     * @return
     */
    public List<String> getDetails() {
        return details;
    }

    /**
     * set 详情,见blockDetail中描述
     *
     * @param details
     */
    public void setDetails(List<String> details) {
        this.details = details;
    }

    /**
     * get 得分
     *
     * @return
     */
    public Score getScore() {
        return score;
    }

    /**
     * set 得分
     *
     * @param score
     */
    public void setScore(Score score) {
        this.score = score;
    }

    /**
     * get 冻结处理，modify-修改权限，remove-移动，空字符串表示无处理
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 冻结处理，modify-修改权限，remove-移动，空字符串表示无处理
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get oss中空间名
     *
     * @return
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * set oss中空间名
     *
     * @param bucket
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * get oss中对象名
     *
     * @return
     */
    public String getObject() {
        return object;
    }

    /**
     * set oss中对象名
     *
     * @param object
     */
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * get 人工审核处理
     *
     * @return
     */
    public String getReviewResult() {
        return reviewResult;
    }

    /**
     * set 人工审核处理
     *
     * @param reviewResult
     */
    public void setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
    }


    /**
     * set 图片或视频的短链
     *
     * @param content
     */
    public OssDataResult content(String content) {
        this.content = content;
        return this;
    }

    /**
     * set taskId
     *
     * @param taskId
     */
    public OssDataResult taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set dataId
     *
     * @param dataId
     */
    public OssDataResult dataId(String dataId) {
        this.dataId = dataId;
        return this;
    }

    /**
     * set 送审时间 2019-12-18 16:02:19（北京时间UTC+8）
     *
     * @param time
     */
    public OssDataResult time(String time) {
        this.time = time;
        return this;
    }

    /**
     * set 日志落盘时间 2019-12-18 16:02:19（北京时间UTC+8）
     *
     * @param logTime
     */
    public OssDataResult logTime(String logTime) {
        this.logTime = logTime;
        return this;
    }

    /**
     * set 识别结果
     *
     * @param result
     */
    public OssDataResult result(String result) {
        this.result = result;
        return this;
    }

    /**
     * set 详情,见blockDetail中描述
     *
     * @param details
     */
    public OssDataResult details(List<String> details) {
        this.details = details;
        return this;
    }

    /**
     * set 得分
     *
     * @param score
     */
    public OssDataResult score(Score score) {
        this.score = score;
        return this;
    }

    /**
     * set 冻结处理，modify-修改权限，remove-移动，空字符串表示无处理
     *
     * @param action
     */
    public OssDataResult action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set oss中空间名
     *
     * @param bucket
     */
    public OssDataResult bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * set oss中对象名
     *
     * @param object
     */
    public OssDataResult object(String object) {
        this.object = object;
        return this;
    }

    /**
     * set 人工审核处理
     *
     * @param reviewResult
     */
    public OssDataResult reviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
        return this;
    }


    /**
     * add item to 详情,见blockDetail中描述
     *
     * @param detail
     */
    public void addDetail(String detail) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detail);
    }

}