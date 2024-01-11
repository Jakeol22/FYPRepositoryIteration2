<%-- 
    Document   : SignIn
    Created on : 6 Nov 2023, 11:29:46
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
        
        <br>
        <br>
<form action=SignInServlet method="post">  
    
                    
<!--Form was created with the help of bootstrap-->
<div class="form-floating" style="width: 30%; margin: 0 auto;">
    <h4 style="text-align: center">Enter your email address</h4>
      <input type="email" class="form-control" id="floatingInput" name="email" placeholder="name@example.com" > <!--attribute "password" goes through SignInServlet-->
     
    </div>
<br>
    
    <div class="form-floating" style="width: 30%; margin: 0 auto;">
        <h4 style="text-align: center">Enter your password</h4>
      <input type="password" class="form-control" id="floatingPassword" name="password" placeholder="Password"> <!--attribute "password" goes through SignInServlet-->
    </div>
        
           <br>
        <br>
        
<div style="text-align: center;" >
            <button class="btn btn-primary w-30"  margin type="submit">Sign in to make payment.</button> <!--button to sign in-->
            </div>
</form>
    </body>
</html>



<!--Bootstrap (2023) Navbars example. Available at: https://getbootstrap.com/docs/5.3/examples/navbars/>
<!--Bootstrap (2023) Sign In example. Available at:  https://getbootstrap.com/docs/5.3/examples/sign-in/>
<!--Color Hexa (2023) #e0e0e0 Hex Color. Available at: https://www.colorhexa.com/e0e0e0>
<!--Futuer (2023) Referee Icon. Available at: https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Futuer - Flaticon>