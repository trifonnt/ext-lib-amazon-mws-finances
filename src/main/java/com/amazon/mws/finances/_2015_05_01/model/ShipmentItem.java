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
 * Shipment Item
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * ShipmentItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ShipmentItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="OrderItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="OrderAdjustmentItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="QuantityShipped" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="ItemChargeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ItemChargeAdjustmentList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ItemFeeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ItemFeeAdjustmentList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PromotionList" type="{http://mws.amazonservices.com/Finances/2015-05-01}Promotion" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PromotionAdjustmentList" type="{http://mws.amazonservices.com/Finances/2015-05-01}Promotion" maxOccurs="unbounded"/&gt;
 *             &lt;element name="CostOfPointsGranted" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="CostOfPointsReturned" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ShipmentItem extends AbstractMwsObject {

    private String sellerSKU;

    private String orderItemId;

    private String orderAdjustmentItemId;

    private Integer quantityShipped;

    private List<ChargeComponent> itemChargeList;

    private List<ChargeComponent> itemChargeAdjustmentList;

    private List<FeeComponent> itemFeeList;

    private List<FeeComponent> itemFeeAdjustmentList;

    private List<Promotion> promotionList;

    private List<Promotion> promotionAdjustmentList;

    private Currency costOfPointsGranted;

    private Currency costOfPointsReturned;

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
    public ShipmentItem withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * Get the value of OrderItemId.
     *
     * @return The value of OrderItemId.
     */
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * Set the value of OrderItemId.
     *
     * @param orderItemId
     *            The new value to set.
     */
    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * Check to see if OrderItemId is set.
     *
     * @return true if OrderItemId is set.
     */
    public boolean isSetOrderItemId() {
        return orderItemId != null;
    }

    /**
     * Set the value of OrderItemId, return this.
     *
     * @param orderItemId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentItem withOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
        return this;
    }

    /**
     * Get the value of OrderAdjustmentItemId.
     *
     * @return The value of OrderAdjustmentItemId.
     */
    public String getOrderAdjustmentItemId() {
        return orderAdjustmentItemId;
    }

    /**
     * Set the value of OrderAdjustmentItemId.
     *
     * @param orderAdjustmentItemId
     *            The new value to set.
     */
    public void setOrderAdjustmentItemId(String orderAdjustmentItemId) {
        this.orderAdjustmentItemId = orderAdjustmentItemId;
    }

    /**
     * Check to see if OrderAdjustmentItemId is set.
     *
     * @return true if OrderAdjustmentItemId is set.
     */
    public boolean isSetOrderAdjustmentItemId() {
        return orderAdjustmentItemId != null;
    }

    /**
     * Set the value of OrderAdjustmentItemId, return this.
     *
     * @param orderAdjustmentItemId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentItem withOrderAdjustmentItemId(String orderAdjustmentItemId) {
        this.orderAdjustmentItemId = orderAdjustmentItemId;
        return this;
    }

    /**
     * Get the value of QuantityShipped.
     *
     * @return The value of QuantityShipped.
     */
    public Integer getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * Set the value of QuantityShipped.
     *
     * @param quantityShipped
     *            The new value to set.
     */
    public void setQuantityShipped(Integer quantityShipped) {
        this.quantityShipped = quantityShipped;
    }

    /**
     * Check to see if QuantityShipped is set.
     *
     * @return true if QuantityShipped is set.
     */
    public boolean isSetQuantityShipped() {
        return quantityShipped != null;
    }

    /**
     * Set the value of QuantityShipped, return this.
     *
     * @param quantityShipped
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentItem withQuantityShipped(Integer quantityShipped) {
        this.quantityShipped = quantityShipped;
        return this;
    }

    /**
     * Get the value of ItemChargeList.
     *
     * @return The value of ItemChargeList.
     */
    public List<ChargeComponent> getItemChargeList() {
        if (itemChargeList==null) {
            itemChargeList = new ArrayList<ChargeComponent>();
        }
        return itemChargeList;
    }

    /**
     * Set the value of ItemChargeList.
     *
     * @param itemChargeList
     *            The new value to set.
     */
    public void setItemChargeList(List<ChargeComponent> itemChargeList) {
        this.itemChargeList = itemChargeList;
    }

    /**
     * Clear ItemChargeList.
     */
    public void unsetItemChargeList() {
        this.itemChargeList = null;
    }

    /**
     * Check to see if ItemChargeList is set.
     *
     * @return true if ItemChargeList is set.
     */
    public boolean isSetItemChargeList() {
        return itemChargeList != null && !itemChargeList.isEmpty();
    }

    /**
     * Add values for ItemChargeList, return this.
     *
     * @param itemChargeList
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentItem withItemChargeList(ChargeComponent... values) {
        List<ChargeComponent> list = getItemChargeList();
        for (ChargeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ItemChargeAdjustmentList.
     *
     * @return The value of ItemChargeAdjustmentList.
     */
    public List<ChargeComponent> getItemChargeAdjustmentList() {
        if (itemChargeAdjustmentList==null) {
            itemChargeAdjustmentList = new ArrayList<ChargeComponent>();
        }
        return itemChargeAdjustmentList;
    }

    /**
     * Set the value of ItemChargeAdjustmentList.
     *
     * @param itemChargeAdjustmentList
     *            The new value to set.
     */
    public void setItemChargeAdjustmentList(List<ChargeComponent> itemChargeAdjustmentList) {
        this.itemChargeAdjustmentList = itemChargeAdjustmentList;
    }

    /**
     * Clear ItemChargeAdjustmentList.
     */
    public void unsetItemChargeAdjustmentList() {
        this.itemChargeAdjustmentList = null;
    }

    /**
     * Check to see if ItemChargeAdjustmentList is set.
     *
     * @return true if ItemChargeAdjustmentList is set.
     */
    public boolean isSetItemChargeAdjustmentList() {
        return itemChargeAdjustmentList != null && !itemChargeAdjustmentList.isEmpty();
    }

    /**
     * Add values for ItemChargeAdjustmentList, return this.
     *
     * @param itemChargeAdjustmentList
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentItem withItemChargeAdjustmentList(ChargeComponent... values) {
        List<ChargeComponent> list = getItemChargeAdjustmentList();
        for (ChargeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ItemFeeList.
     *
     * @return The value of ItemFeeList.
     */
    public List<FeeComponent> getItemFeeList() {
        if (itemFeeList==null) {
            itemFeeList = new ArrayList<FeeComponent>();
        }
        return itemFeeList;
    }

    /**
     * Set the value of ItemFeeList.
     *
     * @param itemFeeList
     *            The new value to set.
     */
    public void setItemFeeList(List<FeeComponent> itemFeeList) {
        this.itemFeeList = itemFeeList;
    }

    /**
     * Clear ItemFeeList.
     */
    public void unsetItemFeeList() {
        this.itemFeeList = null;
    }

    /**
     * Check to see if ItemFeeList is set.
     *
     * @return true if ItemFeeList is set.
     */
    public boolean isSetItemFeeList() {
        return itemFeeList != null && !itemFeeList.isEmpty();
    }

    /**
     * Add values for ItemFeeList, return this.
     *
     * @param itemFeeList
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentItem withItemFeeList(FeeComponent... values) {
        List<FeeComponent> list = getItemFeeList();
        for (FeeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ItemFeeAdjustmentList.
     *
     * @return The value of ItemFeeAdjustmentList.
     */
    public List<FeeComponent> getItemFeeAdjustmentList() {
        if (itemFeeAdjustmentList==null) {
            itemFeeAdjustmentList = new ArrayList<FeeComponent>();
        }
        return itemFeeAdjustmentList;
    }

    /**
     * Set the value of ItemFeeAdjustmentList.
     *
     * @param itemFeeAdjustmentList
     *            The new value to set.
     */
    public void setItemFeeAdjustmentList(List<FeeComponent> itemFeeAdjustmentList) {
        this.itemFeeAdjustmentList = itemFeeAdjustmentList;
    }

    /**
     * Clear ItemFeeAdjustmentList.
     */
    public void unsetItemFeeAdjustmentList() {
        this.itemFeeAdjustmentList = null;
    }

    /**
     * Check to see if ItemFeeAdjustmentList is set.
     *
     * @return true if ItemFeeAdjustmentList is set.
     */
    public boolean isSetItemFeeAdjustmentList() {
        return itemFeeAdjustmentList != null && !itemFeeAdjustmentList.isEmpty();
    }

    /**
     * Add values for ItemFeeAdjustmentList, return this.
     *
     * @param itemFeeAdjustmentList
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentItem withItemFeeAdjustmentList(FeeComponent... values) {
        List<FeeComponent> list = getItemFeeAdjustmentList();
        for (FeeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of PromotionList.
     *
     * @return The value of PromotionList.
     */
    public List<Promotion> getPromotionList() {
        if (promotionList==null) {
            promotionList = new ArrayList<Promotion>();
        }
        return promotionList;
    }

    /**
     * Set the value of PromotionList.
     *
     * @param promotionList
     *            The new value to set.
     */
    public void setPromotionList(List<Promotion> promotionList) {
        this.promotionList = promotionList;
    }

    /**
     * Clear PromotionList.
     */
    public void unsetPromotionList() {
        this.promotionList = null;
    }

    /**
     * Check to see if PromotionList is set.
     *
     * @return true if PromotionList is set.
     */
    public boolean isSetPromotionList() {
        return promotionList != null && !promotionList.isEmpty();
    }

    /**
     * Add values for PromotionList, return this.
     *
     * @param promotionList
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentItem withPromotionList(Promotion... values) {
        List<Promotion> list = getPromotionList();
        for (Promotion value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of PromotionAdjustmentList.
     *
     * @return The value of PromotionAdjustmentList.
     */
    public List<Promotion> getPromotionAdjustmentList() {
        if (promotionAdjustmentList==null) {
            promotionAdjustmentList = new ArrayList<Promotion>();
        }
        return promotionAdjustmentList;
    }

    /**
     * Set the value of PromotionAdjustmentList.
     *
     * @param promotionAdjustmentList
     *            The new value to set.
     */
    public void setPromotionAdjustmentList(List<Promotion> promotionAdjustmentList) {
        this.promotionAdjustmentList = promotionAdjustmentList;
    }

    /**
     * Clear PromotionAdjustmentList.
     */
    public void unsetPromotionAdjustmentList() {
        this.promotionAdjustmentList = null;
    }

    /**
     * Check to see if PromotionAdjustmentList is set.
     *
     * @return true if PromotionAdjustmentList is set.
     */
    public boolean isSetPromotionAdjustmentList() {
        return promotionAdjustmentList != null && !promotionAdjustmentList.isEmpty();
    }

    /**
     * Add values for PromotionAdjustmentList, return this.
     *
     * @param promotionAdjustmentList
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentItem withPromotionAdjustmentList(Promotion... values) {
        List<Promotion> list = getPromotionAdjustmentList();
        for (Promotion value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of CostOfPointsGranted.
     *
     * @return The value of CostOfPointsGranted.
     */
    public Currency getCostOfPointsGranted() {
        return costOfPointsGranted;
    }

    /**
     * Set the value of CostOfPointsGranted.
     *
     * @param costOfPointsGranted
     *            The new value to set.
     */
    public void setCostOfPointsGranted(Currency costOfPointsGranted) {
        this.costOfPointsGranted = costOfPointsGranted;
    }

    /**
     * Check to see if CostOfPointsGranted is set.
     *
     * @return true if CostOfPointsGranted is set.
     */
    public boolean isSetCostOfPointsGranted() {
        return costOfPointsGranted != null;
    }

    /**
     * Set the value of CostOfPointsGranted, return this.
     *
     * @param costOfPointsGranted
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentItem withCostOfPointsGranted(Currency costOfPointsGranted) {
        this.costOfPointsGranted = costOfPointsGranted;
        return this;
    }

    /**
     * Get the value of CostOfPointsReturned.
     *
     * @return The value of CostOfPointsReturned.
     */
    public Currency getCostOfPointsReturned() {
        return costOfPointsReturned;
    }

    /**
     * Set the value of CostOfPointsReturned.
     *
     * @param costOfPointsReturned
     *            The new value to set.
     */
    public void setCostOfPointsReturned(Currency costOfPointsReturned) {
        this.costOfPointsReturned = costOfPointsReturned;
    }

    /**
     * Check to see if CostOfPointsReturned is set.
     *
     * @return true if CostOfPointsReturned is set.
     */
    public boolean isSetCostOfPointsReturned() {
        return costOfPointsReturned != null;
    }

    /**
     * Set the value of CostOfPointsReturned, return this.
     *
     * @param costOfPointsReturned
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentItem withCostOfPointsReturned(Currency costOfPointsReturned) {
        this.costOfPointsReturned = costOfPointsReturned;
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
        sellerSKU = r.read("SellerSKU", String.class);
        orderItemId = r.read("OrderItemId", String.class);
        orderAdjustmentItemId = r.read("OrderAdjustmentItemId", String.class);
        quantityShipped = r.read("QuantityShipped", Integer.class);
        itemChargeList = r.readList("ItemChargeList", "ChargeComponent", ChargeComponent.class);
        itemChargeAdjustmentList = r.readList("ItemChargeAdjustmentList", "ChargeComponent", ChargeComponent.class);
        itemFeeList = r.readList("ItemFeeList", "FeeComponent", FeeComponent.class);
        itemFeeAdjustmentList = r.readList("ItemFeeAdjustmentList", "FeeComponent", FeeComponent.class);
        promotionList = r.readList("PromotionList", "Promotion", Promotion.class);
        promotionAdjustmentList = r.readList("PromotionAdjustmentList", "Promotion", Promotion.class);
        costOfPointsGranted = r.read("CostOfPointsGranted", Currency.class);
        costOfPointsReturned = r.read("CostOfPointsReturned", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerSKU", sellerSKU);
        w.write("OrderItemId", orderItemId);
        w.write("OrderAdjustmentItemId", orderAdjustmentItemId);
        w.write("QuantityShipped", quantityShipped);
        w.writeList("ItemChargeList", "ChargeComponent", itemChargeList);
        w.writeList("ItemChargeAdjustmentList", "ChargeComponent", itemChargeAdjustmentList);
        w.writeList("ItemFeeList", "FeeComponent", itemFeeList);
        w.writeList("ItemFeeAdjustmentList", "FeeComponent", itemFeeAdjustmentList);
        w.writeList("PromotionList", "Promotion", promotionList);
        w.writeList("PromotionAdjustmentList", "Promotion", promotionAdjustmentList);
        w.write("CostOfPointsGranted", costOfPointsGranted);
        w.write("CostOfPointsReturned", costOfPointsReturned);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "ShipmentItem",this);
    }

    /** Value constructor. */
    public ShipmentItem(String sellerSKU,String orderItemId,String orderAdjustmentItemId,Integer quantityShipped,List<ChargeComponent> itemChargeList,List<ChargeComponent> itemChargeAdjustmentList,List<FeeComponent> itemFeeList,List<FeeComponent> itemFeeAdjustmentList,List<Promotion> promotionList,List<Promotion> promotionAdjustmentList,Currency costOfPointsGranted,Currency costOfPointsReturned) {
        this.sellerSKU = sellerSKU;
        this.orderItemId = orderItemId;
        this.orderAdjustmentItemId = orderAdjustmentItemId;
        this.quantityShipped = quantityShipped;
        this.itemChargeList = itemChargeList;
        this.itemChargeAdjustmentList = itemChargeAdjustmentList;
        this.itemFeeList = itemFeeList;
        this.itemFeeAdjustmentList = itemFeeAdjustmentList;
        this.promotionList = promotionList;
        this.promotionAdjustmentList = promotionAdjustmentList;
        this.costOfPointsGranted = costOfPointsGranted;
        this.costOfPointsReturned = costOfPointsReturned;
    }    
    

    /** Default constructor. */
    public ShipmentItem() {
        super();
    }

}
