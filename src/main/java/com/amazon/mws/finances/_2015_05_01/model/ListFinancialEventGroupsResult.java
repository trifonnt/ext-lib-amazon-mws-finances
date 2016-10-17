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
 * List Financial Event Groups Result
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * ListFinancialEventGroupsResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListFinancialEventGroupsResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="NextToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FinancialEventGroupList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FinancialEventGroup" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ListFinancialEventGroupsResult extends AbstractMwsObject {

    private String nextToken;

    private List<FinancialEventGroup> financialEventGroupList;

    /**
     * Get the value of NextToken.
     *
     * @return The value of NextToken.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Set the value of NextToken.
     *
     * @param nextToken
     *            The new value to set.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Check to see if NextToken is set.
     *
     * @return true if NextToken is set.
     */
    public boolean isSetNextToken() {
        return nextToken != null;
    }

    /**
     * Set the value of NextToken, return this.
     *
     * @param nextToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListFinancialEventGroupsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Get the value of FinancialEventGroupList.
     *
     * @return The value of FinancialEventGroupList.
     */
    public List<FinancialEventGroup> getFinancialEventGroupList() {
        if (financialEventGroupList==null) {
            financialEventGroupList = new ArrayList<FinancialEventGroup>();
        }
        return financialEventGroupList;
    }

    /**
     * Set the value of FinancialEventGroupList.
     *
     * @param financialEventGroupList
     *            The new value to set.
     */
    public void setFinancialEventGroupList(List<FinancialEventGroup> financialEventGroupList) {
        this.financialEventGroupList = financialEventGroupList;
    }

    /**
     * Clear FinancialEventGroupList.
     */
    public void unsetFinancialEventGroupList() {
        this.financialEventGroupList = null;
    }

    /**
     * Check to see if FinancialEventGroupList is set.
     *
     * @return true if FinancialEventGroupList is set.
     */
    public boolean isSetFinancialEventGroupList() {
        return financialEventGroupList != null && !financialEventGroupList.isEmpty();
    }

    /**
     * Add values for FinancialEventGroupList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ListFinancialEventGroupsResult withFinancialEventGroupList(FinancialEventGroup... values) {
        List<FinancialEventGroup> list = getFinancialEventGroupList();
        for (FinancialEventGroup value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Read members from a MwsReader.
     *
     * @param r
     *      The reader to read from.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        nextToken = r.read("NextToken", String.class);
        financialEventGroupList = r.readList("FinancialEventGroupList", "FinancialEventGroup", FinancialEventGroup.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("NextToken", nextToken);
        w.writeList("FinancialEventGroupList", "FinancialEventGroup", financialEventGroupList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "ListFinancialEventGroupsResult",this);
    }

    /** Value constructor. */
    public ListFinancialEventGroupsResult(String nextToken,List<FinancialEventGroup> financialEventGroupList) {
        this.nextToken = nextToken;
        this.financialEventGroupList = financialEventGroupList;
    }    
    

    /** Default constructor. */
    public ListFinancialEventGroupsResult() {
        super();
    }

}
