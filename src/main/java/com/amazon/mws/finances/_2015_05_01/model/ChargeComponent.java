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
 * Charge Component
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.*;

/**
 * ChargeComponent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ChargeComponent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ChargeAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ChargeComponent extends AbstractMwsObject {

    private String chargeType;

    private Currency chargeAmount;

    /**
     * Get the value of ChargeType.
     *
     * @return The value of ChargeType.
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Set the value of ChargeType.
     *
     * @param chargeType
     *            The new value to set.
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * Check to see if ChargeType is set.
     *
     * @return true if ChargeType is set.
     */
    public boolean isSetChargeType() {
        return chargeType != null;
    }

    /**
     * Set the value of ChargeType, return this.
     *
     * @param chargeType
     *             The new value to set.
     *
     * @return This instance.
     */
    public ChargeComponent withChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    /**
     * Get the value of ChargeAmount.
     *
     * @return The value of ChargeAmount.
     */
    public Currency getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Set the value of ChargeAmount.
     *
     * @param chargeAmount
     *            The new value to set.
     */
    public void setChargeAmount(Currency chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    /**
     * Check to see if ChargeAmount is set.
     *
     * @return true if ChargeAmount is set.
     */
    public boolean isSetChargeAmount() {
        return chargeAmount != null;
    }

    /**
     * Set the value of ChargeAmount, return this.
     *
     * @param chargeAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public ChargeComponent withChargeAmount(Currency chargeAmount) {
        this.chargeAmount = chargeAmount;
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
        chargeType = r.read("ChargeType", String.class);
        chargeAmount = r.read("ChargeAmount", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ChargeType", chargeType);
        w.write("ChargeAmount", chargeAmount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "ChargeComponent",this);
    }

    /** Value constructor. */
    public ChargeComponent(String chargeType,Currency chargeAmount) {
        this.chargeType = chargeType;
        this.chargeAmount = chargeAmount;
    }    
    

    /** Default constructor. */
    public ChargeComponent() {
        super();
    }

}
