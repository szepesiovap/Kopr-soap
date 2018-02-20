
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DochadzkyService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DochadzkyService {


    /**
     * 
     * @param arg0
     * @return
     *     returns service.Predmet
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dajPredmet", targetNamespace = "http://service/", className = "service.DajPredmet")
    @ResponseWrapper(localName = "dajPredmetResponse", targetNamespace = "http://service/", className = "service.DajPredmetResponse")
    @Action(input = "http://service/DochadzkyService/dajPredmetRequest", output = "http://service/DochadzkyService/dajPredmetResponse")
    public Predmet dajPredmet(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pridajPredmet", targetNamespace = "http://service/", className = "service.PridajPredmet")
    @ResponseWrapper(localName = "pridajPredmetResponse", targetNamespace = "http://service/", className = "service.PridajPredmetResponse")
    @Action(input = "http://service/DochadzkyService/pridajPredmetRequest", output = "http://service/DochadzkyService/pridajPredmetResponse")
    public String pridajPredmet(
        @WebParam(name = "arg0", targetNamespace = "")
        Predmet arg0);

    /**
     * 
     * @return
     *     returns java.util.List<service.Predmet>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dajPredmety", targetNamespace = "http://service/", className = "service.DajPredmety")
    @ResponseWrapper(localName = "dajPredmetyResponse", targetNamespace = "http://service/", className = "service.DajPredmetyResponse")
    @Action(input = "http://service/DochadzkyService/dajPredmetyRequest", output = "http://service/DochadzkyService/dajPredmetyResponse")
    public List<Predmet> dajPredmety();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pridajPrezencku", targetNamespace = "http://service/", className = "service.PridajPrezencku")
    @ResponseWrapper(localName = "pridajPrezenckuResponse", targetNamespace = "http://service/", className = "service.PridajPrezenckuResponse")
    @Action(input = "http://service/DochadzkyService/pridajPrezenckuRequest", output = "http://service/DochadzkyService/pridajPrezenckuResponse")
    public String pridajPrezencku(
        @WebParam(name = "arg0", targetNamespace = "")
        Prezencka arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<String> arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.Prezencka
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dajPrezencku", targetNamespace = "http://service/", className = "service.DajPrezencku")
    @ResponseWrapper(localName = "dajPrezenckuResponse", targetNamespace = "http://service/", className = "service.DajPrezenckuResponse")
    @Action(input = "http://service/DochadzkyService/dajPrezenckuRequest", output = "http://service/DochadzkyService/dajPrezenckuResponse")
    public Prezencka dajPrezencku(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<service.Prezencka>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dajPrezencky", targetNamespace = "http://service/", className = "service.DajPrezencky")
    @ResponseWrapper(localName = "dajPrezenckyResponse", targetNamespace = "http://service/", className = "service.DajPrezenckyResponse")
    @Action(input = "http://service/DochadzkyService/dajPrezenckyRequest", output = "http://service/DochadzkyService/dajPrezenckyResponse")
    public List<Prezencka> dajPrezencky();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<service.Prezencka>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dajPrezenckyUcastnika", targetNamespace = "http://service/", className = "service.DajPrezenckyUcastnika")
    @ResponseWrapper(localName = "dajPrezenckyUcastnikaResponse", targetNamespace = "http://service/", className = "service.DajPrezenckyUcastnikaResponse")
    @Action(input = "http://service/DochadzkyService/dajPrezenckyUcastnikaRequest", output = "http://service/DochadzkyService/dajPrezenckyUcastnikaResponse")
    public List<Prezencka> dajPrezenckyUcastnika(
        @WebParam(name = "arg0", targetNamespace = "")
        Ucastnik arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pridajUcastnika", targetNamespace = "http://service/", className = "service.PridajUcastnika")
    @ResponseWrapper(localName = "pridajUcastnikaResponse", targetNamespace = "http://service/", className = "service.PridajUcastnikaResponse")
    @Action(input = "http://service/DochadzkyService/pridajUcastnikaRequest", output = "http://service/DochadzkyService/pridajUcastnikaResponse")
    public String pridajUcastnika(
        @WebParam(name = "arg0", targetNamespace = "")
        Ucastnik arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.Ucastnik
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dajUcastnika", targetNamespace = "http://service/", className = "service.DajUcastnika")
    @ResponseWrapper(localName = "dajUcastnikaResponse", targetNamespace = "http://service/", className = "service.DajUcastnikaResponse")
    @Action(input = "http://service/DochadzkyService/dajUcastnikaRequest", output = "http://service/DochadzkyService/dajUcastnikaResponse")
    public Ucastnik dajUcastnika(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<service.Ucastnik>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dajUcastnikov", targetNamespace = "http://service/", className = "service.DajUcastnikov")
    @ResponseWrapper(localName = "dajUcastnikovResponse", targetNamespace = "http://service/", className = "service.DajUcastnikovResponse")
    @Action(input = "http://service/DochadzkyService/dajUcastnikovRequest", output = "http://service/DochadzkyService/dajUcastnikovResponse")
    public List<Ucastnik> dajUcastnikov();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<service.Ucastnik>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dajUcastnikovNaPrezencke", targetNamespace = "http://service/", className = "service.DajUcastnikovNaPrezencke")
    @ResponseWrapper(localName = "dajUcastnikovNaPrezenckeResponse", targetNamespace = "http://service/", className = "service.DajUcastnikovNaPrezenckeResponse")
    @Action(input = "http://service/DochadzkyService/dajUcastnikovNaPrezenckeRequest", output = "http://service/DochadzkyService/dajUcastnikovNaPrezenckeResponse")
    public List<Ucastnik> dajUcastnikovNaPrezencke(
        @WebParam(name = "arg0", targetNamespace = "")
        Prezencka arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "vymazPredmet", targetNamespace = "http://service/", className = "service.VymazPredmet")
    @ResponseWrapper(localName = "vymazPredmetResponse", targetNamespace = "http://service/", className = "service.VymazPredmetResponse")
    @Action(input = "http://service/DochadzkyService/vymazPredmetRequest", output = "http://service/DochadzkyService/vymazPredmetResponse")
    public void vymazPredmet(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "vymazPrezencku", targetNamespace = "http://service/", className = "service.VymazPrezencku")
    @ResponseWrapper(localName = "vymazPrezenckuResponse", targetNamespace = "http://service/", className = "service.VymazPrezenckuResponse")
    @Action(input = "http://service/DochadzkyService/vymazPrezenckuRequest", output = "http://service/DochadzkyService/vymazPrezenckuResponse")
    public void vymazPrezencku(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "vymazUcastnika", targetNamespace = "http://service/", className = "service.VymazUcastnika")
    @ResponseWrapper(localName = "vymazUcastnikaResponse", targetNamespace = "http://service/", className = "service.VymazUcastnikaResponse")
    @Action(input = "http://service/DochadzkyService/vymazUcastnikaRequest", output = "http://service/DochadzkyService/vymazUcastnikaResponse")
    public void vymazUcastnika(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
