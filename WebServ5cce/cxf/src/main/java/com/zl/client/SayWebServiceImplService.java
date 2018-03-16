package com.zl.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-16T19:47:35.840+08:00
 * Generated source version: 3.2.2
 *
 */
@WebServiceClient(name = "SayWebServiceImplService",
                  wsdlLocation = "http://localhost:8080/WebServ5cce/hello?wsdl",
                  targetNamespace = "http://server.zl.com/")
public class SayWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.zl.com/", "SayWebServiceImplService");
    public final static QName SayWebServiceImplPort = new QName("http://server.zl.com/", "SayWebServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/WebServ5cce/hello?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SayWebServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/WebServ5cce/hello?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SayWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SayWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SayWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SayWebServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SayWebServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SayWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SayWebService
     */
    @WebEndpoint(name = "SayWebServiceImplPort")
    public SayWebService getSayWebServiceImplPort() {
        return super.getPort(SayWebServiceImplPort, SayWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SayWebService
     */
    @WebEndpoint(name = "SayWebServiceImplPort")
    public SayWebService getSayWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(SayWebServiceImplPort, SayWebService.class, features);
    }

}