//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:08:13 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.fulfill;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conditionTypes"
})
@XmlRootElement(name = "ValidityPeriod")
public class ValidityPeriod {

    @XmlAttribute(name = "from", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String from;
    @XmlAttribute(name = "to", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String to;
    @XmlElement(name = "ConditionTypes", required = true)
    protected ConditionTypes conditionTypes;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the conditionTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionTypes }
     *     
     */
    public ConditionTypes getConditionTypes() {
        return conditionTypes;
    }

    /**
     * Sets the value of the conditionTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionTypes }
     *     
     */
    public void setConditionTypes(ConditionTypes value) {
        this.conditionTypes = value;
    }

}
