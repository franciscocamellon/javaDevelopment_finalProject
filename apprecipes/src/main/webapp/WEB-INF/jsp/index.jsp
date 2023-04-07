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
					<form class="d-flex">
						<div class="input-group">
							<input type="text" class="form-control form-control-light"
								id="dash-daterange"> <span
								class="input-group-text bg-success border-success text-white">
								<i class="mdi mdi-calendar-range font-13"></i>
							</span>
						</div>
						<a href="javascript: void(0);" class="btn btn-success ms-2"> <i
							class="mdi mdi-autorenew"></i>
						</a>
					</form>
				</div>
				<h4 class="page-title">Dashboard</h4>
			</div>
		</div>
	</div>
	<!-- end page title -->

	<div class="row">
		<div class="col-lg-12">

			<div class="row">
				<c:if test="${not empty requests}">
				<div class="col-lg-3">
					<div class="card widget-flat">
						<div class="card-body">
							<div class="float-end">
								<i class="mdi mdi-account-multiple widget-icon bg-success-lighten text-success"></i>
							</div>
							
							<h5 class="text-muted fw-normal mt-0" title="Number of Customers">Solicitações de consultoria</h5>
							<h3 class="mt-3 mb-3">${requests}</h3>
							<p class="mb-0 text-muted">
								<span class="text-success me-2"><i
									class="mdi mdi-arrow-up-bold"></i> 5.27%</span> <span
									class="text-nowrap">Since last month</span>
							</p>
						</div>
						<!-- end card-body-->
					</div>
					<!-- end card-->
					
				</div>
				</c:if>
				<!-- end col-->
				<c:if test="${not empty consultancies}">
				<div class="col-lg-3">
					<div class="card widget-flat">
						<div class="card-body">
							<div class="float-end">
								<i
									class="mdi mdi-cart-plus widget-icon bg-danger-lighten text-danger"></i>
							</div>
							<h5 class="text-muted fw-normal mt-0" title="Number of Orders">Consultorias</h5>
							<h3 class="mt-3 mb-3">${consultancies}</h3>
							<p class="mb-0 text-muted">
								<span class="text-danger me-2"><i
									class="mdi mdi-arrow-down-bold"></i> 1.08%</span> <span
									class="text-nowrap">Since last month</span>
							</p>
						</div>
						<!-- end card-body-->
					</div>
					<!-- end card-->
				</div>
				</c:if>
				<!-- end col-->
				<c:if test="${not empty clients}">
				<div class="col-lg-3">
					<div class="card widget-flat">
						<div class="card-body">
							<div class="float-end">
								<i
									class="mdi mdi-currency-usd widget-icon bg-info-lighten text-info"></i>
							</div>
							<h5 class="text-muted fw-normal mt-0" title="Average Revenue">Clientes</h5>
							<h3 class="mt-3 mb-3">${clients}</h3>
							<p class="mb-0 text-muted">
								<span class="text-danger me-2"><i
									class="mdi mdi-arrow-down-bold"></i> 7.00%</span> <span
									class="text-nowrap">Since last month</span>
							</p>
						</div>
						<!-- end card-body-->
					</div>
					<!-- end card-->
				</div>
				</c:if>
				<!-- end col-->
				<c:if test="${not empty users}">
				<div class="col-lg-3">
					<div class="card widget-flat">
						<div class="card-body">
							<div class="float-end">
								<i
									class="mdi mdi-pulse widget-icon bg-warning-lighten text-warning"></i>
							</div>
							<h5 class="text-muted fw-normal mt-0" title="Growth">Usuários</h5>
							<h3 class="mt-3 mb-3">${users}</h3>
							<p class="mb-0 text-muted">
								<span class="text-success me-2"><i
									class="mdi mdi-arrow-up-bold"></i> 4.87%</span> <span
									class="text-nowrap">Since last month</span>
							</p>
						</div>
						<!-- end card-body-->
					</div>
					<!-- end card-->
				</div>
				</c:if>
				<!-- end col-->
			</div>
			<!-- end row -->

		</div>
		<!-- end col -->

	</div>
	<!-- end row -->

	<div class="row">
		<div class="col-lg-6">
			<div class="card">
				<div class="card-body">
					<div class="dropdown float-end">
						<a href="#" class="dropdown-toggle arrow-none card-drop"
							data-bs-toggle="dropdown" aria-expanded="false"> <i
							class="mdi mdi-dots-vertical"></i>
						</a>
						<div class="dropdown-menu dropdown-menu-end">
							<!-- item-->
							<a href="javascript:void(0);" class="dropdown-item">Sales
								Report</a>
							<!-- item-->
							<a href="javascript:void(0);" class="dropdown-item">Export
								Report</a>
							<!-- item-->
							<a href="javascript:void(0);" class="dropdown-item">Profit</a>
							<!-- item-->
							<a href="javascript:void(0);" class="dropdown-item">Action</a>
						</div>
					</div>
					<h4 class="header-title">Tipo de serviços</h4>

					<h5 class="mb-1 mt-3 fw-normal">Menu</h5>
					<div class="progress-w-percent">
						<span class="progress-value fw-bold">72k </span>
						<div class="progress progress-sm">
							<div class="progress-bar bg-dark" role="progressbar"
								style="width: 72%;" aria-valuenow="72" aria-valuemin="0"
								aria-valuemax="100"></div>
						</div>
					</div>

					<h5 class="mb-1 mt-0 fw-normal">Layout</h5>
					<div class="progress-w-percent">
						<span class="progress-value fw-bold">39k </span>
						<div class="progress progress-sm">
							<div class="progress-bar bg-warning" role="progressbar"
								style="width: 39%;" aria-valuenow="39" aria-valuemin="0"
								aria-valuemax="100"></div>
						</div>
					</div>

					<h5 class="mb-1 mt-0 fw-normal">Treinamento</h5>
					<div class="progress-w-percent">
						<span class="progress-value fw-bold">25k </span>
						<div class="progress progress-sm">
							<div class="progress-bar bg-info" role="progressbar"
								style="width: 39%;" aria-valuenow="39" aria-valuemin="0"
								aria-valuemax="100"></div>
						</div>
					</div>
				</div>
				<!-- end card-body-->
			</div>
			<!-- end card-->
		</div>
		<!-- end col-->
	</div>
	<!-- end row -->

</div>
<!-- container -->

<c:import url="/WEB-INF/jsp/templates/footer.jsp"></c:import>