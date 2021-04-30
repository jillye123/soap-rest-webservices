
package com.webage.ejb;

import javax.xml.ws.WebFault;

@WebFault(name = "BadCustomer", targetNamespace = "http://ejb.webage.com/")
public class BadCustomerException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BadCustomerException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public BadCustomerException_Exception(String message, BadCustomerException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public BadCustomerException_Exception(String message, BadCustomerException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.webage.ejb.BadCustomerException
     */
    public BadCustomerException getFaultInfo() {
        return faultInfo;
    }

}
