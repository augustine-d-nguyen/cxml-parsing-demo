//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:08:13 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.fulfill;

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
    "qualityInspectionResultRequestHeader",
    "qualityInspectionResultRequestDetail"
})
@XmlRootElement(name = "QualityInspectionResultRequest")
public class QualityInspectionResultRequest {

    @XmlElement(name = "QualityInspectionResultRequestHeader", required = true)
    protected QualityInspectionResultRequestHeader qualityInspectionResultRequestHeader;
    @XmlElement(name = "QualityInspectionResultRequestDetail", required = true)
    protected QualityInspectionResultRequestDetail qualityInspectionResultRequestDetail;

    /**
     * Gets the value of the qualityInspectionResultRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link QualityInspectionResultRequestHeader }
     *     
     */
    public QualityInspectionResultRequestHeader getQualityInspectionResultRequestHeader() {
        return qualityInspectionResultRequestHeader;
    }

    /**
     * Sets the value of the qualityInspectionResultRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityInspectionResultRequestHeader }
     *     
     */
    public void setQualityInspectionResultRequestHeader(QualityInspectionResultRequestHeader value) {
        this.qualityInspectionResultRequestHeader = value;
    }

    /**
     * Gets the value of the qualityInspectionResultRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link QualityInspectionResultRequestDetail }
     *     
     */
    public QualityInspectionResultRequestDetail getQualityInspectionResultRequestDetail() {
        return qualityInspectionResultRequestDetail;
    }

    /**
     * Sets the value of the qualityInspectionResultRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityInspectionResultRequestDetail }
     *     
     */
    public void setQualityInspectionResultRequestDetail(QualityInspectionResultRequestDetail value) {
        this.qualityInspectionResultRequestDetail = value;
    }

}
