<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <title>App Recipes</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="CAMELLonCASE" name="author" />
        
        <!-- App favicon -->
        <link rel="shortcut icon" href="/assets/images/favicon.ico">

        <!-- App css -->
        <link href="/assets/css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="/assets/css/app-creative.min.css" rel="stylesheet" type="text/css" id="light-style" />
        <link href="/assets/css/app-creative-dark.min.css" rel="stylesheet" type="text/css" id="dark-style" />

    </head>

    <body class="authentication-bg pb-0" data-layout-config='{"darkMode":false}'>

        <div class="auth-fluid">
            <!--Auth fluid left content -->
            <div class="auth-fluid-form-box">
                <div class="align-items-center d-flex h-100">
                    <div class="card-body">

                        <!-- Logo -->
                        <div class="auth-brand text-center text-lg-start">
                            <a href="#" class="logo-dark">
                                <span><img src="assets/images/logo-dark.png" alt="" height="18"></span>
                            </a>
                            <a href="#" class="logo-light">
                                <span><img src="assets/images/logo.png" alt="" height="18"></span>
                            </a>
                        </div>

                        <!-- User pic with title-->
                        <div class="text-center w-75 m-auto">
                            <!-- <img src="assets/images/users/avatar-1.jpg" height="64" alt="user-image" class="rounded-circle shadow">-->
                            <h4 class="text-dark-50 text-center mt-3 fw-bold">Menu </h4>
                            <p class="text-muted mb-4">Which task do you want to do?</p>
                        </div>

                        <!-- form -->
                        <form action="#">
                            <div class="mb-3 text-center d-grid">
                                <a href="/user/list" class="btn btn-primary" >
                                	<i class="mdi mdi-account-plus"></i> Register a User
                                </a>
                            </div>
                            
                        </form>
                        <!-- end form-->

                        <!-- Footer-->
                        <footer class="footer footer-alt">
		                    <div class="container-fluid">
		                        <div class="row">
		                            <div class="col-md">
		                                <script>document.write(new Date().getFullYear())</script> © AppRecipes - Francisco Camello
		                            </div>
		                        </div>
		                    </div>
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