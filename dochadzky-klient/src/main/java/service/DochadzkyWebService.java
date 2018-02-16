
package service;

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
@WebServiceClient(name = "DochadzkyWebService", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8888/dochadzky?wsdl")
public class DochadzkyWebService
    extends Service
{

    private final static URL DOCHADZKYWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException DOCHADZKYWEBSERVICE_EXCEPTION;
    private final static QName DOCHADZKYWEBSERVICE_QNAME = new QName("http://service/", "DochadzkyWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/dochadzky?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DOCHADZKYWEBSERVICE_WSDL_LOCATION = url;
        DOCHADZKYWEBSERVICE_EXCEPTION = e;
    }

    public DochadzkyWebService() {
        super(__getWsdlLocation(), DOCHADZKYWEBSERVICE_QNAME);
    }

    public DochadzkyWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DOCHADZKYWEBSERVICE_QNAME, features);
    }

    public DochadzkyWebService(URL wsdlLocation) {
        super(wsdlLocation, DOCHADZKYWEBSERVICE_QNAME);
    }

    public DochadzkyWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DOCHADZKYWEBSERVICE_QNAME, features);
    }

    public DochadzkyWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DochadzkyWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DochadzkyService
     */
    @WebEndpoint(name = "DochadzkyServicePort")
    public DochadzkyService getDochadzkyServicePort() {
        return super.getPort(new QName("http://service/", "DochadzkyServicePort"), DochadzkyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DochadzkyService
     */
    @WebEndpoint(name = "DochadzkyServicePort")
    public DochadzkyService getDochadzkyServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "DochadzkyServicePort"), DochadzkyService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DOCHADZKYWEBSERVICE_EXCEPTION!= null) {
            throw DOCHADZKYWEBSERVICE_EXCEPTION;
        }
        return DOCHADZKYWEBSERVICE_WSDL_LOCATION;
    }

}