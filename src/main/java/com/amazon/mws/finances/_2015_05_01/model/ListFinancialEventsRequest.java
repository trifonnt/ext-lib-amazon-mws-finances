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
 * List Financial Events Request
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amazonservices.mws.client.*;

/**
 * ListFinancialEventsRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListFinancialEventsRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MaxResultsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FinancialEventGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PostedAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="PostedBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ListFinancialEventsRequest extends AbstractMwsObject {

    private String sellerId;

    private String mwsAuthToken;

    private Integer maxResultsPerPage;

    private String amazonOrderId;

    private String financialEventGroupId;

    private XMLGregorianCalendar postedAfter;

    private XMLGregorianCalendar postedBefore;

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
    public ListFinancialEventsRequest withSellerId(String sellerId) {
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
    public ListFinancialEventsRequest withMWSAuthToken(String mwsAuthToken) {
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
    public ListFinancialEventsRequest withMaxResultsPerPage(Integer maxResultsPerPage) {
        this.maxResultsPerPage = maxResultsPerPage;
        return this;
    }

    /**
     * Get the value of AmazonOrderId.
     *
     * @return The value of AmazonOrderId.
     */
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    /**
     * Set the value of AmazonOrderId.
     *
     * @param amazonOrderId
     *            The new value to set.
     */
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    /**
     * Check to see if AmazonOrderId is set.
     *
     * @return true if AmazonOrderId is set.
     */
    public boolean isSetAmazonOrderId() {
        return amazonOrderId != null;
    }

    /**
     * Set the value of AmazonOrderId, return this.
     *
     * @param amazonOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListFinancialEventsRequest withAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * Get the value of FinancialEventGroupId.
     *
     * @return The value of FinancialEventGroupId.
     */
    public String getFinancialEventGroupId() {
        return financialEventGroupId;
    }

    /**
     * Set the value of FinancialEventGroupId.
     *
     * @param financialEventGroupId
     *            The new value to set.
     */
    public void setFinancialEventGroupId(String financialEventGroupId) {
        this.financialEventGroupId = financialEventGroupId;
    }

    /**
     * Check to see if FinancialEventGroupId is set.
     *
     * @return true if FinancialEventGroupId is set.
     */
    public boolean isSetFinancialEventGroupId() {
        return financialEventGroupId != null;
    }

    /**
     * Set the value of FinancialEventGroupId, return this.
     *
     * @param financialEventGroupId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListFinancialEventsRequest withFinancialEventGroupId(String financialEventGroupId) {
        this.financialEventGroupId = financialEventGroupId;
        return this;
    }

    /**
     * Get the value of PostedAfter.
     *
     * @return The value of PostedAfter.
     */
    public XMLGregorianCalendar getPostedAfter() {
        return postedAfter;
    }

    /**
     * Set the value of PostedAfter.
     *
     * @param postedAfter
     *            The new value to set.
     */
    public void setPostedAfter(XMLGregorianCalendar postedAfter) {
        this.postedAfter = postedAfter;
    }

    /**
     * Check to see if PostedAfter is set.
     *
     * @return true if PostedAfter is set.
     */
    public boolean isSetPostedAfter() {
        return postedAfter != null;
    }

    /**
     * Set the value of PostedAfter, return this.
     *
     * @param postedAfter
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListFinancialEventsRequest withPostedAfter(XMLGregorianCalendar postedAfter) {
        this.postedAfter = postedAfter;
        return this;
    }

    /**
     * Get the value of PostedBefore.
     *
     * @return The value of PostedBefore.
     */
    public XMLGregorianCalendar getPostedBefore() {
        return postedBefore;
    }

    /**
     * Set the value of PostedBefore.
     *
     * @param postedBefore
     *            The new value to set.
     */
    public void setPostedBefore(XMLGregorianCalendar postedBefore) {
        this.postedBefore = postedBefore;
    }

    /**
     * Check to see if PostedBefore is set.
     *
     * @return true if PostedBefore is set.
     */
    public boolean isSetPostedBefore() {
        return postedBefore != null;
    }

    /**
     * Set the value of PostedBefore, return this.
     *
     * @param postedBefore
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListFinancialEventsRequest withPostedBefore(XMLGregorianCalendar postedBefore) {
        this.postedBefore = postedBefore;
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
        amazonOrderId = r.read("AmazonOrderId", String.class);
        financialEventGroupId = r.read("FinancialEventGroupId", String.class);
        postedAfter = r.read("PostedAfter", XMLGregorianCalendar.class);
        postedBefore = r.read("PostedBefore", XMLGregorianCalendar.class);
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
        w.write("AmazonOrderId", amazonOrderId);
        w.write("FinancialEventGroupId", financialEventGroupId);
        w.write("PostedAfter", postedAfter);
        w.write("PostedBefore", postedBefore);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "ListFinancialEventsRequest",this);
    }

    /** Value constructor. 
     * @param sellerId 
     * @param mwsAuthToken 
     * @param maxResultsPerPage 
     * @param amazonOrderId 
     * @param financialEventGroupId 
     * @param postedAfter 
     * @param postedBefore */
    public ListFinancialEventsRequest(String sellerId,String mwsAuthToken,Integer maxResultsPerPage,String amazonOrderId,String financialEventGroupId,XMLGregorianCalendar postedAfter,XMLGregorianCalendar postedBefore) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.maxResultsPerPage = maxResultsPerPage;
        this.amazonOrderId = amazonOrderId;
        this.financialEventGroupId = financialEventGroupId;
        this.postedAfter = postedAfter;
        this.postedBefore = postedBefore;
    }    

    /** Legacy value constructor. 
     * @param sellerId 
     * @param maxResultsPerPage 
     * @param amazonOrderId 
     * @param financialEventGroupId 
     * @param postedAfter 
     * @param postedBefore */
    public ListFinancialEventsRequest(String sellerId,Integer maxResultsPerPage,String amazonOrderId,String financialEventGroupId,XMLGregorianCalendar postedAfter,XMLGregorianCalendar postedBefore) {
        this.sellerId = sellerId;
        this.maxResultsPerPage = maxResultsPerPage;
        this.amazonOrderId = amazonOrderId;
        this.financialEventGroupId = financialEventGroupId;
        this.postedAfter = postedAfter;
        this.postedBefore = postedBefore;
    }
    

    /** Default constructor. */
    public ListFinancialEventsRequest() {
        super();
    }

}
