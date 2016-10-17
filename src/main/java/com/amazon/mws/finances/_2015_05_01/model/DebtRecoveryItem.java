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
 * Debt Recovery Item
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amazonservices.mws.client.*;

/**
 * DebtRecoveryItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="DebtRecoveryItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="RecoveryAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="OriginalAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="GroupBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="GroupEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class DebtRecoveryItem extends AbstractMwsObject {

    private Currency recoveryAmount;

    private Currency originalAmount;

    private XMLGregorianCalendar groupBeginDate;

    private XMLGregorianCalendar groupEndDate;

    /**
     * Get the value of RecoveryAmount.
     *
     * @return The value of RecoveryAmount.
     */
    public Currency getRecoveryAmount() {
        return recoveryAmount;
    }

    /**
     * Set the value of RecoveryAmount.
     *
     * @param recoveryAmount
     *            The new value to set.
     */
    public void setRecoveryAmount(Currency recoveryAmount) {
        this.recoveryAmount = recoveryAmount;
    }

    /**
     * Check to see if RecoveryAmount is set.
     *
     * @return true if RecoveryAmount is set.
     */
    public boolean isSetRecoveryAmount() {
        return recoveryAmount != null;
    }

    /**
     * Set the value of RecoveryAmount, return this.
     *
     * @param recoveryAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public DebtRecoveryItem withRecoveryAmount(Currency recoveryAmount) {
        this.recoveryAmount = recoveryAmount;
        return this;
    }

    /**
     * Get the value of OriginalAmount.
     *
     * @return The value of OriginalAmount.
     */
    public Currency getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Set the value of OriginalAmount.
     *
     * @param originalAmount
     *            The new value to set.
     */
    public void setOriginalAmount(Currency originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * Check to see if OriginalAmount is set.
     *
     * @return true if OriginalAmount is set.
     */
    public boolean isSetOriginalAmount() {
        return originalAmount != null;
    }

    /**
     * Set the value of OriginalAmount, return this.
     *
     * @param originalAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public DebtRecoveryItem withOriginalAmount(Currency originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }

    /**
     * Get the value of GroupBeginDate.
     *
     * @return The value of GroupBeginDate.
     */
    public XMLGregorianCalendar getGroupBeginDate() {
        return groupBeginDate;
    }

    /**
     * Set the value of GroupBeginDate.
     *
     * @param groupBeginDate
     *            The new value to set.
     */
    public void setGroupBeginDate(XMLGregorianCalendar groupBeginDate) {
        this.groupBeginDate = groupBeginDate;
    }

    /**
     * Check to see if GroupBeginDate is set.
     *
     * @return true if GroupBeginDate is set.
     */
    public boolean isSetGroupBeginDate() {
        return groupBeginDate != null;
    }

    /**
     * Set the value of GroupBeginDate, return this.
     *
     * @param groupBeginDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public DebtRecoveryItem withGroupBeginDate(XMLGregorianCalendar groupBeginDate) {
        this.groupBeginDate = groupBeginDate;
        return this;
    }

    /**
     * Get the value of GroupEndDate.
     *
     * @return The value of GroupEndDate.
     */
    public XMLGregorianCalendar getGroupEndDate() {
        return groupEndDate;
    }

    /**
     * Set the value of GroupEndDate.
     *
     * @param groupEndDate
     *            The new value to set.
     */
    public void setGroupEndDate(XMLGregorianCalendar groupEndDate) {
        this.groupEndDate = groupEndDate;
    }

    /**
     * Check to see if GroupEndDate is set.
     *
     * @return true if GroupEndDate is set.
     */
    public boolean isSetGroupEndDate() {
        return groupEndDate != null;
    }

    /**
     * Set the value of GroupEndDate, return this.
     *
     * @param groupEndDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public DebtRecoveryItem withGroupEndDate(XMLGregorianCalendar groupEndDate) {
        this.groupEndDate = groupEndDate;
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
        recoveryAmount = r.read("RecoveryAmount", Currency.class);
        originalAmount = r.read("OriginalAmount", Currency.class);
        groupBeginDate = r.read("GroupBeginDate", XMLGregorianCalendar.class);
        groupEndDate = r.read("GroupEndDate", XMLGregorianCalendar.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("RecoveryAmount", recoveryAmount);
        w.write("OriginalAmount", originalAmount);
        w.write("GroupBeginDate", groupBeginDate);
        w.write("GroupEndDate", groupEndDate);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "DebtRecoveryItem",this);
    }

    /** Value constructor. */
    public DebtRecoveryItem(Currency recoveryAmount,Currency originalAmount,XMLGregorianCalendar groupBeginDate,XMLGregorianCalendar groupEndDate) {
        this.recoveryAmount = recoveryAmount;
        this.originalAmount = originalAmount;
        this.groupBeginDate = groupBeginDate;
        this.groupEndDate = groupEndDate;
    }    
    

    /** Default constructor. */
    public DebtRecoveryItem() {
        super();
    }

}
