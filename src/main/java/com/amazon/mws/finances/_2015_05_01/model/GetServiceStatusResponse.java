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
 * Get Service Status Response
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.*;

/**
 * GetServiceStatusResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetServiceStatusResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetServiceStatusResult" type="{http://mws.amazonservices.com/Finances/2015-05-01}GetServiceStatusResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/Finances/2015-05-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class GetServiceStatusResponse extends AbstractMwsObject implements MWSResponse {

    private GetServiceStatusResult getServiceStatusResult;

    private ResponseMetadata responseMetadata;

    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetServiceStatusResult.
     *
     * @return The value of GetServiceStatusResult.
     */
    public GetServiceStatusResult getGetServiceStatusResult() {
        return getServiceStatusResult;
    }

    /**
     * Set the value of GetServiceStatusResult.
     *
     * @param getServiceStatusResult
     *            The new value to set.
     */
    public void setGetServiceStatusResult(GetServiceStatusResult getServiceStatusResult) {
        this.getServiceStatusResult = getServiceStatusResult;
    }

    /**
     * Check to see if GetServiceStatusResult is set.
     *
     * @return true if GetServiceStatusResult is set.
     */
    public boolean isSetGetServiceStatusResult() {
        return getServiceStatusResult != null;
    }

    /**
     * Set the value of GetServiceStatusResult, return this.
     *
     * @param getServiceStatusResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetServiceStatusResponse withGetServiceStatusResult(GetServiceStatusResult getServiceStatusResult) {
        this.getServiceStatusResult = getServiceStatusResult;
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetServiceStatusResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * Set the value of ResponseHeaderMetadata.
     *
     * @param responseHeaderMetadata
     *            The new value to set.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetServiceStatusResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
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
        getServiceStatusResult = r.read("GetServiceStatusResult", GetServiceStatusResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("GetServiceStatusResult", getServiceStatusResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "GetServiceStatusResponse",this);
    }

    /** Value constructor. */
    public GetServiceStatusResponse(GetServiceStatusResult getServiceStatusResult,ResponseMetadata responseMetadata) {
        this.getServiceStatusResult = getServiceStatusResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /** Default constructor. */
    public GetServiceStatusResponse() {
        super();
    }

}
