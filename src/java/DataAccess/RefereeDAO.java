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
         
         long RefereeId=0;
         String Fname = null;
         String Lname = null;
         String RefereeEmail = null;
         String RefereePassword = null;
         LocalDate RefereeDOB= null;
         long RefereePhoneNumber =0;
         String RefereeAddress = null;
         long CreditCardNumber = 0;
         
         ArrayList<RefereeModel>RefereeDetails = new ArrayList();
         
         String SelectReferee = "SELECT * FROM referee";
         
         try{
             PreparedStatement pstm1 = newconnection.prepareStatement(SelectReferee);
             
             ResultSet rset = pstm1.executeQuery();
             
             int refcount=0;
             
             while (rset.next()){
                 //if (refcount>=NumReferee)
                    // break;
                 
                 RefereeId= (rset.getLong(1));
                 Fname=(rset.getString(2));
                 Lname=(rset.getString(3));
                 RefereeEmail= (rset.getString(4));
                 RefereePassword= (rset.getString(5));
                 RefereeDOB = rset.getDate(6).toLocalDate();
                 RefereePhoneNumber = (rset.getLong(7));
                 RefereeAddress = (rset.getString(8));
                 CreditCardNumber = (rset.getLong(9));
                 
                 
                 RefereeModel RefModel = new RefereeModel(RefereeId,Fname,Lname,RefereeEmail,RefereePassword,RefereeDOB,RefereePhoneNumber,RefereeAddress,CreditCardNumber);
                 RefModel.setRefereeID(RefereeId);
                 RefModel.setRefereeFname(Fname);
                 RefModel.setRefereeLname(Lname);
                 RefModel.setRefereeEmail(RefereeEmail);
                 RefModel.setRefereePassword(RefereePassword);
                 RefModel.setRefereeDOB(RefereeDOB);
                 RefModel.setRefereePhoneNumber(RefereePhoneNumber);
                 RefModel.setRefereeAddress(RefereeAddress);
                 RefModel.setRefereeCardNumber(CreditCardNumber);
                 
                 RefereeDetails.add(RefModel);
                 refcount++;
             }
             
         }catch (SQLException ex){
              Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex); 
         }
     
        return RefereeDetails; 

     }

}