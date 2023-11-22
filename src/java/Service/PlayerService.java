/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DataAccess.PlayerDAO;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author My PC
 */
public class PlayerService {
    
    //This service code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).

    public  ArrayList<Long> GetManagerID(String playerEmail)  { //Calls on the GetManagerID method from my dao
        
        
        PlayerDAO plr = new PlayerDAO(); //creates a new instance of 
        return plr.GetManagerID(playerEmail);
    }
    
    
    
    public  ArrayList<Long> GetPlayerID(String playerEmail) {
        
        
        PlayerDAO plr1 = new PlayerDAO();
        return plr1.GetPlayerID(playerEmail);
    }
    
        public  ArrayList<String> GetManagerName(String playerEmail){
        
        
        PlayerDAO plr2 = new PlayerDAO();
        return plr2.GetManagerName(playerEmail);
    }
}
