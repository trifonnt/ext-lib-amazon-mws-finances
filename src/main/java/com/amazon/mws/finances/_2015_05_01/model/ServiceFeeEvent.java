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
 * Service Fee Event
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * ServiceFeeEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ServiceFeeEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FeeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FeeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FnSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FeeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ServiceFeeEvent extends AbstractMwsObject {

    private String amazonOrderId;

    private String feeReason;

    private List<FeeComponent> feeList;

    private String sellerSKU;

    private String fnSKU;

    private String feeDescription;

    private String asin;

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
    public ServiceFeeEvent withAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * Get the value of FeeReason.
     *
     * @return The value of FeeReason.
     */
    public String getFeeReason() {
        return feeReason;
    }

    /**
     * Set the value of FeeReason.
     *
     * @param feeReason
     *            The new value to set.
     */
    public void setFeeReason(String feeReason) {
        this.feeReason = feeReason;
    }

    /**
     * Check to see if FeeReason is set.
     *
     * @return true if FeeReason is set.
     */
    public boolean isSetFeeReason() {
        return feeReason != null;
    }

    /**
     * Set the value of FeeReason, return this.
     *
     * @param feeReason
     *             The new value to set.
     *
     * @return This instance.
     */
    public ServiceFeeEvent withFeeReason(String feeReason) {
        this.feeReason = feeReason;
        return this;
    }

    /**
     * Get the value of FeeList.
     *
     * @return The value of FeeList.
     */
    public List<FeeComponent> getFeeList() {
        if (feeList==null) {
            feeList = new ArrayList<FeeComponent>();
        }
        return feeList;
    }

    /**
     * Set the value of FeeList.
     *
     * @param feeList
     *            The new value to set.
     */
    public void setFeeList(List<FeeComponent> feeList) {
        this.feeList = feeList;
    }

    /**
     * Clear FeeList.
     */
    public void unsetFeeList() {
        this.feeList = null;
    }

    /**
     * Check to see if FeeList is set.
     *
     * @return true if FeeList is set.
     */
    public boolean isSetFeeList() {
        return feeList != null && !feeList.isEmpty();
    }

    /**
     * Add values for FeeList, return this.
     *
     * @param feeList
     *             New values to add.
     *
     * @return This instance.
     */
    public ServiceFeeEvent withFeeList(FeeComponent... values) {
        List<FeeComponent> list = getFeeList();
        for (FeeComponent value : values) {
            list.add(value);
        }
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
    public ServiceFeeEvent withSellerSKU(String sellerSKU) {
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
    public ServiceFeeEvent withFnSKU(String fnSKU) {
        this.fnSKU = fnSKU;
        return this;
    }

    /**
     * Get the value of FeeDescription.
     *
     * @return The value of FeeDescription.
     */
    public String getFeeDescription() {
        return feeDescription;
    }

    /**
     * Set the value of FeeDescription.
     *
     * @param feeDescription
     *            The new value to set.
     */
    public void setFeeDescription(String feeDescription) {
        this.feeDescription = feeDescription;
    }

    /**
     * Check to see if FeeDescription is set.
     *
     * @return true if FeeDescription is set.
     */
    public boolean isSetFeeDescription() {
        return feeDescription != null;
    }

    /**
     * Set the value of FeeDescription, return this.
     *
     * @param feeDescription
     *             The new value to set.
     *
     * @return This instance.
     */
    public ServiceFeeEvent withFeeDescription(String feeDescription) {
        this.feeDescription = feeDescription;
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
    public ServiceFeeEvent withASIN(String asin) {
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
        amazonOrderId = r.read("AmazonOrderId", String.class);
        feeReason = r.read("FeeReason", String.class);
        feeList = r.readList("FeeList", "FeeComponent", FeeComponent.class);
        sellerSKU = r.read("SellerSKU", String.class);
        fnSKU = r.read("FnSKU", String.class);
        feeDescription = r.read("FeeDescription", String.class);
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
        w.write("AmazonOrderId", amazonOrderId);
        w.write("FeeReason", feeReason);
        w.writeList("FeeList", "FeeComponent", feeList);
        w.write("SellerSKU", sellerSKU);
        w.write("FnSKU", fnSKU);
        w.write("FeeDescription", feeDescription);
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
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "ServiceFeeEvent",this);
    }

    /** Value constructor. */
    public ServiceFeeEvent(String amazonOrderId,String feeReason,List<FeeComponent> feeList,String sellerSKU,String fnSKU,String feeDescription,String asin) {
        this.amazonOrderId = amazonOrderId;
        this.feeReason = feeReason;
        this.feeList = feeList;
        this.sellerSKU = sellerSKU;
        this.fnSKU = fnSKU;
        this.feeDescription = feeDescription;
        this.asin = asin;
    }    
    

    /** Default constructor. */
    public ServiceFeeEvent() {
        super();
    }

}
