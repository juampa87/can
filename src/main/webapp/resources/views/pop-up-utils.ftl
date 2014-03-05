<#macro delete dogId dogCode dogCodeType>
	<div id="delete-${dogId}" class="modal fade">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title">Borrar</h4>
	            </div>
	            <div class="modal-body">
	                <p>Esta seguro de querer borrar el perro ${dogCodeType}-${dogCode}?</p>
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
	                <a href="/can/dogs/delete?oid=${dogId}" class="btn btn-primary" role="button">Borrar</a>
	            </div>
	        </div>
	    </div>
	</div>
</#macro>

