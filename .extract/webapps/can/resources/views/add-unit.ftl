<#include "header.ftl">
<div id="page-wrapper">
	 <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Unidades</h1>
        </div>
        <!-- /.col-lg-12 -->    
        <div class="row">
            <div class="col-lg-12">
            	<div class="panel-body">
            		<div class="row">
            			
		    			<form action="/can/units/add" method="POST" role="form">
		    				<div class="col-lg-6">
				                <div class="form-group">
				                    <label>Nombre</label>
				                    <input name="name" class="form-control">
				                </div>
				                <div class="form-group">
				                    <label>Ubicaci&oacute;n</label>
				                    <input name="location" class="form-control">
				                </div>				                
				                <button type="submit" class="btn btn-success">Agregar</button>
				                <button type="reset" class="btn btn-danger">Resetear Campos</button>
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

<#include "footer.ftl">