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
 * Solution Provider Credit Event
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.*;

/**
 * SolutionProviderCreditEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SolutionProviderCreditEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ProviderTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerStoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ProviderStoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class SolutionProviderCreditEvent extends AbstractMwsObject {

    private String providerTransactionType;

    private String sellerOrderId;

    private String marketplaceId;

    private String marketplaceCountryCode;

    private String sellerId;

    private String sellerStoreName;

    private String providerId;

    private String providerStoreName;

    /**
     * Get the value of ProviderTransactionType.
     *
     * @return The value of ProviderTransactionType.
     */
    public String getProviderTransactionType() {
        return providerTransactionType;
    }

    /**
     * Set the value of ProviderTransactionType.
     *
     * @param providerTransactionType
     *            The new value to set.
     */
    public void setProviderTransactionType(String providerTransactionType) {
        this.providerTransactionType = providerTransactionType;
    }

    /**
     * Check to see if ProviderTransactionType is set.
     *
     * @return true if ProviderTransactionType is set.
     */
    public boolean isSetProviderTransactionType() {
        return providerTransactionType != null;
    }

    /**
     * Set the value of ProviderTransactionType, return this.
     *
     * @param providerTransactionType
     *             The new value to set.
     *
     * @return This instance.
     */
    public SolutionProviderCreditEvent withProviderTransactionType(String providerTransactionType) {
        this.providerTransactionType = providerTransactionType;
        return this;
    }

    /**
     * Get the value of SellerOrderId.
     *
     * @return The value of SellerOrderId.
     */
    public String getSellerOrderId() {
        return sellerOrderId;
    }

    /**
     * Set the value of SellerOrderId.
     *
     * @param sellerOrderId
     *            The new value to set.
     */
    public void setSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
    }

    /**
     * Check to see if SellerOrderId is set.
     *
     * @return true if SellerOrderId is set.
     */
    public boolean isSetSellerOrderId() {
        return sellerOrderId != null;
    }

    /**
     * Set the value of SellerOrderId, return this.
     *
     * @param sellerOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public SolutionProviderCreditEvent withSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
        return this;
    }

    /**
     * Get the value of MarketplaceId.
     *
     * @return The value of MarketplaceId.
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * Set the value of MarketplaceId.
     *
     * @param marketplaceId
     *            The new value to set.
     */
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * Check to see if MarketplaceId is set.
     *
     * @return true if MarketplaceId is set.
     */
    public boolean isSetMarketplaceId() {
        return marketplaceId != null;
    }

    /**
     * Set the value of MarketplaceId, return this.
     *
     * @param marketplaceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public SolutionProviderCreditEvent withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

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
    public SolutionProviderCreditEvent withMarketplaceCountryCode(String marketplaceCountryCode) {
        this.marketplaceCountryCode = marketplaceCountryCode;
        return this;
    }

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
    public SolutionProviderCreditEvent withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of SellerStoreName.
     *
     * @return The value of SellerStoreName.
     */
    public String getSellerStoreName() {
        return sellerStoreName;
    }

    /**
     * Set the value of SellerStoreName.
     *
     * @param sellerStoreName
     *            The new value to set.
     */
    public void setSellerStoreName(String sellerStoreName) {
        this.sellerStoreName = sellerStoreName;
    }

    /**
     * Check to see if SellerStoreName is set.
     *
     * @return true if SellerStoreName is set.
     */
    public boolean isSetSellerStoreName() {
        return sellerStoreName != null;
    }

    /**
     * Set the value of SellerStoreName, return this.
     *
     * @param sellerStoreName
     *             The new value to set.
     *
     * @return This instance.
     */
    public SolutionProviderCreditEvent withSellerStoreName(String sellerStoreName) {
        this.sellerStoreName = sellerStoreName;
        return this;
    }

    /**
     * Get the value of ProviderId.
     *
     * @return The value of ProviderId.
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Set the value of ProviderId.
     *
     * @param providerId
     *            The new value to set.
     */
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    /**
     * Check to see if ProviderId is set.
     *
     * @return true if ProviderId is set.
     */
    public boolean isSetProviderId() {
        return providerId != null;
    }

    /**
     * Set the value of ProviderId, return this.
     *
     * @param providerId
     *             The new value to set.
     *
     * @return This instance.
     */
    public SolutionProviderCreditEvent withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * Get the value of ProviderStoreName.
     *
     * @return The value of ProviderStoreName.
     */
    public String getProviderStoreName() {
        return providerStoreName;
    }

    /**
     * Set the value of ProviderStoreName.
     *
     * @param providerStoreName
     *            The new value to set.
     */
    public void setProviderStoreName(String providerStoreName) {
        this.providerStoreName = providerStoreName;
    }

    /**
     * Check to see if ProviderStoreName is set.
     *
     * @return true if ProviderStoreName is set.
     */
    public boolean isSetProviderStoreName() {
        return providerStoreName != null;
    }

    /**
     * Set the value of ProviderStoreName, return this.
     *
     * @param providerStoreName
     *             The new value to set.
     *
     * @return This instance.
     */
    public SolutionProviderCreditEvent withProviderStoreName(String providerStoreName) {
        this.providerStoreName = providerStoreName;
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
        providerTransactionType = r.read("ProviderTransactionType", String.class);
        sellerOrderId = r.read("SellerOrderId", String.class);
        marketplaceId = r.read("MarketplaceId", String.class);
        marketplaceCountryCode = r.read("MarketplaceCountryCode", String.class);
        sellerId = r.read("SellerId", String.class);
        sellerStoreName = r.read("SellerStoreName", String.class);
        providerId = r.read("ProviderId", String.class);
        providerStoreName = r.read("ProviderStoreName", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ProviderTransactionType", providerTransactionType);
        w.write("SellerOrderId", sellerOrderId);
        w.write("MarketplaceId", marketplaceId);
        w.write("MarketplaceCountryCode", marketplaceCountryCode);
        w.write("SellerId", sellerId);
        w.write("SellerStoreName", sellerStoreName);
        w.write("ProviderId", providerId);
        w.write("ProviderStoreName", providerStoreName);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "SolutionProviderCreditEvent",this);
    }

    /** Value constructor. */
    public SolutionProviderCreditEvent(String providerTransactionType,String sellerOrderId,String marketplaceId,String marketplaceCountryCode,String sellerId,String sellerStoreName,String providerId,String providerStoreName) {
        this.providerTransactionType = providerTransactionType;
        this.sellerOrderId = sellerOrderId;
        this.marketplaceId = marketplaceId;
        this.marketplaceCountryCode = marketplaceCountryCode;
        this.sellerId = sellerId;
        this.sellerStoreName = sellerStoreName;
        this.providerId = providerId;
        this.providerStoreName = providerStoreName;
    }    
    

    /** Default constructor. */
    public SolutionProviderCreditEvent() {
        super();
    }

}
