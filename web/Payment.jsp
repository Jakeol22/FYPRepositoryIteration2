<%-- 
    Document   : Payment
    Created on : 8 Nov 2023, 14:25:52
    Author     : My PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
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
        
        
   <% if (email != null) { %>
          <li>Hello, ${PlayerEmail}!</li>
          
          <% } %>
          <h1>Hello :)</h1>
    </body>
</html>


<!--https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Futuer - Flaticon-->
<!--https://getbootstrap.com/docs/5.3/examples/navbars/-->