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
                            <li class="breadcrumb-item active">Training</li>
                        </ol>
                    </div>
                    <h4 class="page-title">Lista das Consultorias de Treinamento</h4>
                </div>
            </div>
        </div>
        <!-- end page title -->

        <div class="row">
            <div class="col-12">
                <div class="card">
                    <div class="card-body">
                        
                        <c:if test="${empty trainings}">
                        	<div class="clearfix">
		                        <div class="float-start">
		                            <h5 class="page-title">Não existem consultorias cadastradas!</h5>
		                        </div>
		                        <div class="float-end">
		                            <a href="/consultancy/training"> <button type="button" class="btn btn-primary btn-md">
		                                <i class="mdi mdi-plus-thick"></i> Cadastrar </button>
		                            </a>
		                        </div>
		                    </div>
                        </c:if>
                        
                        <c:if test="${not empty trainings}">
                        <div class="row mb-2">
                            <div class="col-sm-4">
	                            <h5 class="page-title">Quantidade de consultorias cadastradas: ${trainings.size()}!</h5>
	                        </div>
	                        <div class="col-sm-8">
                                <div class="text-sm-end">
		                            <a href="/consultancy/training"> <button type="button" class="btn btn-primary btn-md">
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
                                        <th>Tipo</th>
                                        <th>Qtd de pessoas</th>
                                        <th>Horas de treinamento</th>
                                        <th>Tipo de contrato</th>
                                        <th>Número de horas</th>
                                        <th>Custo</th>
                                        <th style="width: 75px;">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<c:forEach var="u" items="${trainings}">
                                     <tr>
                                     	<td>${u.id}</td>
                                         <td>${u.trainingType}</td>
                                         <td>${u.qtyPeople}</td>
                                         <td>${u.qtyTrainingHours}</td>
                                        <td>${u.contractType}</td>
                                         <td>${u.qtyHours}</td>
                                         <td>${u.cost}</td>
                                         <td>
                                             <a href="javascript:void(0);" class="action-icon"> <i class="mdi mdi-square-edit-outline"></i></a>
                                             <a href="/consultancy/training/${u.id}/delete" class="action-icon"> <i class="mdi mdi-delete"></i></a>
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