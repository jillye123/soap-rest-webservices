
package com.mycom.movie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addMovie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addMovie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movie" type="{http://www.mycom.com/movie}movieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMovie", propOrder = {
    "movie"
})
public class AddMovie {

    protected MovieType movie;

    /**
     * Gets the value of the movie property.
     * 
     * @return
     *     possible object is
     *     {@link MovieType }
     *     
     */
    public MovieType getMovie() {
        return movie;
    }

    /**
     * Sets the value of the movie property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovieType }
     *     
     */
    public void setMovie(MovieType value) {
        this.movie = value;
    }

}
