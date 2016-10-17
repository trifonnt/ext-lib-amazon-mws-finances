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
package com.amazon.mws.finances._2015_05_01.mock;


import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.Date;

import com.amazon.mws.finances._2015_05_01.*;
import com.amazon.mws.finances._2015_05_01.model.*;

import com.amazonservices.mws.client.MwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.client.MwsXmlReader;

/**
 * A mock implementation of MWSFinancesService that uses pre-populated set of 
 * XML files that serve local data.
 *
 * It simulates responses from the MWS Finances Service service.
 *
 * Use this to test your application without making actual service calls.
 *
 * This mock implementation does not validate requests.
 */
public class MWSFinancesServiceMock 
        implements MWSFinancesService, MWSFinancesServiceAsync {

    /**
     * Create a future that will immediately return the given response.
     *
     * @param response
     *
     * @return Future
     */
    private <T> Future<T> newFuture(final T response) {
        FutureTask<T> t = new FutureTask<T>(new Callable<T>() {
                @Override
                public T call() {
                    return response;
                }
            });
        t.run();
        return t;
    }

    /**
     * Create a new response object.
     * 
     * @param cls
     * 
     * @return The object.
     */
    private <T extends MwsObject> T newResponse(
            Class<T> cls) {
        InputStream is = null;
        try {
            is = this.getClass().getResourceAsStream(cls.getSimpleName()+".xml");
            MwsXmlReader reader = new MwsXmlReader(is);
            T obj = cls.newInstance();
            obj.readFragmentFrom(reader);
            ResponseHeaderMetadata rhmd = new ResponseHeaderMetadata(
                "mockRequestId", Arrays.asList("A","B","C"), "mockTimestamp", 0d, 0d, new Date());
            cls.getMethod("setResponseHeaderMetadata", rhmd.getClass()).invoke(obj,  rhmd);
            return obj;
        } catch (Exception e) {
            throw MwsUtl.wrap(e);
        } finally {
            MwsUtl.close(is);
        }
    }

    /**
     * List Financial Event Groups
     * ListFinancialEventGroups can be used to find financial event groups that meet filter criteria.
     *
     * @param request
     *           ListFinancialEventGroupsRequest request.
     *
     * @return ListFinancialEventGroupsResponse response.
     *
     * @throws MWSFinancesServiceException
     */
    public ListFinancialEventGroupsResponse listFinancialEventGroups(ListFinancialEventGroupsRequest request) 
            throws MWSFinancesServiceException {
        return newResponse(ListFinancialEventGroupsResponse.class);
    }

    /**
    * List Financial Event Groups
    * ListFinancialEventGroups can be used to find financial event groups that meet filter criteria.
    *
    * @param request
    *           ListFinancialEventGroupsRequest request.
    *
    * @return Future<ListFinancialEventGroupsResponse> Future containing completed response
    *
    * @throws MWSFinancesServiceException
    */
    public Future<ListFinancialEventGroupsResponse> listFinancialEventGroupsAsync(ListFinancialEventGroupsRequest request) {
        return newFuture(listFinancialEventGroups(request));
    }

    /**
     * List Financial Event Groups By Next Token
     * If ListFinancialEventGroups returns a nextToken, thus indicating that there are more groups
     *         than returned that matched the given filter criteria, ListFinancialEventGroupsByNextToken
     *         can be used to retrieve those groups using that nextToken.
     *
     * @param request
     *           ListFinancialEventGroupsByNextTokenRequest request.
     *
     * @return ListFinancialEventGroupsByNextTokenResponse response.
     *
     * @throws MWSFinancesServiceException
     */
    public ListFinancialEventGroupsByNextTokenResponse listFinancialEventGroupsByNextToken(ListFinancialEventGroupsByNextTokenRequest request) 
            throws MWSFinancesServiceException {
        return newResponse(ListFinancialEventGroupsByNextTokenResponse.class);
    }

    /**
    * List Financial Event Groups By Next Token
    * If ListFinancialEventGroups returns a nextToken, thus indicating that there are more groups
     *         than returned that matched the given filter criteria, ListFinancialEventGroupsByNextToken
     *         can be used to retrieve those groups using that nextToken.
    *
    * @param request
    *           ListFinancialEventGroupsByNextTokenRequest request.
    *
    * @return Future<ListFinancialEventGroupsByNextTokenResponse> Future containing completed response
    *
    * @throws MWSFinancesServiceException
    */
    public Future<ListFinancialEventGroupsByNextTokenResponse> listFinancialEventGroupsByNextTokenAsync(ListFinancialEventGroupsByNextTokenRequest request) {
        return newFuture(listFinancialEventGroupsByNextToken(request));
    }

    /**
     * List Financial Events
     * ListFinancialEvents can be used to find financial events that meet the specified criteria.
     *
     * @param request
     *           ListFinancialEventsRequest request.
     *
     * @return ListFinancialEventsResponse response.
     *
     * @throws MWSFinancesServiceException
     */
    public ListFinancialEventsResponse listFinancialEvents(ListFinancialEventsRequest request) 
            throws MWSFinancesServiceException {
        return newResponse(ListFinancialEventsResponse.class);
    }

    /**
    * List Financial Events
    * ListFinancialEvents can be used to find financial events that meet the specified criteria.
    *
    * @param request
    *           ListFinancialEventsRequest request.
    *
    * @return Future<ListFinancialEventsResponse> Future containing completed response
    *
    * @throws MWSFinancesServiceException
    */
    public Future<ListFinancialEventsResponse> listFinancialEventsAsync(ListFinancialEventsRequest request) {
        return newFuture(listFinancialEvents(request));
    }

    /**
     * List Financial Events By Next Token
     * If ListFinancialEvents returns a nextToken, thus indicating that there are more financial events
     *         than returned that matched the given filter criteria, ListFinancialEventsByNextToken
     *         can be used to retrieve those events using that nextToken.
     *
     * @param request
     *           ListFinancialEventsByNextTokenRequest request.
     *
     * @return ListFinancialEventsByNextTokenResponse response.
     *
     * @throws MWSFinancesServiceException
     */
    public ListFinancialEventsByNextTokenResponse listFinancialEventsByNextToken(ListFinancialEventsByNextTokenRequest request) 
            throws MWSFinancesServiceException {
        return newResponse(ListFinancialEventsByNextTokenResponse.class);
    }

    /**
    * List Financial Events By Next Token
    * If ListFinancialEvents returns a nextToken, thus indicating that there are more financial events
     *         than returned that matched the given filter criteria, ListFinancialEventsByNextToken
     *         can be used to retrieve those events using that nextToken.
    *
    * @param request
    *           ListFinancialEventsByNextTokenRequest request.
    *
    * @return Future<ListFinancialEventsByNextTokenResponse> Future containing completed response
    *
    * @throws MWSFinancesServiceException
    */
    public Future<ListFinancialEventsByNextTokenResponse> listFinancialEventsByNextTokenAsync(ListFinancialEventsByNextTokenRequest request) {
        return newFuture(listFinancialEventsByNextToken(request));
    }

    /**
     * Get Service Status
     * 
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return GetServiceStatusResponse response.
     *
     * @throws MWSFinancesServiceException
     */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) 
            throws MWSFinancesServiceException {
        return newResponse(GetServiceStatusResponse.class);
    }

    /**
    * Get Service Status
    * 
    *
    * @param request
    *           GetServiceStatusRequest request.
    *
    * @return Future<GetServiceStatusResponse> Future containing completed response
    *
    * @throws MWSFinancesServiceException
    */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(GetServiceStatusRequest request) {
        return newFuture(getServiceStatus(request));
    }

}
