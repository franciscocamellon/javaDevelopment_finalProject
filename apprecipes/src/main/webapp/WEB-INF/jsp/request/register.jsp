<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="button" value="" />
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
                        <h4 class="page-title">Solicita��o de consultoria</h4>
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
                                            <h4 class="mt-2">Registro</h4>

                                            <p class="text-muted mb-4">Preencha o formul�rio para o cadstro de uma solicita��o de consultoria.</p>

                                            <form action="/consultancy/request/add" method="post">
                                                <div class="row">
                                                    <div class="col-md-4">
                                                        <div class="mb-3">
                                                            <label class="form-label">Cliente</label>
                                                            <select name="client.id" class="form-select mb-3" data-placeholder="Escolha uma consultoria">
																
                                                                <c:if test="${not empty clients}">
																	<option value="">Selecione um cliente</option>
                                                                    <c:forEach var="u" items="${clients}">
                                                                        <option value="${u.id}">${u.name}</option>
                                                                    </c:forEach>

                                                                </c:if>

                                                                <c:if test="${empty clients}">
                                                                	<c:set var="button" value="disabled" />
                                                                    <option value="null" selected>N�o h� clientes cadastrados</option>
                                                                </c:if>

                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-4">
                                                        <div class="mb-3">
                                                            <label class="form-label">Consultorias</label>
                                                            <select name="consultancies" class="select2 form-control select2-multiple" data-toggle="select2" multiple="multiple" data-placeholder="Escolha uma consultoria">
															    <c:if test="${not empty consultancies}">
																	
                                                                    <c:forEach var="u" items="${consultancies}">
                                                                        <option value="${u.id}">${u.name}</option>
                                                                    </c:forEach>

                                                                </c:if>

                                                                <c:if test="${empty consultancies}">
                                                                	<c:set var="button" value="disabled" />
                                                                    <option value="null" selected>N�o h� consultorias cadastradas</option>
                                                                </c:if>
															</select>
                                                        </div>
                                                    </div>
                                                </div> <!-- end row -->

                                                <div class="row mt-4">
                                                    <div class="col-sm-6">
                                                        <a href="request/list"
                                                            class="btn text-muted d-none d-sm-inline-block btn-link fw-semibold">
                                                            <i class="mdi mdi-arrow-left"></i> Voltar </a>
                                                    </div> <!-- end col -->
                                                    <div class="col-sm-6">
                                                        <div class="text-sm-end">
                                                            <button ${button} class="btn btn-primary" type="submit">
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