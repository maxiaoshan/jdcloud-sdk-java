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
 * JCLOUD IoT Engine API
 * API related to IoT Engine
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.iotcore.model.AddDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.AddDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.AddDeviceExecutor;
import com.jdcloud.sdk.service.iotcore.model.UpdateThingShadowRequest;
import com.jdcloud.sdk.service.iotcore.model.UpdateThingShadowResponse;
import com.jdcloud.sdk.service.iotcore.client.UpdateThingShadowExecutor;
import com.jdcloud.sdk.service.iotcore.model.DeleteProductRequest;
import com.jdcloud.sdk.service.iotcore.model.DeleteProductResponse;
import com.jdcloud.sdk.service.iotcore.client.DeleteProductExecutor;
import com.jdcloud.sdk.service.iotcore.model.QueryDevicePageRequest;
import com.jdcloud.sdk.service.iotcore.model.QueryDevicePageResponse;
import com.jdcloud.sdk.service.iotcore.client.QueryDevicePageExecutor;
import com.jdcloud.sdk.service.iotcore.model.InvokeThingServiceRequest;
import com.jdcloud.sdk.service.iotcore.model.InvokeThingServiceResponse;
import com.jdcloud.sdk.service.iotcore.client.InvokeThingServiceExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeThingShadowRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeThingShadowResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeThingShadowExecutor;
import com.jdcloud.sdk.service.iotcore.model.ListProductsRequest;
import com.jdcloud.sdk.service.iotcore.model.ListProductsResponse;
import com.jdcloud.sdk.service.iotcore.client.ListProductsExecutor;
import com.jdcloud.sdk.service.iotcore.model.CreateProductRequest;
import com.jdcloud.sdk.service.iotcore.model.CreateProductResponse;
import com.jdcloud.sdk.service.iotcore.client.CreateProductExecutor;
import com.jdcloud.sdk.service.iotcore.model.ExportThingModelRequest;
import com.jdcloud.sdk.service.iotcore.model.ExportThingModelResponse;
import com.jdcloud.sdk.service.iotcore.client.ExportThingModelExecutor;
import com.jdcloud.sdk.service.iotcore.model.ListProductAbilitiesRequest;
import com.jdcloud.sdk.service.iotcore.model.ListProductAbilitiesResponse;
import com.jdcloud.sdk.service.iotcore.client.ListProductAbilitiesExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeProductRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeProductResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeProductExecutor;
import com.jdcloud.sdk.service.iotcore.model.UpdateDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.UpdateDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.UpdateDeviceExecutor;
import com.jdcloud.sdk.service.iotcore.model.UpdateProductRequest;
import com.jdcloud.sdk.service.iotcore.model.UpdateProductResponse;
import com.jdcloud.sdk.service.iotcore.client.UpdateProductExecutor;
import com.jdcloud.sdk.service.iotcore.model.QueryDeviceDetailRequest;
import com.jdcloud.sdk.service.iotcore.model.QueryDeviceDetailResponse;
import com.jdcloud.sdk.service.iotcore.client.QueryDeviceDetailExecutor;
import com.jdcloud.sdk.service.iotcore.model.ImportThingModelRequest;
import com.jdcloud.sdk.service.iotcore.model.ImportThingModelResponse;
import com.jdcloud.sdk.service.iotcore.client.ImportThingModelExecutor;
import com.jdcloud.sdk.service.iotcore.model.RemoveDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.RemoveDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.RemoveDeviceExecutor;

/**
 * iotcoreClient
 */
public class IotcoreClient extends JdcloudClient {

    public final static String ApiVersion = "v2";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.0";
    public final static String DefaultEndpoint = "iotcore.jdcloud-api.com";
    public final static String ServiceName = "iotcore";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private IotcoreClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 注册单个设备并返回秘钥信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddDeviceResponse addDevice(AddDeviceRequest request) throws JdcloudSdkException {
        return new AddDeviceExecutor().client(this).execute(request);
    }

    /**
     * 更新设备影子的期望值
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateThingShadowResponse updateThingShadow(UpdateThingShadowRequest request) throws JdcloudSdkException {
        return new UpdateThingShadowExecutor().client(this).execute(request);
    }

    /**
     * 删除产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws JdcloudSdkException {
        return new DeleteProductExecutor().client(this).execute(request);
    }

    /**
     * 分页查询设备信息,支持一个或多个条件
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryDevicePageResponse queryDevicePage(QueryDevicePageRequest request) throws JdcloudSdkException {
        return new QueryDevicePageExecutor().client(this).execute(request);
    }

    /**
     * 设备服务调用
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public InvokeThingServiceResponse invokeThingService(InvokeThingServiceRequest request) throws JdcloudSdkException {
        return new InvokeThingServiceExecutor().client(this).execute(request);
    }

    /**
     * 查看设备影子
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeThingShadowResponse describeThingShadow(DescribeThingShadowRequest request) throws JdcloudSdkException {
        return new DescribeThingShadowExecutor().client(this).execute(request);
    }

    /**
     * 查看产品列表接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws JdcloudSdkException {
        return new ListProductsExecutor().client(this).execute(request);
    }

    /**
     * 新建产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateProductResponse createProduct(CreateProductRequest request) throws JdcloudSdkException {
        return new CreateProductExecutor().client(this).execute(request);
    }

    /**
     * 导出物模型
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ExportThingModelResponse exportThingModel(ExportThingModelRequest request) throws JdcloudSdkException {
        return new ExportThingModelExecutor().client(this).execute(request);
    }

    /**
     * 查看产品功能列表接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListProductAbilitiesResponse listProductAbilities(ListProductAbilitiesRequest request) throws JdcloudSdkException {
        return new ListProductAbilitiesExecutor().client(this).execute(request);
    }

    /**
     * 查看产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProductResponse describeProduct(DescribeProductRequest request) throws JdcloudSdkException {
        return new DescribeProductExecutor().client(this).execute(request);
    }

    /**
     * 修改设备详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) throws JdcloudSdkException {
        return new UpdateDeviceExecutor().client(this).execute(request);
    }

    /**
     * 修改产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) throws JdcloudSdkException {
        return new UpdateProductExecutor().client(this).execute(request);
    }

    /**
     * 查询设备详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryDeviceDetailResponse queryDeviceDetail(QueryDeviceDetailRequest request) throws JdcloudSdkException {
        return new QueryDeviceDetailExecutor().client(this).execute(request);
    }

    /**
     * 导入物模型
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ImportThingModelResponse importThingModel(ImportThingModelRequest request) throws JdcloudSdkException {
        return new ImportThingModelExecutor().client(this).execute(request);
    }

    /**
     * 删除设备
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveDeviceResponse removeDevice(RemoveDeviceRequest request) throws JdcloudSdkException {
        return new RemoveDeviceExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public IotcoreClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private IotcoreClient iotcoreClient;

        public DefaultBuilder() {
            iotcoreClient = new IotcoreClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            iotcoreClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            iotcoreClient.httpRequestConfig = config;
            return this;
        }

        public IotcoreClient build() throws JdcloudSdkException {

            if (iotcoreClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                iotcoreClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (iotcoreClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("IotcoreClient build error: jdcloud credentials provider not set");
                }
            }
            if (iotcoreClient.httpRequestConfig == null) {
                iotcoreClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (iotcoreClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("IotcoreClient build error: http request config not set");
                }
            }
            return iotcoreClient;
        }

        public Builder environment(Environment environment) {
            iotcoreClient.environment = environment;
            return this;
        }
    }
}
