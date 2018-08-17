/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import ejb.AccountFacadeLocal;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author apple
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    @EJB
    private AccountFacadeLocal accountFacade;
    
    
    

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "servicePayment")
    public String servicePayment(@WebParam(name ="accountID") int accountID, @WebParam(name = "total") double total){
        return accountFacade.Payment(accountID, total);
    }
}
