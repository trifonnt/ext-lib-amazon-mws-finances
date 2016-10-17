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

import javax.xml.datatype.XMLGregorianCalendar;

import com.amazon.mws.finances._2015_05_01.MWSFinancesService;
import com.amazon.mws.finances._2015_05_01.MWSFinancesServiceClient;
import com.amazon.mws.finances._2015_05_01.MWSFinancesServiceException;
import com.amazon.mws.finances._2015_05_01.model.ListFinancialEventsRequest;
import com.amazon.mws.finances._2015_05_01.model.ListFinancialEventsResponse;
import com.amazon.mws.finances._2015_05_01.model.ResponseHeaderMetadata;
import com.amazonservices.mws.client.MwsUtl;


/** Sample call for ListFinancialEvents. */
public class ListFinancialEventsSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static ListFinancialEventsResponse invokeListFinancialEvents(
            MWSFinancesService client, 
            ListFinancialEventsRequest request) {
        try {
            // Call the service.
            ListFinancialEventsResponse response = client.listFinancialEvents(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (MWSFinancesServiceException ex) {
            // Exception properties are important for diagnostics.
            System.out.println("Service Exception:");
            ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
            if(rhmd != null) {
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
            }
            System.out.println("Message: "+ex.getMessage());
            System.out.println("StatusCode: "+ex.getStatusCode());
            System.out.println("ErrorCode: "+ex.getErrorCode());
            System.out.println("ErrorType: "+ex.getErrorType());
            throw ex;
        }
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        // Make sure you've set the variables in MWSFinancesServiceSampleConfig.
        MWSFinancesServiceClient client = MWSFinancesServiceSampleConfig.getClient();

        // Create a request.
        ListFinancialEventsRequest request = new ListFinancialEventsRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        Integer maxResultsPerPage = 1;
        request.setMaxResultsPerPage(maxResultsPerPage);
        String amazonOrderId = "example";
        request.setAmazonOrderId(amazonOrderId);
        String financialEventGroupId = "example";
        request.setFinancialEventGroupId(financialEventGroupId);
        XMLGregorianCalendar postedAfter = MwsUtl.getDTF().newXMLGregorianCalendar();
        request.setPostedAfter(postedAfter);
        XMLGregorianCalendar postedBefore = MwsUtl.getDTF().newXMLGregorianCalendar();
        request.setPostedBefore(postedBefore);

        // Make the call.
        ListFinancialEventsSample.invokeListFinancialEvents(client, request);

    }

}
