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
package com.amazon.mws.finances._2015_05_01.samples;

import com.amazon.mws.finances._2015_05_01.MWSFinancesServiceAsyncClient;
import com.amazon.mws.finances._2015_05_01.MWSFinancesServiceClient;
import com.amazon.mws.finances._2015_05_01.MWSFinancesServiceConfig;

/**
 * Configuration for MWSFinancesService samples.
 */
public class MWSFinancesServiceSampleConfig {

    /** Developer AWS access key. */
    private static final String accessKey = "replaceWithAccessKey";

    /** Developer AWS secret key. */
    private static final String secretKey = "replaceWithSecretKey";

    /** The client application name. */
    private static final String appName = "replaceWithAppName";

    /** The client application version. */
    private static final String appVersion = "replaceWithAppVersion";

    /**
     * The endpoint for region service and version.
     * ex: serviceURL = MWSEndpoint.NA_PROD.toString();
     */
    private static final String serviceURL = "replaceWithServiceURL";

    /** The client, lazy initialized. Async client is also a sync client. */
    private static MWSFinancesServiceAsyncClient client = null;

    /**
     * Get a client connection ready to use.
     *
     * @return A ready to use client connection.
     */
    public static MWSFinancesServiceClient getClient() {
        return getAsyncClient();
    }

    /**
     * Get an async client connection ready to use.
     *
     * @return A ready to use client connection.
     */
    public static synchronized MWSFinancesServiceAsyncClient getAsyncClient() {
        if (client==null) {
            MWSFinancesServiceConfig config = new MWSFinancesServiceConfig();
            config.setServiceURL(serviceURL);
            // Set other client connection configurations here.
            client = new MWSFinancesServiceAsyncClient(accessKey, secretKey, 
                    appName, appVersion, config, null);
        }
        return client;
    }

}
