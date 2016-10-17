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

import com.amazon.mws.finances._2015_05_01.model.ResponseHeaderMetadata;
import com.amazonservices.mws.client.MwsException;
 import com.amazonservices.mws.client.MwsResponseHeaderMetadata;

/**
 * Exceptions thrown by MWSFinancesService operations.
 */
public class MWSFinancesServiceException extends MwsException {

    /** For serialization. */
    private static final long serialVersionUID = 1L;

    @Override
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        MwsResponseHeaderMetadata baseRHMD = super.getResponseHeaderMetadata();
        if(baseRHMD != null) {
            return new ResponseHeaderMetadata(baseRHMD);
        } else {
            return null;
        }
    }

    public void setResponseHeaderMetadata(ResponseHeaderMetadata rhmd) {
        super.setResponseHeaderMetadata(rhmd);
    }

    public MWSFinancesServiceException(String message) {
        super(0, message, null);
    }

    public MWSFinancesServiceException(String message, int statusCode) {
        super(statusCode, message, null);
    }

    public MWSFinancesServiceException(Throwable t) {
        super(0, null, t);
    }

    public MWSFinancesServiceException(String message, Throwable t) {
        super(0, message, t);
    }

    public MWSFinancesServiceException(String message, int statusCode, 
         String errorCode, String errorType, String requestId,
         String xml, ResponseHeaderMetadata rhmd) {
        super(statusCode, message, errorCode, errorType, xml, rhmd);
    }

    public MWSFinancesServiceException(String message, int statusCode, 
         String errorCode, String errorType, String requestId,
         String xml) {
        super(statusCode, message, errorCode, errorType, xml, null);
    }

}

