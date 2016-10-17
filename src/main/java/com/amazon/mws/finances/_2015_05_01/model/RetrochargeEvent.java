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
 * Retrocharge Event
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amazonservices.mws.client.*;

/**
 * RetrochargeEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="RetrochargeEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="RetrochargeEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="BaseTax" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="ShippingTax" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class RetrochargeEvent extends AbstractMwsObject {

    private String retrochargeEventType;

    private String amazonOrderId;

    private XMLGregorianCalendar postedDate;

    private Currency baseTax;

    private Currency shippingTax;

    private String marketplaceName;

    /**
     * Get the value of RetrochargeEventType.
     *
     * @return The value of RetrochargeEventType.
     */
    public String getRetrochargeEventType() {
        return retrochargeEventType;
    }

    /**
     * Set the value of RetrochargeEventType.
     *
     * @param retrochargeEventType
     *            The new value to set.
     */
    public void setRetrochargeEventType(String retrochargeEventType) {
        this.retrochargeEventType = retrochargeEventType;
    }

    /**
     * Check to see if RetrochargeEventType is set.
     *
     * @return true if RetrochargeEventType is set.
     */
    public boolean isSetRetrochargeEventType() {
        return retrochargeEventType != null;
    }

    /**
     * Set the value of RetrochargeEventType, return this.
     *
     * @param retrochargeEventType
     *             The new value to set.
     *
     * @return This instance.
     */
    public RetrochargeEvent withRetrochargeEventType(String retrochargeEventType) {
        this.retrochargeEventType = retrochargeEventType;
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
    public RetrochargeEvent withAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * Get the value of PostedDate.
     *
     * @return The value of PostedDate.
     */
    public XMLGregorianCalendar getPostedDate() {
        return postedDate;
    }

    /**
     * Set the value of PostedDate.
     *
     * @param postedDate
     *            The new value to set.
     */
    public void setPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
    }

    /**
     * Check to see if PostedDate is set.
     *
     * @return true if PostedDate is set.
     */
    public boolean isSetPostedDate() {
        return postedDate != null;
    }

    /**
     * Set the value of PostedDate, return this.
     *
     * @param postedDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public RetrochargeEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of BaseTax.
     *
     * @return The value of BaseTax.
     */
    public Currency getBaseTax() {
        return baseTax;
    }

    /**
     * Set the value of BaseTax.
     *
     * @param baseTax
     *            The new value to set.
     */
    public void setBaseTax(Currency baseTax) {
        this.baseTax = baseTax;
    }

    /**
     * Check to see if BaseTax is set.
     *
     * @return true if BaseTax is set.
     */
    public boolean isSetBaseTax() {
        return baseTax != null;
    }

    /**
     * Set the value of BaseTax, return this.
     *
     * @param baseTax
     *             The new value to set.
     *
     * @return This instance.
     */
    public RetrochargeEvent withBaseTax(Currency baseTax) {
        this.baseTax = baseTax;
        return this;
    }

    /**
     * Get the value of ShippingTax.
     *
     * @return The value of ShippingTax.
     */
    public Currency getShippingTax() {
        return shippingTax;
    }

    /**
     * Set the value of ShippingTax.
     *
     * @param shippingTax
     *            The new value to set.
     */
    public void setShippingTax(Currency shippingTax) {
        this.shippingTax = shippingTax;
    }

    /**
     * Check to see if ShippingTax is set.
     *
     * @return true if ShippingTax is set.
     */
    public boolean isSetShippingTax() {
        return shippingTax != null;
    }

    /**
     * Set the value of ShippingTax, return this.
     *
     * @param shippingTax
     *             The new value to set.
     *
     * @return This instance.
     */
    public RetrochargeEvent withShippingTax(Currency shippingTax) {
        this.shippingTax = shippingTax;
        return this;
    }

    /**
     * Get the value of MarketplaceName.
     *
     * @return The value of MarketplaceName.
     */
    public String getMarketplaceName() {
        return marketplaceName;
    }

    /**
     * Set the value of MarketplaceName.
     *
     * @param marketplaceName
     *            The new value to set.
     */
    public void setMarketplaceName(String marketplaceName) {
        this.marketplaceName = marketplaceName;
    }

    /**
     * Check to see if MarketplaceName is set.
     *
     * @return true if MarketplaceName is set.
     */
    public boolean isSetMarketplaceName() {
        return marketplaceName != null;
    }

    /**
     * Set the value of MarketplaceName, return this.
     *
     * @param marketplaceName
     *             The new value to set.
     *
     * @return This instance.
     */
    public RetrochargeEvent withMarketplaceName(String marketplaceName) {
        this.marketplaceName = marketplaceName;
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
        retrochargeEventType = r.read("RetrochargeEventType", String.class);
        amazonOrderId = r.read("AmazonOrderId", String.class);
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
        baseTax = r.read("BaseTax", Currency.class);
        shippingTax = r.read("ShippingTax", Currency.class);
        marketplaceName = r.read("MarketplaceName", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("RetrochargeEventType", retrochargeEventType);
        w.write("AmazonOrderId", amazonOrderId);
        w.write("PostedDate", postedDate);
        w.write("BaseTax", baseTax);
        w.write("ShippingTax", shippingTax);
        w.write("MarketplaceName", marketplaceName);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "RetrochargeEvent",this);
    }

    /** Value constructor. */
    public RetrochargeEvent(String retrochargeEventType,String amazonOrderId,XMLGregorianCalendar postedDate,Currency baseTax,Currency shippingTax,String marketplaceName) {
        this.retrochargeEventType = retrochargeEventType;
        this.amazonOrderId = amazonOrderId;
        this.postedDate = postedDate;
        this.baseTax = baseTax;
        this.shippingTax = shippingTax;
        this.marketplaceName = marketplaceName;
    }    
    

    /** Default constructor. */
    public RetrochargeEvent() {
        super();
    }

}
