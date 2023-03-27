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
                        <li class="breadcrumb-item"><a href="javascript: void(0);">Client</a></li>
                        <li class="breadcrumb-item active">Register</li>
                    </ol>
                </div>
                <h4 class="page-title">Client</h4>
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

                                    <form action="/client/add" method="post">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <div class="mb-3">
                                                    <label for="billing-first-name" class="form-label">Nome completo</label>
                                                    <input class="form-control" type="text" name="name" value="Francisco Camello"
                                                        placeholder="Digite o nome completo" required />
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="mb-3">
                                                    <label class="form-label">Client type</label>
                                                    <select name="clientType" class="form-select mb-3">
                                                        <option value="Entrepreneur">Entrepreneur</option>
                                                        <option value="Restaurant" selected>Restaurant</option>
                                                    </select>
                                                </div>
                                            </div>
                                        </div> <!-- end row -->
                                        <div class="row">
                                            <div class="col-md-4">
                                                <div class="mb-3">
                                                    <label for="billing-last-name" class="form-label">Nome do empreendimento</label>
                                                    <input class="form-control" type="text" name="enterpriseName" value="Boteco do Chico Bala"
                                                        placeholder="Digite o nome do empreendimento" />
                                                </div>
                                            </div>
                                            <div class="col-md-4">
                                                <div class="mb-3">
                                                    <label for="billing-email-address" class="form-label">Email<span class="text-danger">*</span></label>
                                                    <input class="form-control" type="email" name="email" value="botecochicobala@email.com" placeholder="Digite o email"/>
                                                </div>
                                            </div>
                                        </div> <!-- end row -->
                                        
                                        <c:import url="/WEB-INF/jsp/address/register.jsp"></c:import>

                                        <div class="row mt-4">
                                            <div class="col-sm-6">
                                                <a href="/"
                                                    class="btn text-muted d-none d-sm-inline-block btn-link fw-semibold">
                                                    <i class="mdi mdi-arrow-left"></i> Back </a>
                                            </div> <!-- end col -->
                                            <div class="col-sm-6">
                                                <div class="text-sm-end">
                                                    <button class="btn btn-primary" type="submit">
                                                    	<i class="mdi mdi-content-save me-1"></i> Save
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                        
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<c:import url="/WEB-INF/jsp/templates/footer.jsp"></c:import>