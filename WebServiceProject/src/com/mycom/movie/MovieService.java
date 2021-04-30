
package com.mycom.movie;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "movie_service", targetNamespace = "http://www.mycom.com/movie")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MovieService {


    /**
     * 
     * @param movie
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://www.mycom.com/movie/NewOperation")
    @WebResult(name = "status", targetNamespace = "")
    @RequestWrapper(localName = "addMovie", targetNamespace = "http://www.mycom.com/movie", className = "com.mycom.movie.AddMovie")
    @ResponseWrapper(localName = "addMovieResponse", targetNamespace = "http://www.mycom.com/movie", className = "com.mycom.movie.AddMovieResponse")
    public String addMovie(
        @WebParam(name = "movie", targetNamespace = "")
        MovieType movie);

}
