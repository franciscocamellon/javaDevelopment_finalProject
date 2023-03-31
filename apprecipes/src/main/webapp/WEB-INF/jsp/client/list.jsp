<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
						<li class="breadcrumb-item"><a href="javascript: void(0);">Client</a></li>
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
                        
                        <c:if test="${empty clients}">
                        	<div class="clearfix">
		                        <div class="float-start">
		                            <h5 class="page-title">Não existem clientes cadastrados!</h5>
		                        </div>
		                        <div class="float-end">
		                            <a href="/client"> <button type="button" class="btn btn-primary btn-md">
		                                <i class="mdi mdi-plus-thick"></i> Cadastrar </button>
		                            </a>
		                        </div>
		                    </div>
                        </c:if>
                        <c:if test="${not empty clients}">
                        <div class="row mb-2">
                            <div class="col-sm-4">
	                            <h5 class="page-title">Quantidade de clientes cadastrados: ${clients.size()}!</h5>
	                        </div>
	                        <div class="col-sm-8">
                                <div class="text-sm-end">
		                            <a href="/client"> <button type="button" class="btn btn-primary btn-md">
		                                <i class="mdi mdi-plus-thick"></i> Cadastrar </button>
		                            </a>
		                        </div>
		                    </div>                             
	                    </div>                             

						<div class="table-responsive">
							<table class="table table-centered w-100 dt-responsive nowrap"
								id="products-datatable">
								<thead class="table-light">
									<tr>
										<th class="all">ID</th>
										<th>Nome</th>
										<th>Tipo</th>
										<th>Empreendimento</th>
										<th>Email</th>
										<th>Consultor</th>
										<th>Endereço</th>
										<th style="width: 75px;">Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="c" items="${clients}">
										<tr>
											<td>${c.id}</td>
											<td>${c.name}</td>
											<td>${c.clientType}</td>
											<td>${c.enterpriseName}</td>
											<td>${c.email}</td>
											<td>${c.user.name}</td>
											<td>${c.address}</td>
											<td>
												<a href="#" class="action-icon"> <i	class="mdi mdi-square-edit-outline"></i></a> 
												<a href="/client/${c.id}/delete" class="action-icon"> <i class="mdi mdi-delete"></i></a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</c:if>
				</div>
				<!-- end card-body-->
			</div>
			<!-- end card-->
		</div>
		<!-- end col -->
	</div>
	<!-- end row -->

</div>
<!-- container -->

<c:import url="/WEB-INF/jsp/templates/footer.jsp"></c:import>