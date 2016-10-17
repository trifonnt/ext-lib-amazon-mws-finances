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
 * Currency
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import java.math.BigDecimal;

import com.amazonservices.mws.client.*;

/**
 * Currency complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Currency"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="CurrencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Currency extends AbstractMwsObject {

    private String currencyCode;

    private BigDecimal currencyAmount;

    /**
     * Get the value of CurrencyCode.
     *
     * @return The value of CurrencyCode.
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Set the value of CurrencyCode.
     *
     * @param currencyCode
     *            The new value to set.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Check to see if CurrencyCode is set.
     *
     * @return true if CurrencyCode is set.
     */
    public boolean isSetCurrencyCode() {
        return currencyCode != null;
    }

    /**
     * Set the value of CurrencyCode, return this.
     *
     * @param currencyCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public Currency withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Get the value of CurrencyAmount.
     *
     * @return The value of CurrencyAmount.
     */
    public BigDecimal getCurrencyAmount() {
        return currencyAmount;
    }

    /**
     * Set the value of CurrencyAmount.
     *
     * @param currencyAmount
     *            The new value to set.
     */
    public void setCurrencyAmount(BigDecimal currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    /**
     * Check to see if CurrencyAmount is set.
     *
     * @return true if CurrencyAmount is set.
     */
    public boolean isSetCurrencyAmount() {
        return currencyAmount != null;
    }

    /**
     * Set the value of CurrencyAmount, return this.
     *
     * @param currencyAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public Currency withCurrencyAmount(BigDecimal currencyAmount) {
        this.currencyAmount = currencyAmount;
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
        currencyCode = r.read("CurrencyCode", String.class);
        currencyAmount = r.read("CurrencyAmount", BigDecimal.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("CurrencyCode", currencyCode);
        w.write("CurrencyAmount", currencyAmount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "Currency",this);
    }

    /** Value constructor. */
    public Currency(String currencyCode,BigDecimal currencyAmount) {
        this.currencyCode = currencyCode;
        this.currencyAmount = currencyAmount;
    }    
    

    /** Default constructor. */
    public Currency() {
        super();
    }

}
