//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:07:34 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.cxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paymentRelationshipInformation"
})
@XmlRootElement(name = "RelationshipInformation")
public class RelationshipInformation {

    @XmlElement(name = "PaymentRelationshipInformation")
    protected PaymentRelationshipInformation paymentRelationshipInformation;

    /**
     * Gets the value of the paymentRelationshipInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRelationshipInformation }
     *     
     */
    public PaymentRelationshipInformation getPaymentRelationshipInformation() {
        return paymentRelationshipInformation;
    }

    /**
     * Sets the value of the paymentRelationshipInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRelationshipInformation }
     *     
     */
    public void setPaymentRelationshipInformation(PaymentRelationshipInformation value) {
        this.paymentRelationshipInformation = value;
    }

}
