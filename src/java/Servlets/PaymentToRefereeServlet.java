/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Java.RefereeModel;
import Service.ManagerService;
import Service.RefereeService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "PaymentToRefereeServlet", urlPatterns = {"/PaymentToRefereeServlet"})
public class PaymentToRefereeServlet extends HttpServlet {

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
        
        ManagerService mgrsrvc = new ManagerService();
        
        String reff = null;
        if (Ref == null) {//if newaction is null, you get redirected to login page
            request.getRequestDispatcher("/SignIn.jsp").forward(request, response);
       
       
        
        }else if (Ref != null) {

            ArrayList<Long>RefID = refsrvc.GetRefereeID(); //method is called from my referee service

           
            
            
            request.setAttribute("Ref", Ref); //Attribute for my jsp
            context.setAttribute("Ref", Ref);
            
            
            ArrayList<String>RefName = refsrvc.GetRefereeName();//get referees name from ref service
            
            request.setAttribute("RefName", RefName);
            context.setAttribute("RefName", RefName);
            
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
        
                    //This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
        
   
           
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
