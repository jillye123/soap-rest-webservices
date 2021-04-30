package com.acme.services.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "quote_request")
public class QuoteRequest {
	String partNumber;
	int quantity;
	String clientId;
	String dateRequiredBy;

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getDateRequiredBy() {
		return dateRequiredBy;
	}

	public void setDateRequiredBy(String dateRequiredBy) {
		this.dateRequiredBy = dateRequiredBy;
	}

}
