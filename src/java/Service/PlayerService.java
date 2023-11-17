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
    public  ArrayList<Long> GetManagerID(String playerEmail)throws SQLException {
        
        
        PlayerDAO plr = new PlayerDAO();
        return plr.GetManagerID(playerEmail);
    }
    
    
    
    public  ArrayList<Long> GetPlayerID(String playerEmail)throws SQLException {
        
        
        PlayerDAO plr1 = new PlayerDAO();
        return plr1.GetPlayerID(playerEmail);
    }
}
