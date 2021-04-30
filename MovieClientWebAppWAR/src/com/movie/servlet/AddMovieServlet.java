package com.movie.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.BindingProvider;

import com.mycom.movie.MovieService;
import com.mycom.movie.MovieService_Service;
import com.mycom.movie.MovieType;

/**
 * Servlet implementation class AddMovieServlet
 */
@WebServlet("/AddMovieServlet")
public class AddMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		MovieType movie = new MovieType();
		movie.setTitle(request.getParameter("title"));
		movie.setDescription(request.getParameter("description"));
		movie.setRating(request.getParameter("rating"));
		
		String[] actors = request.getParameter("actors").split(";");
		for (int i=0; i<actors.length; i++) {
			movie.getActor().add(actors[i]);
		}
		
		MovieService_Service mss = new MovieService_Service();
		MovieService service = mss.getMovieServiceSOAPPort();
		
		// uncomment below if turn on monitor
//		BindingProvider bp = (BindingProvider) service;
//		Map<String, Object> context = bp.getRequestContext();
//		context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:9081/WebServiceProject/MovieService");
		
		service.addMovie(movie);
		
		out.println("Successfully added a movie: " + movie.getTitle());
	}

}
