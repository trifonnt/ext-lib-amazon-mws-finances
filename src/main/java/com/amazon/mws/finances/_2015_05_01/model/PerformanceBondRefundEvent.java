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
 * Performance Bond Refund Event
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * PerformanceBondRefundEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PerformanceBondRefundEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="MarketplaceCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Amount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="ProductGroupList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class PerformanceBondRefundEvent extends AbstractMwsObject {

    private String marketplaceCountryCode;

    private Currency amount;

    private List<String> productGroupList;

    /**
     * Get the value of MarketplaceCountryCode.
     *
     * @return The value of MarketplaceCountryCode.
     */
    public String getMarketplaceCountryCode() {
        return marketplaceCountryCode;
    }

    /**
     * Set the value of MarketplaceCountryCode.
     *
     * @param marketplaceCountryCode
     *            The new value to set.
     */
    public void setMarketplaceCountryCode(String marketplaceCountryCode) {
        this.marketplaceCountryCode = marketplaceCountryCode;
    }

    /**
     * Check to see if MarketplaceCountryCode is set.
     *
     * @return true if MarketplaceCountryCode is set.
     */
    public boolean isSetMarketplaceCountryCode() {
        return marketplaceCountryCode != null;
    }

    /**
     * Set the value of MarketplaceCountryCode, return this.
     *
     * @param marketplaceCountryCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public PerformanceBondRefundEvent withMarketplaceCountryCode(String marketplaceCountryCode) {
        this.marketplaceCountryCode = marketplaceCountryCode;
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
    public PerformanceBondRefundEvent withAmount(Currency amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the value of ProductGroupList.
     *
     * @return The value of ProductGroupList.
     */
    public List<String> getProductGroupList() {
        if (productGroupList==null) {
            productGroupList = new ArrayList<String>();
        }
        return productGroupList;
    }

    /**
     * Set the value of ProductGroupList.
     *
     * @param productGroupList
     *            The new value to set.
     */
    public void setProductGroupList(List<String> productGroupList) {
        this.productGroupList = productGroupList;
    }

    /**
     * Clear ProductGroupList.
     */
    public void unsetProductGroupList() {
        this.productGroupList = null;
    }

    /**
     * Check to see if ProductGroupList is set.
     *
     * @return true if ProductGroupList is set.
     */
    public boolean isSetProductGroupList() {
        return productGroupList != null && !productGroupList.isEmpty();
    }

    /**
     * Add values for ProductGroupList, return this.
     *
     * @param productGroupList
     *             New values to add.
     *
     * @return This instance.
     */
    public PerformanceBondRefundEvent withProductGroupList(String... values) {
        List<String> list = getProductGroupList();
        for (String value : values) {
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
        marketplaceCountryCode = r.read("MarketplaceCountryCode", String.class);
        amount = r.read("Amount", Currency.class);
        productGroupList = r.readList("ProductGroupList", "ProductGroup", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("MarketplaceCountryCode", marketplaceCountryCode);
        w.write("Amount", amount);
        w.writeList("ProductGroupList", "ProductGroup", productGroupList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "PerformanceBondRefundEvent",this);
    }

    /** Value constructor. */
    public PerformanceBondRefundEvent(String marketplaceCountryCode,Currency amount,List<String> productGroupList) {
        this.marketplaceCountryCode = marketplaceCountryCode;
        this.amount = amount;
        this.productGroupList = productGroupList;
    }    
    

    /** Default constructor. */
    public PerformanceBondRefundEvent() {
        super();
    }

}
