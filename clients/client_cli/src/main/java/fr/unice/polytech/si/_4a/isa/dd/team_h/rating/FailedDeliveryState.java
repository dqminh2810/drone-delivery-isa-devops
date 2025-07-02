
package fr.unice.polytech.si._4a.isa.dd.team_h.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for failedDeliveryState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="failedDeliveryState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.polytech.unice.fr/si/4a/isa/dd/team-h/rating}deliveryState"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "failedDeliveryState", propOrder = {
    "localDateTime"
})
public class FailedDeliveryState
    extends DeliveryState
{

    protected String localDateTime;

    /**
     * Gets the value of the localDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDateTime() {
        return localDateTime;
    }

    /**
     * Sets the value of the localDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDateTime(String value) {
        this.localDateTime = value;
    }

}
