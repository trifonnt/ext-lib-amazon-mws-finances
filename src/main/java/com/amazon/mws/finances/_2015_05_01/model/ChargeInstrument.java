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
 * Charge Instrument
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.*;

/**
 * ChargeInstrument complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ChargeInstrument"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Tail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Amount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ChargeInstrument extends AbstractMwsObject {

    private String description;

    private String tail;

    private Currency amount;

    /**
     * Get the value of Description.
     *
     * @return The value of Description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of Description.
     *
     * @param description
     *            The new value to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Check to see if Description is set.
     *
     * @return true if Description is set.
     */
    public boolean isSetDescription() {
        return description != null;
    }

    /**
     * Set the value of Description, return this.
     *
     * @param description
     *             The new value to set.
     *
     * @return This instance.
     */
    public ChargeInstrument withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the value of Tail.
     *
     * @return The value of Tail.
     */
    public String getTail() {
        return tail;
    }

    /**
     * Set the value of Tail.
     *
     * @param tail
     *            The new value to set.
     */
    public void setTail(String tail) {
        this.tail = tail;
    }

    /**
     * Check to see if Tail is set.
     *
     * @return true if Tail is set.
     */
    public boolean isSetTail() {
        return tail != null;
    }

    /**
     * Set the value of Tail, return this.
     *
     * @param tail
     *             The new value to set.
     *
     * @return This instance.
     */
    public ChargeInstrument withTail(String tail) {
        this.tail = tail;
        return this;
    }

    /**
     * Get the value of Amount.
     *
     * @return The value of Amount.
     */
    public Currency getAmount() {
        return amount;
    }

    /**
     * Set the value of Amount.
     *
     * @param amount
     *            The new value to set.
     */
    public void setAmount(Currency amount) {
        this.amount = amount;
    }

    /**
     * Check to see if Amount is set.
     *
     * @return true if Amount is set.
     */
    public boolean isSetAmount() {
        return amount != null;
    }

    /**
     * Set the value of Amount, return this.
     *
     * @param amount
     *             The new value to set.
     *
     * @return This instance.
     */
    public ChargeInstrument withAmount(Currency amount) {
        this.amount = amount;
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
        description = r.read("Description", String.class);
        tail = r.read("Tail", String.class);
        amount = r.read("Amount", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Description", description);
        w.write("Tail", tail);
        w.write("Amount", amount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "ChargeInstrument",this);
    }

    /** Value constructor. 
     * @param description 
     * @param tail 
     * @param amount */
    public ChargeInstrument(String description,String tail,Currency amount) {
        this.description = description;
        this.tail = tail;
        this.amount = amount;
    }    
    

    /** Default constructor. */
    public ChargeInstrument() {
        super();
    }

}
