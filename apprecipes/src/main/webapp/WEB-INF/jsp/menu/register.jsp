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
                                            <li class="breadcrumb-item active">Menu</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Cardápio</h4>
                                </div>
                            </div>
                        </div>
                        <!-- end page title -->

				        <div class="row">
				            <div class="col-12 px-sm-3">
					            <div class="card">
					                <div class="card-body">
					
					                    <!-- Steps Information -->
					                    <div class="tab-content px-sm-2">

                                            <!-- Billing Content-->
                                            <div class="tab-pane show active" id="billing-information">
                                                <div class="row">
                                                    <div class="col-lg">
                                                        <h4 class="mt-2">Cadastro</h4>

                                                        <p class="text-muted mb-4">Preencha o formulário abaixo para cadastrar uma consultoria de cardápio.</p>

                                                        <form action="/consultancy/menu/add" method="post">
                                                        
                                                        	<c:import url="/WEB-INF/jsp/consultancy/register.jsp"></c:import>
                                                        
                                                            <div class="row">
                                                                <div class="col-md-4">
                                                                    <div class="mb-3">
                                                                        <label class="form-label">Tipo de Cardápio</label>
                                                                        <select class="form-select mb-3" name="menuType">
                                                                            <option value="Comida">Comida</option>
                                                                            <option value="Bebida">Bebida</option>
                                                                            <option value="Sobremesa">Sobremesa</option>
                                                                            <option value="Completo">Completo</option>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-4">
                                                                    <div class="mb-3">
                                                                        <label class="form-label">Cozinha</label>
                                                                        <select class="form-select mb-3" name="cuisine">
                                                                            <option value="Tailandesa">Tailandesa</option>
                                                                            <option value="Francesa">Francesa</option>
                                                                            <option value="Italiana">Italiana</option>
                                                                            <option value="Brasileira">Brasileira</option>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-4">
                                                                	<label class="form-label">Vegano</label>
                                                                    <div class="mt-1 mb-3">
                                                                        <div class="form-check form-check-inline">
																	        <input type="radio" id="customRadio3" value="true" name="vegan" class="form-check-input">
																	        <label class="form-check-label" for="customRadio3">Sim</label>
																	    </div>
																	    <div class="form-check form-check-inline">
																	        <input type="radio" id="customRadio4" value="false" name="vegan" checked class="form-check-input">
																	        <label class="form-check-label" for="customRadio4">Não</label>
																	    </div>
                                                                    </div>
                                                                </div>
                                                            </div> <!-- end row -->

                                                            <div class="row mt-4">
                                                                <div class="col-sm-6">
                                                                    <a href="menu/list" class="btn text-muted d-none d-sm-inline-block btn-link fw-semibold">
                                                                        <i class="mdi mdi-arrow-left"></i> Voltar </a>
                                                                </div> <!-- end col -->
                                                                <div class="col-sm-6">
                                                                    <div class="text-sm-end">
                                                                        <button class="btn btn-primary" type="submit">
                                                                        	<i class="mdi mdi-content-save me-1"></i> Salvar
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