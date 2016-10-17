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
 * Fee Component
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.*;

/**
 * FeeComponent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FeeComponent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="FeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FeeAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class FeeComponent extends AbstractMwsObject {

    private String feeType;

    private Currency feeAmount;

    /**
     * Get the value of FeeType.
     *
     * @return The value of FeeType.
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Set the value of FeeType.
     *
     * @param feeType
     *            The new value to set.
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    /**
     * Check to see if FeeType is set.
     *
     * @return true if FeeType is set.
     */
    public boolean isSetFeeType() {
        return feeType != null;
    }

    /**
     * Set the value of FeeType, return this.
     *
     * @param feeType
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeeComponent withFeeType(String feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * Get the value of FeeAmount.
     *
     * @return The value of FeeAmount.
     */
    public Currency getFeeAmount() {
        return feeAmount;
    }

    /**
     * Set the value of FeeAmount.
     *
     * @param feeAmount
     *            The new value to set.
     */
    public void setFeeAmount(Currency feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * Check to see if FeeAmount is set.
     *
     * @return true if FeeAmount is set.
     */
    public boolean isSetFeeAmount() {
        return feeAmount != null;
    }

    /**
     * Set the value of FeeAmount, return this.
     *
     * @param feeAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeeComponent withFeeAmount(Currency feeAmount) {
        this.feeAmount = feeAmount;
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
        feeType = r.read("FeeType", String.class);
        feeAmount = r.read("FeeAmount", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("FeeType", feeType);
        w.write("FeeAmount", feeAmount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "FeeComponent",this);
    }

    /** Value constructor. */
    public FeeComponent(String feeType,Currency feeAmount) {
        this.feeType = feeType;
        this.feeAmount = feeAmount;
    }    
    

    /** Default constructor. */
    public FeeComponent() {
        super();
    }

}
