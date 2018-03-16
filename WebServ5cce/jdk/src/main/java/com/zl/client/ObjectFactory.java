
package com.zl.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zl.client package. 
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

    private final static QName _GetHollerSayResponse_QNAME = new QName("http://server.zl.com/", "getHollerSayResponse");
    private final static QName _GetHollerSay_QNAME = new QName("http://server.zl.com/", "getHollerSay");
    private final static QName _GetSay_QNAME = new QName("http://server.zl.com/", "getSay");
    private final static QName _GetSayResponse_QNAME = new QName("http://server.zl.com/", "getSayResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zl.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSayResponse }
     * 
     */
    public GetSayResponse createGetSayResponse() {
        return new GetSayResponse();
    }

    /**
     * Create an instance of {@link GetHollerSayResponse }
     * 
     */
    public GetHollerSayResponse createGetHollerSayResponse() {
        return new GetHollerSayResponse();
    }

    /**
     * Create an instance of {@link GetHollerSay }
     * 
     */
    public GetHollerSay createGetHollerSay() {
        return new GetHollerSay();
    }

    /**
     * Create an instance of {@link GetSay }
     * 
     */
    public GetSay createGetSay() {
        return new GetSay();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHollerSayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.zl.com/", name = "getHollerSayResponse")
    public JAXBElement<GetHollerSayResponse> createGetHollerSayResponse(GetHollerSayResponse value) {
        return new JAXBElement<GetHollerSayResponse>(_GetHollerSayResponse_QNAME, GetHollerSayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHollerSay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.zl.com/", name = "getHollerSay")
    public JAXBElement<GetHollerSay> createGetHollerSay(GetHollerSay value) {
        return new JAXBElement<GetHollerSay>(_GetHollerSay_QNAME, GetHollerSay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.zl.com/", name = "getSay")
    public JAXBElement<GetSay> createGetSay(GetSay value) {
        return new JAXBElement<GetSay>(_GetSay_QNAME, GetSay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.zl.com/", name = "getSayResponse")
    public JAXBElement<GetSayResponse> createGetSayResponse(GetSayResponse value) {
        return new JAXBElement<GetSayResponse>(_GetSayResponse_QNAME, GetSayResponse.class, null, value);
    }

}
