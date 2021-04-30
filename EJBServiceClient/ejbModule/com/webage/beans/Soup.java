package com.webage.beans;

import java.io.Serializable;

public class Soup implements Serializable {

	private static final long serialVersionUID = 1L;

	private String customerName = "";
	private String soupType = "";
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getSoupType() {
		return soupType;
	}
	public void setSoupType(String soupType) {
		this.soupType = soupType;
	}
	
	
}
