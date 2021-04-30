package com.webage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

import com.webage.ejb.BadCustomerException_Exception;
import com.webage.ejb.OrderSoup;
import com.webage.ejb.OrderSoupService;
import com.webage.ejb.Soup;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@WebServiceRef(name = "OrderSoupService")
	private OrderSoupService service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerName = request.getParameter("customerName");
		String soupType = request.getParameter("soupType");
		Soup soupToOrder = new Soup();
		soupToOrder.setCustomerName(customerName);
		soupToOrder.setSoupType(soupType);
		
//		OrderSoupService os = new OrderSoupService();
		
		OrderSoup port = service.getOrderSoupPort();
		
		PrintWriter out = response.getWriter();
		String message;
		try {
			message = port.orderSoup(soupToOrder);
			out.println(message);
		} catch (BadCustomerException_Exception e) {
			out.println("<h2>A bad customer tried to order!</h2>");
			Soup soupOrdered = e.getFaultInfo().getSoupOrdered();
			out.println(soupOrdered.getCustomerName()
					+ " is not allowed to order " + soupOrdered.getSoupType());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
