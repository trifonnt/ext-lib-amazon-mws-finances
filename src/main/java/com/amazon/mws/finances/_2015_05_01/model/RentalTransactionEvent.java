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
 * Rental Transaction Event
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
 * RentalTransactionEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="RentalTransactionEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="RentalEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ExtensionLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="RentalChargeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RentalFeeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="MarketplaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="RentalInitialValue" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="RentalReimbursement" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class RentalTransactionEvent extends AbstractMwsObject {

    private String amazonOrderId;

    private String rentalEventType;

    private Integer extensionLength;

    private XMLGregorianCalendar postedDate;

    private List<ChargeComponent> rentalChargeList;

    private List<FeeComponent> rentalFeeList;

    private String marketplaceName;

    private Currency rentalInitialValue;

    private Currency rentalReimbursement;

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
    public RentalTransactionEvent withAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * Get the value of RentalEventType.
     *
     * @return The value of RentalEventType.
     */
    public String getRentalEventType() {
        return rentalEventType;
    }

    /**
     * Set the value of RentalEventType.
     *
     * @param rentalEventType
     *            The new value to set.
     */
    public void setRentalEventType(String rentalEventType) {
        this.rentalEventType = rentalEventType;
    }

    /**
     * Check to see if RentalEventType is set.
     *
     * @return true if RentalEventType is set.
     */
    public boolean isSetRentalEventType() {
        return rentalEventType != null;
    }

    /**
     * Set the value of RentalEventType, return this.
     *
     * @param rentalEventType
     *             The new value to set.
     *
     * @return This instance.
     */
    public RentalTransactionEvent withRentalEventType(String rentalEventType) {
        this.rentalEventType = rentalEventType;
        return this;
    }

    /**
     * Get the value of ExtensionLength.
     *
     * @return The value of ExtensionLength.
     */
    public Integer getExtensionLength() {
        return extensionLength;
    }

    /**
     * Set the value of ExtensionLength.
     *
     * @param extensionLength
     *            The new value to set.
     */
    public void setExtensionLength(Integer extensionLength) {
        this.extensionLength = extensionLength;
    }

    /**
     * Check to see if ExtensionLength is set.
     *
     * @return true if ExtensionLength is set.
     */
    public boolean isSetExtensionLength() {
        return extensionLength != null;
    }

    /**
     * Set the value of ExtensionLength, return this.
     *
     * @param extensionLength
     *             The new value to set.
     *
     * @return This instance.
     */
    public RentalTransactionEvent withExtensionLength(Integer extensionLength) {
        this.extensionLength = extensionLength;
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
    public RentalTransactionEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of RentalChargeList.
     *
     * @return The value of RentalChargeList.
     */
    public List<ChargeComponent> getRentalChargeList() {
        if (rentalChargeList==null) {
            rentalChargeList = new ArrayList<ChargeComponent>();
        }
        return rentalChargeList;
    }

    /**
     * Set the value of RentalChargeList.
     *
     * @param rentalChargeList
     *            The new value to set.
     */
    public void setRentalChargeList(List<ChargeComponent> rentalChargeList) {
        this.rentalChargeList = rentalChargeList;
    }

    /**
     * Clear RentalChargeList.
     */
    public void unsetRentalChargeList() {
        this.rentalChargeList = null;
    }

    /**
     * Check to see if RentalChargeList is set.
     *
     * @return true if RentalChargeList is set.
     */
    public boolean isSetRentalChargeList() {
        return rentalChargeList != null && !rentalChargeList.isEmpty();
    }

    /**
     * Add values for RentalChargeList, return this.
     *
     * @param rentalChargeList
     *             New values to add.
     *
     * @return This instance.
     */
    public RentalTransactionEvent withRentalChargeList(ChargeComponent... values) {
        List<ChargeComponent> list = getRentalChargeList();
        for (ChargeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RentalFeeList.
     *
     * @return The value of RentalFeeList.
     */
    public List<FeeComponent> getRentalFeeList() {
        if (rentalFeeList==null) {
            rentalFeeList = new ArrayList<FeeComponent>();
        }
        return rentalFeeList;
    }

    /**
     * Set the value of RentalFeeList.
     *
     * @param rentalFeeList
     *            The new value to set.
     */
    public void setRentalFeeList(List<FeeComponent> rentalFeeList) {
        this.rentalFeeList = rentalFeeList;
    }

    /**
     * Clear RentalFeeList.
     */
    public void unsetRentalFeeList() {
        this.rentalFeeList = null;
    }

    /**
     * Check to see if RentalFeeList is set.
     *
     * @return true if RentalFeeList is set.
     */
    public boolean isSetRentalFeeList() {
        return rentalFeeList != null && !rentalFeeList.isEmpty();
    }

    /**
     * Add values for RentalFeeList, return this.
     *
     * @param rentalFeeList
     *             New values to add.
     *
     * @return This instance.
     */
    public RentalTransactionEvent withRentalFeeList(FeeComponent... values) {
        List<FeeComponent> list = getRentalFeeList();
        for (FeeComponent value : values) {
            list.add(value);
        }
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
    public RentalTransactionEvent withMarketplaceName(String marketplaceName) {
        this.marketplaceName = marketplaceName;
        return this;
    }

    /**
     * Get the value of RentalInitialValue.
     *
     * @return The value of RentalInitialValue.
     */
    public Currency getRentalInitialValue() {
        return rentalInitialValue;
    }

    /**
     * Set the value of RentalInitialValue.
     *
     * @param rentalInitialValue
     *            The new value to set.
     */
    public void setRentalInitialValue(Currency rentalInitialValue) {
        this.rentalInitialValue = rentalInitialValue;
    }

    /**
     * Check to see if RentalInitialValue is set.
     *
     * @return true if RentalInitialValue is set.
     */
    public boolean isSetRentalInitialValue() {
        return rentalInitialValue != null;
    }

    /**
     * Set the value of RentalInitialValue, return this.
     *
     * @param rentalInitialValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public RentalTransactionEvent withRentalInitialValue(Currency rentalInitialValue) {
        this.rentalInitialValue = rentalInitialValue;
        return this;
    }

    /**
     * Get the value of RentalReimbursement.
     *
     * @return The value of RentalReimbursement.
     */
    public Currency getRentalReimbursement() {
        return rentalReimbursement;
    }

    /**
     * Set the value of RentalReimbursement.
     *
     * @param rentalReimbursement
     *            The new value to set.
     */
    public void setRentalReimbursement(Currency rentalReimbursement) {
        this.rentalReimbursement = rentalReimbursement;
    }

    /**
     * Check to see if RentalReimbursement is set.
     *
     * @return true if RentalReimbursement is set.
     */
    public boolean isSetRentalReimbursement() {
        return rentalReimbursement != null;
    }

    /**
     * Set the value of RentalReimbursement, return this.
     *
     * @param rentalReimbursement
     *             The new value to set.
     *
     * @return This instance.
     */
    public RentalTransactionEvent withRentalReimbursement(Currency rentalReimbursement) {
        this.rentalReimbursement = rentalReimbursement;
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
        rentalEventType = r.read("RentalEventType", String.class);
        extensionLength = r.read("ExtensionLength", Integer.class);
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
        rentalChargeList = r.readList("RentalChargeList", "ChargeComponent", ChargeComponent.class);
        rentalFeeList = r.readList("RentalFeeList", "FeeComponent", FeeComponent.class);
        marketplaceName = r.read("MarketplaceName", String.class);
        rentalInitialValue = r.read("RentalInitialValue", Currency.class);
        rentalReimbursement = r.read("RentalReimbursement", Currency.class);
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
        w.write("RentalEventType", rentalEventType);
        w.write("ExtensionLength", extensionLength);
        w.write("PostedDate", postedDate);
        w.writeList("RentalChargeList", "ChargeComponent", rentalChargeList);
        w.writeList("RentalFeeList", "FeeComponent", rentalFeeList);
        w.write("MarketplaceName", marketplaceName);
        w.write("RentalInitialValue", rentalInitialValue);
        w.write("RentalReimbursement", rentalReimbursement);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "RentalTransactionEvent",this);
    }

    /** Value constructor. */
    public RentalTransactionEvent(String amazonOrderId,String rentalEventType,Integer extensionLength,XMLGregorianCalendar postedDate,List<ChargeComponent> rentalChargeList,List<FeeComponent> rentalFeeList,String marketplaceName,Currency rentalInitialValue,Currency rentalReimbursement) {
        this.amazonOrderId = amazonOrderId;
        this.rentalEventType = rentalEventType;
        this.extensionLength = extensionLength;
        this.postedDate = postedDate;
        this.rentalChargeList = rentalChargeList;
        this.rentalFeeList = rentalFeeList;
        this.marketplaceName = marketplaceName;
        this.rentalInitialValue = rentalInitialValue;
        this.rentalReimbursement = rentalReimbursement;
    }    
    

    /** Default constructor. */
    public RentalTransactionEvent() {
        super();
    }

}
