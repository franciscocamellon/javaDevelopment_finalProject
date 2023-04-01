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
                        	<div class="row mb-2">
	                            <div class="col-sm-4">
	                            	<c:if test="${not empty message}">
	                            		<div class="alert alert-success alert-dismissible bg-success text-white border-0 fade show" role="alert">
										    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
										    ${message}
										</div>
	                            	</c:if>
	                            	<c:if test="${empty message}">
		                            <h5 class="page-title">Quantidade de consultorias cadastradas: ${requests.size()}!</h5>
		                            </c:if>
		                        </div>
		                        <div class="col-sm-8">
                                	<div class="text-sm-end">
			                            <a href="/consultancy/request"> <button type="button" class="btn btn-primary btn-md">
			                                <i class="mdi mdi-plus-thick"></i> Cadastrar </button>
			                            </a>
		                        	</div>
		                        </div>
		                    </div>
	                        <div class="table-responsive">
	                            <table class="table table-centered w-100 dt-responsive nowrap" id="products-datatable">
	                                <thead class="table-light">
	                                    <tr>
	                                        <th class="all">ID</th>
	                                        <th>Cliente</th>
	                                        <th>Qtd</th>
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
	                                     	<td>${u.id}</td>
	                                         <td class="table-user">
	                                             <img src="/assets/images/users/avatar-4.jpg" alt="table-user" class="me-2 rounded-circle">
	                                             <a href="javascript:void(0);" class="text-body fw-semibold">${u.client.name}</a>
	                                         </td>
	                                         <td>${u.consultancies.size()}</td>
	                                         <td>
	                                         <c:forEach var="consultancies" items="${u.consultancies}">
	                                         	${consultancies}<br>
	                                         </c:forEach>
	                                         </td>
	                                         <td>${u.user.name}</td>
	                                         <td>${u.totalCost}</td>
	                                         <td>${u.requestDate}</td>
	                                         <td>
	                                             <a href="javascript:void(0);" class="action-icon"> <i class="mdi mdi-square-edit-outline"></i></a>
	                                             <a href="#danger-alert-modal-${u.id}" data-bs-toggle="modal" class="action-icon"> <i class="mdi mdi-delete"></i></a>
	                                         </td>
	                                     </tr>
										
										<!-- Danger Alert Modal -->
										 <div id="danger-alert-modal-${u.id}" class="modal fade" data-bs-backdrop="static" tabindex="-1" role="dialog" aria-hidden="true">
										    <div class="modal-dialog modal-sm modal-dialog-centered">
										        <div class="modal-content modal-filled bg-danger">
										            <div class="modal-body p-4">
										                <div class="text-center">
										                    <i class="dripicons-wrong h1"></i>
										                    <h4 class="mt-2">Atenção!</h4>
										                    <p class="mt-3">A solicitação do cliente <em><strong>${u.client.name}</strong></em> será deletada, confirma?</p>
										                    
										                    <button type="button" class="btn btn-light" data-bs-dismiss="modal">Não</button>
										                    <a href="/consultancy/request/${u.id}/delete">
										                    	<button type="button" class="btn btn-light my-2" data-bs-dismiss="modal">Sim</button>
									                    	</a>
										                </div>
										            </div>
										        </div><!-- /.modal-content -->
										    </div><!-- /.modal-dialog -->
										 </div><!-- /.modal -->
										
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