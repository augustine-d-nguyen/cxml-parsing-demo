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
    "contractorIdentifier",
    "contact"
})
@XmlRootElement(name = "Contractor")
public class Contractor {

    @XmlElement(name = "ContractorIdentifier", required = true)
    protected ContractorIdentifier contractorIdentifier;
    @XmlElement(name = "Contact", required = true)
    protected Contact contact;

    /**
     * Gets the value of the contractorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorIdentifier }
     *     
     */
    public ContractorIdentifier getContractorIdentifier() {
        return contractorIdentifier;
    }

    /**
     * Sets the value of the contractorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorIdentifier }
     *     
     */
    public void setContractorIdentifier(ContractorIdentifier value) {
        this.contractorIdentifier = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

}
