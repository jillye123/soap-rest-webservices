package com.movie;

import com.mycom.movie.MovieService;
import com.mycom.movie.MovieService_Service;
import com.mycom.movie.MovieType;

public class StandaloneMovieClient {

	public static void main(String[] args) {
		MovieType movie = new MovieType();
		movie.setTitle("The Big Lebowski");
		movie.setRating("PG-13");
		movie.setDescription("Let's Go Bowling");
		movie.getActor().add("Jeff Bridges");
		movie.getActor().add("John Goodman");

		MovieService_Service mss = new MovieService_Service();
		MovieService service = mss.getMovieServiceSOAPPort();
		
		String response = service.addMovie(movie);
		System.out.println("Response from movie service: " + response);
	}

}
