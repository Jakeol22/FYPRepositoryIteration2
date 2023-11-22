<%-- 
    Document   : PlayerHome
    Created on : 15 Nov 2023, 14:10:04
    Author     : My PC
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
   <%HttpSession sessionLogin = request.getSession();
    String email = (String) session.getAttribute("ManagerEmail");
    %>
    </head>
    <body>
         <!--Color taken from ColorHexa-->
    <body style="background-color: #e0e0e0"> 
        

<nav class="navbar navbar-expand navbar-white bg-dark" style ="text-align: right"  aria-label="Referee fees">
    <div class="container-fluid" >
        
        <!-- Image sourced from flaticon.com   <a href="https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Futuer - Flaticon</a>-->
        <a class="navbar-brand" style ="color: white"   href="#">Referee fees </a> <img src="Images/referee.png" style="width: 45px; height: 45px;"></img> 


        <!--Navbar was created with the use of bootstrap-->
      <div class="collapse navbar-collapse" id="navbarsExample02">
          
          
        <ul class="navbar-nav me-auto"> 
          <li class="nav-item">
            <a class="nav-link active" style ="color: white;" aria-current="page" href="#">Home</a> <!--Link for my home page-->
          </li>
          
          <li class="nav-item">
            <a class="nav-link" style ="color: white;"  href="Payment.jsp">Make Payment!</a> <!--Link for my Make Payment page-->
          </li>
          
           <li class="nav-item">
            <a class="nav-link" style ="color: white;"  href="ChosenReferee.jsp">About</a> <!--Link for my About page-->
          </li>
          
        </ul>

      </div>
    </div>
  </nav>
        
                
   <% if (email != null) { %>
          <li>Hello, ${ManagerEmail}!</li>
          
          <% } %>
          
          
                              <div class="d-flex justify-content-center align-items-center" " >
                        <div class="card h-100" style=" background-color: #E6E6FA; border-color: black; border-width: 5px">
                            <!-- Product image-->
                            
                           <!-- <a href="https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Flat Icons - Flaticon</a>-->
                            <img class="card-img-top" src="Images/referee (1).png" style="width: 250px; height: 250px;" alt="Hoovers????" ><img/>
                            <!-- Product details-->
                            <div class="card-body p-4">
                                <div class="text-center">
                                   
                                    <h5 class="fw-bolder"> Pay  referee! </h5>
                                    <br>
                                  
                                   
                                   
                                </div>
                            </div>
                            <!-- Product actions-->
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="http://localhost:8080/FYP-Iteration2.0/ChosenReferee.jsp">Make your payment!</a></div>
                            </div>
                        </div>
                    </div>
          

        
    </body>
</html>
