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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amazon.mws.finances._2015_05_01.MWSFinancesServiceAsync;
import com.amazon.mws.finances._2015_05_01.MWSFinancesServiceAsyncClient;
import com.amazon.mws.finances._2015_05_01.MWSFinancesServiceException;
import com.amazon.mws.finances._2015_05_01.model.ListFinancialEventGroupsRequest;
import com.amazon.mws.finances._2015_05_01.model.ListFinancialEventGroupsResponse;
import com.amazon.mws.finances._2015_05_01.model.ResponseHeaderMetadata;
import com.amazonservices.mws.client.MwsUtl;

/** Sample async call for ListFinancialEventGroups. */
public class ListFinancialEventGroupsAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static List<Object> invokeListFinancialEventGroups(
            MWSFinancesServiceAsync client, 
            List<ListFinancialEventGroupsRequest> requestList) {
        // Call the service async.
        List<Future<ListFinancialEventGroupsResponse>> futureList = 
            new ArrayList<Future<ListFinancialEventGroupsResponse>>();
        for (ListFinancialEventGroupsRequest request : requestList) {
            Future<ListFinancialEventGroupsResponse> future = 
                client.listFinancialEventGroupsAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<ListFinancialEventGroupsResponse> future : futureList) {
            Object xresponse;
            try {
                ListFinancialEventGroupsResponse response = future.get();
                ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
                // We recommend logging every the request id and timestamp of every call.
                System.out.println("Response:");
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
                String responseXml = response.toXML();
                System.out.println(responseXml);
                xresponse = response;
            } catch (ExecutionException ee) {
                Throwable cause = ee.getCause();
                if (cause instanceof MWSFinancesServiceException) {
                    // Exception properties are important for diagnostics.
                    MWSFinancesServiceException ex = 
                        (MWSFinancesServiceException)cause;
                    ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
                    System.out.println("Service Exception:");
                    System.out.println("RequestId: "+rhmd.getRequestId());
                    System.out.println("Timestamp: "+rhmd.getTimestamp());
                    System.out.println("Message: "+ex.getMessage());
                    System.out.println("StatusCode: "+ex.getStatusCode());
                    System.out.println("ErrorCode: "+ex.getErrorCode());
                    System.out.println("ErrorType: "+ex.getErrorType());
                    xresponse = ex;
                } else {
                    xresponse = cause;
                }
            } catch (Exception e) {
                xresponse = e;
            }
            responseList.add(xresponse);
        }
        return responseList;
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        MWSFinancesServiceAsyncClient client = MWSFinancesServiceSampleConfig.getAsyncClient();

        // Create a request list.
        List<ListFinancialEventGroupsRequest> requestList = new ArrayList<ListFinancialEventGroupsRequest>();
        ListFinancialEventGroupsRequest request = new ListFinancialEventGroupsRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        Integer maxResultsPerPage = 1;
        request.setMaxResultsPerPage(maxResultsPerPage);
        XMLGregorianCalendar financialEventGroupStartedAfter = MwsUtl.getDTF().newXMLGregorianCalendar();
        request.setFinancialEventGroupStartedAfter(financialEventGroupStartedAfter);
        XMLGregorianCalendar financialEventGroupStartedBefore = MwsUtl.getDTF().newXMLGregorianCalendar();
        request.setFinancialEventGroupStartedBefore(financialEventGroupStartedBefore);
        requestList.add(request);

        // Make the calls.
        ListFinancialEventGroupsAsyncSample.invokeListFinancialEventGroups(client, requestList);

    }

}
