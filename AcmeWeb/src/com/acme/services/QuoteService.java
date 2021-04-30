package com.acme.services;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.acme.services.entities.QuoteRequest;
import com.acme.services.entities.QuoteResponse;

@Path("/quotes")
public class QuoteService {
	Logger logger = Logger.getLogger("QuoteService");

	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.TEXT_XML })
	@Consumes({ MediaType.APPLICATION_XML, MediaType.TEXT_XML })
	public QuoteResponse getQuote(QuoteRequest req) {
		QuoteResponse res = new QuoteResponse();

		res.setClientId(req.getClientId());
		res.setDateRequiredBy(req.getDateRequiredBy());
		res.setPartNumber(req.getPartNumber());
		res.setQuantity(req.getQuantity());
		res.setTotalPrice(10.0 * req.getQuantity());
		res.setUnitPrice(10.00);
		res.setProductAvailable(true);

		return res;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public QuoteResponse getQuoteJSON(@FormParam("clientId") String clientId,
			@FormParam("dateRequiredBy") String dateRequiredBy, @FormParam("partNumber") String partNumber,
			@FormParam("quantity") int quantity) {

		logger.info("Client wants JSON response");
		QuoteRequest req = new QuoteRequest();

		req.setClientId(clientId);
		req.setDateRequiredBy(dateRequiredBy);
		req.setPartNumber(partNumber);
		req.setQuantity(quantity);

		return getQuote(req);

	}

}
