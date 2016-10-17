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
 * Financial Event Group
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amazonservices.mws.client.*;

/**
 * FinancialEventGroup complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FinancialEventGroup"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="FinancialEventGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ProcessingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FundTransferStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="OriginalTotal" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="ConvertedTotal" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="FundTransferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AccountTail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="BeginningBalance" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="FinancialEventGroupStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="FinancialEventGroupEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class FinancialEventGroup extends AbstractMwsObject {

    private String financialEventGroupId;

    private String processingStatus;

    private String fundTransferStatus;

    private Currency originalTotal;

    private Currency convertedTotal;

    private XMLGregorianCalendar fundTransferDate;

    private String traceId;

    private String accountTail;

    private Currency beginningBalance;

    private XMLGregorianCalendar financialEventGroupStart;

    private XMLGregorianCalendar financialEventGroupEnd;

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
    public FinancialEventGroup withFinancialEventGroupId(String financialEventGroupId) {
        this.financialEventGroupId = financialEventGroupId;
        return this;
    }

    /**
     * Get the value of ProcessingStatus.
     *
     * @return The value of ProcessingStatus.
     */
    public String getProcessingStatus() {
        return processingStatus;
    }

    /**
     * Set the value of ProcessingStatus.
     *
     * @param processingStatus
     *            The new value to set.
     */
    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    /**
     * Check to see if ProcessingStatus is set.
     *
     * @return true if ProcessingStatus is set.
     */
    public boolean isSetProcessingStatus() {
        return processingStatus != null;
    }

    /**
     * Set the value of ProcessingStatus, return this.
     *
     * @param processingStatus
     *             The new value to set.
     *
     * @return This instance.
     */
    public FinancialEventGroup withProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
        return this;
    }

    /**
     * Get the value of FundTransferStatus.
     *
     * @return The value of FundTransferStatus.
     */
    public String getFundTransferStatus() {
        return fundTransferStatus;
    }

    /**
     * Set the value of FundTransferStatus.
     *
     * @param fundTransferStatus
     *            The new value to set.
     */
    public void setFundTransferStatus(String fundTransferStatus) {
        this.fundTransferStatus = fundTransferStatus;
    }

    /**
     * Check to see if FundTransferStatus is set.
     *
     * @return true if FundTransferStatus is set.
     */
    public boolean isSetFundTransferStatus() {
        return fundTransferStatus != null;
    }

    /**
     * Set the value of FundTransferStatus, return this.
     *
     * @param fundTransferStatus
     *             The new value to set.
     *
     * @return This instance.
     */
    public FinancialEventGroup withFundTransferStatus(String fundTransferStatus) {
        this.fundTransferStatus = fundTransferStatus;
        return this;
    }

    /**
     * Get the value of OriginalTotal.
     *
     * @return The value of OriginalTotal.
     */
    public Currency getOriginalTotal() {
        return originalTotal;
    }

    /**
     * Set the value of OriginalTotal.
     *
     * @param originalTotal
     *            The new value to set.
     */
    public void setOriginalTotal(Currency originalTotal) {
        this.originalTotal = originalTotal;
    }

    /**
     * Check to see if OriginalTotal is set.
     *
     * @return true if OriginalTotal is set.
     */
    public boolean isSetOriginalTotal() {
        return originalTotal != null;
    }

    /**
     * Set the value of OriginalTotal, return this.
     *
     * @param originalTotal
     *             The new value to set.
     *
     * @return This instance.
     */
    public FinancialEventGroup withOriginalTotal(Currency originalTotal) {
        this.originalTotal = originalTotal;
        return this;
    }

    /**
     * Get the value of ConvertedTotal.
     *
     * @return The value of ConvertedTotal.
     */
    public Currency getConvertedTotal() {
        return convertedTotal;
    }

    /**
     * Set the value of ConvertedTotal.
     *
     * @param convertedTotal
     *            The new value to set.
     */
    public void setConvertedTotal(Currency convertedTotal) {
        this.convertedTotal = convertedTotal;
    }

    /**
     * Check to see if ConvertedTotal is set.
     *
     * @return true if ConvertedTotal is set.
     */
    public boolean isSetConvertedTotal() {
        return convertedTotal != null;
    }

    /**
     * Set the value of ConvertedTotal, return this.
     *
     * @param convertedTotal
     *             The new value to set.
     *
     * @return This instance.
     */
    public FinancialEventGroup withConvertedTotal(Currency convertedTotal) {
        this.convertedTotal = convertedTotal;
        return this;
    }

    /**
     * Get the value of FundTransferDate.
     *
     * @return The value of FundTransferDate.
     */
    public XMLGregorianCalendar getFundTransferDate() {
        return fundTransferDate;
    }

    /**
     * Set the value of FundTransferDate.
     *
     * @param fundTransferDate
     *            The new value to set.
     */
    public void setFundTransferDate(XMLGregorianCalendar fundTransferDate) {
        this.fundTransferDate = fundTransferDate;
    }

    /**
     * Check to see if FundTransferDate is set.
     *
     * @return true if FundTransferDate is set.
     */
    public boolean isSetFundTransferDate() {
        return fundTransferDate != null;
    }

    /**
     * Set the value of FundTransferDate, return this.
     *
     * @param fundTransferDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public FinancialEventGroup withFundTransferDate(XMLGregorianCalendar fundTransferDate) {
        this.fundTransferDate = fundTransferDate;
        return this;
    }

    /**
     * Get the value of TraceId.
     *
     * @return The value of TraceId.
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Set the value of TraceId.
     *
     * @param traceId
     *            The new value to set.
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    /**
     * Check to see if TraceId is set.
     *
     * @return true if TraceId is set.
     */
    public boolean isSetTraceId() {
        return traceId != null;
    }

    /**
     * Set the value of TraceId, return this.
     *
     * @param traceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public FinancialEventGroup withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * Get the value of AccountTail.
     *
     * @return The value of AccountTail.
     */
    public String getAccountTail() {
        return accountTail;
    }

    /**
     * Set the value of AccountTail.
     *
     * @param accountTail
     *            The new value to set.
     */
    public void setAccountTail(String accountTail) {
        this.accountTail = accountTail;
    }

    /**
     * Check to see if AccountTail is set.
     *
     * @return true if AccountTail is set.
     */
    public boolean isSetAccountTail() {
        return accountTail != null;
    }

    /**
     * Set the value of AccountTail, return this.
     *
     * @param accountTail
     *             The new value to set.
     *
     * @return This instance.
     */
    public FinancialEventGroup withAccountTail(String accountTail) {
        this.accountTail = accountTail;
        return this;
    }

    /**
     * Get the value of BeginningBalance.
     *
     * @return The value of BeginningBalance.
     */
    public Currency getBeginningBalance() {
        return beginningBalance;
    }

    /**
     * Set the value of BeginningBalance.
     *
     * @param beginningBalance
     *            The new value to set.
     */
    public void setBeginningBalance(Currency beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    /**
     * Check to see if BeginningBalance is set.
     *
     * @return true if BeginningBalance is set.
     */
    public boolean isSetBeginningBalance() {
        return beginningBalance != null;
    }

    /**
     * Set the value of BeginningBalance, return this.
     *
     * @param beginningBalance
     *             The new value to set.
     *
     * @return This instance.
     */
    public FinancialEventGroup withBeginningBalance(Currency beginningBalance) {
        this.beginningBalance = beginningBalance;
        return this;
    }

    /**
     * Get the value of FinancialEventGroupStart.
     *
     * @return The value of FinancialEventGroupStart.
     */
    public XMLGregorianCalendar getFinancialEventGroupStart() {
        return financialEventGroupStart;
    }

    /**
     * Set the value of FinancialEventGroupStart.
     *
     * @param financialEventGroupStart
     *            The new value to set.
     */
    public void setFinancialEventGroupStart(XMLGregorianCalendar financialEventGroupStart) {
        this.financialEventGroupStart = financialEventGroupStart;
    }

    /**
     * Check to see if FinancialEventGroupStart is set.
     *
     * @return true if FinancialEventGroupStart is set.
     */
    public boolean isSetFinancialEventGroupStart() {
        return financialEventGroupStart != null;
    }

    /**
     * Set the value of FinancialEventGroupStart, return this.
     *
     * @param financialEventGroupStart
     *             The new value to set.
     *
     * @return This instance.
     */
    public FinancialEventGroup withFinancialEventGroupStart(XMLGregorianCalendar financialEventGroupStart) {
        this.financialEventGroupStart = financialEventGroupStart;
        return this;
    }

    /**
     * Get the value of FinancialEventGroupEnd.
     *
     * @return The value of FinancialEventGroupEnd.
     */
    public XMLGregorianCalendar getFinancialEventGroupEnd() {
        return financialEventGroupEnd;
    }

    /**
     * Set the value of FinancialEventGroupEnd.
     *
     * @param financialEventGroupEnd
     *            The new value to set.
     */
    public void setFinancialEventGroupEnd(XMLGregorianCalendar financialEventGroupEnd) {
        this.financialEventGroupEnd = financialEventGroupEnd;
    }

    /**
     * Check to see if FinancialEventGroupEnd is set.
     *
     * @return true if FinancialEventGroupEnd is set.
     */
    public boolean isSetFinancialEventGroupEnd() {
        return financialEventGroupEnd != null;
    }

    /**
     * Set the value of FinancialEventGroupEnd, return this.
     *
     * @param financialEventGroupEnd
     *             The new value to set.
     *
     * @return This instance.
     */
    public FinancialEventGroup withFinancialEventGroupEnd(XMLGregorianCalendar financialEventGroupEnd) {
        this.financialEventGroupEnd = financialEventGroupEnd;
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
        financialEventGroupId = r.read("FinancialEventGroupId", String.class);
        processingStatus = r.read("ProcessingStatus", String.class);
        fundTransferStatus = r.read("FundTransferStatus", String.class);
        originalTotal = r.read("OriginalTotal", Currency.class);
        convertedTotal = r.read("ConvertedTotal", Currency.class);
        fundTransferDate = r.read("FundTransferDate", XMLGregorianCalendar.class);
        traceId = r.read("TraceId", String.class);
        accountTail = r.read("AccountTail", String.class);
        beginningBalance = r.read("BeginningBalance", Currency.class);
        financialEventGroupStart = r.read("FinancialEventGroupStart", XMLGregorianCalendar.class);
        financialEventGroupEnd = r.read("FinancialEventGroupEnd", XMLGregorianCalendar.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("FinancialEventGroupId", financialEventGroupId);
        w.write("ProcessingStatus", processingStatus);
        w.write("FundTransferStatus", fundTransferStatus);
        w.write("OriginalTotal", originalTotal);
        w.write("ConvertedTotal", convertedTotal);
        w.write("FundTransferDate", fundTransferDate);
        w.write("TraceId", traceId);
        w.write("AccountTail", accountTail);
        w.write("BeginningBalance", beginningBalance);
        w.write("FinancialEventGroupStart", financialEventGroupStart);
        w.write("FinancialEventGroupEnd", financialEventGroupEnd);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "FinancialEventGroup",this);
    }

    /** Value constructor. */
    public FinancialEventGroup(String financialEventGroupId,String processingStatus,String fundTransferStatus,Currency originalTotal,Currency convertedTotal,XMLGregorianCalendar fundTransferDate,String traceId,String accountTail,Currency beginningBalance,XMLGregorianCalendar financialEventGroupStart,XMLGregorianCalendar financialEventGroupEnd) {
        this.financialEventGroupId = financialEventGroupId;
        this.processingStatus = processingStatus;
        this.fundTransferStatus = fundTransferStatus;
        this.originalTotal = originalTotal;
        this.convertedTotal = convertedTotal;
        this.fundTransferDate = fundTransferDate;
        this.traceId = traceId;
        this.accountTail = accountTail;
        this.beginningBalance = beginningBalance;
        this.financialEventGroupStart = financialEventGroupStart;
        this.financialEventGroupEnd = financialEventGroupEnd;
    }    
    

    /** Default constructor. */
    public FinancialEventGroup() {
        super();
    }

}
