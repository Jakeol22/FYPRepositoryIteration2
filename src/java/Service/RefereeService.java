/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DataAccess.RefereeDAO;
import Java.RefereeModel;
import java.util.ArrayList;

/**
 *
 * @author My PC
 */
public class RefereeService {
    
    //This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
    public ArrayList<RefereeModel>getRefereeDetails(){ //Calls on getRefereeDetailsMethod from my RefereeDAO which returns an arraylist
        
        RefereeDAO RefDetails = new RefereeDAO(); //create an instance of RefereeDAO
                
        return RefDetails.getAllReferees(); //Getting and outputting the referee details
    }
}

//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project 