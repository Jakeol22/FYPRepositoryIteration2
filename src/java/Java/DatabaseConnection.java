/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

/**
 *
 * @author My PC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection {
    
    public Connection getConnection(){
        
        try {
            //This was taken from Bill Emerson notes(2023)--JDBC_Part1_IS3312.ppt
            Class.forName("com.mysql.jdbc.Driver"); //loading the driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fypsetup", "root", "BlaizeAstro22");//connecting to my database with my username and password
            
            return con; //returns the database connection
            

//Created this class with help from youtube video:
// Code is from SDE Camp (2015). See bottom of page for full reference.
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex); //catches an error if there's an issue loading the driver//Netbeans filled this in
            return null; 
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);  //catches an error if there's an issue connecting to the database//Netbeans filled this in
            return null;
        }
                    
    }
}
    

//Bill Emerson notes from IS3312 (2023): JDBC_Part1_IS3312.ppt. -Notes on JDBC (Accessed: 01 November 2023).
//SDE Camp (2015)Make Java Web Application Connect To MySQL. Available at: https://www.youtube.com/watch?v=CHBfplHDO7I (Accessed: 05 November 2023).
