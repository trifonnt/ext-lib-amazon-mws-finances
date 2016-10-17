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
 * List Financial Event Groups Request
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amazonservices.mws.client.*;

/**
 * ListFinancialEventGroupsRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListFinancialEventGroupsRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MaxResultsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="FinancialEventGroupStartedAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="FinancialEventGroupStartedBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ListFinancialEventGroupsRequest extends AbstractMwsObject {

    private String sellerId;

    private String mwsAuthToken;

    private Integer maxResultsPerPage;

    private XMLGregorianCalendar financialEventGroupStartedAfter;

    private XMLGregorianCalendar financialEventGroupStartedBefore;

    /**
     * Get the value of SellerId.
     *
     * @return The value of SellerId.
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Set the value of SellerId.
     *
     * @param sellerId
     *            The new value to set.
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Check to see if SellerId is set.
     *
     * @return true if SellerId is set.
     */
    public boolean isSetSellerId() {
        return sellerId != null;
    }

    /**
     * Set the value of SellerId, return this.
     *
     * @param sellerId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListFinancialEventGroupsRequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return mwsAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param mwsAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return mwsAuthToken != null;
    }

    /**
     * Set the value of MWSAuthToken, return this.
     *
     * @param mwsAuthToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListFinancialEventGroupsRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of MaxResultsPerPage.
     *
     * @return The value of MaxResultsPerPage.
     */
    public Integer getMaxResultsPerPage() {
        return maxResultsPerPage;
    }

    /**
     * Set the value of MaxResultsPerPage.
     *
     * @param maxResultsPerPage
     *            The new value to set.
     */
    public void setMaxResultsPerPage(Integer maxResultsPerPage) {
        this.maxResultsPerPage = maxResultsPerPage;
    }

    /**
     * Check to see if MaxResultsPerPage is set.
     *
     * @return true if MaxResultsPerPage is set.
     */
    public boolean isSetMaxResultsPerPage() {
        return maxResultsPerPage != null;
    }

    /**
     * Set the value of MaxResultsPerPage, return this.
     *
     * @param maxResultsPerPage
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListFinancialEventGroupsRequest withMaxResultsPerPage(Integer maxResultsPerPage) {
        this.maxResultsPerPage = maxResultsPerPage;
        return this;
    }

    /**
     * Get the value of FinancialEventGroupStartedAfter.
     *
     * @return The value of FinancialEventGroupStartedAfter.
     */
    public XMLGregorianCalendar getFinancialEventGroupStartedAfter() {
        return financialEventGroupStartedAfter;
    }

    /**
     * Set the value of FinancialEventGroupStartedAfter.
     *
     * @param financialEventGroupStartedAfter
     *            The new value to set.
     */
    public void setFinancialEventGroupStartedAfter(XMLGregorianCalendar financialEventGroupStartedAfter) {
        this.financialEventGroupStartedAfter = financialEventGroupStartedAfter;
    }

    /**
     * Check to see if FinancialEventGroupStartedAfter is set.
     *
     * @return true if FinancialEventGroupStartedAfter is set.
     */
    public boolean isSetFinancialEventGroupStartedAfter() {
        return financialEventGroupStartedAfter != null;
    }

    /**
     * Set the value of FinancialEventGroupStartedAfter, return this.
     *
     * @param financialEventGroupStartedAfter
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListFinancialEventGroupsRequest withFinancialEventGroupStartedAfter(XMLGregorianCalendar financialEventGroupStartedAfter) {
        this.financialEventGroupStartedAfter = financialEventGroupStartedAfter;
        return this;
    }

    /**
     * Get the value of FinancialEventGroupStartedBefore.
     *
     * @return The value of FinancialEventGroupStartedBefore.
     */
    public XMLGregorianCalendar getFinancialEventGroupStartedBefore() {
        return financialEventGroupStartedBefore;
    }

    /**
     * Set the value of FinancialEventGroupStartedBefore.
     *
     * @param financialEventGroupStartedBefore
     *            The new value to set.
     */
    public void setFinancialEventGroupStartedBefore(XMLGregorianCalendar financialEventGroupStartedBefore) {
        this.financialEventGroupStartedBefore = financialEventGroupStartedBefore;
    }

    /**
     * Check to see if FinancialEventGroupStartedBefore is set.
     *
     * @return true if FinancialEventGroupStartedBefore is set.
     */
    public boolean isSetFinancialEventGroupStartedBefore() {
        return financialEventGroupStartedBefore != null;
    }

    /**
     * Set the value of FinancialEventGroupStartedBefore, return this.
     *
     * @param financialEventGroupStartedBefore
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListFinancialEventGroupsRequest withFinancialEventGroupStartedBefore(XMLGregorianCalendar financialEventGroupStartedBefore) {
        this.financialEventGroupStartedBefore = financialEventGroupStartedBefore;
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
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        maxResultsPerPage = r.read("MaxResultsPerPage", Integer.class);
        financialEventGroupStartedAfter = r.read("FinancialEventGroupStartedAfter", XMLGregorianCalendar.class);
        financialEventGroupStartedBefore = r.read("FinancialEventGroupStartedBefore", XMLGregorianCalendar.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerId", sellerId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.write("MaxResultsPerPage", maxResultsPerPage);
        w.write("FinancialEventGroupStartedAfter", financialEventGroupStartedAfter);
        w.write("FinancialEventGroupStartedBefore", financialEventGroupStartedBefore);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "ListFinancialEventGroupsRequest",this);
    }

    /** Value constructor. */
    public ListFinancialEventGroupsRequest(String sellerId,String mwsAuthToken,Integer maxResultsPerPage,XMLGregorianCalendar financialEventGroupStartedAfter,XMLGregorianCalendar financialEventGroupStartedBefore) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.maxResultsPerPage = maxResultsPerPage;
        this.financialEventGroupStartedAfter = financialEventGroupStartedAfter;
        this.financialEventGroupStartedBefore = financialEventGroupStartedBefore;
    }    

    /** Legacy value constructor. */
    public ListFinancialEventGroupsRequest(String sellerId,Integer maxResultsPerPage,XMLGregorianCalendar financialEventGroupStartedAfter,XMLGregorianCalendar financialEventGroupStartedBefore) {
        this.sellerId = sellerId;
        this.maxResultsPerPage = maxResultsPerPage;
        this.financialEventGroupStartedAfter = financialEventGroupStartedAfter;
        this.financialEventGroupStartedBefore = financialEventGroupStartedBefore;
    }
    

    /** Default constructor. */
    public ListFinancialEventGroupsRequest() {
        super();
    }

}
