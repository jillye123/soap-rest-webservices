package com.webage.billing;

import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class BillingManager {
	Logger logger = Logger.getLogger(getClass().getName());
	
	@WebMethod
	@WebResult(name="status")
	public String addAccount(
			@WebParam(name="account")
			CustomerAccount account) {
	
		logger.info("Adding new account");
		logger.info("Customer name: " + account.getName());
		logger.info("Address: " + account.getAddress());
		
		return "OK";
	}
}
