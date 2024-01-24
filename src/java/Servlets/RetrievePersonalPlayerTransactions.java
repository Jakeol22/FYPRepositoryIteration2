/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Java.DatabaseConnection;
import Java.PaymentToManagerModel;
import Service.PlayerService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
@WebServlet(name = "RetrievePersonalPlayerTransactions", urlPatterns = {"/RetrievePersonalPlayerTransactions"})
public class RetrievePersonalPlayerTransactions extends HttpServlet {

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
        //The process request code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).

String newestaction = request.getParameter("newestaction"); //attribute from when the user hits a button
        
        ServletContext context = getServletContext();
                 
      PlayerService plrsrvc = new PlayerService();
        String plr = null;
        if (newestaction == null) {//if newaction is null, you get redirected to login page
            request.getRequestDispatcher("/SignIn.jsp").forward(request, response);
       
       
        
        }else if (newestaction != null && newestaction.equals("GetTransactions")) {
         
                    
        //Session code taken from ChatGPT (2023)
        HttpSession session = request.getSession();
        Long PlayerID = (Long)session.getAttribute("PlayerID");
        String playerEmail = (String) session.getAttribute("PlayerEmail");

        
        

           

            
            
       
        ArrayList<PaymentToManagerModel>GetPlayerTransactions = plrsrvc.GetPlayerTransactions(PlayerID);
        
            request.setAttribute("GetPlayerTransactions", GetPlayerTransactions); //Attribute for my jsp
            context.setAttribute("GetPlayerTransactions", GetPlayerTransactions);
            
        ArrayList<String> ManagerNameList = plrsrvc.GetManagerName(playerEmail);  //new array list that calls on GetManagerName method from Player service, using an instance of PlayerService. Retrives Manager using the session
               
               request.setAttribute("ManagerNameList", ManagerNameList);//Attribute for session
               context.setAttribute("ManagerNameList", ManagerNameList);
          
            
            request.getRequestDispatcher("/ViewPlayerTransactions.jsp").forward(request, response);
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
//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.
//ChatGPT (2023) OpenAI.Help with session. Available at: https://chat.openai.com/share/e7c505f4-8d53-423a-ad7d-a75b9556730e 