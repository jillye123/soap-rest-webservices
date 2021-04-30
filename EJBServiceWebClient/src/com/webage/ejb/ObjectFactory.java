
package com.webage.ejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webage.ejb package. 
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

    private final static QName _OrderSoup_QNAME = new QName("http://ejb.webage.com/", "orderSoup");
    private final static QName _OrderSoupResponse_QNAME = new QName("http://ejb.webage.com/", "orderSoupResponse");
    private final static QName _BadCustomer_QNAME = new QName("http://ejb.webage.com/", "BadCustomer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webage.ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BadCustomerException }
     * 
     */
    public BadCustomerException createBadCustomerException() {
        return new BadCustomerException();
    }

    /**
     * Create an instance of {@link OrderSoupResponse }
     * 
     */
    public OrderSoupResponse createOrderSoupResponse() {
        return new OrderSoupResponse();
    }

    /**
     * Create an instance of {@link OrderSoup_Type }
     * 
     */
    public OrderSoup_Type createOrderSoup_Type() {
        return new OrderSoup_Type();
    }

    /**
     * Create an instance of {@link Soup }
     * 
     */
    public Soup createSoup() {
        return new Soup();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderSoup_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.webage.com/", name = "orderSoup")
    public JAXBElement<OrderSoup_Type> createOrderSoup(OrderSoup_Type value) {
        return new JAXBElement<OrderSoup_Type>(_OrderSoup_QNAME, OrderSoup_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderSoupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.webage.com/", name = "orderSoupResponse")
    public JAXBElement<OrderSoupResponse> createOrderSoupResponse(OrderSoupResponse value) {
        return new JAXBElement<OrderSoupResponse>(_OrderSoupResponse_QNAME, OrderSoupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BadCustomerException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.webage.com/", name = "BadCustomer")
    public JAXBElement<BadCustomerException> createBadCustomer(BadCustomerException value) {
        return new JAXBElement<BadCustomerException>(_BadCustomer_QNAME, BadCustomerException.class, null, value);
    }

}
