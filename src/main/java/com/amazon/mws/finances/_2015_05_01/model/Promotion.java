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
 * Promotion
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.*;

/**
 * Promotion complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Promotion"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PromotionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PromotionAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Promotion extends AbstractMwsObject {

    private String promotionType;

    private String promotionId;

    private Currency promotionAmount;

    /**
     * Get the value of PromotionType.
     *
     * @return The value of PromotionType.
     */
    public String getPromotionType() {
        return promotionType;
    }

    /**
     * Set the value of PromotionType.
     *
     * @param promotionType
     *            The new value to set.
     */
    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    /**
     * Check to see if PromotionType is set.
     *
     * @return true if PromotionType is set.
     */
    public boolean isSetPromotionType() {
        return promotionType != null;
    }

    /**
     * Set the value of PromotionType, return this.
     *
     * @param promotionType
     *             The new value to set.
     *
     * @return This instance.
     */
    public Promotion withPromotionType(String promotionType) {
        this.promotionType = promotionType;
        return this;
    }

    /**
     * Get the value of PromotionId.
     *
     * @return The value of PromotionId.
     */
    public String getPromotionId() {
        return promotionId;
    }

    /**
     * Set the value of PromotionId.
     *
     * @param promotionId
     *            The new value to set.
     */
    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    /**
     * Check to see if PromotionId is set.
     *
     * @return true if PromotionId is set.
     */
    public boolean isSetPromotionId() {
        return promotionId != null;
    }

    /**
     * Set the value of PromotionId, return this.
     *
     * @param promotionId
     *             The new value to set.
     *
     * @return This instance.
     */
    public Promotion withPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    /**
     * Get the value of PromotionAmount.
     *
     * @return The value of PromotionAmount.
     */
    public Currency getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * Set the value of PromotionAmount.
     *
     * @param promotionAmount
     *            The new value to set.
     */
    public void setPromotionAmount(Currency promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * Check to see if PromotionAmount is set.
     *
     * @return true if PromotionAmount is set.
     */
    public boolean isSetPromotionAmount() {
        return promotionAmount != null;
    }

    /**
     * Set the value of PromotionAmount, return this.
     *
     * @param promotionAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public Promotion withPromotionAmount(Currency promotionAmount) {
        this.promotionAmount = promotionAmount;
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
        promotionType = r.read("PromotionType", String.class);
        promotionId = r.read("PromotionId", String.class);
        promotionAmount = r.read("PromotionAmount", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PromotionType", promotionType);
        w.write("PromotionId", promotionId);
        w.write("PromotionAmount", promotionAmount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "Promotion",this);
    }

    /** Value constructor. */
    public Promotion(String promotionType,String promotionId,Currency promotionAmount) {
        this.promotionType = promotionType;
        this.promotionId = promotionId;
        this.promotionAmount = promotionAmount;
    }    
    

    /** Default constructor. */
    public Promotion() {
        super();
    }

}
