package com.mycom.test;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.jaxb.movie.Database;
import com.jaxb.movie.MovieType;

public class JAXBMoviePrinter {

	public static void main(String[] args) {

		try {
			JAXBContext jc = JAXBContext.newInstance("com.jaxb.movie");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			
			Database db = (Database) unmarshaller.unmarshal(new File("C:\\LabFiles\\movie.xml"));
			
			List<MovieType> movies = db.getMovie();
			
			for (MovieType m : movies) {
				System.out.println("Found movie: " + m.getTitle());
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
