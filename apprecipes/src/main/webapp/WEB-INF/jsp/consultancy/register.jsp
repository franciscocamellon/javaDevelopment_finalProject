<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <div class="row">
	<div class="col-md-4">
		<div class="mb-3">
			<label class="form-label">Nome</label>
			<input class="form-control" type="text" name="name" value="Consultoria gastronômica" placeholder="Enter your name" required>
		</div>
	</div>
	
	<div class="col-md-3">
		 <div class="mb-3">
		     <label class="form-label">Tipo de contrato</label>
		     <select class="form-select mb-3" name="contractType">
		         <option value="Projeto">Projeto</option>
		         <option value="Tempo certo">Tempo certo</option>
		         <option value="Tempo indeterminado">Tempo indeterminado</option>
		     </select>
		 </div>
	 </div>
	 
	 <div class="col-md-3">
		 <div class="mb-3">
			<label class="form-label">Qtd de horas <span class="text-danger">*</span></label>
			<input class="form-control" id="example-number" type="number" value="55" name="qtyHours">
		</div>
	</div>
	
	<div class="col-md-2">
		<div class="mb-3">
			<label class="form-label">Custo da consultoria <span class="text-danger">*</span></label>
		    <input class="form-control" id="example-number" type="number" value="55000" name="cost">
		</div>
	</div>
</div> <!-- end row -->                         