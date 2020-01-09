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

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;

/**
 * areaData
 */
public class AreaData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 省份信息（中文）
     */
    private String area;

    /**
     * 该省份的全部攻击pv
     */
    private Integer totalPv;

    /**
     * 该省份省会的经纬度
     */
    private List<String> location;

    /**
     * 分ip的pv统计结果
     */
    private List<IpData> ipDatas;


    /**
     * get 省份信息（中文）
     *
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     * set 省份信息（中文）
     *
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * get 该省份的全部攻击pv
     *
     * @return
     */
    public Integer getTotalPv() {
        return totalPv;
    }

    /**
     * set 该省份的全部攻击pv
     *
     * @param totalPv
     */
    public void setTotalPv(Integer totalPv) {
        this.totalPv = totalPv;
    }

    /**
     * get 该省份省会的经纬度
     *
     * @return
     */
    public List<String> getLocation() {
        return location;
    }

    /**
     * set 该省份省会的经纬度
     *
     * @param location
     */
    public void setLocation(List<String> location) {
        this.location = location;
    }

    /**
     * get 分ip的pv统计结果
     *
     * @return
     */
    public List<IpData> getIpDatas() {
        return ipDatas;
    }

    /**
     * set 分ip的pv统计结果
     *
     * @param ipDatas
     */
    public void setIpDatas(List<IpData> ipDatas) {
        this.ipDatas = ipDatas;
    }


    /**
     * set 省份信息（中文）
     *
     * @param area
     */
    public AreaData area(String area) {
        this.area = area;
        return this;
    }

    /**
     * set 该省份的全部攻击pv
     *
     * @param totalPv
     */
    public AreaData totalPv(Integer totalPv) {
        this.totalPv = totalPv;
        return this;
    }

    /**
     * set 该省份省会的经纬度
     *
     * @param location
     */
    public AreaData location(List<String> location) {
        this.location = location;
        return this;
    }

    /**
     * set 分ip的pv统计结果
     *
     * @param ipDatas
     */
    public AreaData ipDatas(List<IpData> ipDatas) {
        this.ipDatas = ipDatas;
        return this;
    }


    /**
     * add item to 该省份省会的经纬度
     *
     * @param location
     */
    public void addLocation(String location) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(location);
    }

    /**
     * add item to 分ip的pv统计结果
     *
     * @param ipData
     */
    public void addIpData(IpData ipData) {
        if (this.ipDatas == null) {
            this.ipDatas = new ArrayList<>();
        }
        this.ipDatas.add(ipData);
    }

}