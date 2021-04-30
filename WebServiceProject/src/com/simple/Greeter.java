package com.simple;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.beans.Person;

@WebService(targetNamespace = "www.jill.example.org")
public class Greeter {

	@WebMethod
	public String sayHello(@WebParam(name = "greet_name") String name) {
		return "Hi " + name;
	}
	
	@WebMethod
	@WebResult(name="newperson")
	public Person createPerson(String name) {
		Person person = new Person();
		person.setName(name);
		person.setCreationDate("" + new Date());
		return person;
	}
	
	@WebMethod
	public String getPersonName(Person person) {
		return person.getName();
	}
}
