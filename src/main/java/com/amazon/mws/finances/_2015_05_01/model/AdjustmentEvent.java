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
 * Adjustment Event
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * AdjustmentEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AdjustmentEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AdjustmentAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="AdjustmentItemList" type="{http://mws.amazonservices.com/Finances/2015-05-01}AdjustmentItem" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class AdjustmentEvent extends AbstractMwsObject {

    private String adjustmentType;

    private Currency adjustmentAmount;

    private List<AdjustmentItem> adjustmentItemList;

    /**
     * Get the value of AdjustmentType.
     *
     * @return The value of AdjustmentType.
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Set the value of AdjustmentType.
     *
     * @param adjustmentType
     *            The new value to set.
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * Check to see if AdjustmentType is set.
     *
     * @return true if AdjustmentType is set.
     */
    public boolean isSetAdjustmentType() {
        return adjustmentType != null;
    }

    /**
     * Set the value of AdjustmentType, return this.
     *
     * @param adjustmentType
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdjustmentEvent withAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * Get the value of AdjustmentAmount.
     *
     * @return The value of AdjustmentAmount.
     */
    public Currency getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Set the value of AdjustmentAmount.
     *
     * @param adjustmentAmount
     *            The new value to set.
     */
    public void setAdjustmentAmount(Currency adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    /**
     * Check to see if AdjustmentAmount is set.
     *
     * @return true if AdjustmentAmount is set.
     */
    public boolean isSetAdjustmentAmount() {
        return adjustmentAmount != null;
    }

    /**
     * Set the value of AdjustmentAmount, return this.
     *
     * @param adjustmentAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdjustmentEvent withAdjustmentAmount(Currency adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
        return this;
    }

    /**
     * Get the value of AdjustmentItemList.
     *
     * @return The value of AdjustmentItemList.
     */
    public List<AdjustmentItem> getAdjustmentItemList() {
        if (adjustmentItemList==null) {
            adjustmentItemList = new ArrayList<AdjustmentItem>();
        }
        return adjustmentItemList;
    }

    /**
     * Set the value of AdjustmentItemList.
     *
     * @param adjustmentItemList
     *            The new value to set.
     */
    public void setAdjustmentItemList(List<AdjustmentItem> adjustmentItemList) {
        this.adjustmentItemList = adjustmentItemList;
    }

    /**
     * Clear AdjustmentItemList.
     */
    public void unsetAdjustmentItemList() {
        this.adjustmentItemList = null;
    }

    /**
     * Check to see if AdjustmentItemList is set.
     *
     * @return true if AdjustmentItemList is set.
     */
    public boolean isSetAdjustmentItemList() {
        return adjustmentItemList != null && !adjustmentItemList.isEmpty();
    }

    /**
     * Add values for AdjustmentItemList, return this.
     *
     * @param adjustmentItemList
     *             New values to add.
     *
     * @return This instance.
     */
    public AdjustmentEvent withAdjustmentItemList(AdjustmentItem... values) {
        List<AdjustmentItem> list = getAdjustmentItemList();
        for (AdjustmentItem value : values) {
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
        adjustmentType = r.read("AdjustmentType", String.class);
        adjustmentAmount = r.read("AdjustmentAmount", Currency.class);
        adjustmentItemList = r.readList("AdjustmentItemList", "AdjustmentItem", AdjustmentItem.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("AdjustmentType", adjustmentType);
        w.write("AdjustmentAmount", adjustmentAmount);
        w.writeList("AdjustmentItemList", "AdjustmentItem", adjustmentItemList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "AdjustmentEvent",this);
    }

    /** Value constructor. */
    public AdjustmentEvent(String adjustmentType,Currency adjustmentAmount,List<AdjustmentItem> adjustmentItemList) {
        this.adjustmentType = adjustmentType;
        this.adjustmentAmount = adjustmentAmount;
        this.adjustmentItemList = adjustmentItemList;
    }    
    

    /** Default constructor. */
    public AdjustmentEvent() {
        super();
    }

}
