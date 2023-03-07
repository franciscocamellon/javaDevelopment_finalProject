<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <title>Register | AppRecipes</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="assets/images/favicon.ico">

        <!-- App css -->
        <link href="assets/css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/app-creative.min.css" rel="stylesheet" type="text/css" id="light-style" />
        <link href="assets/css/app-creative-dark.min.css" rel="stylesheet" type="text/css" id="dark-style" />

    </head>

    <body class="authentication-bg pb-0" data-layout-config='{"darkMode":false}'>

        <div class="auth-fluid">
            <!--Auth fluid left content -->
            <div class="auth-fluid-form-box">
                <div class="align-items-center d-flex h-100">
                    <div class="card-body">

                        <!-- Logo -->
                        <div class="auth-brand text-center text-lg-start">
                            <a href="index.html" class="logo-dark">
                                <span><img src="assets/images/logo-dark.png" alt="" height="18"></span>
                            </a>
                            <a href="index.html" class="logo-light">
                                <span><img src="assets/images/logo.png" alt="" height="18"></span>
                            </a>
                        </div>

                        <!-- title-->
                        <h4 class="mt-3">Registro de usuário</h4>
                        <p class="text-muted mb-4">Não tem uma conta? Crie sua conta, leva menos de um minuto!</p>

                        <!-- form -->
                        <form action="/user/add" method="post">
                            <div class="mb-3">
                                <label class="form-label">Nome completo</label>
                                <input class="form-control" type="text" name="name" value="Francisco Camello" placeholder="Digite seu nome" required>
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Senha</label>
                                <input class="form-control" type="text" name="password"  value="123456"  placeholder="Digite sua senha" required>
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Email</label>
                                <input class="form-control" type="email" name="email" value="chicobala@email.com" required placeholder="Digite seu email">
                            </div>
                            <div class="row g-2 mb-3">
                            	<div class="col-md">
	                                <label class="form-label">Idade</label>
	                                <input class="form-control" type="text" name="age" value="42" required placeholder="Digite sua idade">
                                </div>
                                <div class="col-md">
	                                <label class="form-label">CEP</label>
	                                <input class="form-control" type="text" name="zip" value="70745-080" required placeholder="Digite seu CEP">
                                </div>
                            </div>
                            <div class="row g-2 mb-3">
                                <div class="col-md">
	                                <label class="form-label">Endereço</label>
	                                <input class="form-control" type="text" name="address" value="SQN 306 Bloco H Apto 602" required placeholder="Digite seu endereço">
                                </div>
                            </div>
                            <div class="mb-3 d-grid text-center">
                                <button class="btn btn-primary" type="submit"><i class="mdi mdi-account"></i> Register </button>
                            </div>
                            <div class="mb-0 d-grid text-center">
                            	<a href="/user/list" class="form-control btn btn-danger" ><i class="mdi mdi-account-cancel"></i> Cancel </a>
                            </div>
                        </form>
                        <!-- end form-->

                        <!-- Footer-->
                        <footer class="footer footer-alt">
                            
                        </footer>

                    </div> <!-- end .card-body -->
                </div> <!-- end .align-items-center.d-flex.h-100-->
            </div>
            <!-- end auth-fluid-form-box-->

            <!-- Auth fluid right content -->
            <div class="auth-fluid-right text-center">
                <div class="auth-user-testimonial">
                    <h2 class="mb-3">App Recipes</h2>
                    <p class="lead"><i class="mdi mdi-format-quote-open"></i> An App to manage your delicious recipes. <i class="mdi mdi-format-quote-close"></i>
                    </p>
                    <p>
                        - Francisco Camello - Developer
                    </p>
                </div> <!-- end auth-user-testimonial-->
            </div>
            <!-- end Auth fluid right content -->
        </div>
        <!-- end auth-fluid-->

        <!-- bundle -->
        <script src="assets/js/vendor.min.js"></script>
        <script src="assets/js/app.min.js"></script>

    </body>

</html>