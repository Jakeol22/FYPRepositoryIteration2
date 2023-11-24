<%-- 
    Document   : ManagerRefereePlayerSignIn
    Created on : 24 Nov 2023, 13:55:46
    Author     : My PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        

    </head>
    
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
            <a class="nav-link" style ="color: white;"  href="#">Make Payment!</a> <!--Link for my Make Payment page-->
          </li>
          
           <li class="nav-item">
            <a class="nav-link" style ="color: white;"  href="#">About</a> <!--Link for my About page-->
          </li>
          
        </ul>

      </div>
    </div>
  </nav>
                  <!--This html/css was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->
                  
                              <div class="d-flex justify-content-center align-items-center" " >
                        <div class="card h-100" style=" background-color: #E6E6FA; border-color: black; border-width: 5px">
                            
                            <!--<a href="https://www.flaticon.com/free-icons/sports-and-competition" title="sports and competition icons">Sports and competition icons created by Flat Icons - Flaticon</a>-->
                            <img class="card-img-top" src="Images/football-player.png" style="width: 250px; height: 250px;" alt="????" ><img/>
                           
                            <div class="card-body p-4">
                                <div class="text-center">
                                   
                                    <h5 class="fw-bolder"> Sign in as a player! </h5>
                                    <br>
                                  
                                   
                                   
                                </div>
                            </div>
                            
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                
                                
                                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="SignIn.jsp">Sign In!</a></div> <!--Takes you to Manager sign in page-->
                            </div>
                        </div>
                    </div>
                  
                            <!--This html/css was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->
                              <div class="d-flex justify-content-center align-items-center" " >
                        <div class="card h-100" style=" background-color: #E6E6FA; border-color: black; border-width: 5px">
                            
                           <!-- <a href="https://www.flaticon.com/free-icons/professions-and-jobs" title="professions and jobs icons">Professions and jobs icons created by Flat Icons - Flaticon</a>-->
                            <img class="card-img-top" src="Images/manager (1).png" style="width: 250px; height: 250px;" alt="????" ><img/>
                           
                            <div class="card-body p-4">
                                <div class="text-center">
                                   
                                    <h5 class="fw-bolder"> Sign in as a manager! </h5>
                                    <br>
                                  
                                   
                                   
                                </div>
                            </div>
                            
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                
                                
                                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="ManagerSignIn.jsp">Make your payment!</a></div> <!--Takes you to Manager sign in page-->
                            </div>
                        </div>
                    </div>
    </body>
</html>


<!--Bootstrap (2023) Navbars example. Available at: https://getbootstrap.com/docs/5.3/examples/navbars/>
<!--Color Hexa (2023) #e0e0e0 Hex Color. Available at: https://www.colorhexa.com/e0e0e0>
<!--FlatIcons (2023). Sports and Competition icons. Available at https://www.flaticon.com/free-icons/sports-and-competition -->
<!--FlatIcons (2023). Professions and jobs icons. Available at https://www.flaticon.com/free-icons/professions-and-jobs-->
<!--Futuer (2023) Referee Icon. Available at: https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Futuer - Flaticon>
<!--Jake O'Leary(2022), HowsYourHoover project from IS3312.Available on my one drive.-->