/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Java.PaymentToManagerModel;
import DataAccess.PaymentToManagerDAO;

/**
 *
 * @author My PC
 */
public class PaymentToManagerService {
    
    //The following code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
    public void CreateTransaction(PaymentToManagerModel newPaymentToManager){ //Calls on create transaction from my PaymentToManagerDAO
        
        PaymentToManagerDAO pmtm = new PaymentToManagerDAO(); //Create new instance of PaymentToManagerDAO
        pmtm.CreateTransaction(newPaymentToManager); //retrive the details
        return;
        
    }
}

//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.