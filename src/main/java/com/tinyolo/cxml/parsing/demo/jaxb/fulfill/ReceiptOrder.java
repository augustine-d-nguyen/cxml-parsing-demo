//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:08:13 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.fulfill;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "receiptOrderInfo",
    "receiptItem"
})
@XmlRootElement(name = "ReceiptOrder")
public class ReceiptOrder {

    @XmlAttribute(name = "closeForReceiving")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String closeForReceiving;
    @XmlElement(name = "ReceiptOrderInfo", required = true)
    protected ReceiptOrderInfo receiptOrderInfo;
    @XmlElement(name = "ReceiptItem", required = true)
    protected List<ReceiptItem> receiptItem;

    /**
     * Gets the value of the closeForReceiving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseForReceiving() {
        return closeForReceiving;
    }

    /**
     * Sets the value of the closeForReceiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseForReceiving(String value) {
        this.closeForReceiving = value;
    }

    /**
     * Gets the value of the receiptOrderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptOrderInfo }
     *     
     */
    public ReceiptOrderInfo getReceiptOrderInfo() {
        return receiptOrderInfo;
    }

    /**
     * Sets the value of the receiptOrderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptOrderInfo }
     *     
     */
    public void setReceiptOrderInfo(ReceiptOrderInfo value) {
        this.receiptOrderInfo = value;
    }

    /**
     * Gets the value of the receiptItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptItem }
     * 
     * 
     */
    public List<ReceiptItem> getReceiptItem() {
        if (receiptItem == null) {
            receiptItem = new ArrayList<ReceiptItem>();
        }
        return this.receiptItem;
    }

}
