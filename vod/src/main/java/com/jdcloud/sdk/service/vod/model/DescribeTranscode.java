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

package com.jdcloud.sdk.service.vod.model;


/**
 * describeTranscode
 */
public class DescribeTranscode  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
    private Number coderateId;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 封装格式
     */
    private String format;

    /**
     * 宽
     */
    private Integer width;

    /**
     * 高
     */
    private Integer height;

    /**
     * 视频编码
     */
    private String videoCodec;

    /**
     * 视频码率
     */
    private Integer videoCoderate;

    /**
     * 视频帧率
     */
    private String videoFramerate;

    /**
     * 音频ID
     */
    private Number audioId;

    /**
     * 音频编码
     */
    private String audioCodec;

    /**
     * 音频码率
     */
    private Integer audioCoderate;

    /**
     * 音频采样率
     */
    private Integer sampleRate;

    /**
     * 音频声道数
     */
    private Integer channel;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 创建时间
     */
    private String createTime;


    /**
     * get 模板ID
     *
     * @return
     */
    public Number getCoderateId() {
        return coderateId;
    }

    /**
     * set 模板ID
     *
     * @param coderateId
     */
    public void setCoderateId(Number coderateId) {
        this.coderateId = coderateId;
    }

    /**
     * get 模板名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 模板名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 封装格式
     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * set 封装格式
     *
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * get 宽
     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set 宽
     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get 高
     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set 高
     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * get 视频编码
     *
     * @return
     */
    public String getVideoCodec() {
        return videoCodec;
    }

    /**
     * set 视频编码
     *
     * @param videoCodec
     */
    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    /**
     * get 视频码率
     *
     * @return
     */
    public Integer getVideoCoderate() {
        return videoCoderate;
    }

    /**
     * set 视频码率
     *
     * @param videoCoderate
     */
    public void setVideoCoderate(Integer videoCoderate) {
        this.videoCoderate = videoCoderate;
    }

    /**
     * get 视频帧率
     *
     * @return
     */
    public String getVideoFramerate() {
        return videoFramerate;
    }

    /**
     * set 视频帧率
     *
     * @param videoFramerate
     */
    public void setVideoFramerate(String videoFramerate) {
        this.videoFramerate = videoFramerate;
    }

    /**
     * get 音频ID
     *
     * @return
     */
    public Number getAudioId() {
        return audioId;
    }

    /**
     * set 音频ID
     *
     * @param audioId
     */
    public void setAudioId(Number audioId) {
        this.audioId = audioId;
    }

    /**
     * get 音频编码
     *
     * @return
     */
    public String getAudioCodec() {
        return audioCodec;
    }

    /**
     * set 音频编码
     *
     * @param audioCodec
     */
    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    /**
     * get 音频码率
     *
     * @return
     */
    public Integer getAudioCoderate() {
        return audioCoderate;
    }

    /**
     * set 音频码率
     *
     * @param audioCoderate
     */
    public void setAudioCoderate(Integer audioCoderate) {
        this.audioCoderate = audioCoderate;
    }

    /**
     * get 音频采样率
     *
     * @return
     */
    public Integer getSampleRate() {
        return sampleRate;
    }

    /**
     * set 音频采样率
     *
     * @param sampleRate
     */
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * get 音频声道数
     *
     * @return
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * set 音频声道数
     *
     * @param channel
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * set 模板ID
     *
     * @param coderateId
     */
    public DescribeTranscode coderateId(Number coderateId) {
        this.coderateId = coderateId;
        return this;
    }

    /**
     * set 模板名称
     *
     * @param name
     */
    public DescribeTranscode name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 封装格式
     *
     * @param format
     */
    public DescribeTranscode format(String format) {
        this.format = format;
        return this;
    }

    /**
     * set 宽
     *
     * @param width
     */
    public DescribeTranscode width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set 高
     *
     * @param height
     */
    public DescribeTranscode height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * set 视频编码
     *
     * @param videoCodec
     */
    public DescribeTranscode videoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * set 视频码率
     *
     * @param videoCoderate
     */
    public DescribeTranscode videoCoderate(Integer videoCoderate) {
        this.videoCoderate = videoCoderate;
        return this;
    }

    /**
     * set 视频帧率
     *
     * @param videoFramerate
     */
    public DescribeTranscode videoFramerate(String videoFramerate) {
        this.videoFramerate = videoFramerate;
        return this;
    }

    /**
     * set 音频ID
     *
     * @param audioId
     */
    public DescribeTranscode audioId(Number audioId) {
        this.audioId = audioId;
        return this;
    }

    /**
     * set 音频编码
     *
     * @param audioCodec
     */
    public DescribeTranscode audioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * set 音频码率
     *
     * @param audioCoderate
     */
    public DescribeTranscode audioCoderate(Integer audioCoderate) {
        this.audioCoderate = audioCoderate;
        return this;
    }

    /**
     * set 音频采样率
     *
     * @param sampleRate
     */
    public DescribeTranscode sampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * set 音频声道数
     *
     * @param channel
     */
    public DescribeTranscode channel(Integer channel) {
        this.channel = channel;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public DescribeTranscode updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public DescribeTranscode createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}