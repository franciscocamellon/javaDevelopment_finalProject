<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <title>Gastronomee</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
    <meta content="Coderthemes" name="author" />
    <!-- App favicon -->
    <link rel="shortcut icon" href="/assets/images/favicon.ico">

    <!-- third party css -->
    <link href="/assets/css/vendor/dataTables.bootstrap5.css" rel="stylesheet" type="text/css" />
    <link href="/assets/css/vendor/responsive.bootstrap5.css" rel="stylesheet" type="text/css" />
    <!-- third party css end -->

    <!-- App css -->
    <link href="/assets/css/icons.min.css" rel="stylesheet" type="text/css" />
    <link href="/assets/css/app-creative.min.css" rel="stylesheet" type="text/css" id="light-style" />
    <link href="/assets/css/app-creative-dark.min.css" rel="stylesheet" type="text/css" id="dark-style" />

</head>

<body class="loading"
    data-layout-config='{"leftSideBarTheme":"dark","layoutBoxed":false, "leftSidebarCondensed":false, "leftSidebarScrollable":false,"darkMode":false, "showRightSidebarOnStart": false'>
    <!-- Begin page -->
    <div class="wrapper">
        <!-- ========== Left Sidebar Start ========== -->
        <div class="leftside-menu">

            <!-- LOGO -->
            <a href="/home" class="logo text-center logo-light">
                <span class="logo-lg">
                    <img src="/assets/images/logo.png" alt="" height="16">
                </span>
                <span class="logo-sm">
                    <img src="/assets/images/logo_sm.png" alt="" height="16">
                </span>
            </a>

            <!-- LOGO -->
            <a href="/home" class="logo text-center logo-dark">
                <span class="logo-lg">
                    <img src="/assets/images/logo-dark.png" alt="" height="16">
                </span>
                <span class="logo-sm">
                    <img src="/assets/images/logo_sm_dark.png" alt="" height="16">
                </span>
            </a>

            

                <div class="h-100" id="leftside-menu-container" data-simplebar>

                    <!--- Sidemenu -->
                    <ul class="side-nav">

                        <li class="side-nav-title side-nav-item">Navegação</li>

                        <li class="side-nav-item">
                            <a href="/home" class="side-nav-link">
                                <i class="uil-tachometer-fast"></i>
                                <span> Dashboard </span>
                            </a>
                        </li>
                        
                        <c:if test="${not empty user}">

                        <li class="side-nav-title side-nav-item">Apps</li>

                        <li class="side-nav-item">
                            <a href="/user/list" class="side-nav-link">
                                <i class="mdi mdi-account"></i>
                                <span> Usuários </span>
                            </a>
                        </li>

                        <li class="side-nav-item">
                            <a href="/client/list" class="side-nav-link">
                                <i class="mdi mdi-chef-hat"></i>
                                <span> Clientes </span>
                            </a>
                        </li>


                        <li class="side-nav-item">
                            <a href="/consultancy/request/list" class="side-nav-link">
                                <i class="mdi mdi-basket-plus"></i>
                                <span> Solicitações de consultorias </span>
                            </a>
                        </li>

                        <li class="side-nav-item">
                            <a data-bs-toggle="collapse" href="#sidebarEcommerce" aria-expanded="false"
                                aria-controls="sidebarEcommerce" class="side-nav-link">
                                <i class="mdi mdi-notebook"></i>
                                <span> Consultorias </span>
                                <span class="menu-arrow"></span>
                            </a>
                            <div class="collapse" id="sidebarEcommerce">
                                <ul class="side-nav-second-level">
                                    <li>
                                        <a href="/consultancy/list">Geral</a>
                                    </li>
                                    <li>
                                        <a href="/consultancy/menu/list">Menu</a>
                                    </li>
                                    <li>
                                        <a href="/consultancy/layout/list">Layout</a>
                                    </li>
                                    <li>
                                        <a href="/consultancy/training/list">Treinamento</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        </c:if>
                    </ul>
                    <!-- End Sidebar -->


                    <div class="clearfix"></div>

                </div>
                <!-- Sidebar -left -->
            
        </div>
        <!-- Left Sidebar End -->

        <!-- ============================================================== -->
        <!-- Start Page Content here -->
        <!-- ============================================================== -->

        <div class="content-page">
            <div class="content">
                <!-- Topbar Start -->
                <div class="navbar-custom">
                    <ul class="list-unstyled topbar-menu float-end mb-0">
                        <li class="dropdown notification-list d-lg-none">
                            <a class="nav-link dropdown-toggle arrow-none" data-bs-toggle="dropdown" href="#"
                                role="button" aria-haspopup="false" aria-expanded="false">
                                <i class="dripicons-search noti-icon"></i>
                            </a>
                            <div class="dropdown-menu dropdown-menu-animated dropdown-lg p-0">
                                <form class="p-3">
                                    <input type="text" class="form-control" placeholder="Search ..."
                                        aria-label="Recipient's username">
                                </form>
                            </div>
                        </li>

                        

                        <c:if test="${not empty user}">
	                        <li class="notification-list">
	                            <a class="nav-link end-bar-toggle" href="javascript: void(0);">
	                                <i class="dripicons-gear noti-icon"></i>
	                            </a>
	                        </li>
                            <li class="dropdown notification-list">
                                <a class="nav-link dropdown-toggle nav-user arrow-none me-0"
                                    data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="false"
                                    aria-expanded="false">
                                    <span class="account-user-avatar">
                                        <img src="/assets/images/users/camellon.jpg" alt="user-image" class="rounded-circle">
                                    </span>
                                    <span>
                                        <span class="account-user-name">${user.name}</span>
                                        <span class="account-position">
                                        	<c:if test="${user.admin}">Administrador</c:if>
	                                        <c:if test="${not user.admin}">Usuário</c:if>
										</span>
                                    </span>
                                </a>
                                <div
                                    class="dropdown-menu dropdown-menu-end dropdown-menu-animated topbar-dropdown-menu profile-dropdown">
                                    <!-- item-->
                                    <a href="/logout" class="dropdown-item notify-item">
                                        <i class="mdi mdi-logout me-1"></i>
                                        <span>Logout</span>
                                    </a>
                                </div>
                            </li>
                        </c:if>

                        <c:if test="${empty user}">
                          <li class="notification-list">
                            <a class="nav-link " href="/login">
	                            <span class="account-user-avatar">
	                                <i class="mdi mdi-login noti-icon"></i>
	                            </span>
	                            <span class="account-user-name">
                                    <span>Login</span>
                                </span>
                            </a>
                        </li>
                          <li class="notification-list">
                            <a class="nav-link " href="/user">
	                            <span class="account-user-avatar">
	                                <i class="mdi mdi-account noti-icon"></i>
	                            </span>
	                            <span class="account-user-name">
                                    <span>Sign up</span>
                                </span>
                            </a>
                        </li>
                        </c:if>

                    </ul>
                    <button class="button-menu-mobile open-left disable-btn">
                        <i class="mdi mdi-menu"></i>
                    </button>
                    <div class="app-search dropdown d-none d-lg-block">
                        <form>
                            <div class="input-group">
                                <input type="text" class="form-control dropdown-toggle" placeholder="Search..."
                                    id="top-search">
                                <span class="mdi mdi-magnify search-icon"></span>
                                <button class="input-group-text btn-primary" type="submit">Search</button>
                            </div>

                        </form>

                    </div>
                </div>
                <!-- end Topbar -->