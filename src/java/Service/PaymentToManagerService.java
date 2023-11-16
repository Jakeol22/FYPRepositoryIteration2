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
    public void CreateTransaction(PaymentToManagerModel newPaymentToManager){
        
        PaymentToManagerDAO pmtm = new PaymentToManagerDAO();
        pmtm.CreateTransaction(newPaymentToManager);
        return;
        
    }
}
