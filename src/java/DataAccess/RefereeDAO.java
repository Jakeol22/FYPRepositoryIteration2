/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Java.DatabaseConnection;
import Java.RefereeModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author My PC
 */
public class RefereeDAO {
     public ArrayList<RefereeModel> getAllReferees(){
         
      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
         
      
      //This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
        
      //set variables to be populated - represent my Referee Model
        long RefereeId=0; 
         String Fname = null;
         String Lname = null;
         String RefereeEmail = null;
         String RefereePassword = null;
         LocalDate RefereeDOB= null;
         long RefereePhoneNumber =0;
         String RefereeAddress = null;
         long CreditCardNumber = 0;
         
         ArrayList<RefereeModel>RefereeDetails = new ArrayList(); //create an array list based off my referee model
         
         String SelectReferee = "SELECT * FROM referee";  //select everything from my referee table
         
         try{
             PreparedStatement pstm1 = newconnection.prepareStatement(SelectReferee); 
             
             ResultSet rset = pstm1.executeQuery(); //execute the query and store the results
             
             
             
             while (rset.next()){
                
                 
                 RefereeId= (rset.getLong(1)); //Get the data from the result set
                 Fname=(rset.getString(2));
                 Lname=(rset.getString(3));
                 RefereeEmail= (rset.getString(4));
                 RefereePassword= (rset.getString(5));
                 RefereeDOB = rset.getDate(6).toLocalDate();
                 RefereePhoneNumber = (rset.getLong(7));
                 RefereeAddress = (rset.getString(8));
                 CreditCardNumber = (rset.getLong(9));
                 
                 
                 //Create a new object of referee model
                 
                 RefereeModel RefModel = new RefereeModel(RefereeId,Fname,Lname,RefereeEmail,RefereePassword,RefereeDOB,RefereePhoneNumber,RefereeAddress,CreditCardNumber); 
                
                 //Populate the object using my setters from my RefereeModel class
                 RefModel.setRefereeID(RefereeId);
                 RefModel.setRefereeFname(Fname);
                 RefModel.setRefereeLname(Lname);
                 RefModel.setRefereeEmail(RefereeEmail);
                 RefModel.setRefereePassword(RefereePassword);
                 RefModel.setRefereeDOB(RefereeDOB);
                 RefModel.setRefereePhoneNumber(RefereePhoneNumber);
                 RefModel.setRefereeAddress(RefereeAddress);
                 RefModel.setRefereeCardNumber(CreditCardNumber);
                 
                 //add the object to the arraylist "RefereeDetails"
                 RefereeDetails.add(RefModel);
                 
             }
             
         }catch (SQLException ex){
              Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex); 
         }
     
        return RefereeDetails; //Return the array list

     }
     
        public ArrayList<Long>GetRefereeID(){
        
      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
        
        long RefereeID=0;
        
        ArrayList<Long>RefereeIDList = new ArrayList<>(); //Create a new arraylist PlayerIDlist
        
              try{
          PreparedStatement Smnt1;
          
          Smnt1=newconnection.prepareStatement("Select RefereeID from referee");
          
          
          
          ResultSet Rst2 =Smnt1.executeQuery();
          
        
          
          while (Rst2.next()){
              RefereeIDList.add(Rst2.getLong("RefereeID")); 
              
   
          }
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return RefereeIDList; //return the Arraylist
    } 

public String GetRefereeName(long RefereeID){
    DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newconnection=database.getConnection(); //gets connection from db
        
      //Code for getting Referee Name taken from ChatGPT (2024)
      String RefereeName="";
        
          try{
          PreparedStatement Smnt1;
          
          Smnt1=newconnection.prepareStatement("Select RefereeFname, RefereeLname from referee where RefereeID=?");
          
           Smnt1.setLong(1, RefereeID);
          
         
          
          ResultSet Rst2 =Smnt1.executeQuery();
          
        
          
          if (Rst2.next()){
              
              String FirstName = Rst2.getString("RefereeFname");
              String LastName = Rst2.getString("RefereeLname");
   
     
     RefereeName  = FirstName + " " + LastName;
          }
      }catch (SQLException ex){
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
    return RefereeName; //return the Arraylist     
}
     
}

//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.
//ChatGPT (2024) OpenAI.Help Returning a name, using RefereeID. Available at: https://chat.openai.com/share/86b7a088-0c7d-45aa-8aa4-13aade2f81bd 