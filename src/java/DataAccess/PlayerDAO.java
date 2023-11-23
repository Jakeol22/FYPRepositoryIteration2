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
      
      //This page has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).

       
      long ManagerID= 0; //starts ManagerID off at 0
      
      ArrayList<Long>ManagerIDlist = new ArrayList<>(); //Create a new arraylist ManagerIDlist to store manager ID
      
     
      
      try{
          PreparedStatement smnt;
          
          smnt=newconnection.prepareStatement("Select ManagerID from player where PlayerEmail=?"); //Get manager id where the playeremail isn't known yet
          
          smnt.setString(1, playerEmail); //Set the value of PlayerEmail
          
          ResultSet rst1 =smnt.executeQuery();//execute the query
          
        
          
          while (rst1.next()){
              ManagerIDlist.add(rst1.getLong("ManagerID")); //store the value in the result set
              
   
          }
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return ManagerIDlist; //return the Arraylist
    }
    
    public ArrayList<Long>GetPlayerID(String playerEmail){
        
      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
        
        long PlayerID=0;
        
        ArrayList<Long>PlayerIDList = new ArrayList<>(); //Create a new arraylist PlayerIDlist
        
              try{
          PreparedStatement Smnt1;
          
          Smnt1=newconnection.prepareStatement("Select PlayerID from player where PlayerEmail=?");
          
          Smnt1.setString(1, playerEmail); //Set the value of PlayerEmail
          
          ResultSet Rst2 =Smnt1.executeQuery();
          
        
          
          while (Rst2.next()){
              PlayerIDList.add(Rst2.getLong("PlayerID")); 
              
   
          }
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return PlayerIDList; //return the Arraylist
    }
    
    public ArrayList<String>GetManagerName(String playerEmail){

      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
        
        
        String ManagerFname = "";
        
        ArrayList<String>ManagerNameList = new ArrayList<>(); //Create a new arraylist ManagerNamelist
        
        try{
          PreparedStatement Smnt3;
          
          //Statement was created with help from chat gpt (2023)
          Smnt3=newconnection.prepareStatement("SELECT mgr.ManagerFname, mgr.ManagerLname FROM manager mgr JOIN player plr ON mgr.ManagerID = plr.ManagerID where plr.PlayerEmail=?");
          
          Smnt3.setString(1, playerEmail);
          
          ResultSet Rst3 =Smnt3.executeQuery();
          
        
          
          while (Rst3.next()){
              ManagerNameList.add(Rst3.getString("ManagerFname")); //Get the manager first name
              ManagerNameList.add(Rst3.getString("ManagerLname")); //Get the manager last name
              
   
          }
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return ManagerNameList; //Return the list
    }
        
}


//ChatGPT (2023) OpenAI. Help with sql query. Available at: https://chat.openai.com/share/dac1976d-64b4-406d-8991-aaf3166bdc8e . 

//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.
