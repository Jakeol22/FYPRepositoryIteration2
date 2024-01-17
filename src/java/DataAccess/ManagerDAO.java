/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Java.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author My PC
 */
public class ManagerDAO {
    
    //The following code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
    
    public ArrayList<Long>GetManagerID(String managerEmail){
        
      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
        
        long ManagerID=0;
        
        ArrayList<Long>ManagerIDList = new ArrayList<>(); //Create a new arraylist PlayerIDlist
        
              try{
          PreparedStatement Smnt1;
          
          Smnt1=newconnection.prepareStatement("Select ManagerID from manager where ManagerEmail=?");
          
          Smnt1.setString(1, managerEmail); //Set the value of PlayerEmail
          
          ResultSet Rst2 =Smnt1.executeQuery();
          
        
          
          while (Rst2.next()){
              ManagerIDList.add(Rst2.getLong("ManagerID")); 
              
   
          }
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return ManagerIDList; //return the Arraylist
    }
    
    
}
//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.