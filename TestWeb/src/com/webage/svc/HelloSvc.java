package com.webage.svc;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloSvc {

	@WebMethod
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
