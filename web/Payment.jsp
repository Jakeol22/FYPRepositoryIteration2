<%-- 
    Document   : Payment
    Created on : 8 Nov 2023, 14:25:52
    Author     : My PC
--%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
         <!--This was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->
   <%HttpSession sessionLogin = request.getSession();
    String email = (String) session.getAttribute("PlayerEmail");
    %>
    </head>
    
    <!--Color taken from ColorHexa-->
    <body style="background-color: #e0e0e0">
        
        <nav class="navbar navbar-expand navbar-white bg-dark"  aria-label="Referee fees">
    <div class="container-fluid" >
        
        <!-- Image sourced from flaticon.com   <a href="https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Futuer - Flaticon</a>-->
        <a class="navbar-brand" style ="color: white"   href="#">Referee fees </a> <img src="Images/referee.png" style="width: 45px; height: 45px;"></img> 


        <!--Navbar was created with the use of bootstrap-->
      <div class="collapse navbar-collapse" id="navbarsExample02">
          
          
        <ul class="navbar-nav me-auto"> 
          <li class="nav-item">
            <a class="nav-link active" style ="color: white;" aria-current="page" href="SignIn.jsp">Home</a> <!--Link for my home page-->
          </li>
          
          <li class="nav-item">
            <a class="nav-link" style ="color: white;"  href="#">Make Payment!</a> <!--Link for my Make Payment page-->
          </li>
          
           <li class="nav-item">
            <a class="nav-link" style ="color: white;"  href="#">About</a> <!--Link for my About page-->
          </li>
          
        </ul>

      </div>
    </div>
  </nav>
        
        
         <!--This was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->
        
   <% if (email != null) { %>
          <li>Hello, ${PlayerEmail}!</li>
          
          <% } %>
         
          
          
<div class="container">
        <div class=" text-center mt-5 ">

            <h1 >Make a payment to your manager</h1>
            
            
           
            <h3> Your Manager is:
                      
        
                  ${ManagerNameList}        
   
                
            
            </h3> 
            
                
            
        </div>

    
                  
                  <!--Below form/html is taken from BBbootstrap (2019)-->
    <div class="row " >
        
      <div class="col-lg-7 mx-auto">
        <div class="card mt-2 mx-auto p-4 " style="background-color: #E6E6FA; border-color: black; border-width: 5px">
            <div class="card-body">
       
            <div class = "container">
                             <form action="PlayerServlet" method="post"id="contact-form" role="form" > <!--Calls on playerservlet-->

                              

            <div class="controls">

 
                <div class="row">
    <div class="col-md-6">
        <div class="form-group">
             
                          
            <label for="form_need">Your Player ID is: </label>
            
            
            <select id="form_need" name="playerid" class="form-control" required="required" data-error="Please specify your need.">
      <!--Asked CHATGPT for help on making a for loop in a dropdown (2023)-->
      <!--This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).-->
                <c:forEach var="PlayerID" items="${PlayerIDlist}">
        <option value="${PlayerID}">${PlayerID}</option> <!--Gets Player ID from servlet-->
    </c:forEach>
            </select>
        </div>
    </div>
                    
                    <div class="col-md-6">
        <div class="form-group">
             <!--This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).-->
            <label for="form_need">Your Managers ID is: </label>
            <select id="form_need" name="managerid" class="form-control" required="required" data-error="Please specify your need.">
      
                <!--Asked CHATGPT for help on making a for loop in a dropdown (2023)-->
                <c:forEach var="ManagerID" items="${ManagerIDlist}">
        <option value="${ManagerID}">${ManagerID}</option> <!--Recognises Manager ID from servlet-->
    </c:forEach>
            </select>
        </div>
                </div>


     
                         
    <div class="col-md-6">
                         <div class="form-group">
            <label for="form_need">Amount due to Manager (€):</label>
            <select id="form_need" name="AmountDue" class="form-control" required="required" data-error="Please specify your need.">
              
              <option> 5 </option> <!--Amount to be paid-->
            </select>
        </div>
        </div>
                    
                                 
 

                </div>
         </div>
                    
</div>
                
                


                    <div class="col-md-12">
                        
                        <!-- Asked chatgpt about this as newaction was null when selecting the button (2023)-->
                        <input type="hidden" name="newaction" value="MakePayment">

                        <input type="submit" class="btn btn-success btn-send  pt-2 btn-block
                            " value="Pay now!" >
                    
                </div>
          
                </div>


        </div>
         </form>
        </div>
            </div>


    </div>
        <!-- /.8 -->

    </div>
    <!-- /.row-->

</div>
</div>

    </body>
</html>

<!--Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.-->
<!--BBbootstrap (2019) Bootstrap 4 Simple Contact Form. Available at https://bbbootstrap.com/snippets/simple-contact-form-74408136 -->
<!--Bootstrap (2023) Navbars example. Available at: https://getbootstrap.com/docs/5.3/examples/navbars/>
<!--Color Hexa (2023) #e0e0e0 Hex Color. Available at: https://www.colorhexa.com/e0e0e0>
<!--ChatGPT (2023) OpenAI. Help on dropdown loop. Available at: https://chat.openai.com/share/6762dd59-58fd-4ed9-b34a-e951df487afe  -->
<!--ChatGPT (2023) OpenAI. Help on "new action" being null. Available at: https://chat.openai.com/share/06c7a056-d61b-443e-b8e9-d820d92fad0e -->
<!--Futuer (2023) Referee Icon. Available at: https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Futuer - Flaticon>
<!--Jake O'Leary(2022), HowsYourHoover project from IS3312.Available on my one drive.-->