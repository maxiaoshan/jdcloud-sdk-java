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
 * 音频检测相关接口
 * API related to audio scan
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.censor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看音频异步检测结果
 */
public class AudioResultsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * taskIds
     * Required:true
     */
    @Required
    private List<String> taskIds;


    /**
     * get taskIds
     *
     * @return
     */
    public List<String> getTaskIds() {
        return taskIds;
    }

    /**
     * set taskIds
     *
     * @param taskIds
     */
    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }


    /**
     * set taskIds
     *
     * @param taskIds
     */
    public AudioResultsRequest taskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }


    /**
     * add item to taskIds
     *
     * @param taskId
     */
    public void addTaskId(String taskId) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskId);
    }

}