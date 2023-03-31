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
                           <li class="breadcrumb-item"><a href="javascript: void(0);">Cliente</a></li>
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
		                            <h5 class="page-title">Não existem consultorias cadastradas!</h5>
		                        </div>
		                        <div class="float-end">
		                            <a href="/user"> <button type="button" class="btn btn-primary btn-md">
		                                <i class="mdi mdi-plus-thick"></i> Cadastrar </button>
		                            </a>
		                        </div>
		                    </div>
                        </c:if>
                        
                        <c:if test="${not empty users}">
                        <div class="row mb-2">
                            <div class="col-sm-4">
                            	<c:if test="${not empty message}">
	                        		<div class="alert alert-success alert-dismissible bg-success text-white border-0 fade show" role="alert">
									    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
									    <strong>Success - </strong> ${message}
									</div>
	                        	</c:if>
	                        	<c:if test="${empty message}">
									<h5 class="page-title">Quantidade de usuários cadastrados: ${users.size()}!</h5> 
								</c:if>                                
							</div>
	                    </div>
                        <div class="table-responsive">
                            <table class="table table-centered w-100 dt-responsive nowrap" id="products-datatable">
                                <thead class="table-light">
                                    <tr>
                                    	<c:if test="${user.admin}"><th class="all">ID</th></c:if>
                                        <c:if test="${not user.admin}">
                                        	<th/>
                                        	<th class="all">ID</th>
                                   		</c:if>
                                        <th>Nome</th>
                                        <th>Email</th>
                                        <th>Endereço</th>
                                        <th>Clientes</th>
                                        <th>Consultorias</th>
                                        <th>Solicitações</th>
                                        <c:if test="${user.admin}">
                                        	<th style="width: 75px;">Action</th>
                                        </c:if>
                                    </tr>
                                </thead>
                                <tbody>
                                	<c:forEach var="u" items="${users}">
                                     <tr>
	                                     <c:if test="${user.admin}"><td>${u.id}</td></c:if>
	                                        <c:if test="${not user.admin}">
	                                        	<th></th>
	                                        	<td>${u.id}</td>
                                   		 </c:if>
                                     	
                                         <td>
                                         	<div class="d-flex align-items-start">
                                            	<img src="/assets/images/users/avatar-4.jpg" width="40" class="me-3 rounded-circle">
                                            	<div class="w-100 overflow-hidden">
	                                            	<h5 class="mt-0 mb-1">${u.name}</h5>
	                                            	<span class="text-muted font-13">
	                                            		<c:if test="${u.admin}">Administrador</c:if>
	                                            		<c:if test="${not u.admin}">Usuário</c:if>
	                                            	</span>
                                            	</div>
                                            </div>
                                         </td>
                                         <td>${u.email}</td>
                                         <td>${u.address}</td>
                                         <td>${u.clients.size()}</td>
                                         <td>${u.consultancies.size()}</td>
                                         <td>${u.consultancyRequests.size()}</td>
                                         <c:if test="${user.admin}">
	                                         <td>
	                                             <a href="javascript:void(0);" class="action-icon"> <i class="mdi mdi-square-edit-outline"></i></a>
	                                             <a href="#danger-alert-modal-${u.id}" data-bs-toggle="modal" class="action-icon"> <i class="mdi mdi-delete"></i></a>
	                                         </td>
                                         </c:if>
                                     </tr>
                                     
                                     <!-- Danger Alert Modal -->
									 <div id="danger-alert-modal-${u.id}" class="modal fade" data-bs-backdrop="static" tabindex="-1" role="dialog" aria-hidden="true">
									    <div class="modal-dialog modal-sm modal-dialog-centered">
									        <div class="modal-content modal-filled bg-danger">
									            <div class="modal-body p-4">
									                <div class="text-center">
									                    <i class="dripicons-wrong h1"></i>
									                    <h4 class="mt-2">Atenção!</h4>
									                    <p class="mt-3">A ${u.name} será deletada, confirma?</p>
									                    
									                    <button type="button" class="btn btn-light" data-bs-dismiss="modal">Close</button>
									                    <a href="/usuario/${u.id}/excluir">
									                    	<button type="button" class="btn btn-light my-2" data-bs-dismiss="modal">Confirma</button>
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