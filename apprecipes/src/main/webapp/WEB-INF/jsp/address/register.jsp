<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

	<div class="row">
		<div class="col-md-8">
    		<div class="mb-3">
		        <label class="form-label">Logradouro</label>
		        <input type="text" name="logradouro" class="form-control" value="${address.logradouro}">
		    </div>
	    </div>
    	<div class="col-md-4">
			 <div class="mb-3">
		        <label class="form-label">Complemento</label>
		        <input type="text" name="complemento" class="form-control" value="${address.complemento}">
	    	</div>
    	</div>
   	</div>
    
	<div class="row g-2">
		<div class="col-md-6">
	        <div class="mb-3">
	            <label class="form-label">Bairro</label>
	            <input type="text" name="bairro" class="form-control" value="${address.bairro}">
	        </div>
        </div>
        <div class="col-md-4">
	        <div class="mb-3">
	            <label class="form-label">Cidade</label>
	            <input type="text" name="localidade" class="form-control" value="${address.localidade}">
	        </div>
        </div>
        <div class="col-md-2">
	        <div class="mb-3">
	            <label class="form-label">UF</label>
	            <input type="text" name="uf" class="form-control" value="${address.uf}">
	        </div>
        </div>
		<div class="col-md-6 invisible">
		    <input type="text" class="form-control" name="cep" value="${address.cep}">
		</div>
        
    </div>
<!-- end row -->                         