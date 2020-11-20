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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "taxableAmount",
    "taxAmount",
    "taxLocation",
    "taxAdjustmentAmount",
    "description",
    "triangularTransactionLawReference",
    "taxRegime",
    "taxExemption",
    "extrinsic"
})
@XmlRootElement(name = "TaxDetail")
public class TaxDetail {

    @XmlAttribute(name = "taxedElement")
    @XmlIDREF
    protected Object taxedElement;
    @XmlAttribute(name = "purpose")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String purpose;
    @XmlAttribute(name = "category", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String category;
    @XmlAttribute(name = "percentageRate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String percentageRate;
    @XmlAttribute(name = "isVatRecoverable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isVatRecoverable;
    @XmlAttribute(name = "taxPointDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String taxPointDate;
    @XmlAttribute(name = "paymentDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String paymentDate;
    @XmlAttribute(name = "isTriangularTransaction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isTriangularTransaction;
    @XmlAttribute(name = "exemptDetail")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String exemptDetail;
    @XmlAttribute(name = "isWithholdingTax")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isWithholdingTax;
    @XmlAttribute(name = "taxRateType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String taxRateType;
    @XmlAttribute(name = "basePercentageRate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String basePercentageRate;
    @XmlAttribute(name = "isIncludedInPrice")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isIncludedInPrice;
    @XmlElement(name = "TaxableAmount")
    protected TaxableAmount taxableAmount;
    @XmlElement(name = "TaxAmount", required = true)
    protected TaxAmount taxAmount;
    @XmlElement(name = "TaxLocation")
    protected TaxLocation taxLocation;
    @XmlElement(name = "TaxAdjustmentAmount")
    protected TaxAdjustmentAmount taxAdjustmentAmount;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "TriangularTransactionLawReference")
    protected TriangularTransactionLawReference triangularTransactionLawReference;
    @XmlElement(name = "TaxRegime")
    protected String taxRegime;
    @XmlElement(name = "TaxExemption")
    protected TaxExemption taxExemption;
    @XmlElement(name = "Extrinsic")
    protected List<Extrinsic> extrinsic;

    /**
     * Gets the value of the taxedElement property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxedElement() {
        return taxedElement;
    }

    /**
     * Sets the value of the taxedElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxedElement(Object value) {
        this.taxedElement = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the percentageRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageRate() {
        return percentageRate;
    }

    /**
     * Sets the value of the percentageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageRate(String value) {
        this.percentageRate = value;
    }

    /**
     * Gets the value of the isVatRecoverable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVatRecoverable() {
        return isVatRecoverable;
    }

    /**
     * Sets the value of the isVatRecoverable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVatRecoverable(String value) {
        this.isVatRecoverable = value;
    }

    /**
     * Gets the value of the taxPointDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPointDate() {
        return taxPointDate;
    }

    /**
     * Sets the value of the taxPointDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPointDate(String value) {
        this.taxPointDate = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the isTriangularTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTriangularTransaction() {
        return isTriangularTransaction;
    }

    /**
     * Sets the value of the isTriangularTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTriangularTransaction(String value) {
        this.isTriangularTransaction = value;
    }

    /**
     * Gets the value of the exemptDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptDetail() {
        return exemptDetail;
    }

    /**
     * Sets the value of the exemptDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptDetail(String value) {
        this.exemptDetail = value;
    }

    /**
     * Gets the value of the isWithholdingTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsWithholdingTax() {
        return isWithholdingTax;
    }

    /**
     * Sets the value of the isWithholdingTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsWithholdingTax(String value) {
        this.isWithholdingTax = value;
    }

    /**
     * Gets the value of the taxRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRateType() {
        return taxRateType;
    }

    /**
     * Sets the value of the taxRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRateType(String value) {
        this.taxRateType = value;
    }

    /**
     * Gets the value of the basePercentageRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePercentageRate() {
        return basePercentageRate;
    }

    /**
     * Sets the value of the basePercentageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePercentageRate(String value) {
        this.basePercentageRate = value;
    }

    /**
     * Gets the value of the isIncludedInPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIncludedInPrice() {
        return isIncludedInPrice;
    }

    /**
     * Sets the value of the isIncludedInPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIncludedInPrice(String value) {
        this.isIncludedInPrice = value;
    }

    /**
     * Gets the value of the taxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableAmount }
     *     
     */
    public TaxableAmount getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableAmount }
     *     
     */
    public void setTaxableAmount(TaxableAmount value) {
        this.taxableAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmount }
     *     
     */
    public TaxAmount getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmount }
     *     
     */
    public void setTaxAmount(TaxAmount value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TaxLocation }
     *     
     */
    public TaxLocation getTaxLocation() {
        return taxLocation;
    }

    /**
     * Sets the value of the taxLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxLocation }
     *     
     */
    public void setTaxLocation(TaxLocation value) {
        this.taxLocation = value;
    }

    /**
     * Gets the value of the taxAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAdjustmentAmount }
     *     
     */
    public TaxAdjustmentAmount getTaxAdjustmentAmount() {
        return taxAdjustmentAmount;
    }

    /**
     * Sets the value of the taxAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAdjustmentAmount }
     *     
     */
    public void setTaxAdjustmentAmount(TaxAdjustmentAmount value) {
        this.taxAdjustmentAmount = value;
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
     * Gets the value of the triangularTransactionLawReference property.
     * 
     * @return
     *     possible object is
     *     {@link TriangularTransactionLawReference }
     *     
     */
    public TriangularTransactionLawReference getTriangularTransactionLawReference() {
        return triangularTransactionLawReference;
    }

    /**
     * Sets the value of the triangularTransactionLawReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriangularTransactionLawReference }
     *     
     */
    public void setTriangularTransactionLawReference(TriangularTransactionLawReference value) {
        this.triangularTransactionLawReference = value;
    }

    /**
     * Gets the value of the taxRegime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegime() {
        return taxRegime;
    }

    /**
     * Sets the value of the taxRegime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegime(String value) {
        this.taxRegime = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemption }
     *     
     */
    public TaxExemption getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemption }
     *     
     */
    public void setTaxExemption(TaxExemption value) {
        this.taxExemption = value;
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