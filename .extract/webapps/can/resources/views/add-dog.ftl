<#include "header.ftl">
<div id="page-wrapper">
	 <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Perros</h1>
        </div>
        <!-- /.col-lg-12 -->    
        <div class="row">
            <div class="col-lg-12">
            	<div class="panel-body">
            		<div class="row">
            			
		    			<form action="/can/dogs/add" method="POST" role="form" >
		    				<div class="col-lg-6">
		    					 <div class="form-group">
				                    <label>C&oacute;digo</label>
				                    <input name="code" class="form-control">
				                </div>		
				                <div class="form-group">
				                    <label>Nombre</label>
				                    <input name="name" class="form-control">
				                </div>
				                <div class="form-group">
				                    <label>Apodo</label>
				                    <input  name="nickname" class="form-control">
				                </div>
				                <div class="form-group">
				                    <label>Raza</label>
				                    <input  name="breed" class="form-control">
				                </div>
				                <div class="form-group">
				                    <label>Especialidad</label>
				                    <select  name="specialization" class="form-control">
				                    	<#list specializations as specialization>
					                        <option value="${specialization}">${specialization.field}</option>
				                        </#list>
				                    </select>
				                </div>
				                
				                <div class="form-group">
				                    <label>Unidad</label>
				                    <select  name="unitId"  class="form-control">
				                    	<#list units as unit>
					                        <option value="${unit.id}">${unit}</option>
				                        </#list>
				                    </select>
				                </div>
				                
				                <div class="form-group">
				                    <label>Fecha Nacimiento</label>
									<input  name="birthdate" class="form-control" id="fecha-nac""></input>
				                </div>
				                <div class="form-group">
				                    <label>Tatuaje</label>
				                    <input  name="tatoo" class="form-control">
				                </div>
				                
				                <div class="form-group">
				                    <label>Foto</label>
				                    <input  name="file" type="file">
				                </div>
				                <div class="form-group">
				                    <label>Observaci&oacute;n</label>
				                    <textarea  name="description"  class="form-control" rows="3"></textarea>
				                </div>
				                
				                <button type="submit" class="btn btn-success">Agregar</button>
				                <button type="reset" class="btn btn-danger">Resetear Campos</button>
							</div>
		            		<!-- /.col-lg-6 -->
		            		<div class="col-lg-3">
				                <div class="form-group">
				                    <label>Tipo de c&oacute;digo</label>
				                    <select  name="codeType"  class="form-control">
				                        <option value="POA">POA</option>
				                        <option value="FCA">FCA</option>
				                    </select>
				                </div>
							</div>
			            </form>
			    	</div>	  
				</div>   	
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
    </div>
</div>
<!-- /#page-wrapper -->

<!-- Page-Level Plugin Scripts -->
<link href="/can/resources/views/datepicker/css/datepicker.css" rel="stylesheet">
<script src="/can/resources/views/datepicker/js/bootstrap-datepicker.js"></script>
<script src="/can/resources/views/js/add-dogs.js"></script>

<#include "footer.ftl">