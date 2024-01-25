/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DataAccess.PaymentToRefereeDAO;
import Java.PaymentToRefereeModel;

/**
 *
 * @author My PC
 */

//The following code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
public class PaymentToRefereeService {
    public void CreateNewTransaction (PaymentToRefereeModel newPaymentToReferee){
        PaymentToRefereeDAO ptr = new PaymentToRefereeDAO();
        ptr.CreateNewTransaction(newPaymentToReferee);
    }
}
//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.