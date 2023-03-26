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
                            <li class="breadcrumb-item"><a href="javascript: void(0);">Consultancy</a></li>
                            <li class="breadcrumb-item active">Request</li>
                        </ol>
                    </div>
                    <h4 class="page-title">Lista dos Pedidos de Consultoria</h4>
                </div>
            </div>
        </div>
        <!-- end page title -->

        <div class="row">
            <div class="col-12">
                <div class="card">
                    <div class="card-body">
                        
                        <c:if test="${empty requests}">
	                        <div class="clearfix">
		                        <div class="float-start">
		                            <h5 class="page-title">Não existem consultorias cadastradas!</h5>
		                        </div>
		                        <div class="float-end">
		                            <a href="/consultancy/request"> <button type="button" class="btn btn-primary btn-md">
		                                <i class="mdi mdi-plus-thick"></i> Cadastrar </button>
		                            </a>
		                        </div>
		                    </div>
                        </c:if>
                        
                        <c:if test="${not empty requests}">
                        	<div class="clearfix">
		                        <div class="float-start">
		                            <h5 class="page-title">Quantidade de consultorias cadastradas: ${requests.size()}!</h5>
		                        </div>
		                        <div class="float-end">
		                            <a href="/consultancy/request"> <button type="button" class="btn btn-primary btn-md">
		                                <i class="mdi mdi-plus-thick"></i> Cadastrar </button>
		                            </a>
		                        </div>
		                    </div>
	                        <div class="table-responsive">
	                            <table class="table table-centered w-100 dt-responsive nowrap" id="products-datatable">
	                                <thead class="table-light">
	                                    <tr>
	                                    	<th class="all" style="width: 20px;">
	                                            <div class="form-check">
	                                                <input type="checkbox" class="form-check-input" id="customCheck1">
	                                                <label class="form-check-label" for="customCheck1">&nbsp;</label>
	                                            </div>
	                                        </th>
	                                        <th class="all">ID</th>
	                                        <th>Cliente</th>
	                                        <th>Qte Consultoria</th>
	                                        <th>Consultorias</th>
	                                        <th>Consultor</th>
	                                        <th>Custo total</th>
	                                        <th>Data da requisição</th>
	                                        <th style="width: 75px;">Action</th>
	                                    </tr>
	                                </thead>
	                                <tbody>
	                                	<c:forEach var="u" items="${requests}">
	                                     <tr>
                                     		<td>
	                                            <div class="form-check">
	                                                <input type="checkbox" class="form-check-input" id="customCheck2">
	                                                <label class="form-check-label" for="customCheck2">&nbsp;</label>
	                                            </div>
                                        	</td>
	                                     	<td>${u.id}</td>
	                                         <td class="table-user">
	                                             <img src="/assets/images/users/avatar-4.jpg" alt="table-user" class="me-2 rounded-circle">
	                                             <a href="javascript:void(0);" class="text-body fw-semibold">${u.client.name}</a>
	                                         </td>
	                                         <td>${u.consultancies.size()}</td>
	                                         <td>${u.consultancies}</td>
	                                         <td>${u.user.name}</td>
	                                         <td>${u.totalCost}</td>
	                                         <td>${u.requestDate}</td>
	                                         <td>
	                                             <a href="javascript:void(0);" class="action-icon"> <i class="mdi mdi-square-edit-outline"></i></a>
	                                             <a href="/consultancy/request/${u.id}/delete" class="action-icon"> <i class="mdi mdi-delete"></i></a>
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