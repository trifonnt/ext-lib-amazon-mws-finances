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
 * Debt Recovery Event
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * DebtRecoveryEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="DebtRecoveryEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="DebtRecoveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="RecoveryAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="OverPaymentCredit" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="DebtRecoveryItemList" type="{http://mws.amazonservices.com/Finances/2015-05-01}DebtRecoveryItem" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ChargeInstrumentList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeInstrument" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class DebtRecoveryEvent extends AbstractMwsObject {

    private String debtRecoveryType;

    private Currency recoveryAmount;

    private Currency overPaymentCredit;

    private List<DebtRecoveryItem> debtRecoveryItemList;

    private List<ChargeInstrument> chargeInstrumentList;

    /**
     * Get the value of DebtRecoveryType.
     *
     * @return The value of DebtRecoveryType.
     */
    public String getDebtRecoveryType() {
        return debtRecoveryType;
    }

    /**
     * Set the value of DebtRecoveryType.
     *
     * @param debtRecoveryType
     *            The new value to set.
     */
    public void setDebtRecoveryType(String debtRecoveryType) {
        this.debtRecoveryType = debtRecoveryType;
    }

    /**
     * Check to see if DebtRecoveryType is set.
     *
     * @return true if DebtRecoveryType is set.
     */
    public boolean isSetDebtRecoveryType() {
        return debtRecoveryType != null;
    }

    /**
     * Set the value of DebtRecoveryType, return this.
     *
     * @param debtRecoveryType
     *             The new value to set.
     *
     * @return This instance.
     */
    public DebtRecoveryEvent withDebtRecoveryType(String debtRecoveryType) {
        this.debtRecoveryType = debtRecoveryType;
        return this;
    }

    /**
     * Get the value of RecoveryAmount.
     *
     * @return The value of RecoveryAmount.
     */
    public Currency getRecoveryAmount() {
        return recoveryAmount;
    }

    /**
     * Set the value of RecoveryAmount.
     *
     * @param recoveryAmount
     *            The new value to set.
     */
    public void setRecoveryAmount(Currency recoveryAmount) {
        this.recoveryAmount = recoveryAmount;
    }

    /**
     * Check to see if RecoveryAmount is set.
     *
     * @return true if RecoveryAmount is set.
     */
    public boolean isSetRecoveryAmount() {
        return recoveryAmount != null;
    }

    /**
     * Set the value of RecoveryAmount, return this.
     *
     * @param recoveryAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public DebtRecoveryEvent withRecoveryAmount(Currency recoveryAmount) {
        this.recoveryAmount = recoveryAmount;
        return this;
    }

    /**
     * Get the value of OverPaymentCredit.
     *
     * @return The value of OverPaymentCredit.
     */
    public Currency getOverPaymentCredit() {
        return overPaymentCredit;
    }

    /**
     * Set the value of OverPaymentCredit.
     *
     * @param overPaymentCredit
     *            The new value to set.
     */
    public void setOverPaymentCredit(Currency overPaymentCredit) {
        this.overPaymentCredit = overPaymentCredit;
    }

    /**
     * Check to see if OverPaymentCredit is set.
     *
     * @return true if OverPaymentCredit is set.
     */
    public boolean isSetOverPaymentCredit() {
        return overPaymentCredit != null;
    }

    /**
     * Set the value of OverPaymentCredit, return this.
     *
     * @param overPaymentCredit
     *             The new value to set.
     *
     * @return This instance.
     */
    public DebtRecoveryEvent withOverPaymentCredit(Currency overPaymentCredit) {
        this.overPaymentCredit = overPaymentCredit;
        return this;
    }

    /**
     * Get the value of DebtRecoveryItemList.
     *
     * @return The value of DebtRecoveryItemList.
     */
    public List<DebtRecoveryItem> getDebtRecoveryItemList() {
        if (debtRecoveryItemList==null) {
            debtRecoveryItemList = new ArrayList<DebtRecoveryItem>();
        }
        return debtRecoveryItemList;
    }

    /**
     * Set the value of DebtRecoveryItemList.
     *
     * @param debtRecoveryItemList
     *            The new value to set.
     */
    public void setDebtRecoveryItemList(List<DebtRecoveryItem> debtRecoveryItemList) {
        this.debtRecoveryItemList = debtRecoveryItemList;
    }

    /**
     * Clear DebtRecoveryItemList.
     */
    public void unsetDebtRecoveryItemList() {
        this.debtRecoveryItemList = null;
    }

    /**
     * Check to see if DebtRecoveryItemList is set.
     *
     * @return true if DebtRecoveryItemList is set.
     */
    public boolean isSetDebtRecoveryItemList() {
        return debtRecoveryItemList != null && !debtRecoveryItemList.isEmpty();
    }

    /**
     * Add values for DebtRecoveryItemList, return this.
     *
     * @param debtRecoveryItemList
     *             New values to add.
     *
     * @return This instance.
     */
    public DebtRecoveryEvent withDebtRecoveryItemList(DebtRecoveryItem... values) {
        List<DebtRecoveryItem> list = getDebtRecoveryItemList();
        for (DebtRecoveryItem value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ChargeInstrumentList.
     *
     * @return The value of ChargeInstrumentList.
     */
    public List<ChargeInstrument> getChargeInstrumentList() {
        if (chargeInstrumentList==null) {
            chargeInstrumentList = new ArrayList<ChargeInstrument>();
        }
        return chargeInstrumentList;
    }

    /**
     * Set the value of ChargeInstrumentList.
     *
     * @param chargeInstrumentList
     *            The new value to set.
     */
    public void setChargeInstrumentList(List<ChargeInstrument> chargeInstrumentList) {
        this.chargeInstrumentList = chargeInstrumentList;
    }

    /**
     * Clear ChargeInstrumentList.
     */
    public void unsetChargeInstrumentList() {
        this.chargeInstrumentList = null;
    }

    /**
     * Check to see if ChargeInstrumentList is set.
     *
     * @return true if ChargeInstrumentList is set.
     */
    public boolean isSetChargeInstrumentList() {
        return chargeInstrumentList != null && !chargeInstrumentList.isEmpty();
    }

    /**
     * Add values for ChargeInstrumentList, return this.
     *
     * @param chargeInstrumentList
     *             New values to add.
     *
     * @return This instance.
     */
    public DebtRecoveryEvent withChargeInstrumentList(ChargeInstrument... values) {
        List<ChargeInstrument> list = getChargeInstrumentList();
        for (ChargeInstrument value : values) {
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
        debtRecoveryType = r.read("DebtRecoveryType", String.class);
        recoveryAmount = r.read("RecoveryAmount", Currency.class);
        overPaymentCredit = r.read("OverPaymentCredit", Currency.class);
        debtRecoveryItemList = r.readList("DebtRecoveryItemList", "DebtRecoveryItem", DebtRecoveryItem.class);
        chargeInstrumentList = r.readList("ChargeInstrumentList", "ChargeInstrument", ChargeInstrument.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("DebtRecoveryType", debtRecoveryType);
        w.write("RecoveryAmount", recoveryAmount);
        w.write("OverPaymentCredit", overPaymentCredit);
        w.writeList("DebtRecoveryItemList", "DebtRecoveryItem", debtRecoveryItemList);
        w.writeList("ChargeInstrumentList", "ChargeInstrument", chargeInstrumentList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "DebtRecoveryEvent",this);
    }

    /** Value constructor. */
    public DebtRecoveryEvent(String debtRecoveryType,Currency recoveryAmount,Currency overPaymentCredit,List<DebtRecoveryItem> debtRecoveryItemList,List<ChargeInstrument> chargeInstrumentList) {
        this.debtRecoveryType = debtRecoveryType;
        this.recoveryAmount = recoveryAmount;
        this.overPaymentCredit = overPaymentCredit;
        this.debtRecoveryItemList = debtRecoveryItemList;
        this.chargeInstrumentList = chargeInstrumentList;
    }    
    

    /** Default constructor. */
    public DebtRecoveryEvent() {
        super();
    }

}
