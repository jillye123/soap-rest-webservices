
package com.webage.ejb;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "OrderSoupService", targetNamespace = "http://ejb.webage.com/", wsdlLocation = "WEB-INF/wsdl/OrderSoupService.wsdl")
public class OrderSoupService
    extends Service
{

    private final static URL ORDERSOUPSERVICE_WSDL_LOCATION;
    private final static WebServiceException ORDERSOUPSERVICE_EXCEPTION;
    private final static QName ORDERSOUPSERVICE_QNAME = new QName("http://ejb.webage.com/", "OrderSoupService");

    static {
            ORDERSOUPSERVICE_WSDL_LOCATION = com.webage.ejb.OrderSoupService.class.getResource("/WEB-INF/wsdl/OrderSoupService.wsdl");
        WebServiceException e = null;
        if (ORDERSOUPSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'WEB-INF/wsdl/OrderSoupService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        ORDERSOUPSERVICE_EXCEPTION = e;
    }

    public OrderSoupService() {
        super(__getWsdlLocation(), ORDERSOUPSERVICE_QNAME);
    }

    public OrderSoupService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ORDERSOUPSERVICE_QNAME, features);
    }

    public OrderSoupService(URL wsdlLocation) {
        super(wsdlLocation, ORDERSOUPSERVICE_QNAME);
    }

    public OrderSoupService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ORDERSOUPSERVICE_QNAME, features);
    }

    public OrderSoupService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderSoupService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OrderSoup
     */
    @WebEndpoint(name = "OrderSoupPort")
    public OrderSoup getOrderSoupPort() {
        return super.getPort(new QName("http://ejb.webage.com/", "OrderSoupPort"), OrderSoup.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderSoup
     */
    @WebEndpoint(name = "OrderSoupPort")
    public OrderSoup getOrderSoupPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ejb.webage.com/", "OrderSoupPort"), OrderSoup.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ORDERSOUPSERVICE_EXCEPTION!= null) {
            throw ORDERSOUPSERVICE_EXCEPTION;
        }
        return ORDERSOUPSERVICE_WSDL_LOCATION;
    }

}
