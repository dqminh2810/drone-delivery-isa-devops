package fr.unice.polytech.isa.dd.teamH.webservices;

import fr.unice.polytech.isa.dd.teamH.entities.delivery.Delivery;
import fr.unice.polytech.isa.dd.teamH.entities.deliveryplanning.PlanningEntry;
import fr.unice.polytech.isa.dd.teamH.exceptions.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Set;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/team-h/planning")
public interface PlanningWebService {
    @WebMethod
    @WebResult(name = "delivery-planning")
    Set<PlanningEntry> getCompleteDeliveryPlanning();

    @WebMethod
    @WebResult(name = "delivery")
    Delivery planDelivery(@WebParam(name="tracking-number") String trackingNumber,
                      @WebParam(name="shipping-date") String date, @WebParam(name="shipping-time") String time) throws
            UnknownPackageException, DeliveryDistanceException, UnknownDeliveryStateException, NoReadyDroneException, DeliveryPastTimeException, CorruptedPlanningException;

    @WebMethod
    @WebResult(name = "return_code")
    boolean editDeliveryStatus(@WebParam(name="id") String id, @WebParam(name="status") String status) throws UnknownDeliveryStateException, UnknownDeliveryException;

    @WebMethod
    @WebResult(name = "return_code")
    boolean deleteDelivery(@WebParam(name="tracking-number") String trackingNumber) throws UnknownDeliveryException;

    @WebMethod
    @WebResult(name = "return_code")
    boolean deletePlanningEntry(@WebParam(name="tracking-number") String trackingNumber) throws UnknownPlanningEntryException;

    @WebMethod
    @WebResult(name = "return_code")
    boolean deletePlanningEntryByDroneId(@WebParam(name="drone-id") int droneId) throws UnknownPlanningEntryException;

    @WebMethod
    @WebResult(name = "delivery")
    Delivery findDeliveryById(@WebParam(name="id") String id) throws UnknownDeliveryException;

    @WebMethod
    @WebResult(name = "planning")
    PlanningEntry findPlanningEntryById(@WebParam(name="id") String id) throws UnknownDeliveryException;

    @WebMethod
    @WebResult(name = "return_code")
    boolean startDelivery(@WebParam(name="tracking-number") String trackingId) throws UnknownDeliveryException;
}
