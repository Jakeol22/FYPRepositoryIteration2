/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DataAccess.PlayerDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class PlayerService {
    public  ArrayList<Long> GetManagerID(){
        
        PlayerDAO plr = new PlayerDAO();
        
        ArrayList <Long> ManagerIdList = plr.GetManagerID();
        return ManagerIdList;
    }
}
