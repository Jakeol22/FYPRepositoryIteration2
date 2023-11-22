<%-- 
    Document   : PlayerHome
    Created on : 15 Nov 2023, 14:10:04
    Author     : My PC
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Java.RefereeModel"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
              <!--This was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->
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
            <a class="nav-link" style ="color: white;"  href="#">About</a> <!--Link for my About page-->
          </li>
          
        </ul>

      </div>
    </div>
  </nav>
        
            
        <!--This was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->
   <% if (email != null) { %>
          <li>Hello, ${ManagerEmail}!</li>
          
          <% } %>
          
          
          <!--My html/css was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->
          
          
                  <section class="py-5">
            <div class="container px-4 px-lg-5 mt-5 ">
                <div class="row gx-4 gx-lg-5 justify-content-center" >
                    
                    <!--This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).-->
                    
<c:forEach items="${RefDetails}" var="referee"> <!--gets refdetails from servlet and sets referee as variable-->
    
                   
                    
                        
                         <div class="col mb-5" >
                             
                             <!--Width taken from W3Schools-->
                        <div class="card h-100"  style="width: 20rem; background-color: #E6E6FA;">
                            
                            
                            <div class="text-center">
                                
                            <!-- <a href="https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Freepik - Flaticon</a>-->
                            <img class="card-img-top" src="Images/ChooseReferee.png" style="width: 200px; height: 200px;" alt="????" />
                           
                            <div class="card-body p-4">
                                <div class="text-center">
                                    
                                    <!--Get the referees details-->
                                    
                                    <!--This was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->
                                    <h5 class="fw-bolder">  ${referee.getRefereeFname()}
                                        ${referee.getRefereeLname()} </h5>
                                    <br>
                                    <p>Email Address: ${referee.getRefereeEmail()}</p>
                                    <p>Phone Number: 0${referee.getRefereePhoneNumber()}</p>
                                   
                                   
                                </div>
                            </div>
                            
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="">Pay ${referee.getRefereeFname()} </a></div> 
                            </div>
                             
                        </div>
                            
                         </div>
                         </div>
                       
                      
                             </c:forEach>  
                    </div>
                   



                   
                        </div>
                    
        </section>
          
            
          
 
    </body>
</html>


<!--Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project (Accessed from 15th to 22nd of November,2023)-->
<!--Bootstrap (2023) Navbars example. Available at: https://getbootstrap.com/docs/5.3/examples/navbars/>
<!--Bootstrap (2023) Sign In example. Available at:  https://getbootstrap.com/docs/5.3/examples/sign-in/>
<!--Color Hexa (2023) #e0e0e0 Hex Color. Available at: https://www.colorhexa.com/e0e0e0>
<!--Futuer (2023) Referee Icon. Available at: https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Futuer - Flaticon>
<!--Jake O'Leary(2022), HowsYourHoover project from IS3312.Available on my one drive.-->
<!--W3Schools(2023) CSS units. Available at: https://www.w3schools.com/cssref/css_units.php
