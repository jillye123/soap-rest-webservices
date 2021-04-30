package com.acme.services;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import com.acme.services.entities.Order;

@Path("/orders")
public class OrderService {
	@Context
	UriInfo ui;

	Logger logger = Logger.getLogger("OrderService");

	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.TEXT_XML })
	public Response placeOrder(Order o) {
		try {
			OrderDAO dao = new OrderDAO();
			long orderId = dao.createOrder(o);

			UriBuilder ub = ui.getRequestUriBuilder();
			ub = ub.path(OrderService.class, "getOrder");
			URI orderURI = ub.build(orderId);

			return Response.created(orderURI).build();
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error creating order", e);
			throw new WebApplicationException(e);
		}

		// return null;
	}

	@GET
	@Path("/{orderId}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.TEXT_XML })
	public Order getOrder(@PathParam("orderId") long orderId) {
		Order o = null;

		try {
			OrderDAO dao = new OrderDAO();
			o = dao.findOrder(orderId);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error finding order", e);
		}

		if (o == null) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}

		return o;
	}

}
