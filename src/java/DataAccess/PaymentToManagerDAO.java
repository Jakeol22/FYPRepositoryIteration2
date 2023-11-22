/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Java.DatabaseConnection;
import Java.PaymentToManagerModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.sql.Connection;
import java.util.logging.Logger;

/**
 *
 * @author My PC
 */
public class PaymentToManagerDAO {
    public void CreateTransaction(PaymentToManagerModel newPaymentToManager){
      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
        
      //The following code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
      
      Statement PPSTN1 = null;
      
      try{
          PPSTN1 = newconnection.createStatement();
          
          String newsql = String.format("Insert into PaymentToManager(PlayerID, ManagerID,PaymentToManagerStatus, PaymentToManagerAmount, DateOfPaymentToManager)" + 
                  "VALUES('%s','%s','Succesful','%s','%s')", newPaymentToManager.getPlayerID(), newPaymentToManager.getManagerID(), newPaymentToManager.getPaymentToManagerAmount(), newPaymentToManager.getDateOfPaymentToManager()); //insert statement and use my getters from paymenttomanager model
          
          PPSTN1.executeUpdate(newsql); //execute my statement
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
}
}

//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project (Accessed from 15th to 22nd of November,2023)