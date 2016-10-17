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
 * Shipment Event
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
 * ShipmentEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ShipmentEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="OrderChargeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="OrderChargeAdjustmentList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ShipmentFeeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ShipmentFeeAdjustmentList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="OrderFeeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="OrderFeeAdjustmentList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="DirectPaymentList" type="{http://mws.amazonservices.com/Finances/2015-05-01}DirectPayment" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentItemList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentItem" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ShipmentItemAdjustmentList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentItem" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ShipmentEvent extends AbstractMwsObject {

    private String amazonOrderId;

    private String sellerOrderId;

    private String marketplaceName;

    private List<ChargeComponent> orderChargeList;

    private List<ChargeComponent> orderChargeAdjustmentList;

    private List<FeeComponent> shipmentFeeList;

    private List<FeeComponent> shipmentFeeAdjustmentList;

    private List<FeeComponent> orderFeeList;

    private List<FeeComponent> orderFeeAdjustmentList;

    private List<DirectPayment> directPaymentList;

    private XMLGregorianCalendar postedDate;

    private List<ShipmentItem> shipmentItemList;

    private List<ShipmentItem> shipmentItemAdjustmentList;

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
    public ShipmentEvent withAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
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
    public ShipmentEvent withSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
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
    public ShipmentEvent withMarketplaceName(String marketplaceName) {
        this.marketplaceName = marketplaceName;
        return this;
    }

    /**
     * Get the value of OrderChargeList.
     *
     * @return The value of OrderChargeList.
     */
    public List<ChargeComponent> getOrderChargeList() {
        if (orderChargeList==null) {
            orderChargeList = new ArrayList<ChargeComponent>();
        }
        return orderChargeList;
    }

    /**
     * Set the value of OrderChargeList.
     *
     * @param orderChargeList
     *            The new value to set.
     */
    public void setOrderChargeList(List<ChargeComponent> orderChargeList) {
        this.orderChargeList = orderChargeList;
    }

    /**
     * Clear OrderChargeList.
     */
    public void unsetOrderChargeList() {
        this.orderChargeList = null;
    }

    /**
     * Check to see if OrderChargeList is set.
     *
     * @return true if OrderChargeList is set.
     */
    public boolean isSetOrderChargeList() {
        return orderChargeList != null && !orderChargeList.isEmpty();
    }

    /**
     * Add values for OrderChargeList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentEvent withOrderChargeList(ChargeComponent... values) {
        List<ChargeComponent> list = getOrderChargeList();
        for (ChargeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of OrderChargeAdjustmentList.
     *
     * @return The value of OrderChargeAdjustmentList.
     */
    public List<ChargeComponent> getOrderChargeAdjustmentList() {
        if (orderChargeAdjustmentList==null) {
            orderChargeAdjustmentList = new ArrayList<ChargeComponent>();
        }
        return orderChargeAdjustmentList;
    }

    /**
     * Set the value of OrderChargeAdjustmentList.
     *
     * @param orderChargeAdjustmentList
     *            The new value to set.
     */
    public void setOrderChargeAdjustmentList(List<ChargeComponent> orderChargeAdjustmentList) {
        this.orderChargeAdjustmentList = orderChargeAdjustmentList;
    }

    /**
     * Clear OrderChargeAdjustmentList.
     */
    public void unsetOrderChargeAdjustmentList() {
        this.orderChargeAdjustmentList = null;
    }

    /**
     * Check to see if OrderChargeAdjustmentList is set.
     *
     * @return true if OrderChargeAdjustmentList is set.
     */
    public boolean isSetOrderChargeAdjustmentList() {
        return orderChargeAdjustmentList != null && !orderChargeAdjustmentList.isEmpty();
    }

    /**
     * Add values for OrderChargeAdjustmentList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentEvent withOrderChargeAdjustmentList(ChargeComponent... values) {
        List<ChargeComponent> list = getOrderChargeAdjustmentList();
        for (ChargeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ShipmentFeeList.
     *
     * @return The value of ShipmentFeeList.
     */
    public List<FeeComponent> getShipmentFeeList() {
        if (shipmentFeeList==null) {
            shipmentFeeList = new ArrayList<FeeComponent>();
        }
        return shipmentFeeList;
    }

    /**
     * Set the value of ShipmentFeeList.
     *
     * @param shipmentFeeList
     *            The new value to set.
     */
    public void setShipmentFeeList(List<FeeComponent> shipmentFeeList) {
        this.shipmentFeeList = shipmentFeeList;
    }

    /**
     * Clear ShipmentFeeList.
     */
    public void unsetShipmentFeeList() {
        this.shipmentFeeList = null;
    }

    /**
     * Check to see if ShipmentFeeList is set.
     *
     * @return true if ShipmentFeeList is set.
     */
    public boolean isSetShipmentFeeList() {
        return shipmentFeeList != null && !shipmentFeeList.isEmpty();
    }

    /**
     * Add values for ShipmentFeeList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentEvent withShipmentFeeList(FeeComponent... values) {
        List<FeeComponent> list = getShipmentFeeList();
        for (FeeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ShipmentFeeAdjustmentList.
     *
     * @return The value of ShipmentFeeAdjustmentList.
     */
    public List<FeeComponent> getShipmentFeeAdjustmentList() {
        if (shipmentFeeAdjustmentList==null) {
            shipmentFeeAdjustmentList = new ArrayList<FeeComponent>();
        }
        return shipmentFeeAdjustmentList;
    }

    /**
     * Set the value of ShipmentFeeAdjustmentList.
     *
     * @param shipmentFeeAdjustmentList
     *            The new value to set.
     */
    public void setShipmentFeeAdjustmentList(List<FeeComponent> shipmentFeeAdjustmentList) {
        this.shipmentFeeAdjustmentList = shipmentFeeAdjustmentList;
    }

    /**
     * Clear ShipmentFeeAdjustmentList.
     */
    public void unsetShipmentFeeAdjustmentList() {
        this.shipmentFeeAdjustmentList = null;
    }

    /**
     * Check to see if ShipmentFeeAdjustmentList is set.
     *
     * @return true if ShipmentFeeAdjustmentList is set.
     */
    public boolean isSetShipmentFeeAdjustmentList() {
        return shipmentFeeAdjustmentList != null && !shipmentFeeAdjustmentList.isEmpty();
    }

    /**
     * Add values for ShipmentFeeAdjustmentList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentEvent withShipmentFeeAdjustmentList(FeeComponent... values) {
        List<FeeComponent> list = getShipmentFeeAdjustmentList();
        for (FeeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of OrderFeeList.
     *
     * @return The value of OrderFeeList.
     */
    public List<FeeComponent> getOrderFeeList() {
        if (orderFeeList==null) {
            orderFeeList = new ArrayList<FeeComponent>();
        }
        return orderFeeList;
    }

    /**
     * Set the value of OrderFeeList.
     *
     * @param orderFeeList
     *            The new value to set.
     */
    public void setOrderFeeList(List<FeeComponent> orderFeeList) {
        this.orderFeeList = orderFeeList;
    }

    /**
     * Clear OrderFeeList.
     */
    public void unsetOrderFeeList() {
        this.orderFeeList = null;
    }

    /**
     * Check to see if OrderFeeList is set.
     *
     * @return true if OrderFeeList is set.
     */
    public boolean isSetOrderFeeList() {
        return orderFeeList != null && !orderFeeList.isEmpty();
    }

    /**
     * Add values for OrderFeeList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentEvent withOrderFeeList(FeeComponent... values) {
        List<FeeComponent> list = getOrderFeeList();
        for (FeeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of OrderFeeAdjustmentList.
     *
     * @return The value of OrderFeeAdjustmentList.
     */
    public List<FeeComponent> getOrderFeeAdjustmentList() {
        if (orderFeeAdjustmentList==null) {
            orderFeeAdjustmentList = new ArrayList<FeeComponent>();
        }
        return orderFeeAdjustmentList;
    }

    /**
     * Set the value of OrderFeeAdjustmentList.
     *
     * @param orderFeeAdjustmentList
     *            The new value to set.
     */
    public void setOrderFeeAdjustmentList(List<FeeComponent> orderFeeAdjustmentList) {
        this.orderFeeAdjustmentList = orderFeeAdjustmentList;
    }

    /**
     * Clear OrderFeeAdjustmentList.
     */
    public void unsetOrderFeeAdjustmentList() {
        this.orderFeeAdjustmentList = null;
    }

    /**
     * Check to see if OrderFeeAdjustmentList is set.
     *
     * @return true if OrderFeeAdjustmentList is set.
     */
    public boolean isSetOrderFeeAdjustmentList() {
        return orderFeeAdjustmentList != null && !orderFeeAdjustmentList.isEmpty();
    }

    /**
     * Add values for OrderFeeAdjustmentList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentEvent withOrderFeeAdjustmentList(FeeComponent... values) {
        List<FeeComponent> list = getOrderFeeAdjustmentList();
        for (FeeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of DirectPaymentList.
     *
     * @return The value of DirectPaymentList.
     */
    public List<DirectPayment> getDirectPaymentList() {
        if (directPaymentList==null) {
            directPaymentList = new ArrayList<DirectPayment>();
        }
        return directPaymentList;
    }

    /**
     * Set the value of DirectPaymentList.
     *
     * @param directPaymentList
     *            The new value to set.
     */
    public void setDirectPaymentList(List<DirectPayment> directPaymentList) {
        this.directPaymentList = directPaymentList;
    }

    /**
     * Clear DirectPaymentList.
     */
    public void unsetDirectPaymentList() {
        this.directPaymentList = null;
    }

    /**
     * Check to see if DirectPaymentList is set.
     *
     * @return true if DirectPaymentList is set.
     */
    public boolean isSetDirectPaymentList() {
        return directPaymentList != null && !directPaymentList.isEmpty();
    }

    /**
     * Add values for DirectPaymentList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentEvent withDirectPaymentList(DirectPayment... values) {
        List<DirectPayment> list = getDirectPaymentList();
        for (DirectPayment value : values) {
            list.add(value);
        }
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
    public ShipmentEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of ShipmentItemList.
     *
     * @return The value of ShipmentItemList.
     */
    public List<ShipmentItem> getShipmentItemList() {
        if (shipmentItemList==null) {
            shipmentItemList = new ArrayList<ShipmentItem>();
        }
        return shipmentItemList;
    }

    /**
     * Set the value of ShipmentItemList.
     *
     * @param shipmentItemList
     *            The new value to set.
     */
    public void setShipmentItemList(List<ShipmentItem> shipmentItemList) {
        this.shipmentItemList = shipmentItemList;
    }

    /**
     * Clear ShipmentItemList.
     */
    public void unsetShipmentItemList() {
        this.shipmentItemList = null;
    }

    /**
     * Check to see if ShipmentItemList is set.
     *
     * @return true if ShipmentItemList is set.
     */
    public boolean isSetShipmentItemList() {
        return shipmentItemList != null && !shipmentItemList.isEmpty();
    }

    /**
     * Add values for ShipmentItemList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentEvent withShipmentItemList(ShipmentItem... values) {
        List<ShipmentItem> list = getShipmentItemList();
        for (ShipmentItem value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ShipmentItemAdjustmentList.
     *
     * @return The value of ShipmentItemAdjustmentList.
     */
    public List<ShipmentItem> getShipmentItemAdjustmentList() {
        if (shipmentItemAdjustmentList==null) {
            shipmentItemAdjustmentList = new ArrayList<ShipmentItem>();
        }
        return shipmentItemAdjustmentList;
    }

    /**
     * Set the value of ShipmentItemAdjustmentList.
     *
     * @param shipmentItemAdjustmentList
     *            The new value to set.
     */
    public void setShipmentItemAdjustmentList(List<ShipmentItem> shipmentItemAdjustmentList) {
        this.shipmentItemAdjustmentList = shipmentItemAdjustmentList;
    }

    /**
     * Clear ShipmentItemAdjustmentList.
     */
    public void unsetShipmentItemAdjustmentList() {
        this.shipmentItemAdjustmentList = null;
    }

    /**
     * Check to see if ShipmentItemAdjustmentList is set.
     *
     * @return true if ShipmentItemAdjustmentList is set.
     */
    public boolean isSetShipmentItemAdjustmentList() {
        return shipmentItemAdjustmentList != null && !shipmentItemAdjustmentList.isEmpty();
    }

    /**
     * Add values for ShipmentItemAdjustmentList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentEvent withShipmentItemAdjustmentList(ShipmentItem... values) {
        List<ShipmentItem> list = getShipmentItemAdjustmentList();
        for (ShipmentItem value : values) {
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
        amazonOrderId = r.read("AmazonOrderId", String.class);
        sellerOrderId = r.read("SellerOrderId", String.class);
        marketplaceName = r.read("MarketplaceName", String.class);
        orderChargeList = r.readList("OrderChargeList", "ChargeComponent", ChargeComponent.class);
        orderChargeAdjustmentList = r.readList("OrderChargeAdjustmentList", "ChargeComponent", ChargeComponent.class);
        shipmentFeeList = r.readList("ShipmentFeeList", "FeeComponent", FeeComponent.class);
        shipmentFeeAdjustmentList = r.readList("ShipmentFeeAdjustmentList", "FeeComponent", FeeComponent.class);
        orderFeeList = r.readList("OrderFeeList", "FeeComponent", FeeComponent.class);
        orderFeeAdjustmentList = r.readList("OrderFeeAdjustmentList", "FeeComponent", FeeComponent.class);
        directPaymentList = r.readList("DirectPaymentList", "DirectPayment", DirectPayment.class);
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
        shipmentItemList = r.readList("ShipmentItemList", "ShipmentItem", ShipmentItem.class);
        shipmentItemAdjustmentList = r.readList("ShipmentItemAdjustmentList", "ShipmentItem", ShipmentItem.class);
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
        w.write("SellerOrderId", sellerOrderId);
        w.write("MarketplaceName", marketplaceName);
        w.writeList("OrderChargeList", "ChargeComponent", orderChargeList);
        w.writeList("OrderChargeAdjustmentList", "ChargeComponent", orderChargeAdjustmentList);
        w.writeList("ShipmentFeeList", "FeeComponent", shipmentFeeList);
        w.writeList("ShipmentFeeAdjustmentList", "FeeComponent", shipmentFeeAdjustmentList);
        w.writeList("OrderFeeList", "FeeComponent", orderFeeList);
        w.writeList("OrderFeeAdjustmentList", "FeeComponent", orderFeeAdjustmentList);
        w.writeList("DirectPaymentList", "DirectPayment", directPaymentList);
        w.write("PostedDate", postedDate);
        w.writeList("ShipmentItemList", "ShipmentItem", shipmentItemList);
        w.writeList("ShipmentItemAdjustmentList", "ShipmentItem", shipmentItemAdjustmentList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "ShipmentEvent",this);
    }

    /** Value constructor. */
    public ShipmentEvent(String amazonOrderId,String sellerOrderId,String marketplaceName,List<ChargeComponent> orderChargeList,List<ChargeComponent> orderChargeAdjustmentList,List<FeeComponent> shipmentFeeList,List<FeeComponent> shipmentFeeAdjustmentList,List<FeeComponent> orderFeeList,List<FeeComponent> orderFeeAdjustmentList,List<DirectPayment> directPaymentList,XMLGregorianCalendar postedDate,List<ShipmentItem> shipmentItemList,List<ShipmentItem> shipmentItemAdjustmentList) {
        this.amazonOrderId = amazonOrderId;
        this.sellerOrderId = sellerOrderId;
        this.marketplaceName = marketplaceName;
        this.orderChargeList = orderChargeList;
        this.orderChargeAdjustmentList = orderChargeAdjustmentList;
        this.shipmentFeeList = shipmentFeeList;
        this.shipmentFeeAdjustmentList = shipmentFeeAdjustmentList;
        this.orderFeeList = orderFeeList;
        this.orderFeeAdjustmentList = orderFeeAdjustmentList;
        this.directPaymentList = directPaymentList;
        this.postedDate = postedDate;
        this.shipmentItemList = shipmentItemList;
        this.shipmentItemAdjustmentList = shipmentItemAdjustmentList;
    }    
    

    /** Default constructor. */
    public ShipmentEvent() {
        super();
    }

}
