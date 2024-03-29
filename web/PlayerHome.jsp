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
        
        <!--This was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->
   <%HttpSession sessionLogin = request.getSession();
    String email = (String) session.getAttribute("PlayerEmail");
   
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
          
          
          
          <!--The below html/css was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->
                              <div class="d-flex justify-content-center align-items-center" " >
                        <div class="card h-100" style=" background-color: #E6E6FA; border-color: black; border-width: 5px">
                            
                            <!--<a href="https://www.flaticon.com/free-icons/sports-and-competition" title="sports and competition icons">Sports and competition icons created by Flat Icons - Flaticon</a>-->
                            <img class="card-img-top" src="Images/manager.png" style="width: 250px; height: 250px;" alt="????" ><img/>
                           
                            <div class="card-body p-4">
                                <div class="text-center">
                                   
                                    <h5 class="fw-bolder"> Pay your manager! </h5>
                                    <br>
                                  
                                   
                                   
                                </div>
                            </div>
                            
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                
                                <!--//This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).-->
                                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="http://localhost:8080/FYP-Iteration3.0/PlayerServlet?newaction=GetManagerIDs">Make your payment!</a></div> <!--Takes you through the PlayerServlet, using newaction-->
                            </div>
                            
                        </div>
                                  
                    </div>
          
          
          <div class="d-flex justify-content-center align-items-center" " >
                        <div class="card h-100" style=" background-color: #E6E6FA; border-color: black; border-width: 5px">
                            
                            <!--<a href="https://www.flaticon.com/free-icons/money-transfer" title="money transfer icons">Money transfer icons created by catkuro - Flaticon</a> -->
                            <img class="card-img-top" src="Images/TransactionPlayer.png" style="width: 250px; height: 250px;" alt="????" ><img/>
                           
                            <div class="card-body p-4">
                                <div class="text-center">
                                   
                                    <h5 class="fw-bolder"> View your transactions </h5>
                                    <br>
                                  
                                   
                                   
                                </div>
                            </div>
                            
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                
                                <!--//This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).-->
                                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="http://localhost:8080/FYP-Iteration3.0/RetrievePersonalPlayerTransactions?newestaction=GetTransactions">View your transactions!</a></div> <!--Takes you through RetrievePersonalPlayerTransactions servlet-->
                            </div>
                        </div>
                    </div>

        
    </body>
</html>

<!--Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.-->
<!--Bootstrap (2023) Navbars example. Available at: https://getbootstrap.com/docs/5.3/examples/navbars/>
<!--Catkuro(2023)Money transfer icons. Available at: https://www.flaticon.com/free-icons/money-transfer-->
<!--Color Hexa (2023) #e0e0e0 Hex Color. Available at: https://www.colorhexa.com/e0e0e0>
<!--Futuer (2023) Referee Icon. Available at: https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Futuer - Flaticon>
<!--FlatIcons(2023)Football manager icons. Available at https://www.flaticon.com/free-icons/sports-and-competition-->
<!--Jake O'Leary(2022), HowsYourHoover project from IS3312.Available on my one drive.-->
