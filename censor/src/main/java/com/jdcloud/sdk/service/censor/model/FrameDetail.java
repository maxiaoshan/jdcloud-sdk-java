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

package com.jdcloud.sdk.service.censor.model;


/**
 * frameDetail
 */
public class FrameDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 涉政截帧数
     */
    private Integer politics_frame_count;

    /**
     * 涉黄截帧数
     */
    private Integer porn_frame_count;

    /**
     * 暴恐截帧数
     */
    private Integer terrorism_frame_count;

    /**
     * 总截帧数
     */
    private Integer total_frame_count;


    /**
     * get 涉政截帧数
     *
     * @return
     */
    public Integer getPolitics_frame_count() {
        return politics_frame_count;
    }

    /**
     * set 涉政截帧数
     *
     * @param politics_frame_count
     */
    public void setPolitics_frame_count(Integer politics_frame_count) {
        this.politics_frame_count = politics_frame_count;
    }

    /**
     * get 涉黄截帧数
     *
     * @return
     */
    public Integer getPorn_frame_count() {
        return porn_frame_count;
    }

    /**
     * set 涉黄截帧数
     *
     * @param porn_frame_count
     */
    public void setPorn_frame_count(Integer porn_frame_count) {
        this.porn_frame_count = porn_frame_count;
    }

    /**
     * get 暴恐截帧数
     *
     * @return
     */
    public Integer getTerrorism_frame_count() {
        return terrorism_frame_count;
    }

    /**
     * set 暴恐截帧数
     *
     * @param terrorism_frame_count
     */
    public void setTerrorism_frame_count(Integer terrorism_frame_count) {
        this.terrorism_frame_count = terrorism_frame_count;
    }

    /**
     * get 总截帧数
     *
     * @return
     */
    public Integer getTotal_frame_count() {
        return total_frame_count;
    }

    /**
     * set 总截帧数
     *
     * @param total_frame_count
     */
    public void setTotal_frame_count(Integer total_frame_count) {
        this.total_frame_count = total_frame_count;
    }


    /**
     * set 涉政截帧数
     *
     * @param politics_frame_count
     */
    public FrameDetail politics_frame_count(Integer politics_frame_count) {
        this.politics_frame_count = politics_frame_count;
        return this;
    }

    /**
     * set 涉黄截帧数
     *
     * @param porn_frame_count
     */
    public FrameDetail porn_frame_count(Integer porn_frame_count) {
        this.porn_frame_count = porn_frame_count;
        return this;
    }

    /**
     * set 暴恐截帧数
     *
     * @param terrorism_frame_count
     */
    public FrameDetail terrorism_frame_count(Integer terrorism_frame_count) {
        this.terrorism_frame_count = terrorism_frame_count;
        return this;
    }

    /**
     * set 总截帧数
     *
     * @param total_frame_count
     */
    public FrameDetail total_frame_count(Integer total_frame_count) {
        this.total_frame_count = total_frame_count;
        return this;
    }


}