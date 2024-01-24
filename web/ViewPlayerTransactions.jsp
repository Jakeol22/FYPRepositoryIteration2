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
          
          
          
          <!--This html/table was adapted from BBBootstrap(2020)-->
        <div class="page-content page-container" id="page-content">
    <div class="padding">
        <div class="row container d-flex justify-content-center">

<div class="col-lg-8 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Your Transactions</h4>
                  <p class="card-description">
                    Your Managers name is:
                    ${ManagerNameList}
                  </p>
                  <div class="table-responsive">
                    <table class="table">
                      <thead>
                        <tr>
                          <th>Transaction NO.</th><!--Column names-->
                          <th>Player ID</th>
                          <th>Manager ID</th>
                          <th>Payment Status</th>
                          <th>Amount Paid</th>
                          <th>Date Of Payment</th>
                        </tr>
                      </thead>
                      <tbody>
                          <c:forEach items="${GetPlayerTransactions}" var="PlayerTransactions"> <!--Calls on my arraylist from my RetrievePersonalPlayerTransactions servlet-->
                        <!--Below code was adapted from my IS3312 Project, HowsYourHoover (BrowseHoovers.jsp)(2022)-->
                              <!--Calls on the methods from my model and retrieves the logged in users transaction details, using their ID-->
                              <tr>
                          <td>${PlayerTransactions.getPaymentToManagerID()}</td> 
                          <td>${PlayerTransactions.getPlayerID()}</td>
                          <td>${PlayerTransactions.getManagerID()}</td>
                          <td>${PlayerTransactions.getPaymentToManagerStatus()}</td>
                          <td>€${PlayerTransactions.getPaymentToManagerAmount()}</td>
                          <td>${PlayerTransactions.getDateOfPaymentToManager()}</td>
                        </tr>
                        </c:forEach> 
                        
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
            
            </div>
              </div>
            </div>
        
    </body>
</html>

<!--Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.-->
<!--BBbootstrap(2020.Bootstrap 4 Basic table with card. Available at: https://bbbootstrap.com/snippets/basic-table-card-45601427
<!--Bootstrap (2023) Navbars example. Available at: https://getbootstrap.com/docs/5.3/examples/navbars/>
<!--Color Hexa (2023) #e0e0e0 Hex Color. Available at: https://www.colorhexa.com/e0e0e0>
<!--Futuer (2023) Referee Icon. Available at: https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Futuer - Flaticon>
<!--FlatIcons(2023)Football manager icons. Available at https://www.flaticon.com/free-icons/sports-and-competition-->
<!--Jake O'Leary(2022), HowsYourHoover project from IS3312.Available on my one drive.-->
