
package com.webage.ejb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "OrderSoup", targetNamespace = "http://ejb.webage.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrderSoup {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws BadCustomerException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "orderSoup", targetNamespace = "http://ejb.webage.com/", className = "com.webage.ejb.OrderSoup_Type")
    @ResponseWrapper(localName = "orderSoupResponse", targetNamespace = "http://ejb.webage.com/", className = "com.webage.ejb.OrderSoupResponse")
    @Action(input = "http://ejb.webage.com/OrderSoup/orderSoupRequest", output = "http://ejb.webage.com/OrderSoup/orderSoupResponse", fault = {
        @FaultAction(className = BadCustomerException_Exception.class, value = "http://ejb.webage.com/OrderSoup/orderSoup/Fault/BadCustomerException")
    })
    public String orderSoup(
        @WebParam(name = "arg0", targetNamespace = "")
        Soup arg0)
        throws BadCustomerException_Exception
    ;

}
