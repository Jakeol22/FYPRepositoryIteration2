/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Java.DatabaseConnection;
import Java.PaymentToRefereeModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author My PC
 */
public class PaymentToRefereeDAO {
        public void CreateNewTransaction(PaymentToRefereeModel newPaymentToReferee){
      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
      
            //The following code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
      
      Statement PPSTN = null;
      
      try{
          PPSTN = newconnection.createStatement();
          
          String newsql = String.format("Insert into PaymentToReferee(ManagerID, RefereeID,PaymentToRefereeStatus, PaymentToRefereeAmount, DateOfPaymentToReferee)" + 
                  "VALUES('%s','%s','Succesful','%s','%s')", newPaymentToReferee.getManagerID(), newPaymentToReferee.getRefereeID(), newPaymentToReferee.getPaymentToRefereeAmount(), newPaymentToReferee.getDateOfPaymentToReferee()); //insert statement and use my getters from paymenttoreferee model
          
          PPSTN.executeUpdate(newsql); //execute my statement
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
}

}