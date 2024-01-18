/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Java.PaymentToRefereeModel;
import Java.RefereeModel;
import Service.ManagerService;
import Service.PaymentToRefereeService;
import Service.RefereeService;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
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
        
 
        
        
        if (Ref == null) {//if ref  null, you get redirected to login page
            request.getRequestDispatcher("/SuccessManagerPaymentToReferee.jsp").forward(request, response);
       
       
        
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
    
    }    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

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
        
   long ManagerID = Long.parseLong(request.getParameter("managerid"));
   long RefereeID = Long.parseLong(request.getParameter("refereeid"));
   String status = request.getParameter("status");
   long AmountDue = Long.parseLong(request.getParameter("AmountDue"));
   LocalDate newDate = LocalDate.now();
   
   PaymentToRefereeModel ptrm = new PaymentToRefereeModel(ManagerID, RefereeID, status, AmountDue, newDate);
           
   ptrm.setManagerID(ManagerID);
   ptrm.setRefereeID(RefereeID);
   ptrm.setPaymentToRefereeStatus("Succesful");
   ptrm.setPaymentToRefereeAmount(AmountDue);
   ptrm.setDateOfPaymentToReferee(newDate);
   
   PaymentToRefereeService ptrs = new PaymentToRefereeService();
   ptrs.CreateNewTransaction(ptrm);
   
 System.out.println("Before redirect");
   request.getRequestDispatcher("/SuccessManagerPaymentToReferee.jsp").forward(request, response);
   System.out.println("After redirect");
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