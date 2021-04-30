package com.webage.ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.ws.WebFault;

import com.webage.beans.Soup;

@WebFault(name="BadCustomer")
@XmlAccessorType(XmlAccessType.FIELD)
public class BadCustomerException extends Exception {

	private static final long serialVersionUID = 1L;
	private Soup soupOrdered;
	
	public BadCustomerException(Soup soupOrdered) {
		super("No soup for you!");
		this.soupOrdered = soupOrdered;
	}
	
	public Soup getSoupOrdered() {
		return soupOrdered;
	}
}
