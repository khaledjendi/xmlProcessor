//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.23 at 04:00:59 PM CEST 
//


package jaxb.shortcv;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxb.shortcv package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxb.shortcv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Material }
     * 
     */
    public Material createMaterial() {
        return new Material();
    }

    /**
     * Create an instance of {@link Material.Cv }
     * 
     */
    public Material.Cv createMaterialCv() {
        return new Material.Cv();
    }

    /**
     * Create an instance of {@link Material.Preference }
     * 
     */
    public Material.Preference createMaterialPreference() {
        return new Material.Preference();
    }

    /**
     * Create an instance of {@link Material.Cv.Qualification }
     * 
     */
    public Material.Cv.Qualification createMaterialCvQualification() {
        return new Material.Cv.Qualification();
    }

}
