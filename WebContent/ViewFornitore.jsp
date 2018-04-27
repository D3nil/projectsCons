<%@page import="java.util.ArrayList"%>
<%@page import="model.*,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/my-style.css">
<script src="js/bootstrap.min.js"></script>
<title>Fornitori</title>
</head>
<body>

<nav class="navbar navbar-expand-sm color ">
<div class="container">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav ml-auto txt-w">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>      
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
    </ul>
  </div>
  </div>
</nav>

   <!-- form card login with validation feedback -->
  			<div >
                    <div class="card card-outline-secondary">
                        <div class="card-header">
                    
                         <%-- <c:forEach items="${requestScope.lista}" var="l">
                         
                        	<c:out value="${l.id}"></c:out>
                        	<c:out value="${l.company}"></c:out>
                        	<c:out value="${l.companyName_No_}"></c:out>
                        	<c:out value="${l.name}"></c:out>
                        	<c:out value="${l.name2}"></c:out>
                        	<c:out value="${l.address}"></c:out>
                        	<c:out value="${l.address2}"></c:out>
                        	<c:out value="${l.city}"></c:out>
                        	<c:out value="${l.postCode}"></c:out>
                        	<c:out value="${l.countryRegion_code}"></c:out>
                        	<c:out value="${l.e_mail}"></c:out>
                        	<c:out value="${l.phoneNo_}"></c:out>
                        	<c:out value="${l.FaxNo_}"></c:out>
                        	<c:out value="${l.vatRegistrationNo_}"></c:out>
                        	<c:out value="${l.blockedQualification}"></c:out>
                        	<c:out value="${l.qualificationNotes}"></c:out>
                        	
                         </c:forEach> --%>
                            <h3 class="mb-3 text-center ">Benvenuto <c:forEach items="${requestScope.lista}" var="l"><c:out value="${l.name}"></c:out></c:forEach></h3>
                        </div>                        
                        <div class="card-body border-dark form-body ">
                            <form action="#" class="fornitore-card">
                                <div class="panel panel-default" >
                                 <div class="panel-heading">
                                     
                                      <div class="row ">
                                              <div class="col-md-12 col-sm-12 col-xs-12"> 
                                                  <span class="help-block text-muted small-font" >  Partita Iva numero:</span>
                                                 <input type="text" class="form-control" value="<c:forEach items="${requestScope.lista}" var="l"><c:out value="${l.vatRegistrationNo_}"></c:out></c:forEach>" disabled/>
                                                 </div>
                                                </div>
                                                <div class="row ">
                                                         <div class="col-md-6 col-sm-6 col-xs-6">
                                                             <span class="help-block text-muted small-font" > Stato</span>
                                                             <input type="text" class="form-control" disabled placeholder="Aperto"  disabled/>
                                                         </div>                                            
                                         	  <div class="col-md-6 col-sm-6 col-xs-6">
		                                                  <span class="help-block text-muted small-font" >  Data fattura</span>
		                                                  <input type="date" class="form-control" value="2017-12-15"  disabled/>
                                              </div>
                                      </div>
                                      <div class="row ">
                                       			 <div class="col-md-6 col-sm-6 col-xs-6">
                                                  <span class="help-block text-muted small-font" >  Importo fattura</span>
                                                  <input type="text" class="form-control" value="6.000"  disabled/>
                                             	 </div>
                                        		 <div class="col-md-6 col-sm-6 col-xs-6">                                				
                                                  <span class="help-block text-muted small-font" >Mese Fattura</span>
                                                  <input type="text" class="form-control" value="dicembre" disabled />
                                        		 </div>
                                      </div>
                                     <div class="row ">
                                              <div class="col-md-6 col-sm-6 col-xs-6 pad-adjust">
                                               		 <span class="help-block text-muted small-font" >Origine</span>
                                                	  <input type="text" class="form-control" value="asdsaoicjicasiodj" disabled/>
                                              </div>
                                              <div class="col-md-6 col-sm-6 col-xs-6 pad-adjust">
                                               		 <span class="help-block text-muted small-font" >Numero Fattura</span>
                                                 	 <input type="text" class="form-control" value="012456212" disabled />
                                              </div>
                                              </div>
                                      <div class="row">
                                              <div class="col-md-6 col-sm-6 col-xs-6 pad-adjust">                                    
                                                  <label>
                                                      <span class="help-block text-muted small-font" >  Data scadenza</span>
                                                    <input type="date" class="form-control" value="2017-12-31" disabled> 
                                                  </label>                                
                                                </div>
                                                <div class="col-md-6 col-sm-6 col-xs-6 pad-adjust">                                    
                                                        <label>
                                                            <span class="help-block text-muted small-font" >  Anno fattura</span>
                                                          <input type="text" class="form-control" value="2017" disabled> 
                                                        </label>                                
                                                      </div>    
                                       </div>
                                     </div>
                                </div>
                                </form>
                            </div>
                        </div>
                        <!--/card-body-->
                    </div>
                    <!-- /form card login -->



<div id="footer-body" class=" bg-inverse">
</div>
<script src="js/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
</body>
</html>