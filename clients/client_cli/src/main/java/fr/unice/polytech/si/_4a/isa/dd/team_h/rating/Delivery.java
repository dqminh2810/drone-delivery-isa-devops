
package fr.unice.polytech.si._4a.isa.dd.team_h.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delivery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="flightTime" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="state" type="{http://www.polytech.unice.fr/si/4a/isa/dd/team-h/rating}deliveryState" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aPackage" type="{http://www.polytech.unice.fr/si/4a/isa/dd/team-h/rating}package" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delivery", propOrder = {
    "date",
    "distance",
    "flightTime",
    "id",
    "state",
    "time",
    "aPackage"
})
public class Delivery {

    protected String date;
    protected float distance;
    protected float flightTime;
    protected int id;
    protected DeliveryState state;
    protected String time;
    protected Package aPackage;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     */
    public float getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(float value) {
        this.distance = value;
    }

    /**
     * Gets the value of the flightTime property.
     * 
     */
    public float getFlightTime() {
        return flightTime;
    }

    /**
     * Sets the value of the flightTime property.
     * 
     */
    public void setFlightTime(float value) {
        this.flightTime = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryState }
     *     
     */
    public DeliveryState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryState }
     *     
     */
    public void setState(DeliveryState value) {
        this.state = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the aPackage property.
     * 
     * @return
     *     possible object is
     *     {@link Package }
     *     
     */
    public Package getAPackage() {
        return aPackage;
    }

    /**
     * Sets the value of the aPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Package }
     *     
     */
    public void setAPackage(Package value) {
        this.aPackage = value;
    }

}
