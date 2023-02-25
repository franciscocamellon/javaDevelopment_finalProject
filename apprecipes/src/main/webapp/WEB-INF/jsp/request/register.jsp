<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url="/WEB-INF/jsp/templates/body.jsp"></c:import>


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
                                    <h4 class="page-title">Request</h4>
                                </div>
                            </div>
                        </div>
                        <!-- end page title -->

				        <div class="row">
				            <div class="col-12">
				                <div class="card">
				                    <div class="card-body">
    
    									<!-- Steps Information -->
                                        <div class="tab-content">

                                            <!-- Billing Content-->
                                            <div class="tab-pane show active" id="billing-information">
                                                <div class="row">
                                                    <div class="col-lg">
                                                        <h4 class="mt-2">Register</h4>

                                                        <p class="text-muted mb-4">Fill the form below in order to
                                                            register a new consultancy request.</p>
														
                                                        <form action="/consultancy/request/add" method="post">
                                                            <div class="row">
                                                                <div class="col-md-4">
                                                                    <div class="mb-3">
                                                                        <label class="form-label">Cliente</label>
                                                                        <select name="client" class="form-select mb-3">
                                                                        
                                                                        	<c:if test="${not empty clients}">
                                                                        	
                                                                        		<c:forEach var="u" items="${clients}">
                                                                        			<option value="${u}">${u.name}</option>
                                                                        		</c:forEach>
	                                                                            
                                                                            </c:if>
                                                                            
                                                                            <c:if test="${empty clients}">
                                                                            	<option value="null" selected>Não há clientes cadastrados</option>
                                                                            </c:if>
                                                                            
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                            </div> <!-- end row -->
                                                            <div class="row">
                                                            	<div class="col-md-4">
                                                            		<div class="mb-3">
                                                                        <label class="form-label">Consultorias em cardápio</label>
                                                                        <select name="service" class="form-select mb-3">
                                                                        
                                                                        	<c:if test="${not empty menus}">
                                                                        	
                                                                        		<c:forEach var="u" items="${menus}">
                                                                        			<option value="${u}">${u.menuType} - ${u.cuisine}</option>
                                                                        		</c:forEach>
	                                                                            
                                                                            </c:if>
                                                                            
                                                                            <c:if test="${empty menus}">
                                                                            	<option value="null" selected>Não há consultorias cadastradas</option>
                                                                            </c:if>
                                                                            
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-4">
	                                                         		<div class="mb-3">
	                                                                     <label class="form-label">Consultorias em layout</label>
	                                                                     <select name="service" class="form-select mb-3">
	                                                                     
	                                                                     	<c:if test="${not empty layouts}">
	                                                                     	
	                                                                     		<c:forEach var="u" items="${layouts}">
	                                                                     			<option value="${u}">${u.layoutType} - ${u.kitchenType}</option>
	                                                                     		</c:forEach>
	                                                                          
	                                                                         </c:if>
	                                                                         
	                                                                         <c:if test="${empty layouts}">
	                                                                         	<option value="null" selected>Não há consultorias cadastradas</option>
	                                                                         </c:if>
	                                                                         
	                                                                     </select>
                                                                	</div>
                                                                </div>
                                                                <div class="col-md-4">
	                                                         		<div class="mb-3">
	                                                                     <label class="form-label">Consultorias em treinamento</label>
	                                                                     <select name="service" class="form-select mb-3">
	                                                                     
	                                                                     	<c:if test="${not empty trainings}">
	                                                                     	
	                                                                     		<c:forEach var="u" items="${trainings}">
	                                                                     			<option value="${u}">${u.trainingType} - ${u.qtyPeople} pessoas</option>
	                                                                     		</c:forEach>
	                                                                          
	                                                                         </c:if>
	                                                                         
	                                                                         <c:if test="${empty trainings}">
	                                                                         	<option value="null" selected>Não há consultorias cadastradas</option>
	                                                                         </c:if>
	                                                                         
	                                                                     </select>
	                                                                </div>
                                                                </div>
                                                        	</div>
                                                            
                                                            <div class="row">
                                                                <div class="col-md-4">
                                                                    <div class="mb-3">
                                                                         <label class="form-label">Custo total <span class="text-danger">*</span></label>
																	    <input class="form-control" value="20000" type="number" name="totalCost">
                                                                    </div>
                                                                </div>
                                                            </div> <!-- end row -->

                                                            <div class="row mt-4">
                                                                <div class="col-sm-6">
                                                                    <a href="/" class="btn text-muted d-none d-sm-inline-block btn-link fw-semibold">
                                                                        <i class="mdi mdi-arrow-left"></i> Back </a>
                                                                </div> <!-- end col -->
                                                                <div class="col-sm-6">
                                                                    <div class="text-sm-end">
                                                                    	<button class="btn btn-primary" type="submit"><i class="mdi mdi-content-save me-1"></i> Save </button>
                                                                    </div>
                                                                </div> <!-- end col -->
                                                            </div> <!-- end row -->
                                                        </form>
                                                    </div>
                                                </div> <!-- end row-->
                                            </div>
                                          
                                            <!-- End Billing Information Content-->
                                            </div>
                                            </div>
                                            </div>
                                            </div>
                                            </div>
                                            </div>

<c:import url="/WEB-INF/jsp/templates/footer.jsp"></c:import>