/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Virus
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    
    @WebMethod(operationName = "first")
    public String first(@WebParam(name = "first") String first) {
        //TODO write your implementation code here:
        return first;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "last")
    public String last(@WebParam(name = "last") String last) {
        //TODO write your implementation code here:
        return last;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "email")
    public String email(@WebParam(name = "email") String email) {
        //TODO write your implementation code here:
        return email;
    }
}

