/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Java.DatabaseConnection;
import Java.PlayerModel;
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
public class PlayerDAO {
    public  ArrayList<Long> GetManagerID(){
      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
      
      long ManagerID= 0;
      
      ArrayList<Long>ManagerIDlist = new ArrayList<>();
      
     
      
      try{
          PreparedStatement smnt;
          
          smnt=newconnection.prepareStatement("Select ManagerID from player where PlayerID=2");
          
          
          ResultSet rst1 =smnt.executeQuery();
          
        
          
          while (rst1.next()){
              ManagerIDlist.add(rst1.getLong("ManagerID"));
              
   
          }
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return ManagerIDlist;
    }
}
