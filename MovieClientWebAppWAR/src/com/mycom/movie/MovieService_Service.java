
package com.mycom.movie;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "MovieService", targetNamespace = "http://www.mycom.com/movie", wsdlLocation = "WEB-INF/wsdl/MovieService.wsdl")
public class MovieService_Service
    extends Service
{

    private final static URL MOVIESERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIESERVICE_EXCEPTION;
    private final static QName MOVIESERVICE_QNAME = new QName("http://www.mycom.com/movie", "MovieService");

    static {
            MOVIESERVICE_WSDL_LOCATION = com.mycom.movie.MovieService_Service.class.getResource("/WEB-INF/wsdl/MovieService.wsdl");
        WebServiceException e = null;
        if (MOVIESERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'WEB-INF/wsdl/MovieService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        MOVIESERVICE_EXCEPTION = e;
    }

    public MovieService_Service() {
        super(__getWsdlLocation(), MOVIESERVICE_QNAME);
    }

    public MovieService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIESERVICE_QNAME, features);
    }

    public MovieService_Service(URL wsdlLocation) {
        super(wsdlLocation, MOVIESERVICE_QNAME);
    }

    public MovieService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIESERVICE_QNAME, features);
    }

    public MovieService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MovieService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MovieService
     */
    @WebEndpoint(name = "MovieServiceSOAPPort")
    public MovieService getMovieServiceSOAPPort() {
        return super.getPort(new QName("http://www.mycom.com/movie", "MovieServiceSOAPPort"), MovieService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MovieService
     */
    @WebEndpoint(name = "MovieServiceSOAPPort")
    public MovieService getMovieServiceSOAPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.mycom.com/movie", "MovieServiceSOAPPort"), MovieService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIESERVICE_EXCEPTION!= null) {
            throw MOVIESERVICE_EXCEPTION;
        }
        return MOVIESERVICE_WSDL_LOCATION;
    }

}
