/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Java.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "SignInServlet", urlPatterns = {"/SignInServlet"})
public class SignInServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignInServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignInServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
      DatabaseConnection database = new DatabaseConnection(); //Calls on the database I have created in the DatabaseConnection class
      Connection newcon=database.getConnection();  //gets connection from db
      

      //Created this try catch with help from Youtube video: 
     //Code is from Sunita Rai (2022). See bottom of page for full reference
      try{
      
      String email = request.getParameter("email"); //get email parameter from text box in my jsp
      String pword = request.getParameter("password"); //get password parameter from text box in my jsp
      
      HttpSession session = request.getSession();
      
      PreparedStatement PPS;
      PPS=newcon.prepareStatement("select * from player where PlayerEmail=? and PlayerPassword=?"); //selects player email column from player table where the email and password must match
      

      
      PPS.setString(1, email);//value for PlayerEmail=?
      PPS.setString(2, pword);//value for PlayerPassword=?
      
      ResultSet rst=PPS.executeQuery();//carry out/execute the statement i created
        
      
      if(rst.next())
      { 
      
         session.setAttribute("PlayerID", rst.getLong("PlayerID"));       
         session.setAttribute("PlayerEmail", rst.getString("PlayerEmail"));
      
         RequestDispatcher rqd=request.getRequestDispatcher("PlayerHome.jsp");
         rqd.forward(request,response); //if the result set matches my parameters, then the user can go to the payment.jsp page

          
      }
      else
      {
          
         RequestDispatcher rqd1=request.getRequestDispatcher("SignIn.jsp");
         rqd1.forward(request,response);//if the result set doesn't match my parameters, then the user goes back to the Sign In page

      }
      }catch (SQLException ex){
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       
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


//Sunita Rai (2022)Login Page using JSP + Servlet + JDBC + MySQL (2022)- Step by Step Tutorial. Available at: https://www.youtube.com/watch?v=36cQjEEvK30 (Accessed: 05 November 2023).