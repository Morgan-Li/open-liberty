//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.20 at 10:40:55 AM CDT 
//


package org.apache.cxf.configuration.security;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.ibm.websphere.ras.annotation.Trivial;


/**
 * 
 *         This structure holds a list of ciphersuite names that are to be
 *         supported. Note: that does not mean that they will be available.
 *         That depends on the JSSE and Crypto providers.
 *         
 * 
 * <p>Java class for CipherSuites complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CipherSuites">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cipherSuite" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CipherSuites", propOrder = {
    "cipherSuite"
})
@Trivial
public class CipherSuites {

    protected List<String> cipherSuite;

    /**
     * Gets the value of the cipherSuite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cipherSuite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCipherSuite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCipherSuite() {
        if (cipherSuite == null) {
            cipherSuite = new ArrayList<String>();
        }
        return this.cipherSuite;
    }

    public boolean isSetCipherSuite() {
        return ((this.cipherSuite!= null)&&(!this.cipherSuite.isEmpty()));
    }

    public void unsetCipherSuite() {
        this.cipherSuite = null;
    }

}
