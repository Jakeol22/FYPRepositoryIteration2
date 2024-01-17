/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DataAccess.ManagerDAO;
import java.util.ArrayList;

/**
 *
 * @author My PC
 */
public class ManagerService {
    
    
    //The following code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
   public  ArrayList<Long> GetManagerID(String managerEmail)  { //Calls on the GetManagerID method from my dao
        
        
        ManagerDAO mgr = new ManagerDAO(); //creates a new instance of ManagerID
        return mgr.GetManagerID(managerEmail); //gets the ManagerID 
    }
    
}
//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.