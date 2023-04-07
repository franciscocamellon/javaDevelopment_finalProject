<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <title>Cadastro | Gastronomee</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="assets/images/favicon.ico">

        <!-- App css -->
        <link href="assets/css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/app-creative.min.css" rel="stylesheet" type="text/css" id="light-style" />
        <!-- <link href="assets/css/app-creative-dark.min.css" rel="stylesheet" type="text/css" id="dark-style" /> -->

    </head>

    <body class="authentication-bg" data-layout-config='{"darkMode":false}'>
    
        <div class="account-pages pt-sm-5 pb-4 pb-sm-5">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-xxl-6 col-lg-5">
                        <div class="card">

                            <!-- Logo -->
                            <div class="card-header pt-4 pb-4 text-center bg-primary">
                                    <span><img src="/assets/images/logo.png" alt="" height="18"></span>
                            </div>

                            <div class="card-body p-4">
                                
                                <div class="text-center w-75 m-auto">
                                    <h4 class="text-dark-50 text-center mt-0 fw-bold">Registro de usuário</h4>
                                    <p class="text-muted mb-4">Não tem uma conta? Crie sua conta, leva menos de um minuto!</p>
                                </div>

                                <!-- form -->
		                        <form action="/cep" method="post">
		                        	
		                        	<div class="mb-3">
								        <label class="form-label">CEP</label>
								        <div class="input-group">
								            <input type="text" class="form-control" name="cep" data-toggle="input-mask" data-mask-format="00000-000" value="20010020">
								            <button class="btn btn-primary" type="submit">Buscar</button>
								        </div>
								    </div>
		                        	
		                        </form>
		                        
                        <!-- form -->
                        <form action="/user/add" method="post">
                            <div class="mb-3">
                                <label class="form-label">Nome completo</label>
                                <input class="form-control" type="text" name="name" value="Elberth Moraes" placeholder="Digite seu nome" required>
                            </div>
                            <div class="row">
                            	<div class="col-md-6">
                            		<div class="mb-3">
		                                <label class="form-label">Email</label>
		                                <input class="form-control" type="email" name="email" value="elberth@email.com" required placeholder="Digite seu email">
		                            </div>
	                            </div>
		                        <div class="col-md-6">
		                            <div class="mb-3">
		                                <label class="form-label">Senha</label>
		                                <input class="form-control" type="text" name="password"  value="123456"  placeholder="Digite sua senha" required>
		                            </div>
                            	</div>
                            </div>
                            
                            <c:import url="/WEB-INF/jsp/address/register.jsp"></c:import>
                            <div class="row">
                            	<div class="col-md-6">
                            		<div class="mb-3">
			                            <div class="mb-3 d-grid text-center">
			                                <button class="btn btn-primary" type="submit"><i class="mdi mdi-account"></i> Register </button>
			                            </div>
		                            </div>
	                            </div>
	                            <div class="col-md-6">
                            		<div class="mb-3">
			                            <div class="mb-0 d-grid text-center">
			                            	<a href="/login" class="form-control btn btn-danger" ><i class="mdi mdi-account-cancel"></i> Cancel </a>
			                            </div>
                            		</div>
                            	</div>
                           	</div>
                        </form>
                        <!-- end form-->
                            </div> <!-- end card-body -->
                        </div>
                        <!-- end card -->

                    </div> <!-- end col -->
                </div>
                <!-- end row -->
            </div>
            <!-- end container -->
        </div>
        <!-- end page -->

        <footer class="footer footer-alt text-white">
            <script>document.write(new Date().getFullYear())</script> © Gastronomee - <a class="text-white" href="https://www.linkedin.com/in/franciscocamellon/">Francisco Camello</a>
        </footer>

        <!-- bundle -->
        <script src="assets/js/vendor.min.js"></script>
        <script src="assets/js/app.min.js"></script>

    </body>

</html>