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
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import java.util.List;
import java.util.Date;

import com.amazonservices.mws.client.MwsResponseHeaderMetadata;

/**
 * ResponseHeaderMetadata
 */
public class ResponseHeaderMetadata extends MwsResponseHeaderMetadata {

    /** Value constructor. */
    public ResponseHeaderMetadata(String requestId, List<String> responseContext, String timestamp,
                                  Double quotaMax, Double quotaRemaining, Date quotaResetsAt) {
        super(requestId, responseContext, timestamp, quotaMax, quotaRemaining, quotaResetsAt);
    }

    /** Empty constructor. */
    public ResponseHeaderMetadata() {
        super(null, null, null, null, null, null);
    }

    /** Copy constructor. */
    public ResponseHeaderMetadata(MwsResponseHeaderMetadata rhmd) {
        super(rhmd);
    }

}
