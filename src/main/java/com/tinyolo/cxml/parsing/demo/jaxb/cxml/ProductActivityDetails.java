//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:07:34 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.cxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemIDOrResourceID",
    "description",
    "classification",
    "serialNumberInfo",
    "forecastDetails",
    "leadTime",
    "plannedAcceptanceDays",
    "manufacturerPartID",
    "manufacturerName",
    "referenceDocumentInfo",
    "characteristic",
    "batch",
    "contact",
    "unitPrice",
    "inventory",
    "consignmentInventory",
    "timeSeries",
    "planningTimeSeries",
    "inventoryTimeSeries",
    "consignmentMovement",
    "salesReport",
    "unitOfMeasure",
    "extrinsic"
})
@XmlRootElement(name = "ProductActivityDetails")
public class ProductActivityDetails {

    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlElements({
        @XmlElement(name = "ItemID", required = true, type = ItemID.class),
        @XmlElement(name = "ResourceID", required = true, type = ResourceID.class)
    })
    protected List<Object> itemIDOrResourceID;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "Classification")
    protected List<Classification> classification;
    @XmlElement(name = "SerialNumberInfo")
    protected SerialNumberInfo serialNumberInfo;
    @XmlElement(name = "ForecastDetails")
    protected ForecastDetails forecastDetails;
    @XmlElement(name = "LeadTime")
    protected String leadTime;
    @XmlElement(name = "PlannedAcceptanceDays")
    protected String plannedAcceptanceDays;
    @XmlElement(name = "ManufacturerPartID")
    protected String manufacturerPartID;
    @XmlElement(name = "ManufacturerName")
    protected ManufacturerName manufacturerName;
    @XmlElement(name = "ReferenceDocumentInfo")
    protected List<ReferenceDocumentInfo> referenceDocumentInfo;
    @XmlElement(name = "Characteristic")
    protected List<Characteristic> characteristic;
    @XmlElement(name = "Batch")
    protected Batch batch;
    @XmlElement(name = "Contact")
    protected List<Contact> contact;
    @XmlElement(name = "UnitPrice")
    protected UnitPrice unitPrice;
    @XmlElement(name = "Inventory")
    protected Inventory inventory;
    @XmlElement(name = "ConsignmentInventory")
    protected ConsignmentInventory consignmentInventory;
    @XmlElement(name = "TimeSeries")
    protected List<TimeSeries> timeSeries;
    @XmlElement(name = "PlanningTimeSeries")
    protected List<PlanningTimeSeries> planningTimeSeries;
    @XmlElement(name = "InventoryTimeSeries")
    protected List<InventoryTimeSeries> inventoryTimeSeries;
    @XmlElement(name = "ConsignmentMovement")
    protected List<ConsignmentMovement> consignmentMovement;
    @XmlElement(name = "SalesReport")
    protected SalesReport salesReport;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "Extrinsic")
    protected List<Extrinsic> extrinsic;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the itemIDOrResourceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemIDOrResourceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemIDOrResourceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemID }
     * {@link ResourceID }
     * 
     * 
     */
    public List<Object> getItemIDOrResourceID() {
        if (itemIDOrResourceID == null) {
            itemIDOrResourceID = new ArrayList<Object>();
        }
        return this.itemIDOrResourceID;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Classification }
     * 
     * 
     */
    public List<Classification> getClassification() {
        if (classification == null) {
            classification = new ArrayList<Classification>();
        }
        return this.classification;
    }

    /**
     * Gets the value of the serialNumberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SerialNumberInfo }
     *     
     */
    public SerialNumberInfo getSerialNumberInfo() {
        return serialNumberInfo;
    }

    /**
     * Sets the value of the serialNumberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialNumberInfo }
     *     
     */
    public void setSerialNumberInfo(SerialNumberInfo value) {
        this.serialNumberInfo = value;
    }

    /**
     * Gets the value of the forecastDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastDetails }
     *     
     */
    public ForecastDetails getForecastDetails() {
        return forecastDetails;
    }

    /**
     * Sets the value of the forecastDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastDetails }
     *     
     */
    public void setForecastDetails(ForecastDetails value) {
        this.forecastDetails = value;
    }

    /**
     * Gets the value of the leadTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadTime() {
        return leadTime;
    }

    /**
     * Sets the value of the leadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadTime(String value) {
        this.leadTime = value;
    }

    /**
     * Gets the value of the plannedAcceptanceDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedAcceptanceDays() {
        return plannedAcceptanceDays;
    }

    /**
     * Sets the value of the plannedAcceptanceDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedAcceptanceDays(String value) {
        this.plannedAcceptanceDays = value;
    }

    /**
     * Gets the value of the manufacturerPartID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerPartID() {
        return manufacturerPartID;
    }

    /**
     * Sets the value of the manufacturerPartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerPartID(String value) {
        this.manufacturerPartID = value;
    }

    /**
     * Gets the value of the manufacturerName property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturerName }
     *     
     */
    public ManufacturerName getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Sets the value of the manufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturerName }
     *     
     */
    public void setManufacturerName(ManufacturerName value) {
        this.manufacturerName = value;
    }

    /**
     * Gets the value of the referenceDocumentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceDocumentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceDocumentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceDocumentInfo }
     * 
     * 
     */
    public List<ReferenceDocumentInfo> getReferenceDocumentInfo() {
        if (referenceDocumentInfo == null) {
            referenceDocumentInfo = new ArrayList<ReferenceDocumentInfo>();
        }
        return this.referenceDocumentInfo;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Characteristic }
     * 
     * 
     */
    public List<Characteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<Characteristic>();
        }
        return this.characteristic;
    }

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link Batch }
     *     
     */
    public Batch getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Batch }
     *     
     */
    public void setBatch(Batch value) {
        this.batch = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice }
     *     
     */
    public UnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice }
     *     
     */
    public void setUnitPrice(UnitPrice value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link Inventory }
     *     
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inventory }
     *     
     */
    public void setInventory(Inventory value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the consignmentInventory property.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentInventory }
     *     
     */
    public ConsignmentInventory getConsignmentInventory() {
        return consignmentInventory;
    }

    /**
     * Sets the value of the consignmentInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentInventory }
     *     
     */
    public void setConsignmentInventory(ConsignmentInventory value) {
        this.consignmentInventory = value;
    }

    /**
     * Gets the value of the timeSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSeries }
     * 
     * 
     */
    public List<TimeSeries> getTimeSeries() {
        if (timeSeries == null) {
            timeSeries = new ArrayList<TimeSeries>();
        }
        return this.timeSeries;
    }

    /**
     * Gets the value of the planningTimeSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planningTimeSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanningTimeSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanningTimeSeries }
     * 
     * 
     */
    public List<PlanningTimeSeries> getPlanningTimeSeries() {
        if (planningTimeSeries == null) {
            planningTimeSeries = new ArrayList<PlanningTimeSeries>();
        }
        return this.planningTimeSeries;
    }

    /**
     * Gets the value of the inventoryTimeSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryTimeSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryTimeSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryTimeSeries }
     * 
     * 
     */
    public List<InventoryTimeSeries> getInventoryTimeSeries() {
        if (inventoryTimeSeries == null) {
            inventoryTimeSeries = new ArrayList<InventoryTimeSeries>();
        }
        return this.inventoryTimeSeries;
    }

    /**
     * Gets the value of the consignmentMovement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consignmentMovement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsignmentMovement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsignmentMovement }
     * 
     * 
     */
    public List<ConsignmentMovement> getConsignmentMovement() {
        if (consignmentMovement == null) {
            consignmentMovement = new ArrayList<ConsignmentMovement>();
        }
        return this.consignmentMovement;
    }

    /**
     * Gets the value of the salesReport property.
     * 
     * @return
     *     possible object is
     *     {@link SalesReport }
     *     
     */
    public SalesReport getSalesReport() {
        return salesReport;
    }

    /**
     * Sets the value of the salesReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesReport }
     *     
     */
    public void setSalesReport(SalesReport value) {
        this.salesReport = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the extrinsic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrinsic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrinsic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extrinsic }
     * 
     * 
     */
    public List<Extrinsic> getExtrinsic() {
        if (extrinsic == null) {
            extrinsic = new ArrayList<Extrinsic>();
        }
        return this.extrinsic;
    }

}