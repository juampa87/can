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
				
				<div class="panel panel-default">
			            	<div class="panel-heading">
		                        Unidades
		                    </div>
			            	<div class="panel-body">
			            		<div class="table-responsive">
	                                <table class="table table-striped table-bordered table-hover" id="units-table">
	                                	<thead>
	                                        <tr>
	                                        	<th></th>
	                                            <th>Nombre</th>
	                                            <th>Ubicaci&oacute;n</th>
	                                            <th></th>
	                                        </tr>
	                                    </thead>
	                                </table>
                            	</div>
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
<script src="/can/resources/views/js/plugins/dataTables/jquery.dataTables.js"></script>
<script src="/can/resources/views/js/plugins/dataTables/dataTables.bootstrap.js"></script>
<script src="/can/resources/views/js/unitsTable.js"></script>

<#include "footer.ftl">