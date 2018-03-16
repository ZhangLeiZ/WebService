
package com.zl.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "sayServiceImplService", targetNamespace = "http://server.zl.com/", wsdlLocation = "http://127.0.0.1/WebServ5cce/jdk?wsdl")
public class SayServiceImplService
    extends Service
{

    private final static URL SAYSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SAYSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName SAYSERVICEIMPLSERVICE_QNAME = new QName("http://server.zl.com/", "sayServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1/WebServ5cce/jdk?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAYSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        SAYSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public SayServiceImplService() {
        super(__getWsdlLocation(), SAYSERVICEIMPLSERVICE_QNAME);
    }

    public SayServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAYSERVICEIMPLSERVICE_QNAME, features);
    }

    public SayServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SAYSERVICEIMPLSERVICE_QNAME);
    }

    public SayServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAYSERVICEIMPLSERVICE_QNAME, features);
    }

    public SayServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SayServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SayServiceImpl
     */
    @WebEndpoint(name = "sayServiceImplPort")
    public SayServiceImpl getSayServiceImplPort() {
        return super.getPort(new QName("http://server.zl.com/", "sayServiceImplPort"), SayServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SayServiceImpl
     */
    @WebEndpoint(name = "sayServiceImplPort")
    public SayServiceImpl getSayServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.zl.com/", "sayServiceImplPort"), SayServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAYSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw SAYSERVICEIMPLSERVICE_EXCEPTION;
        }
        return SAYSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
