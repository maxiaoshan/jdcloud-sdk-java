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
 * Transcode Template
 * 转码模板管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import com.jdcloud.sdk.service.mps.model.VideoStreamSettings;
import com.jdcloud.sdk.service.mps.model.AudioStreamSettings;
import com.jdcloud.sdk.service.mps.model.ContainerSettings;
import com.jdcloud.sdk.service.mps.model.EncryptionSettings;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询转码模板
 */
public class GetTranscodeTemplateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
    private String templateId;

    /**
     * 模板标题。长度不超过 128 个字符，最少 2 个字符。UTF-8 编码。

     */
    private String title;

    /**
     * 视频参数配置
     */
    private VideoStreamSettings video;

    /**
     * 音频参数配置
     */
    private AudioStreamSettings audio;

    /**
     * 容器设置
     */
    private ContainerSettings container;

    /**
     * 加密配置
     */
    private EncryptionSettings encryption;

    /**
     * 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     */
    private String definition;

    /**
     * 转码方式。取值范围：
  normal - 普通转码
  jdchd - 京享超清
  jdchs - 极速转码

     */
    private String transcodeType;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;


    /**
     * get 模板ID
     *
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * set 模板ID
     *
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * get 模板标题。长度不超过 128 个字符，最少 2 个字符。UTF-8 编码。

     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set 模板标题。长度不超过 128 个字符，最少 2 个字符。UTF-8 编码。

     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get 视频参数配置
     *
     * @return
     */
    public VideoStreamSettings getVideo() {
        return video;
    }

    /**
     * set 视频参数配置
     *
     * @param video
     */
    public void setVideo(VideoStreamSettings video) {
        this.video = video;
    }

    /**
     * get 音频参数配置
     *
     * @return
     */
    public AudioStreamSettings getAudio() {
        return audio;
    }

    /**
     * set 音频参数配置
     *
     * @param audio
     */
    public void setAudio(AudioStreamSettings audio) {
        this.audio = audio;
    }

    /**
     * get 容器设置
     *
     * @return
     */
    public ContainerSettings getContainer() {
        return container;
    }

    /**
     * set 容器设置
     *
     * @param container
     */
    public void setContainer(ContainerSettings container) {
        this.container = container;
    }

    /**
     * get 加密配置
     *
     * @return
     */
    public EncryptionSettings getEncryption() {
        return encryption;
    }

    /**
     * set 加密配置
     *
     * @param encryption
     */
    public void setEncryption(EncryptionSettings encryption) {
        this.encryption = encryption;
    }

    /**
     * get 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     *
     * @return
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * set 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     *
     * @param definition
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * get 转码方式。取值范围：
  normal - 普通转码
  jdchd - 京享超清
  jdchs - 极速转码

     *
     * @return
     */
    public String getTranscodeType() {
        return transcodeType;
    }

    /**
     * set 转码方式。取值范围：
  normal - 普通转码
  jdchd - 京享超清
  jdchs - 极速转码

     *
     * @param transcodeType
     */
    public void setTranscodeType(String transcodeType) {
        this.transcodeType = transcodeType;
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
     * set 模板ID
     *
     * @param templateId
     */
    public GetTranscodeTemplateResult templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 模板标题。长度不超过 128 个字符，最少 2 个字符。UTF-8 编码。

     *
     * @param title
     */
    public GetTranscodeTemplateResult title(String title) {
        this.title = title;
        return this;
    }

    /**
     * set 视频参数配置
     *
     * @param video
     */
    public GetTranscodeTemplateResult video(VideoStreamSettings video) {
        this.video = video;
        return this;
    }

    /**
     * set 音频参数配置
     *
     * @param audio
     */
    public GetTranscodeTemplateResult audio(AudioStreamSettings audio) {
        this.audio = audio;
        return this;
    }

    /**
     * set 容器设置
     *
     * @param container
     */
    public GetTranscodeTemplateResult container(ContainerSettings container) {
        this.container = container;
        return this;
    }

    /**
     * set 加密配置
     *
     * @param encryption
     */
    public GetTranscodeTemplateResult encryption(EncryptionSettings encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * set 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     *
     * @param definition
     */
    public GetTranscodeTemplateResult definition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * set 转码方式。取值范围：
  normal - 普通转码
  jdchd - 京享超清
  jdchs - 极速转码

     *
     * @param transcodeType
     */
    public GetTranscodeTemplateResult transcodeType(String transcodeType) {
        this.transcodeType = transcodeType;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public GetTranscodeTemplateResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public GetTranscodeTemplateResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}