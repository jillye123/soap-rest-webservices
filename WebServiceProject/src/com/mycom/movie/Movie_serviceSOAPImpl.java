package com.mycom.movie;

import java.util.List;

import javax.jws.WebService;

@WebService (endpointInterface="com.mycom.movie.MovieService", 
			 targetNamespace="http://www.mycom.com/movie", 
			 serviceName="MovieService", 
			 portName="MovieServiceSOAPPort")
public class Movie_serviceSOAPImpl{

    public String addMovie(MovieType movie) {
    	System.out.println("Received a movie: ");
    	System.out.println("Title: " + movie.getTitle());
    	System.out.println("Rating: " + movie.getRating());
    	
    	List<String> actors = movie.getActor();
    	for (String actor : actors) {
    		System.out.println("Actor: " + actor);
    	}
    	
    	System.out.println("Description: " + movie.getDescription());
    	
        return "Successfully added movie " + movie.getTitle();
    }

}