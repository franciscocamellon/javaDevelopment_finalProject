<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <div class="row">
 	
	
		 <div class="mb-3">
	        <label class="form-label">Logradouro</label>
	        <input type="text" name="logradouro" class="form-control" value="${address.logradouro}">
	    </div>
    
		 <div class="mb-3">
	        <label class="form-label">Complemento</label>
	        <input type="text" name="complemento" class="form-control" value="${address.complemento}">
    	</div>
    
	<div class="row g-2">
        <div class="mb-3 col-md-6">
            <label class="form-label">Bairro</label>
            <input type="text" name="bairro" class="form-control" value="${address.bairro}">
        </div>
        <div class="mb-3 col-md-6">
            <label class="form-label">Cidade</label>
            <input type="text" name="localidade" class="form-control" value="${address.localidade}">
        </div>
		<div class="mb-3  col-md-6">
		    <label class="form-label">CEP</label>
		    <input type="text" class="form-control" name="cep" value="${address.cep}" data-toggle="input-mask" data-mask-format="00000-000">
		</div>
        <div class="mb-3 col-md-6">
            <label class="form-label">UF</label>
            <input type="text" name="uf" class="form-control" value="${address.uf}">
        </div>
    </div>
</div> <!-- end row -->                         