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
                                            <li class="breadcrumb-item active">Layout</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Layout</h4>
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
                                                            register a new client.</p>

                                                        <form action="/consultancy/layout/add" method="post">
                                                            <div class="row">
                                                                <div class="col-md-4">
                                                                    <div class="mb-3">
                                                                        <label class="form-label">Layout type</label>
                                                                        <select class="form-select mb-3" name="layoutType">
                                                                            <option value="Construção" selected>Construção</option>
                                                                            <option value="Reforma">Reforma</option>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-4">
                                                                    <div class="mb-3">
                                                                       <label class="form-label">Typo da cozinha</label>
                                                                        <select class="form-select mb-3" name="kitchenType">
                                                                            <option value="Quente">Quente</option>
                                                                            <option value="Fria">Fria</option>
                                                                            <option value="Mista" selected>Mista</option>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-4">
                                                                <label class="form-label">Delivery</label>
                                                                    <div class="mt-1 mb-3">
                                                                        <div class="form-check form-check-inline">
																	        <input type="checkbox" value="true" name="delivery" class="form-check-input" id="customCheck3">
																	        <label class="form-check-label" for="customCheck3">Sim</label>
																	    </div>
                                                                        <div class="form-check form-check-inline">
																	        <input type="checkbox" value="false" name="delivery"  checked class="form-check-input" id="customCheck3">
																	        <label class="form-check-label" for="customCheck3">Não</label>
																	    </div>
                                                                    </div>
                                                                </div>
                                                            </div> <!-- end row -->
                                                            
                                                            <div class="row">
                                                            	<div class="col-md-4">
                                                                    <div class="mb-3">
                                                                        <label class="form-label">Tipo de contrato</label>
                                                                        <select class="form-select mb-3" name="contractType">
                                                                            <option value="Projeto">Projeto</option>
                                                                            <option value="Tempo certo">Tempo certo</option>
                                                                            <option value="Tempo indeterminado">Tempo indeterminado</option>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-4">
                                                                	<div class="mb-3">
																	    <label class="form-label">Número de horas <span class="text-danger">*</span></label>
																	    <input class="form-control" id="example-number" type="number" value="55" name="qtyHours">
                                                                    </div>
                                                               	</div>
                                                                <div class="col-md-4">
                                                                    <div class="mb-3">
                                                                         <label class="form-label">Custo da consultoria <span class="text-danger">*</span></label>
																	    <input class="form-control" id="example-number" type="number" value="55000" name="cost">
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
                                                                    	<button class="btn btn-primary" type="submit">
                                                                        	<i class="mdi mdi-content-save me-1"></i> Save
                                                                       	</button>
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