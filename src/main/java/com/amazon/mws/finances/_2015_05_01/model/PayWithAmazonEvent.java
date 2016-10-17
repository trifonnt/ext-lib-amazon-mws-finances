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
 * Pay With Amazon Event
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amazonservices.mws.client.*;

/**
 * PayWithAmazonEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PayWithAmazonEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="TransactionPostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="BusinessObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SalesChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Charge" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeComponent" minOccurs="0"/&gt;
 *             &lt;element name="FeeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PaymentAmountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AmountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class PayWithAmazonEvent extends AbstractMwsObject {

    private String sellerOrderId;

    private XMLGregorianCalendar transactionPostedDate;

    private String businessObjectType;

    private String salesChannel;

    private ChargeComponent charge;

    private List<FeeComponent> feeList;

    private String paymentAmountType;

    private String amountDescription;

    private String fulfillmentChannel;

    private String storeName;

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
    public PayWithAmazonEvent withSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
        return this;
    }

    /**
     * Get the value of TransactionPostedDate.
     *
     * @return The value of TransactionPostedDate.
     */
    public XMLGregorianCalendar getTransactionPostedDate() {
        return transactionPostedDate;
    }

    /**
     * Set the value of TransactionPostedDate.
     *
     * @param transactionPostedDate
     *            The new value to set.
     */
    public void setTransactionPostedDate(XMLGregorianCalendar transactionPostedDate) {
        this.transactionPostedDate = transactionPostedDate;
    }

    /**
     * Check to see if TransactionPostedDate is set.
     *
     * @return true if TransactionPostedDate is set.
     */
    public boolean isSetTransactionPostedDate() {
        return transactionPostedDate != null;
    }

    /**
     * Set the value of TransactionPostedDate, return this.
     *
     * @param transactionPostedDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public PayWithAmazonEvent withTransactionPostedDate(XMLGregorianCalendar transactionPostedDate) {
        this.transactionPostedDate = transactionPostedDate;
        return this;
    }

    /**
     * Get the value of BusinessObjectType.
     *
     * @return The value of BusinessObjectType.
     */
    public String getBusinessObjectType() {
        return businessObjectType;
    }

    /**
     * Set the value of BusinessObjectType.
     *
     * @param businessObjectType
     *            The new value to set.
     */
    public void setBusinessObjectType(String businessObjectType) {
        this.businessObjectType = businessObjectType;
    }

    /**
     * Check to see if BusinessObjectType is set.
     *
     * @return true if BusinessObjectType is set.
     */
    public boolean isSetBusinessObjectType() {
        return businessObjectType != null;
    }

    /**
     * Set the value of BusinessObjectType, return this.
     *
     * @param businessObjectType
     *             The new value to set.
     *
     * @return This instance.
     */
    public PayWithAmazonEvent withBusinessObjectType(String businessObjectType) {
        this.businessObjectType = businessObjectType;
        return this;
    }

    /**
     * Get the value of SalesChannel.
     *
     * @return The value of SalesChannel.
     */
    public String getSalesChannel() {
        return salesChannel;
    }

    /**
     * Set the value of SalesChannel.
     *
     * @param salesChannel
     *            The new value to set.
     */
    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    /**
     * Check to see if SalesChannel is set.
     *
     * @return true if SalesChannel is set.
     */
    public boolean isSetSalesChannel() {
        return salesChannel != null;
    }

    /**
     * Set the value of SalesChannel, return this.
     *
     * @param salesChannel
     *             The new value to set.
     *
     * @return This instance.
     */
    public PayWithAmazonEvent withSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
        return this;
    }

    /**
     * Get the value of Charge.
     *
     * @return The value of Charge.
     */
    public ChargeComponent getCharge() {
        return charge;
    }

    /**
     * Set the value of Charge.
     *
     * @param charge
     *            The new value to set.
     */
    public void setCharge(ChargeComponent charge) {
        this.charge = charge;
    }

    /**
     * Check to see if Charge is set.
     *
     * @return true if Charge is set.
     */
    public boolean isSetCharge() {
        return charge != null;
    }

    /**
     * Set the value of Charge, return this.
     *
     * @param charge
     *             The new value to set.
     *
     * @return This instance.
     */
    public PayWithAmazonEvent withCharge(ChargeComponent charge) {
        this.charge = charge;
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
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public PayWithAmazonEvent withFeeList(FeeComponent... values) {
        List<FeeComponent> list = getFeeList();
        for (FeeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of PaymentAmountType.
     *
     * @return The value of PaymentAmountType.
     */
    public String getPaymentAmountType() {
        return paymentAmountType;
    }

    /**
     * Set the value of PaymentAmountType.
     *
     * @param paymentAmountType
     *            The new value to set.
     */
    public void setPaymentAmountType(String paymentAmountType) {
        this.paymentAmountType = paymentAmountType;
    }

    /**
     * Check to see if PaymentAmountType is set.
     *
     * @return true if PaymentAmountType is set.
     */
    public boolean isSetPaymentAmountType() {
        return paymentAmountType != null;
    }

    /**
     * Set the value of PaymentAmountType, return this.
     *
     * @param paymentAmountType
     *             The new value to set.
     *
     * @return This instance.
     */
    public PayWithAmazonEvent withPaymentAmountType(String paymentAmountType) {
        this.paymentAmountType = paymentAmountType;
        return this;
    }

    /**
     * Get the value of AmountDescription.
     *
     * @return The value of AmountDescription.
     */
    public String getAmountDescription() {
        return amountDescription;
    }

    /**
     * Set the value of AmountDescription.
     *
     * @param amountDescription
     *            The new value to set.
     */
    public void setAmountDescription(String amountDescription) {
        this.amountDescription = amountDescription;
    }

    /**
     * Check to see if AmountDescription is set.
     *
     * @return true if AmountDescription is set.
     */
    public boolean isSetAmountDescription() {
        return amountDescription != null;
    }

    /**
     * Set the value of AmountDescription, return this.
     *
     * @param amountDescription
     *             The new value to set.
     *
     * @return This instance.
     */
    public PayWithAmazonEvent withAmountDescription(String amountDescription) {
        this.amountDescription = amountDescription;
        return this;
    }

    /**
     * Get the value of FulfillmentChannel.
     *
     * @return The value of FulfillmentChannel.
     */
    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    /**
     * Set the value of FulfillmentChannel.
     *
     * @param fulfillmentChannel
     *            The new value to set.
     */
    public void setFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
    }

    /**
     * Check to see if FulfillmentChannel is set.
     *
     * @return true if FulfillmentChannel is set.
     */
    public boolean isSetFulfillmentChannel() {
        return fulfillmentChannel != null;
    }

    /**
     * Set the value of FulfillmentChannel, return this.
     *
     * @param fulfillmentChannel
     *             The new value to set.
     *
     * @return This instance.
     */
    public PayWithAmazonEvent withFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
        return this;
    }

    /**
     * Get the value of StoreName.
     *
     * @return The value of StoreName.
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Set the value of StoreName.
     *
     * @param storeName
     *            The new value to set.
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * Check to see if StoreName is set.
     *
     * @return true if StoreName is set.
     */
    public boolean isSetStoreName() {
        return storeName != null;
    }

    /**
     * Set the value of StoreName, return this.
     *
     * @param storeName
     *             The new value to set.
     *
     * @return This instance.
     */
    public PayWithAmazonEvent withStoreName(String storeName) {
        this.storeName = storeName;
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
        sellerOrderId = r.read("SellerOrderId", String.class);
        transactionPostedDate = r.read("TransactionPostedDate", XMLGregorianCalendar.class);
        businessObjectType = r.read("BusinessObjectType", String.class);
        salesChannel = r.read("SalesChannel", String.class);
        charge = r.read("Charge", ChargeComponent.class);
        feeList = r.readList("FeeList", "FeeComponent", FeeComponent.class);
        paymentAmountType = r.read("PaymentAmountType", String.class);
        amountDescription = r.read("AmountDescription", String.class);
        fulfillmentChannel = r.read("FulfillmentChannel", String.class);
        storeName = r.read("StoreName", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerOrderId", sellerOrderId);
        w.write("TransactionPostedDate", transactionPostedDate);
        w.write("BusinessObjectType", businessObjectType);
        w.write("SalesChannel", salesChannel);
        w.write("Charge", charge);
        w.writeList("FeeList", "FeeComponent", feeList);
        w.write("PaymentAmountType", paymentAmountType);
        w.write("AmountDescription", amountDescription);
        w.write("FulfillmentChannel", fulfillmentChannel);
        w.write("StoreName", storeName);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "PayWithAmazonEvent",this);
    }

    /** Value constructor. 
     * @param sellerOrderId 
     * @param transactionPostedDate 
     * @param businessObjectType 
     * @param salesChannel 
     * @param charge 
     * @param feeList 
     * @param paymentAmountType 
     * @param amountDescription 
     * @param fulfillmentChannel 
     * @param storeName */
    public PayWithAmazonEvent(String sellerOrderId,XMLGregorianCalendar transactionPostedDate,String businessObjectType,String salesChannel,ChargeComponent charge,List<FeeComponent> feeList,String paymentAmountType,String amountDescription,String fulfillmentChannel,String storeName) {
        this.sellerOrderId = sellerOrderId;
        this.transactionPostedDate = transactionPostedDate;
        this.businessObjectType = businessObjectType;
        this.salesChannel = salesChannel;
        this.charge = charge;
        this.feeList = feeList;
        this.paymentAmountType = paymentAmountType;
        this.amountDescription = amountDescription;
        this.fulfillmentChannel = fulfillmentChannel;
        this.storeName = storeName;
    }    
    

    /** Default constructor. */
    public PayWithAmazonEvent() {
        super();
    }

}
