package fr.unice.polytech.si._4a.isa.dd.team_h.rating;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2020-04-29T12:04:53.705+02:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "CommentPostingWebServiceImplService", 
                  wsdlLocation = "file:/C:/Users/damin/Documents/cours/projet-isa-devops-20-team-H-20/clients/client/src/main/resources/RatingWS.wsdl",
                  targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/team-h/rating") 
public class CommentPostingWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.polytech.unice.fr/si/4a/isa/dd/team-h/rating", "CommentPostingWebServiceImplService");
    public final static QName CommentPostingWebServiceImplPort = new QName("http://www.polytech.unice.fr/si/4a/isa/dd/team-h/rating", "CommentPostingWebServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/damin/Documents/cours/projet-isa-devops-20-team-H-20/clients/client/src/main/resources/RatingWS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CommentPostingWebServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/damin/Documents/cours/projet-isa-devops-20-team-H-20/clients/client/src/main/resources/RatingWS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CommentPostingWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CommentPostingWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CommentPostingWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CommentPostingWebServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CommentPostingWebServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CommentPostingWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CommentPostingWebService
     */
    @WebEndpoint(name = "CommentPostingWebServiceImplPort")
    public CommentPostingWebService getCommentPostingWebServiceImplPort() {
        return super.getPort(CommentPostingWebServiceImplPort, CommentPostingWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CommentPostingWebService
     */
    @WebEndpoint(name = "CommentPostingWebServiceImplPort")
    public CommentPostingWebService getCommentPostingWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(CommentPostingWebServiceImplPort, CommentPostingWebService.class, features);
    }

}
