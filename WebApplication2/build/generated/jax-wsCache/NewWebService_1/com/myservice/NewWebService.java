
package com.myservice;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebService", targetNamespace = "http://myservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @param first
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "first", targetNamespace = "http://myservice.com/", className = "com.myservice.First")
    @ResponseWrapper(localName = "firstResponse", targetNamespace = "http://myservice.com/", className = "com.myservice.FirstResponse")
    @Action(input = "http://myservice.com/NewWebService/firstRequest", output = "http://myservice.com/NewWebService/firstResponse")
    public String first(
        @WebParam(name = "first", targetNamespace = "")
        String first);

    /**
     * 
     * @param last
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "last", targetNamespace = "http://myservice.com/", className = "com.myservice.Last")
    @ResponseWrapper(localName = "lastResponse", targetNamespace = "http://myservice.com/", className = "com.myservice.LastResponse")
    @Action(input = "http://myservice.com/NewWebService/lastRequest", output = "http://myservice.com/NewWebService/lastResponse")
    public String last(
        @WebParam(name = "last", targetNamespace = "")
        String last);

    /**
     * 
     * @param email
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "email", targetNamespace = "http://myservice.com/", className = "com.myservice.Email")
    @ResponseWrapper(localName = "emailResponse", targetNamespace = "http://myservice.com/", className = "com.myservice.EmailResponse")
    @Action(input = "http://myservice.com/NewWebService/emailRequest", output = "http://myservice.com/NewWebService/emailResponse")
    public String email(
        @WebParam(name = "email", targetNamespace = "")
        String email);

}