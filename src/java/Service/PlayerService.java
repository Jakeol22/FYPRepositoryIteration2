/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DataAccess.PlayerDAO;
import Java.PaymentToManagerModel;
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
        
        
        PlayerDAO plr = new PlayerDAO(); //creates a new instance of PlayerDAO
        return plr.GetManagerID(playerEmail); //gets the ManagerID of the person logged in 
    }
    
    
    
    public  ArrayList<Long> GetPlayerID(String playerEmail) {//Calls on the GetPlayerID method from my dao
        
        
        PlayerDAO plr1 = new PlayerDAO(); //creates a new instance of PlayerDAO
        return plr1.GetPlayerID(playerEmail); //gets the PlayerID of the person logged in 
    }
    
        public  ArrayList<String> GetManagerName(String playerEmail){ //Calls on the GetManagerName method from my dao
        
        
        PlayerDAO plr2 = new PlayerDAO(); //creates a new instance of PlayerDAO
        return plr2.GetManagerName(playerEmail); //gets the ManagerName of the person logged in 
    }
        
        public  ArrayList<PaymentToManagerModel> GetPlayerTransactions(Long PlayerID){ //Calls on the GetManagerName method from my dao
        
        
        PlayerDAO plr3 = new PlayerDAO(); //creates a new instance of PlayerDAO
        return plr3.GetPlayerTransactions(PlayerID);
        }//gets the ManagerName of the person logged in
}

//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas. 