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

import com.amazon.mws.finances._2015_05_01.model.*;
import com.amazonservices.mws.client.*;

public class MWSFinancesServiceClient implements MWSFinancesService {

    private static final String libraryName = "MWSFinancesService";

    private static final String libraryVersion = "2015-09-03";

    protected String servicePath;

    protected final MwsConnection connection;

    public MWSFinancesServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSFinancesServiceConfig config) {
        connection = config.copyConnection();
        connection.setAwsAccessKeyId(accessKey);
        connection.setAwsSecretKeyId(secretKey);
        connection.setApplicationName(applicationName);
        connection.setApplicationVersion(applicationVersion);
        connection.setLibraryVersion(libraryVersion);
        servicePath = config.getServicePath();
    }

    public MWSFinancesServiceClient(
            String accessKey,
            String secretKey,
            MWSFinancesServiceConfig config) {
        this(accessKey, secretKey, libraryName, libraryVersion, config);
    }

    public MWSFinancesServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        this(accessKey, secretKey, applicationName, 
                applicationVersion, new MWSFinancesServiceConfig());
    }

    public ListFinancialEventGroupsResponse listFinancialEventGroups(ListFinancialEventGroupsRequest request) {
        return connection.call(
            new RequestType("ListFinancialEventGroups", ListFinancialEventGroupsResponse.class, servicePath),
            request);
    }

    public ListFinancialEventGroupsByNextTokenResponse listFinancialEventGroupsByNextToken(ListFinancialEventGroupsByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListFinancialEventGroupsByNextToken", ListFinancialEventGroupsByNextTokenResponse.class, servicePath),
            request);
    }

    public ListFinancialEventsResponse listFinancialEvents(ListFinancialEventsRequest request) {
        return connection.call(
            new RequestType("ListFinancialEvents", ListFinancialEventsResponse.class, servicePath),
            request);
    }

    public ListFinancialEventsByNextTokenResponse listFinancialEventsByNextToken(ListFinancialEventsByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListFinancialEventsByNextToken", ListFinancialEventsByNextTokenResponse.class, servicePath),
            request);
    }

    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) {
        return connection.call(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    public static String quoteAppName(String s) {
        return MwsUtl.escapeAppName(s);
    }

    public static String quoteAppVersion(String s) {
        return MwsUtl.escapeAppVersion(s);
    }

    public static String quoteAttributeName(String s) {
        return MwsUtl.escapeAttributeName(s);
    }

    public static String quoteAttributeValue(String s) {
        return MwsUtl.escapeAttributeValue(s);
    }

    protected static class RequestType implements MwsRequestType {

        private final String operationName;
        private final Class<? extends MWSResponse> responseClass;
        private final String servicePath;

        public RequestType(String operationName, Class<? extends MWSResponse> responseClass, String servicePath) {
            this.operationName = operationName;
            this.responseClass = responseClass;
            this.servicePath = servicePath;
        }

        @Override
        public String getServicePath() {
            return this.servicePath;
        }

        @Override
        public String getOperationName() {
            return this.operationName;
        }

        @Override
        public Class<? extends MwsObject> getResponseClass() {
            return this.responseClass;
        }

        @Override
        public MwsException wrapException(Throwable cause) {
            return new MWSFinancesServiceException(cause);
        }

        @Override
        public void setRHMD(MwsObject response, MwsResponseHeaderMetadata rhmd) {
            ((MWSResponse)response).setResponseHeaderMetadata(new ResponseHeaderMetadata(rhmd));
        }
    }

}
