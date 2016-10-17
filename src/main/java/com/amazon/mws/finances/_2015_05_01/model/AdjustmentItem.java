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
 * Adjustment Item
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.*;

/**
 * AdjustmentItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AdjustmentItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PerUnitAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="TotalAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FnSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class AdjustmentItem extends AbstractMwsObject {

    private String quantity;

    private Currency perUnitAmount;

    private Currency totalAmount;

    private String sellerSKU;

    private String fnSKU;

    private String productDescription;

    private String asin;

    /**
     * Get the value of Quantity.
     *
     * @return The value of Quantity.
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Set the value of Quantity.
     *
     * @param quantity
     *            The new value to set.
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Check to see if Quantity is set.
     *
     * @return true if Quantity is set.
     */
    public boolean isSetQuantity() {
        return quantity != null;
    }

    /**
     * Set the value of Quantity, return this.
     *
     * @param quantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdjustmentItem withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the value of PerUnitAmount.
     *
     * @return The value of PerUnitAmount.
     */
    public Currency getPerUnitAmount() {
        return perUnitAmount;
    }

    /**
     * Set the value of PerUnitAmount.
     *
     * @param perUnitAmount
     *            The new value to set.
     */
    public void setPerUnitAmount(Currency perUnitAmount) {
        this.perUnitAmount = perUnitAmount;
    }

    /**
     * Check to see if PerUnitAmount is set.
     *
     * @return true if PerUnitAmount is set.
     */
    public boolean isSetPerUnitAmount() {
        return perUnitAmount != null;
    }

    /**
     * Set the value of PerUnitAmount, return this.
     *
     * @param perUnitAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdjustmentItem withPerUnitAmount(Currency perUnitAmount) {
        this.perUnitAmount = perUnitAmount;
        return this;
    }

    /**
     * Get the value of TotalAmount.
     *
     * @return The value of TotalAmount.
     */
    public Currency getTotalAmount() {
        return totalAmount;
    }

    /**
     * Set the value of TotalAmount.
     *
     * @param totalAmount
     *            The new value to set.
     */
    public void setTotalAmount(Currency totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Check to see if TotalAmount is set.
     *
     * @return true if TotalAmount is set.
     */
    public boolean isSetTotalAmount() {
        return totalAmount != null;
    }

    /**
     * Set the value of TotalAmount, return this.
     *
     * @param totalAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdjustmentItem withTotalAmount(Currency totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Get the value of SellerSKU.
     *
     * @return The value of SellerSKU.
     */
    public String getSellerSKU() {
        return sellerSKU;
    }

    /**
     * Set the value of SellerSKU.
     *
     * @param sellerSKU
     *            The new value to set.
     */
    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    /**
     * Check to see if SellerSKU is set.
     *
     * @return true if SellerSKU is set.
     */
    public boolean isSetSellerSKU() {
        return sellerSKU != null;
    }

    /**
     * Set the value of SellerSKU, return this.
     *
     * @param sellerSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdjustmentItem withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * Get the value of FnSKU.
     *
     * @return The value of FnSKU.
     */
    public String getFnSKU() {
        return fnSKU;
    }

    /**
     * Set the value of FnSKU.
     *
     * @param fnSKU
     *            The new value to set.
     */
    public void setFnSKU(String fnSKU) {
        this.fnSKU = fnSKU;
    }

    /**
     * Check to see if FnSKU is set.
     *
     * @return true if FnSKU is set.
     */
    public boolean isSetFnSKU() {
        return fnSKU != null;
    }

    /**
     * Set the value of FnSKU, return this.
     *
     * @param fnSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdjustmentItem withFnSKU(String fnSKU) {
        this.fnSKU = fnSKU;
        return this;
    }

    /**
     * Get the value of ProductDescription.
     *
     * @return The value of ProductDescription.
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Set the value of ProductDescription.
     *
     * @param productDescription
     *            The new value to set.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * Check to see if ProductDescription is set.
     *
     * @return true if ProductDescription is set.
     */
    public boolean isSetProductDescription() {
        return productDescription != null;
    }

    /**
     * Set the value of ProductDescription, return this.
     *
     * @param productDescription
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdjustmentItem withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * Get the value of ASIN.
     *
     * @return The value of ASIN.
     */
    public String getASIN() {
        return asin;
    }

    /**
     * Set the value of ASIN.
     *
     * @param asin
     *            The new value to set.
     */
    public void setASIN(String asin) {
        this.asin = asin;
    }

    /**
     * Check to see if ASIN is set.
     *
     * @return true if ASIN is set.
     */
    public boolean isSetASIN() {
        return asin != null;
    }

    /**
     * Set the value of ASIN, return this.
     *
     * @param asin
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdjustmentItem withASIN(String asin) {
        this.asin = asin;
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
        quantity = r.read("Quantity", String.class);
        perUnitAmount = r.read("PerUnitAmount", Currency.class);
        totalAmount = r.read("TotalAmount", Currency.class);
        sellerSKU = r.read("SellerSKU", String.class);
        fnSKU = r.read("FnSKU", String.class);
        productDescription = r.read("ProductDescription", String.class);
        asin = r.read("ASIN", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Quantity", quantity);
        w.write("PerUnitAmount", perUnitAmount);
        w.write("TotalAmount", totalAmount);
        w.write("SellerSKU", sellerSKU);
        w.write("FnSKU", fnSKU);
        w.write("ProductDescription", productDescription);
        w.write("ASIN", asin);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "AdjustmentItem",this);
    }

    /** Value constructor. 
     * @param quantity 
     * @param perUnitAmount 
     * @param totalAmount 
     * @param sellerSKU 
     * @param fnSKU 
     * @param productDescription 
     * @param asin */
    public AdjustmentItem(String quantity,Currency perUnitAmount,Currency totalAmount,String sellerSKU,String fnSKU,String productDescription,String asin) {
        this.quantity = quantity;
        this.perUnitAmount = perUnitAmount;
        this.totalAmount = totalAmount;
        this.sellerSKU = sellerSKU;
        this.fnSKU = fnSKU;
        this.productDescription = productDescription;
        this.asin = asin;
    }    
    

    /** Default constructor. */
    public AdjustmentItem() {
        super();
    }

}
