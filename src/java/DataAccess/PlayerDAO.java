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
    public  ArrayList<Long> GetManagerID(String playerEmail){
      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
      
      long ManagerID= 0;
      
      ArrayList<Long>ManagerIDlist = new ArrayList<>();
      
     
      
      try{
          PreparedStatement smnt;
          
          smnt=newconnection.prepareStatement("Select ManagerID from player where PlayerEmail=?");
          
          smnt.setString(1, playerEmail);
          
          ResultSet rst1 =smnt.executeQuery();
          
        
          
          while (rst1.next()){
              ManagerIDlist.add(rst1.getLong("ManagerID"));
              
   
          }
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return ManagerIDlist;
    }
    
    public ArrayList<Long>GetPlayerID(String playerEmail){
        
      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
        
        long PlayerID=0;
        
        ArrayList<Long>PlayerIDList = new ArrayList<>();
        
              try{
          PreparedStatement Smnt1;
          
          Smnt1=newconnection.prepareStatement("Select PlayerID from player where PlayerEmail=?");
          
          Smnt1.setString(1, playerEmail);
          
          ResultSet Rst2 =Smnt1.executeQuery();
          
        
          
          while (Rst2.next()){
              PlayerIDList.add(Rst2.getLong("PlayerID"));
              
   
          }
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return PlayerIDList;
    }
    
    public ArrayList<String>GetManagerName(String playerEmail){

      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
        
        
        String ManagerFname = "";
        
        ArrayList<String>ManagerNameList = new ArrayList<>();
        
        try{
          PreparedStatement Smnt3;
          
          Smnt3=newconnection.prepareStatement("SELECT mgr.ManagerFname, mgr.ManagerLname FROM manager mgr JOIN player plr ON mgr.ManagerID = plr.ManagerID where plr.PlayerEmail=?");
          
          Smnt3.setString(1, playerEmail);
          
          ResultSet Rst3 =Smnt3.executeQuery();
          
        
          
          while (Rst3.next()){
              ManagerNameList.add(Rst3.getString("ManagerFname"));
              ManagerNameList.add(Rst3.getString("ManagerLname"));
              
   
          }
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return ManagerNameList;
    }
        
}



