/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Java.DatabaseConnection;
import Java.PaymentToManagerModel;
import Java.PlayerModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
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
    
    
    //Below is a method to retrieve a players transactions, using their PlayerID, based on who's logged in
  public ArrayList<PaymentToManagerModel>GetPlayerTransactions(Long PlayerID){
        
      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
        
      
      //set my variables to create a new instance of my PaymentToManagerModel
        long PaymentToManagerID=0;
        long PlayerIDD = 0;
        long ManagerID = 0;
        String PaymentToManagerStatus = null;
        long PaymentToManagerAmount = 0;
        LocalDate DateOfPaymentToManager = null;
       
        
        ArrayList<PaymentToManagerModel>NewPlayerTransactions = new ArrayList<>(); //Create a new arraylist NewPlayerTransactions
        
              try{
          PreparedStatement Smnt1;
          
          Smnt1=newconnection.prepareStatement("Select * from PaymentToManager where PlayerID=?");//Select everything from PaymentToManager table where PlayerID is unknown
          
          Smnt1.setLong(1, PlayerID); //Set the value of PlayerID
          
          ResultSet Rst2 =Smnt1.executeQuery();
          
        
          
          while (Rst2.next()){
            
              //Code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
              PaymentToManagerID=(Rst2.getLong(1));
              PlayerID=(Rst2.getLong(2));
              ManagerID=(Rst2.getLong(3));
              PaymentToManagerStatus=(Rst2.getString(4));
              PaymentToManagerAmount=(Rst2.getLong(5));
              DateOfPaymentToManager =Rst2.getDate(6).toLocalDate();
              


            //Create new instance of PaymentToManagertModel
            PaymentToManagerModel PlayerTransactions = new PaymentToManagerModel(PaymentToManagerID, PlayerID, ManagerID, PaymentToManagerStatus, PaymentToManagerAmount, DateOfPaymentToManager);
            
            
            PlayerTransactions.setPlayerID(PlayerID);
            PlayerTransactions.setManagerID(ManagerID);
            PlayerTransactions.setPaymentToManagerStatus(PaymentToManagerStatus);
            PlayerTransactions.setPaymentToManagerAmount(PaymentToManagerAmount);
            PlayerTransactions.setDateOfPaymentToManager(DateOfPaymentToManager);
            
         NewPlayerTransactions.add(PlayerTransactions);
          }
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return NewPlayerTransactions; //return the Arraylist
    }
  
  
  //Created below thinking it would do something else. will keep it for the future just in case
  public PlayerModel getPlayerById(long PlayerID) {

      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
         
      
         long Playerid=0; 
         long ManagerID=0;
         String Fname = null;
         String Lname = null;
         String PlayerEmail = null;
         String PlayerPassword = null;
         String PlayerClub = null;
         String PlayerTeam = null;
         LocalDate PlayerDOB= null;
         String PlayerPhoneNumber =null;
         String PlayerAddress = null;
         String CreditCardNumber = null;
         
         
        PlayerModel tempUser = new PlayerModel(Playerid,ManagerID,Fname,Lname,PlayerEmail,PlayerPassword,PlayerClub,PlayerTeam,PlayerDOB,PlayerPhoneNumber,PlayerAddress,CreditCardNumber);

        String query = String.format("SELECT * FROM Player WHERE PlayerID=%d",PlayerID);
        try {
            PreparedStatement stmt = newconnection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Playerid = (rs.getLong(1));
                ManagerID = (rs.getLong(2));
                Fname = (rs.getString(3));
                Lname = (rs.getString(4));
                PlayerEmail = (rs.getString(5));
                PlayerPassword = (rs.getString(6));
                PlayerClub = (rs.getString(7));
                PlayerTeam = (rs.getString(8));
                PlayerDOB = rs.getDate(9).toLocalDate();
                PlayerPhoneNumber = (rs.getString(10));
                PlayerAddress = (rs.getString(11));
                CreditCardNumber = (rs.getString(12));

                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        tempUser.setPlayerID(Playerid);
        tempUser.setManagerID(ManagerID);
        tempUser.setPlayerFname(Fname);
        tempUser.setPlayerLname(Lname);
        tempUser.setPlayerEmail(PlayerEmail);
        tempUser.setPlayerPassword(PlayerPassword);
        tempUser.setPlayerClub(PlayerClub);
        tempUser.setPlayerTeam(PlayerTeam);
        tempUser.setPlayerDob(PlayerDOB);
        tempUser.setPlayerPhoneNumber(PlayerPhoneNumber);
        tempUser.setPlayerAddress(PlayerAddress);
        tempUser.setPlayerCardNumber(CreditCardNumber);
       
        return tempUser;

    }
        
}


//ChatGPT (2023) OpenAI. Help with sql query. Available at: https://chat.openai.com/share/dac1976d-64b4-406d-8991-aaf3166bdc8e . 

//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.
