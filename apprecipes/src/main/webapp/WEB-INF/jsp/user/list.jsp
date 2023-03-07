<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url="/WEB-INF/jsp/templates/body.jsp"></c:import>
    
    <!-- Start Content-->
    <div class="container-fluid">

        <!-- start page title -->
        <div class="row">
            <div class="col-12">
                <div class="page-title-box">
                   <div class="page-title-right">
                       <ol class="breadcrumb m-0">
                           <li class="breadcrumb-item"><a href="javascript: void(0);">App</a></li>
                           <li class="breadcrumb-item"><a href="javascript: void(0);">Client</a></li>
                           <li class="breadcrumb-item active">List</li>
                       </ol>
                   </div>
                   <h4 class="page-title">Clients</h4>
               </div>
            </div>
        </div>
        <!-- end page title -->

        <div class="row">
            <div class="col-12">
                <div class="card">
                    <div class="card-body">
                        
                        <c:if test="${empty users}">
                        	<div class="clearfix">
		                        <div class="float-start">
		                            <h5 class="page-title">Não existem usuários cadastrados!</h5>
		                        </div>
		                        <div class="float-end">
		                            <a href="/user"> <button type="button" class="btn btn-primary btn-md">
		                                <i class="mdi mdi-plus-thick"></i> Cadastrar </button>
		                            </a>
		                        </div>
		                    </div>
                        </c:if>
                        
                        <c:if test="${not empty users}">
                        <h5 class="page-title">Quantidade de usuários cadastrados: ${users.size()}!</h5>                                        

                        <div class="table-responsive">
                            <table class="table table-centered w-100 dt-responsive nowrap" id="products-datatable">
                                <thead class="table-light">
                                    <tr>
                                        <th>ID</th>
                                        <th>Nome</th>
                                        <th>Email</th>
                                        <th>Senha</th>
                                        <th>Idade</th>
                                        <th>Endereço</th>
                                        <th>CEP</th>
                                        <th style="width: 75px;">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<c:forEach var="u" items="${users}">
                                     <tr>
                                     	<td>${u.id}</td>
                                         <td class="table-user">
                                             <img src="/assets/images/users/avatar-4.jpg" alt="table-user" class="me-2 rounded-circle">
                                             <a href="javascript:void(0);" class="text-body fw-semibold">${u.name}</a>
                                         </td>
                                         <td>${u.email}</td>
                                         <td>${u.password}</td>
                                         <td>${u.age}</td>
                                         <td>${u.address}</td>
                                         <td>${u.zip}</td>
                                         <td>
                                             <a href="javascript:void(0);" class="action-icon"> <i class="mdi mdi-square-edit-outline"></i></a>
                                             <a href="/usuario/${u.id}/excluir" class="action-icon"> <i class="mdi mdi-delete"></i></a>
                                         </td>
                                     </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    	</c:if>
                    </div> <!-- end card-body-->
                </div> <!-- end card-->
            </div> <!-- end col -->
        </div>
        <!-- end row -->

    </div>
    <!-- container -->

<c:import url="/WEB-INF/jsp/templates/footer.jsp"></c:import>