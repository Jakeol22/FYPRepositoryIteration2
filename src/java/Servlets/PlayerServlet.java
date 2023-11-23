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
        
        //The process request code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).

String newaction = request.getParameter("newaction"); //attribute from when the user hits a button
        
        ServletContext context = getServletContext();
        PlayerService plrsrvc = new PlayerService(); //creates an instance of PlayerService
        String plr = null;
        if (newaction == null) {//if newaction is null, you get redirected to login page
            request.getRequestDispatcher("/SignIn.jsp").forward(request, response);
       
       
        
        }else if (newaction != null && newaction.equals("GetManagerIDs")) {
    
    //if new action isnt null and equals GetManagerIDs(from my jsp) the following happens
    //Session is retrieved
    //playerEmail is grabbed from session
    
    
    //Session code taken from ChatGPT (2023)
    
           
            HttpSession session = request.getSession();
            String playerEmail = (String) session.getAttribute("PlayerEmail");
           
            
            //this code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
         
            
            ArrayList<Long> ManagerIDlist = plrsrvc.GetManagerID(playerEmail); //new array list that calls on GetManagerID method from Player service, using an instance of PlayerService. Retrives ManagerID using the session
            
                request.setAttribute("ManagerIDlist", ManagerIDlist);//Attribute for JSP
                context.setAttribute("ManagerIDlist", ManagerIDlist);
                
                
                
               ArrayList<Long> PlayerIDlist = plrsrvc.GetPlayerID(playerEmail);  //new array list that calls on GetManagerID method from Player service, using an instance of PlayerService. Retrives PlayerID using the session
               
               request.setAttribute("PlayerIDlist", PlayerIDlist);//Attribute for JSP
               context.setAttribute("PlayerIDlist", PlayerIDlist);
               
              ArrayList<String> ManagerNameList = plrsrvc.GetManagerName(playerEmail);  //new array list that calls on GetManagerName method from Player service, using an instance of PlayerService. Retrives Manager using the session
               
               request.setAttribute("ManagerNameList", ManagerNameList);//Attribute for session
               context.setAttribute("ManagerNameList", ManagerNameList);
               
               
                

           
     request.getRequestDispatcher("Payment.jsp").forward(request, response);
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
                
        
                //This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).

        //setting variables that will hold what the user enters in the form
        
        long playerid = Long.parseLong(request.getParameter("playerid"));
    long managerid = Long.parseLong(request.getParameter("managerid"));
    String Status = request.getParameter("Status");
    long AmountDue =Long.parseLong(request.getParameter("AmountDue"));
    LocalDate currentDate = LocalDate.now();
    
  //create a new object of PaymentToManagerModel class
    PaymentToManagerModel newpmtmm = new PaymentToManagerModel(playerid, managerid, Status, AmountDue, currentDate);
    
    //Populate the object with the variables from above, which hold what the user entered
    newpmtmm.setPlayerID(playerid);
    newpmtmm.setManagerID(managerid);
    newpmtmm.setPaymentToManagerStatus("Succesful");
    newpmtmm.setPaymentToManagerAmount(AmountDue);
    newpmtmm.setDateOfPaymentToManager(currentDate);
   
    PaymentToManagerService ptms = new PaymentToManagerService();  //Create new object from Payment to manager service
    ptms.CreateTransaction(newpmtmm);
        

    request.getRequestDispatcher("Success.jsp").forward(request, response);
    
          
    
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

//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project (Accessed from 15th to 22nd of November,2023)
//ChatGPT (2023) OpenAI. Available at: https://chat.openai.com/share/e7c505f4-8d53-423a-ad7d-a75b9556730e(Accessed: 18 November 2023). 