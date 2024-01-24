/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Java.DatabaseConnection;
import Java.PaymentToManagerModel;
import Service.ManagerService;
import Service.PaymentToManagerService;
import Service.RefereeService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "PaymentServlet", urlPatterns = {"/PaymentServlet"})
public class PaymentServlet extends HttpServlet {

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

String Ref = request.getParameter("Ref"); //attribute from when the user hits a button


        
        ServletContext context = getServletContext();
        RefereeService refsrvc = new RefereeService(); //creates an instance of RefereeService
        
        ManagerService mgrsrvc = new ManagerService(); //creates an instance of ManagerService
        
 
        
        
        if (Ref == null) {//if String ref is null (when you click the button in ChosenReferee JSP), you get redirected to login page
            request.getRequestDispatcher("/ManagerSignIn.jsp").forward(request, response);
       
       
        
        }else if (Ref != null) { //If string isn't null, call on my different methods from my service/dao to get details

            ArrayList<Long>RefID = refsrvc.GetRefereeID(); //method is called from my referee service

           
            request.setAttribute("Ref", Ref); //Attribute for my jsp
            context.setAttribute("Ref", Ref);
            
            
            //Code for getting Referee Name taken from ChatGPT (2024)
            long RefereeID = Long.parseLong(Ref);
            String RefereeName = refsrvc.GetRefereeName(RefereeID);
            
        request.setAttribute("RefereeName", RefereeName);
        context.setAttribute("RefereeName", RefereeName);
            
//Session code taken from ChatGPT (2023)

            HttpSession session = request.getSession();
            String managerEmail = (String) session.getAttribute("ManagerEmail");
 
            
            ArrayList<Long>ManagerID = mgrsrvc.GetManagerID(managerEmail); //get the manager id of whos logged in
            
            request.setAttribute("ManagerID", ManagerID); //Attribute for my jsp
            context.setAttribute("ManagerID", ManagerID);
            
            
            
            
            request.getRequestDispatcher("/PaymentReferee.jsp").forward(request, response);
        
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
//ChatGPT (2024) OpenAI.Help Returning a name, using RefereeID. Available at: https://chat.openai.com/share/86b7a088-0c7d-45aa-8aa4-1f3aade281bd 