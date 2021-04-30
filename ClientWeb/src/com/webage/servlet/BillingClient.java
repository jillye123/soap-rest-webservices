package com.webage.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

import com.webage.billing.BillingManager;
import com.webage.billing.BillingManagerService;
import com.webage.billing.CustomerAccount;

/**
 * Servlet implementation class BillingClient
 */
public class BillingClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@WebServiceRef(name="BillingManagerService")
	BillingManagerService service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillingClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerAccount a = new CustomerAccount();
		
		a.setName(request.getParameter("name"));
		a.setAddress(request.getParameter("address"));
		
		String message;
		
		try {
			BillingManager proxy = service.getBillingManagerPort();
			proxy.addAccount(a);
			message = "Account was added successfully. Add another?";
		} catch (Exception e) {
			message = e.getMessage();
		}
		
		request.setAttribute("message", message);
		
		//forward to JSP
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
