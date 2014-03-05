<#include "header.ftl">
<#include "pop-up-utils.ftl">
<div id="page-wrapper">
	 <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Perros</h1>
        </div>
        <!-- /.col-lg-12 -->    
        <div class="row">
                <div class="col-lg-12">
                	<a href="/can/dogs/addForm" class="btn btn-primary" role="button">Agregar Perro</a>
                    <div class="panel panel-default">
                        <div class="panel-body">
                        	<div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Nombre</th>
                                            <th>Apodo</th>
                                            <th>Fecha Nac.</th>
                                            <th>Especializaci&oacute;n</th>
                                            <th>C&oacute;digo</th>
                                            <th>Tipo</th>
                                            <th>Unidad</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    	<#list dogList as dog>
                                    	<#assign trCss = (dog_index % 2 == 0)?string("even","odd")>
	                                        <tr class="${trCss}" >
	                                            <td>${dog.name!'-'}</td>
												<td>${dog.nickname!'-'}</td>
												<td>${dog.birthdate!'-'}</td>
												<td>${dog.specialization!'-'}</td>
												<td>${dog.code!'-'}</td>
												<td>${dog.codeType!'-'}</td>
												<td>${(dog.unit.name)!'-'}</td>
												<td>
													<span name="clinic-history"><img src="/can/resources/views/images/clinic-history.png"/></span>
													<span name="edit"><img src="/can/resources/views/images/edit.png"/></span>
									            	<a href="#delete-${dog.id}" role="button" class="btn btn-large btn-primary" data-toggle="modal"><img src="/can/resources/views/images/delete.png"/></a>
										            <@delete dog.id dog.codeType dog.code/>	
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