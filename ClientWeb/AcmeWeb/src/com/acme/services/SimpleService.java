package com.acme.services;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/simple/{myRootPathData}")
public class SimpleService {

	@PathParam("myRootPathData")
	String rootPathData;

	Logger logger = Logger.getLogger("SimpleService");

	@GET
	@Produces("text/plain")
	public String testGET() {
		logger.info("Got a GET request with root path data: " + rootPathData);

		return "OK";
	}

	@GET
	@Produces("text/plain")
	@Path("/mypath")
	public String testGETWithPath() {
		logger.info("Got a GET request with path extension with root path data: " + rootPathData);

		return "OK";
	}

	@GET
	@Produces("text/plain")
	@Path("/{orderId}/address/{addressType}")
	public String getAddress(@PathParam("orderId") int oId, @PathParam("addressType") String type) {
		logger.info("Order Id: " + oId);
		logger.info("Address type: " + type);

		return "OK";
	}

	@GET
	@Produces("text/plain")
	@Path("raise")
	public String giveRaise(@QueryParam("name") String employeeName, @QueryParam("amount") double amount) {
		logger.info("Giving raise to " + employeeName + " by " + amount);

		return "OK";
	}

	@POST
	@Produces("text/plain")
	@Path("feedback")
	public String submitFeed(
	        @FormParam("interest")
	        List<String> interestList,
	        @FormParam("comments")
	        String comments
	    ) {
	    for (String interest : interestList) {
	        logger.info("Interest: " + interest);
	    }
	    logger.info("Comments: " + comments);

	    return "OK";
	}

}
