/*******************************************************************************
 * Copyright 2009-2015 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * MWS Finances Service
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.amazon.mws.finances._2015_05_01.model.*;

public class MWSFinancesServiceAsyncClient extends MWSFinancesServiceClient implements MWSFinancesServiceAsync {

    public MWSFinancesServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSFinancesServiceConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    public MWSFinancesServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSFinancesServiceConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    public MWSFinancesServiceAsyncClient(
            String accessKey,
            String secretKey,
            MWSFinancesServiceConfig config) {
        super(accessKey, secretKey, config);
    }

    public MWSFinancesServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    public Future<ListFinancialEventGroupsResponse> listFinancialEventGroupsAsync(
        ListFinancialEventGroupsRequest request) {
        return connection.callAsync(
            new RequestType("ListFinancialEventGroups", ListFinancialEventGroupsResponse.class, servicePath),
            request);
    }

    public Future<ListFinancialEventGroupsByNextTokenResponse> listFinancialEventGroupsByNextTokenAsync(
        ListFinancialEventGroupsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListFinancialEventGroupsByNextToken", ListFinancialEventGroupsByNextTokenResponse.class, servicePath),
            request);
    }

    public Future<ListFinancialEventsResponse> listFinancialEventsAsync(
        ListFinancialEventsRequest request) {
        return connection.callAsync(
            new RequestType("ListFinancialEvents", ListFinancialEventsResponse.class, servicePath),
            request);
    }

    public Future<ListFinancialEventsByNextTokenResponse> listFinancialEventsByNextTokenAsync(
        ListFinancialEventsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListFinancialEventsByNextToken", ListFinancialEventsByNextTokenResponse.class, servicePath),
            request);
    }

    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }


}
