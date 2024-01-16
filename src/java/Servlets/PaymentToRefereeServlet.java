/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Java.RefereeModel;
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

String ref = request.getParameter("ref"); //attribute from when the user hits a button
        
        ServletContext context = getServletContext();
        RefereeService refsrvc = new RefereeService(); //creates an instance of RefereeService
        String reff = null;
        if (ref == null) {//if newaction is null, you get redirected to login page
            request.getRequestDispatcher("/SignIn.jsp").forward(request, response);
       
       
        
        }else if (ref != null && ref.equals("GetRefIDs")) {

            ArrayList<RefereeModel>RefDetails = refsrvc.getRefereeDetails(); //method is called from my referee service

            
            request.setAttribute("RefDetails", RefDetails); //Attribute for my jsp
            context.setAttribute("RefDetails", RefDetails);
            
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
