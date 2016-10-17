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

import java.util.concurrent.Future;
import com.amazon.mws.finances._2015_05_01.model.*;

/**
 * MWSFinances is a service that provides MWS developers access to Sellers 
 *         payments data coming from all types of seller transactions 
 *         which affect the seller account balance
 */
public interface MWSFinancesServiceAsync extends MWSFinancesService {

    /**
     * List Financial Event Groups
     *
     * ListFinancialEventGroups can be used to find financial event groups that meet filter criteria.
     *
     * @param request
     *           ListFinancialEventGroupsRequest request.
     *
     * @return Future<ListFinancialEventGroupsResponse> response.
     */
    Future<ListFinancialEventGroupsResponse> listFinancialEventGroupsAsync(
        ListFinancialEventGroupsRequest request);

    /**
     * List Financial Event Groups By Next Token
     *
     * If ListFinancialEventGroups returns a nextToken, thus indicating that there are more groups
     *         than returned that matched the given filter criteria, ListFinancialEventGroupsByNextToken
     *         can be used to retrieve those groups using that nextToken.
     *
     * @param request
     *           ListFinancialEventGroupsByNextTokenRequest request.
     *
     * @return Future<ListFinancialEventGroupsByNextTokenResponse> response.
     */
    Future<ListFinancialEventGroupsByNextTokenResponse> listFinancialEventGroupsByNextTokenAsync(
        ListFinancialEventGroupsByNextTokenRequest request);

    /**
     * List Financial Events
     *
     * ListFinancialEvents can be used to find financial events that meet the specified criteria.
     *
     * @param request
     *           ListFinancialEventsRequest request.
     *
     * @return Future<ListFinancialEventsResponse> response.
     */
    Future<ListFinancialEventsResponse> listFinancialEventsAsync(
        ListFinancialEventsRequest request);

    /**
     * List Financial Events By Next Token
     *
     * If ListFinancialEvents returns a nextToken, thus indicating that there are more financial events
     *         than returned that matched the given filter criteria, ListFinancialEventsByNextToken
     *         can be used to retrieve those events using that nextToken.
     *
     * @param request
     *           ListFinancialEventsByNextTokenRequest request.
     *
     * @return Future<ListFinancialEventsByNextTokenResponse> response.
     */
    Future<ListFinancialEventsByNextTokenResponse> listFinancialEventsByNextTokenAsync(
        ListFinancialEventsByNextTokenRequest request);

    /**
     * Get Service Status
     *
     * 
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return Future<GetServiceStatusResponse> response.
     */
    Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request);

}