/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Java.DatabaseConnection;
import Java.PaymentToManagerModel;
import Service.PaymentToManagerService;
import Service.PlayerService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author My PC
 */
@WebServlet(name = "PlayerServlet", urlPatterns = {"/PlayerServlet"})
public class PlayerServlet extends HttpServlet  {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
String newaction = request.getParameter("newaction");
        
        ServletContext context = getServletContext();
        PlayerService plrsrvc = new PlayerService();
        String plr = null;
        if (newaction == null) 
            request.getRequestDispatcher("/SignIn.jsp").forward(request, response);
       
       
        
if (newaction != null && newaction.equals("GetManagerIDs")) {
           
            HttpSession session = request.getSession();
            String playerEmail = (String) session.getAttribute("PlayerEmail");
           
            
           try{
            
            ArrayList<Long> ManagerIDlist = plrsrvc.GetManagerID(playerEmail); 
            
                request.setAttribute("ManagerIDlist", ManagerIDlist);
                context.setAttribute("ManagerIDlist", ManagerIDlist);
                
                
                
               ArrayList<Long> PlayerIDlist = plrsrvc.GetPlayerID(playerEmail);  
               
               request.setAttribute("PlayerIDlist", PlayerIDlist);
               context.setAttribute("PlayerIDlist", PlayerIDlist);
               
              ArrayList<String> ManagerNameList = plrsrvc.GetManagerName(playerEmail);  
               
               request.setAttribute("ManagerNameList", ManagerNameList);
               context.setAttribute("ManagerNameList", ManagerNameList);
               
               
                request.getRequestDispatcher("/Payment.jsp").forward(request, response);
           }catch (SQLException ex) {
               Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
 
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
                
        long playerid = Long.parseLong(request.getParameter("playerid"));
    long managerid = Long.parseLong(request.getParameter("managerid"));
    String Status = request.getParameter("Status");
    long AmountDue =Long.parseLong(request.getParameter("AmountDue"));
    LocalDate currentDate = LocalDate.now();
    
  
    PaymentToManagerModel newpmtmm = new PaymentToManagerModel(playerid, managerid, Status, AmountDue, currentDate);
    
    newpmtmm.setPlayerID(playerid);
    newpmtmm.setManagerID(managerid);
    newpmtmm.setPaymentToManagerStatus("Succesful");
    newpmtmm.setPaymentToManagerAmount(AmountDue);
    newpmtmm.setDateOfPaymentToManager(currentDate);
   
    PaymentToManagerService ptms = new PaymentToManagerService();
    ptms.CreateTransaction(newpmtmm);
        

    
    
                    
    
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
