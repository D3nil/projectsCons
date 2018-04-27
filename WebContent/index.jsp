<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="javax.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/my-style.css">

<title>Portale Fornitori</title>
</head>
<body>
<%String msg=request.getParameter("error");  %>

<nav class="navbar navbar-expand-sm color ">
<div class="container">
  
    <a href="index.jsp">
    <img src="img/Consoft-Sistemi-2017-310x175.png" width="140" height="auto"> 
    </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav ml-auto txt-w">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Communicazioni</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="#">Area Clienti</a>
      </li>
    </ul>
  </div>
  </div>
</nav>


<div class="container-fluid">
  <div class="row">
    <div class="card-header col-lg-12" id="color-h">
        <h1 class="mb-3 text-center text-capitalize">Portale Fornitori</h1>
      </div>
      <!-- INIZIO PRIMO MAIN -->
      <div class="card card-outline-secondary col-lg-7">
        <div class="row">
          <div class="col-lg-12 col-md-12">
            <h2 class="mb-3 text-center text-capitalize">Area Documentazione</h2>
          </div>                        
          <div class="card-body border-dark col-lg-12 col-md-12 col-sm-12">
            <div class="bd-example bd-example-tabs">
              <div class="row " >
                <div class="col-3 col-lg-3 col-md-3 col-sm-3" id="descript-action">
                  <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                    <a class="nav-link" id="v-pills-home-tab" data-toggle="pill" href="#v-pills-home" role="tab" aria-controls="v-pills-home" aria-selected="false" ><i class="fas fa-angle-right fa-lg"></i> Registrazione Portale</a>
                    <a class="nav-link active show" id="v-pills-profile-tab" data-toggle="pill" href="#v-pills-profile" role="tab" aria-controls="v-pills-profile" aria-selected="true"><i class="fas fa-angle-right fa-lg"></i> E-Procurament</a>
                    <a class="nav-link" id="v-pills-messages-tab" data-toggle="pill" href="#v-pills-messages" role="tab" aria-controls="v-pills-messages" aria-selected="false"><i class="fas fa-angle-right fa-lg"></i> Albo Fornitori</a>
                    <a class="nav-link" id="v-pills-settings-tab" data-toggle="pill" href="#v-pills-settings" role="tab" aria-controls="v-pills-settings" aria-selected="false"><i class="fas fa-angle-right fa-lg"></i> Condizioni contrattuali</a>
                  </div>
                </div>
                <div class="col-md-9 col-lg-9 col-sm-9">
                  <div class="tab-content" id="v-pills-tabContent">
                    <div class="tab-pane fade" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab">
                      <p>Cillum ad ut irure tempor velit nostrud occaecat ullamco aliqua anim Lorem sint. Veniam sint duis incididunt do esse magna mollit excepteur laborum qui. Id id reprehenderit sit est eu aliqua occaecat quis et velit excepteur laborum mollit dolore eiusmod. Ipsum dolor in occaecat commodo et voluptate minim reprehenderit mollit pariatur. Deserunt non laborum enim et cillum eu deserunt excepteur ea incididunt minim occaecat.</p>
                    </div>
                    <div class="tab-pane fade active show" id="v-pills-profile" role="tabpanel" aria-labelledby="v-pills-profile-tab">
                      <p>Culpa dolor voluptate do laboris laboris irure reprehenderit id incididunt duis pariatur mollit aute magna pariatur consectetur. Eu veniam duis non ut dolor deserunt commodo et minim in quis laboris ipsum velit id veniam. Quis ut consectetur adipisicing officia excepteur non sit. Ut et elit aliquip labore Lorem enim eu. Ullamco mollit occaecat dolore ipsum id officia mollit qui esse anim eiusmod do sint minim consectetur qui.</p>
                    </div>
                    <div class="tab-pane fade" id="v-pills-messages" role="tabpanel" aria-labelledby="v-pills-messages-tab">
                      <p>Fugiat id quis dolor culpa eiusmod anim velit excepteur proident dolor aute qui magna. Ad proident laboris ullamco esse anim Lorem Lorem veniam quis Lorem irure occaecat velit nostrud magna nulla. Velit et et proident Lorem do ea tempor officia dolor. Reprehenderit Lorem aliquip labore est magna commodo est ea veniam consectetur.</p>
                    </div>
                    <div class="tab-pane fade" id="v-pills-settings" role="tabpanel" aria-labelledby="v-pills-settings-tab">
                      <p>Eu dolore ea ullamco dolore Lorem id cupidatat excepteur reprehenderit consectetur elit id dolor proident in cupidatat officia. Voluptate excepteur commodo labore nisi cillum duis aliqua do. Aliqua amet qui mollit consectetur nulla mollit velit aliqua veniam nisi id do Lorem deserunt amet. Culpa ullamco sit adipisicing labore officia magna elit nisi in aute tempor commodo eiusmod.</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        </div>
        <!-- FINE PRIMO MAIN -->
        
        <!-- INIZIO SECONDO MAIN -->
        <div class="card card-outline-secondary col-lg-5">
            <div class="row">
            <div class="card-body border-dark form-body col-lg-10 offset-1 ">
              <div class="card-header h3 text-center">
               <h3>
               Area Login
               </h3> 
              </div>
                <form class="form" role="form" id="loginForm" action="Control" method="post">
                  <div class="form-group col-lg-12">
                    <label for="txtPIVA">N° Partita IVA</label>
                    <input type="text" class="form-control" name="txtPIVA"  required placeholder="Inserire n° partita IVA">
                    <div class="invalid-feedback">Partita IVA non valida !</div>
                  </div>
                  <div class="form-group col-lg-12 text-center">
                  <span class="badge badge-light">
                    <%String msg2=""; if(msg!=null){msg2="Inserire un numero di partita Iva valido !";}
                    else{msg2="Benvenuto sul Portale";} %><%=msg2%>
                  </span>
                </div>
                <div class="form-group col-lg-12">
                <input type="hidden" value="showAdminprovider" name="action">
                  <button type="submit" class="btn btn-dark btn-lg col-6 offset-3" id="btnLogin">Entra</button>
                  </div>
                  <div class="form-group col-lg-12 text-center">                                
                    <span class=" text-primary ">
                      <a href="Control?action=showForgot" class="badge badge-primary">RECUPERO PASSWORD e ID</a>
                    </span>
                  </div> 
                  <div class="form-group col-lg-12 text-center">   
                    <span class="text-dark ">Registrazione al portale clicca
                      <a href="Control?action=showRegister" class="text-primary ">QUI</a>
                    </span>
                  </div>
                </form>
              </div>                        
            </div>
        </div>
        <!--FINE SECONDO MAIN  -->
    </div>
</div>      




<div id="footer-body">
</div>
<script src="js/jquery.min.js" ></script>
<script src="js/bootstrap.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" ></script>
<script src="svg-with-js/js/fontawesome-all.js" ></script>
<script >
/*   $('#v-pills-tab a').on('click', function (e) {
  e.preventDefault()
  $(this).tab('show')
}) */
</script>
</body>
</html>