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
 * Financial Events
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * FinancialEvents complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FinancialEvents"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShipmentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RefundEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="GuaranteeClaimEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ChargebackEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PayWithAmazonEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}PayWithAmazonEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ServiceProviderCreditEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}SolutionProviderCreditEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RetrochargeEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}RetrochargeEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RentalTransactionEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}RentalTransactionEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PerformanceBondRefundEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}PerformanceBondRefundEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ServiceFeeEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ServiceFeeEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="DebtRecoveryEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}DebtRecoveryEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="LoanServicingEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}LoanServicingEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="AdjustmentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}AdjustmentEvent" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class FinancialEvents extends AbstractMwsObject {

    private List<ShipmentEvent> shipmentEventList;

    private List<ShipmentEvent> refundEventList;

    private List<ShipmentEvent> guaranteeClaimEventList;

    private List<ShipmentEvent> chargebackEventList;

    private List<PayWithAmazonEvent> payWithAmazonEventList;

    private List<SolutionProviderCreditEvent> serviceProviderCreditEventList;

    private List<RetrochargeEvent> retrochargeEventList;

    private List<RentalTransactionEvent> rentalTransactionEventList;

    private List<PerformanceBondRefundEvent> performanceBondRefundEventList;

    private List<ServiceFeeEvent> serviceFeeEventList;

    private List<DebtRecoveryEvent> debtRecoveryEventList;

    private List<LoanServicingEvent> loanServicingEventList;

    private List<AdjustmentEvent> adjustmentEventList;

    /**
     * Get the value of ShipmentEventList.
     *
     * @return The value of ShipmentEventList.
     */
    public List<ShipmentEvent> getShipmentEventList() {
        if (shipmentEventList==null) {
            shipmentEventList = new ArrayList<ShipmentEvent>();
        }
        return shipmentEventList;
    }

    /**
     * Set the value of ShipmentEventList.
     *
     * @param shipmentEventList
     *            The new value to set.
     */
    public void setShipmentEventList(List<ShipmentEvent> shipmentEventList) {
        this.shipmentEventList = shipmentEventList;
    }

    /**
     * Clear ShipmentEventList.
     */
    public void unsetShipmentEventList() {
        this.shipmentEventList = null;
    }

    /**
     * Check to see if ShipmentEventList is set.
     *
     * @return true if ShipmentEventList is set.
     */
    public boolean isSetShipmentEventList() {
        return shipmentEventList != null && !shipmentEventList.isEmpty();
    }

    /**
     * Add values for ShipmentEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withShipmentEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getShipmentEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RefundEventList.
     *
     * @return The value of RefundEventList.
     */
    public List<ShipmentEvent> getRefundEventList() {
        if (refundEventList==null) {
            refundEventList = new ArrayList<ShipmentEvent>();
        }
        return refundEventList;
    }

    /**
     * Set the value of RefundEventList.
     *
     * @param refundEventList
     *            The new value to set.
     */
    public void setRefundEventList(List<ShipmentEvent> refundEventList) {
        this.refundEventList = refundEventList;
    }

    /**
     * Clear RefundEventList.
     */
    public void unsetRefundEventList() {
        this.refundEventList = null;
    }

    /**
     * Check to see if RefundEventList is set.
     *
     * @return true if RefundEventList is set.
     */
    public boolean isSetRefundEventList() {
        return refundEventList != null && !refundEventList.isEmpty();
    }

    /**
     * Add values for RefundEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withRefundEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getRefundEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of GuaranteeClaimEventList.
     *
     * @return The value of GuaranteeClaimEventList.
     */
    public List<ShipmentEvent> getGuaranteeClaimEventList() {
        if (guaranteeClaimEventList==null) {
            guaranteeClaimEventList = new ArrayList<ShipmentEvent>();
        }
        return guaranteeClaimEventList;
    }

    /**
     * Set the value of GuaranteeClaimEventList.
     *
     * @param guaranteeClaimEventList
     *            The new value to set.
     */
    public void setGuaranteeClaimEventList(List<ShipmentEvent> guaranteeClaimEventList) {
        this.guaranteeClaimEventList = guaranteeClaimEventList;
    }

    /**
     * Clear GuaranteeClaimEventList.
     */
    public void unsetGuaranteeClaimEventList() {
        this.guaranteeClaimEventList = null;
    }

    /**
     * Check to see if GuaranteeClaimEventList is set.
     *
     * @return true if GuaranteeClaimEventList is set.
     */
    public boolean isSetGuaranteeClaimEventList() {
        return guaranteeClaimEventList != null && !guaranteeClaimEventList.isEmpty();
    }

    /**
     * Add values for GuaranteeClaimEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withGuaranteeClaimEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getGuaranteeClaimEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ChargebackEventList.
     *
     * @return The value of ChargebackEventList.
     */
    public List<ShipmentEvent> getChargebackEventList() {
        if (chargebackEventList==null) {
            chargebackEventList = new ArrayList<ShipmentEvent>();
        }
        return chargebackEventList;
    }

    /**
     * Set the value of ChargebackEventList.
     *
     * @param chargebackEventList
     *            The new value to set.
     */
    public void setChargebackEventList(List<ShipmentEvent> chargebackEventList) {
        this.chargebackEventList = chargebackEventList;
    }

    /**
     * Clear ChargebackEventList.
     */
    public void unsetChargebackEventList() {
        this.chargebackEventList = null;
    }

    /**
     * Check to see if ChargebackEventList is set.
     *
     * @return true if ChargebackEventList is set.
     */
    public boolean isSetChargebackEventList() {
        return chargebackEventList != null && !chargebackEventList.isEmpty();
    }

    /**
     * Add values for ChargebackEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withChargebackEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getChargebackEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of PayWithAmazonEventList.
     *
     * @return The value of PayWithAmazonEventList.
     */
    public List<PayWithAmazonEvent> getPayWithAmazonEventList() {
        if (payWithAmazonEventList==null) {
            payWithAmazonEventList = new ArrayList<PayWithAmazonEvent>();
        }
        return payWithAmazonEventList;
    }

    /**
     * Set the value of PayWithAmazonEventList.
     *
     * @param payWithAmazonEventList
     *            The new value to set.
     */
    public void setPayWithAmazonEventList(List<PayWithAmazonEvent> payWithAmazonEventList) {
        this.payWithAmazonEventList = payWithAmazonEventList;
    }

    /**
     * Clear PayWithAmazonEventList.
     */
    public void unsetPayWithAmazonEventList() {
        this.payWithAmazonEventList = null;
    }

    /**
     * Check to see if PayWithAmazonEventList is set.
     *
     * @return true if PayWithAmazonEventList is set.
     */
    public boolean isSetPayWithAmazonEventList() {
        return payWithAmazonEventList != null && !payWithAmazonEventList.isEmpty();
    }

    /**
     * Add values for PayWithAmazonEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withPayWithAmazonEventList(PayWithAmazonEvent... values) {
        List<PayWithAmazonEvent> list = getPayWithAmazonEventList();
        for (PayWithAmazonEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ServiceProviderCreditEventList.
     *
     * @return The value of ServiceProviderCreditEventList.
     */
    public List<SolutionProviderCreditEvent> getServiceProviderCreditEventList() {
        if (serviceProviderCreditEventList==null) {
            serviceProviderCreditEventList = new ArrayList<SolutionProviderCreditEvent>();
        }
        return serviceProviderCreditEventList;
    }

    /**
     * Set the value of ServiceProviderCreditEventList.
     *
     * @param serviceProviderCreditEventList
     *            The new value to set.
     */
    public void setServiceProviderCreditEventList(List<SolutionProviderCreditEvent> serviceProviderCreditEventList) {
        this.serviceProviderCreditEventList = serviceProviderCreditEventList;
    }

    /**
     * Clear ServiceProviderCreditEventList.
     */
    public void unsetServiceProviderCreditEventList() {
        this.serviceProviderCreditEventList = null;
    }

    /**
     * Check to see if ServiceProviderCreditEventList is set.
     *
     * @return true if ServiceProviderCreditEventList is set.
     */
    public boolean isSetServiceProviderCreditEventList() {
        return serviceProviderCreditEventList != null && !serviceProviderCreditEventList.isEmpty();
    }

    /**
     * Add values for ServiceProviderCreditEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withServiceProviderCreditEventList(SolutionProviderCreditEvent... values) {
        List<SolutionProviderCreditEvent> list = getServiceProviderCreditEventList();
        for (SolutionProviderCreditEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RetrochargeEventList.
     *
     * @return The value of RetrochargeEventList.
     */
    public List<RetrochargeEvent> getRetrochargeEventList() {
        if (retrochargeEventList==null) {
            retrochargeEventList = new ArrayList<RetrochargeEvent>();
        }
        return retrochargeEventList;
    }

    /**
     * Set the value of RetrochargeEventList.
     *
     * @param retrochargeEventList
     *            The new value to set.
     */
    public void setRetrochargeEventList(List<RetrochargeEvent> retrochargeEventList) {
        this.retrochargeEventList = retrochargeEventList;
    }

    /**
     * Clear RetrochargeEventList.
     */
    public void unsetRetrochargeEventList() {
        this.retrochargeEventList = null;
    }

    /**
     * Check to see if RetrochargeEventList is set.
     *
     * @return true if RetrochargeEventList is set.
     */
    public boolean isSetRetrochargeEventList() {
        return retrochargeEventList != null && !retrochargeEventList.isEmpty();
    }

    /**
     * Add values for RetrochargeEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withRetrochargeEventList(RetrochargeEvent... values) {
        List<RetrochargeEvent> list = getRetrochargeEventList();
        for (RetrochargeEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RentalTransactionEventList.
     *
     * @return The value of RentalTransactionEventList.
     */
    public List<RentalTransactionEvent> getRentalTransactionEventList() {
        if (rentalTransactionEventList==null) {
            rentalTransactionEventList = new ArrayList<RentalTransactionEvent>();
        }
        return rentalTransactionEventList;
    }

    /**
     * Set the value of RentalTransactionEventList.
     *
     * @param rentalTransactionEventList
     *            The new value to set.
     */
    public void setRentalTransactionEventList(List<RentalTransactionEvent> rentalTransactionEventList) {
        this.rentalTransactionEventList = rentalTransactionEventList;
    }

    /**
     * Clear RentalTransactionEventList.
     */
    public void unsetRentalTransactionEventList() {
        this.rentalTransactionEventList = null;
    }

    /**
     * Check to see if RentalTransactionEventList is set.
     *
     * @return true if RentalTransactionEventList is set.
     */
    public boolean isSetRentalTransactionEventList() {
        return rentalTransactionEventList != null && !rentalTransactionEventList.isEmpty();
    }

    /**
     * Add values for RentalTransactionEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withRentalTransactionEventList(RentalTransactionEvent... values) {
        List<RentalTransactionEvent> list = getRentalTransactionEventList();
        for (RentalTransactionEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of PerformanceBondRefundEventList.
     *
     * @return The value of PerformanceBondRefundEventList.
     */
    public List<PerformanceBondRefundEvent> getPerformanceBondRefundEventList() {
        if (performanceBondRefundEventList==null) {
            performanceBondRefundEventList = new ArrayList<PerformanceBondRefundEvent>();
        }
        return performanceBondRefundEventList;
    }

    /**
     * Set the value of PerformanceBondRefundEventList.
     *
     * @param performanceBondRefundEventList
     *            The new value to set.
     */
    public void setPerformanceBondRefundEventList(List<PerformanceBondRefundEvent> performanceBondRefundEventList) {
        this.performanceBondRefundEventList = performanceBondRefundEventList;
    }

    /**
     * Clear PerformanceBondRefundEventList.
     */
    public void unsetPerformanceBondRefundEventList() {
        this.performanceBondRefundEventList = null;
    }

    /**
     * Check to see if PerformanceBondRefundEventList is set.
     *
     * @return true if PerformanceBondRefundEventList is set.
     */
    public boolean isSetPerformanceBondRefundEventList() {
        return performanceBondRefundEventList != null && !performanceBondRefundEventList.isEmpty();
    }

    /**
     * Add values for PerformanceBondRefundEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withPerformanceBondRefundEventList(PerformanceBondRefundEvent... values) {
        List<PerformanceBondRefundEvent> list = getPerformanceBondRefundEventList();
        for (PerformanceBondRefundEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ServiceFeeEventList.
     *
     * @return The value of ServiceFeeEventList.
     */
    public List<ServiceFeeEvent> getServiceFeeEventList() {
        if (serviceFeeEventList==null) {
            serviceFeeEventList = new ArrayList<ServiceFeeEvent>();
        }
        return serviceFeeEventList;
    }

    /**
     * Set the value of ServiceFeeEventList.
     *
     * @param serviceFeeEventList
     *            The new value to set.
     */
    public void setServiceFeeEventList(List<ServiceFeeEvent> serviceFeeEventList) {
        this.serviceFeeEventList = serviceFeeEventList;
    }

    /**
     * Clear ServiceFeeEventList.
     */
    public void unsetServiceFeeEventList() {
        this.serviceFeeEventList = null;
    }

    /**
     * Check to see if ServiceFeeEventList is set.
     *
     * @return true if ServiceFeeEventList is set.
     */
    public boolean isSetServiceFeeEventList() {
        return serviceFeeEventList != null && !serviceFeeEventList.isEmpty();
    }

    /**
     * Add values for ServiceFeeEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withServiceFeeEventList(ServiceFeeEvent... values) {
        List<ServiceFeeEvent> list = getServiceFeeEventList();
        for (ServiceFeeEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of DebtRecoveryEventList.
     *
     * @return The value of DebtRecoveryEventList.
     */
    public List<DebtRecoveryEvent> getDebtRecoveryEventList() {
        if (debtRecoveryEventList==null) {
            debtRecoveryEventList = new ArrayList<DebtRecoveryEvent>();
        }
        return debtRecoveryEventList;
    }

    /**
     * Set the value of DebtRecoveryEventList.
     *
     * @param debtRecoveryEventList
     *            The new value to set.
     */
    public void setDebtRecoveryEventList(List<DebtRecoveryEvent> debtRecoveryEventList) {
        this.debtRecoveryEventList = debtRecoveryEventList;
    }

    /**
     * Clear DebtRecoveryEventList.
     */
    public void unsetDebtRecoveryEventList() {
        this.debtRecoveryEventList = null;
    }

    /**
     * Check to see if DebtRecoveryEventList is set.
     *
     * @return true if DebtRecoveryEventList is set.
     */
    public boolean isSetDebtRecoveryEventList() {
        return debtRecoveryEventList != null && !debtRecoveryEventList.isEmpty();
    }

    /**
     * Add values for DebtRecoveryEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withDebtRecoveryEventList(DebtRecoveryEvent... values) {
        List<DebtRecoveryEvent> list = getDebtRecoveryEventList();
        for (DebtRecoveryEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of LoanServicingEventList.
     *
     * @return The value of LoanServicingEventList.
     */
    public List<LoanServicingEvent> getLoanServicingEventList() {
        if (loanServicingEventList==null) {
            loanServicingEventList = new ArrayList<LoanServicingEvent>();
        }
        return loanServicingEventList;
    }

    /**
     * Set the value of LoanServicingEventList.
     *
     * @param loanServicingEventList
     *            The new value to set.
     */
    public void setLoanServicingEventList(List<LoanServicingEvent> loanServicingEventList) {
        this.loanServicingEventList = loanServicingEventList;
    }

    /**
     * Clear LoanServicingEventList.
     */
    public void unsetLoanServicingEventList() {
        this.loanServicingEventList = null;
    }

    /**
     * Check to see if LoanServicingEventList is set.
     *
     * @return true if LoanServicingEventList is set.
     */
    public boolean isSetLoanServicingEventList() {
        return loanServicingEventList != null && !loanServicingEventList.isEmpty();
    }

    /**
     * Add values for LoanServicingEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withLoanServicingEventList(LoanServicingEvent... values) {
        List<LoanServicingEvent> list = getLoanServicingEventList();
        for (LoanServicingEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of AdjustmentEventList.
     *
     * @return The value of AdjustmentEventList.
     */
    public List<AdjustmentEvent> getAdjustmentEventList() {
        if (adjustmentEventList==null) {
            adjustmentEventList = new ArrayList<AdjustmentEvent>();
        }
        return adjustmentEventList;
    }

    /**
     * Set the value of AdjustmentEventList.
     *
     * @param adjustmentEventList
     *            The new value to set.
     */
    public void setAdjustmentEventList(List<AdjustmentEvent> adjustmentEventList) {
        this.adjustmentEventList = adjustmentEventList;
    }

    /**
     * Clear AdjustmentEventList.
     */
    public void unsetAdjustmentEventList() {
        this.adjustmentEventList = null;
    }

    /**
     * Check to see if AdjustmentEventList is set.
     *
     * @return true if AdjustmentEventList is set.
     */
    public boolean isSetAdjustmentEventList() {
        return adjustmentEventList != null && !adjustmentEventList.isEmpty();
    }

    /**
     * Add values for AdjustmentEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withAdjustmentEventList(AdjustmentEvent... values) {
        List<AdjustmentEvent> list = getAdjustmentEventList();
        for (AdjustmentEvent value : values) {
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
        shipmentEventList = r.readList("ShipmentEventList", "ShipmentEvent", ShipmentEvent.class);
        refundEventList = r.readList("RefundEventList", "ShipmentEvent", ShipmentEvent.class);
        guaranteeClaimEventList = r.readList("GuaranteeClaimEventList", "ShipmentEvent", ShipmentEvent.class);
        chargebackEventList = r.readList("ChargebackEventList", "ShipmentEvent", ShipmentEvent.class);
        payWithAmazonEventList = r.readList("PayWithAmazonEventList", "PayWithAmazonEvent", PayWithAmazonEvent.class);
        serviceProviderCreditEventList = r.readList("ServiceProviderCreditEventList", "SolutionProviderCreditEvent", SolutionProviderCreditEvent.class);
        retrochargeEventList = r.readList("RetrochargeEventList", "RetrochargeEvent", RetrochargeEvent.class);
        rentalTransactionEventList = r.readList("RentalTransactionEventList", "RentalTransactionEvent", RentalTransactionEvent.class);
        performanceBondRefundEventList = r.readList("PerformanceBondRefundEventList", "PerformanceBondRefundEvent", PerformanceBondRefundEvent.class);
        serviceFeeEventList = r.readList("ServiceFeeEventList", "ServiceFeeEvent", ServiceFeeEvent.class);
        debtRecoveryEventList = r.readList("DebtRecoveryEventList", "DebtRecoveryEvent", DebtRecoveryEvent.class);
        loanServicingEventList = r.readList("LoanServicingEventList", "LoanServicingEvent", LoanServicingEvent.class);
        adjustmentEventList = r.readList("AdjustmentEventList", "AdjustmentEvent", AdjustmentEvent.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("ShipmentEventList", "ShipmentEvent", shipmentEventList);
        w.writeList("RefundEventList", "ShipmentEvent", refundEventList);
        w.writeList("GuaranteeClaimEventList", "ShipmentEvent", guaranteeClaimEventList);
        w.writeList("ChargebackEventList", "ShipmentEvent", chargebackEventList);
        w.writeList("PayWithAmazonEventList", "PayWithAmazonEvent", payWithAmazonEventList);
        w.writeList("ServiceProviderCreditEventList", "SolutionProviderCreditEvent", serviceProviderCreditEventList);
        w.writeList("RetrochargeEventList", "RetrochargeEvent", retrochargeEventList);
        w.writeList("RentalTransactionEventList", "RentalTransactionEvent", rentalTransactionEventList);
        w.writeList("PerformanceBondRefundEventList", "PerformanceBondRefundEvent", performanceBondRefundEventList);
        w.writeList("ServiceFeeEventList", "ServiceFeeEvent", serviceFeeEventList);
        w.writeList("DebtRecoveryEventList", "DebtRecoveryEvent", debtRecoveryEventList);
        w.writeList("LoanServicingEventList", "LoanServicingEvent", loanServicingEventList);
        w.writeList("AdjustmentEventList", "AdjustmentEvent", adjustmentEventList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "FinancialEvents",this);
    }

    /** Value constructor. */
    public FinancialEvents(List<ShipmentEvent> shipmentEventList,List<ShipmentEvent> refundEventList,List<ShipmentEvent> guaranteeClaimEventList,List<ShipmentEvent> chargebackEventList,List<PayWithAmazonEvent> payWithAmazonEventList,List<SolutionProviderCreditEvent> serviceProviderCreditEventList,List<RetrochargeEvent> retrochargeEventList,List<RentalTransactionEvent> rentalTransactionEventList,List<PerformanceBondRefundEvent> performanceBondRefundEventList,List<ServiceFeeEvent> serviceFeeEventList,List<DebtRecoveryEvent> debtRecoveryEventList,List<LoanServicingEvent> loanServicingEventList,List<AdjustmentEvent> adjustmentEventList) {
        this.shipmentEventList = shipmentEventList;
        this.refundEventList = refundEventList;
        this.guaranteeClaimEventList = guaranteeClaimEventList;
        this.chargebackEventList = chargebackEventList;
        this.payWithAmazonEventList = payWithAmazonEventList;
        this.serviceProviderCreditEventList = serviceProviderCreditEventList;
        this.retrochargeEventList = retrochargeEventList;
        this.rentalTransactionEventList = rentalTransactionEventList;
        this.performanceBondRefundEventList = performanceBondRefundEventList;
        this.serviceFeeEventList = serviceFeeEventList;
        this.debtRecoveryEventList = debtRecoveryEventList;
        this.loanServicingEventList = loanServicingEventList;
        this.adjustmentEventList = adjustmentEventList;
    }    
    

    /** Default constructor. */
    public FinancialEvents() {
        super();
    }

}
