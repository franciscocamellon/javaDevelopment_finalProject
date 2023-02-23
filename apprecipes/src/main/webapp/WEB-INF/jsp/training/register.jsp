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
                                            <li class="breadcrumb-item active">Training</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Training</h4>
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
                                                        <h4 class="mt-2">Criar uma Consultoria de Treinamento</h4>

                                                        <p class="text-muted mb-4">Preencha o formulário abaixo a fim de criar uma consultoria de treinamento.</p>

                                                        <form>
                                                            <div class="row">
                                                                <div class="col-md-6">
                                                                    <div class="mb-3">
                                                                        <label class="form-label">Solicitação de Consultoria</label>
                                                                        <select data-toggle="select2" title="ClientType">
                                                                            <option value="En">Coco Bambu - 12/12/22</option>
                                                                            <option value="Re">Almeria - 10/08/22</option>
                                                                            <option value="Re">Cantucci - 26/11/22</option>
                                                                            <option value="Re">Almeria - 30/11/22</option>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                            </div> <!-- end row -->
                                                            <div class="row">
                                                            	<div class="col-md-4">
                                                                    <div class="mb-3">
                                                                        <label class="form-label">Tipo de Treinamento</label>
                                                                        <select data-toggle="select2" title="ClientType">
                                                                            <option value="En">Treinamento para promoção</option>
                                                                            <option value="En">Treinamento de boas práticas</option>
                                                                            <option value="En">Treinamento de cardápio</option>
                                                                            <option value="En">Treinamento de estoque</option>
                                                                            <option value="En">Treinamento para mudança de praça</option>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-3">
                                                                    <div class="mb-3">
																	    <label class="form-label">Número de pessoas no treinamento <span class="text-danger">*</span></label>
																	    <input class="form-control" id="example-number" type="number" name="number">
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-5">
                                                                    <div class="mb-3">
                                                                        <label for="billing-phone" class="form-label">Quantidade de dias de treinamento <span class="text-danger">*</span></label>
                                                                        <input type="text" class="form-control date" id="singledaterange" data-toggle="date-picker" data-cancel-class="btn-warning">
                                                                    </div>
                                                                </div>
                                                            </div> <!-- end row -->

                                                            <div class="row mt-4">
                                                                <div class="col-sm-6">
                                                                    <a href="/home" class="btn text-muted d-none d-sm-inline-block btn-link fw-semibold">
                                                                        <i class="mdi mdi-arrow-left"></i> Back to home </a>
                                                                </div> <!-- end col -->
                                                                <div class="col-sm-6">
                                                                    <div class="text-sm-end">
                                                                        <a href="/consultancy/training/list" class="btn btn-primary">
                                                                            <i class="mdi mdi-content-save me-1"></i> Save </a>
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