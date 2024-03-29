<#include "header.ftl">
<div id="page-wrapper">
	 <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Unidades</h1>
        </div>
        <!-- /.col-lg-12 -->    
        <div class="row">
                <div class="col-lg-12">
                	<a href="/can/units/addForm" class="btn btn-primary" role="button">Agregar Unidad</a>
                    <div class="panel panel-default">
                       
                        <div class="panel-body">
                        	<div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Nombre</th>
                                            <th>Ubicacion</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    	<#list unitList as unit>
                                    	<#assign trCss = (unit_index % 2 == 0)?string("even","odd")>
	                                        <tr class="${trCss}" >
	                                            <td>${unit.name!'-'}</td>
												<td>${unit.location!'-'}</td>
												<td>
													<span name="edit"><img src="/elefante/images/edit.png"/></span>
									            	<span name="delete"><img src="/elefante/images/delete.png"/></span>
									            </td>
	                                        </tr>
										</#list>
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
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
<script src="/can/resources/views/js/tables.js"></script>


<#include "footer.ftl">