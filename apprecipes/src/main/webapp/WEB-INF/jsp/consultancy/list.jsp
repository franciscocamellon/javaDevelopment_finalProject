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
                           <li class="breadcrumb-item"><a href="javascript: void(0);">Consultorias</a></li>
                           <li class="breadcrumb-item active">List</li>
                       </ol>
                   </div>
                   <h4 class="page-title">Consultorias</h4>
               </div>
            </div>
        </div>
        <!-- end page title -->

        <div class="row">
            <div class="col-12">
                <div class="card">
                    <div class="card-body">
                        
                        <c:if test="${empty consultancies}">
                        	<div class="clearfix">
		                        <div class="float-start">
		                            <h5 class="page-title">Não existem consultorias cadastradas!</h5>
		                        </div>
		                        <div class="float-end">
		                        </div>
		                    </div>
                        </c:if>
                        
                        <c:if test="${not empty consultancies}">
                        <div class="row mb-2">
                            <div class="col-sm-4">
                            	<c:if test="${not empty message}">
	                        		<div class="alert alert-success alert-dismissible bg-success text-white border-0 fade show" role="alert">
									    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
									    ${message}
									</div>
	                        	</c:if>
	                        	<c:if test="${empty message}">
                        			<h5 class="page-title">Quantidade de consultorias cadastradas: ${consultancies.size()}!</h5>
                        		</c:if>                                        
							</div>
	                    </div>
                        <div class="table-responsive">
                            <table class="table table-centered w-100 dt-responsive nowrap" id="products-datatable">
                                <thead class="table-light">
                                    <tr>
                                        <th>ID</th>
                                        <th>Nome</th>
                                        <th>Tipo de contrato</th>
                                        <th>Horas</th>
                                        <th>Custo</th>
                                        <th>Consultor</th>
                                        <th>Email</th>
                                        <th style="width: 75px;">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<c:forEach var="c" items="${consultancies}">
                                     <tr>
                                     	<td>${c.id}</td>
                                         <td>${c.name}</td>
                                         <td>${c.contractType}</td>
                                         <td>${c.qtyHours}</td>
                                         <td>${c.cost}</td>
                                         <td>${c.user.name}</td>
                                         <td>${c.user.email}</td>
                                         <td>
                                             <a href="#danger-alert-modal-${c.id}" data-bs-toggle="modal" class="action-icon"> <i class="mdi mdi-delete"></i></a>
                                         </td>
                                     </tr>
                                     
                                     <!-- Danger Alert Modal -->
									 <div id="danger-alert-modal-${c.id}" class="modal fade" data-bs-backdrop="static" tabindex="-1" role="dialog" aria-hidden="true">
									    <div class="modal-dialog modal-sm modal-dialog-centered">
									        <div class="modal-content modal-filled bg-danger">
									            <div class="modal-body p-4">
									                <div class="text-center">
									                    <i class="dripicons-wrong h1"></i>
									                    <h4 class="mt-2">Atenção!</h4>
									                    <p class="mt-3">A consultoria <em><strong>${c.name}</strong></em> será deletada, confirma?</p>
									                    <button type="button" class="btn btn-light" data-bs-dismiss="modal">Não</button>
									                    <a href="/consultancy/${c.id}/delete">
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