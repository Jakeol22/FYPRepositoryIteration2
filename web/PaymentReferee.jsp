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
        
                 <!--This was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->
    <%HttpSession sessionLogin = request.getSession();
    String email = (String) session.getAttribute("ManagerEmail");
    %>

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
        
    <!--This was adapted from my code from my IS3312 Project, HowsYourHoover (2022)-->  
   <% if (email != null) { %>
          <li>Hello, ${ManagerEmail}!</li>
          
          <% } %>
        
          
                  <div class=" text-center mt-5 ">

            <h1 >Make a payment to a referee</h1>
            
            
           
            <h3> The referee you have chosen is:
                      
        
                    ${RefName}
   
                
            
            </h3> 
            
                
            
        </div>
          
                  <!--Below form/html is taken from BBbootstrap (2019)-->
    <div class="row " >
        
      <div class="col-lg-7 mx-auto">
        <div class="card mt-2 mx-auto p-4 " style="background-color: #E6E6FA; border-color: black; border-width: 5px">
            <div class="card-body">
       
            <div class = "container">
                             <form action="PaymentToRefereeServlet" method="post"id="contact-form" role="form" > <!--Calls on playerservlet-->

                              

            <div class="controls">

 
                <div class="row">
    <div class="col-md-6">
        <div class="form-group">
             
                          
            <label for="form_need">Your Manager ID is: </label>
            
            
            <select id="form_need" name="managerid" class="form-control" required="required" data-error="Please specify your need.">
      <!--Asked CHATGPT for help on making a for loop in a dropdown (2023)-->
      <!--This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).-->
                <c:forEach var="Manager" items="${ManagerID}">
        <option value="${Manager}">${Manager}</option> <!--Gets Manager ID from servlet-->
    </c:forEach>
            </select>
        </div>
    </div>
                    
                    <div class="col-md-6">
        <div class="form-group">
             <!--This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).-->
            <label for="form_need">The chosen referees ID is: </label>
            <select id="form_need" name="refereeid" class="form-control" required="required" data-error="Please specify your need.">
      
                <!--Asked CHATGPT for help on making a for loop in a dropdown (2023)-->
                <c:forEach items="${Ref}" var="referee"> 
        <option value="${referee}" >${referee}</option> <!--Recognises Referee ID from servlet-->
    </c:forEach>
            </select>
        </div>
                </div>


     
                         
    <div class="col-md-6">
                         <div class="form-group">
            <label for="form_need">Amount due to Referee (€):</label>
            <select id="form_need" name="AmountDue" class="form-control" required="required" data-error="Please specify your need.">
              
              <option> 60 </option> <!--Amount to be paid-->
            </select>
        </div>
        </div>
                    
                                 
 

                </div>
         </div>
                    
</div>
                
                


                    <div class="col-md-12">
                        


                        <input type="submit" class="btn btn-success btn-send  pt-2 btn-block
                            " value="Pay now!" >
                    
                </div>
          
                </div>


        </div>
         </form>
        </div>
            </div>


    </body>
</html>



<!--Bootstrap (2023) Navbars example. Available at: https://getbootstrap.com/docs/5.3/examples/navbars/>
<!--Bootstrap (2023) Sign In example. Available at:  https://getbootstrap.com/docs/5.3/examples/sign-in/>
<!--Color Hexa (2023) #e0e0e0 Hex Color. Available at: https://www.colorhexa.com/e0e0e0>
<!--Futuer (2023) Referee Icon. Available at: https://www.flaticon.com/free-icons/referee" title="referee icons">Referee icons created by Futuer - Flaticon>
