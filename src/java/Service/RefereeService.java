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
    public ArrayList<RefereeModel>getRefereeDetails(){
        
        RefereeDAO RefDetails = new RefereeDAO();
                
        return RefDetails.getAllReferees();
    }
}
