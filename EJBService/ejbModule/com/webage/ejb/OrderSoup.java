package com.webage.ejb;

import com.webage.beans.Soup;
import com.webage.ejb.view.OrderSoupRemote;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;


/**
 * Session Bean implementation class OrderSoup
 */
@Stateless
@WebService
@Remote(OrderSoupRemote.class)
public class OrderSoup implements OrderSoupRemote {

    /**
     * Default constructor. 
     */
    public OrderSoup() {
        
    }

    public String orderSoup(Soup soup) throws BadCustomerException {
    	
    	if ("Monkey".equalsIgnoreCase(soup.getCustomerName())) {
    		System.out.println("EJB said: No soup served to " + soup.getCustomerName());
    		throw new BadCustomerException(soup);
    	}
    	
    	String message = soup.getSoupType() + " served to " + soup.getCustomerName();
    	System.out.println("EJB said: " + message);
    	return message;
    }
}
