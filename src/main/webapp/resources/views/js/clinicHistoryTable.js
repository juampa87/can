$(document).ready(function() {
    $('#clinic-history-table').dataTable({
		"bProcessing": true,
		"sAjaxSource": '/can/dogs/clinic-history/1',
		"aoColumns": [
		              {mDataProp : 'id',bVisible :false},
		              {mDataProp : 'date'},
		              {mDataProp : 'history'}
		],
		"aoColumnDefs": [
		                   {
		                        "aTargets": [3],
		                        "mData": null,
		                        "mRender": function (data, type, full) {
		                        	return '<a href="#deleteClinicHistory" role="button" class="btn btn-large btn-primary" data-toggle="modal">'+
		                        	'<img src="/can/resources/views/images/delete.png"/></a>'+
		                        	'<div id="deleteClinicHistory" class="modal fade">'+
									    '<div class="modal-dialog">'+
									        '<div class="modal-content">'+
									            '<div class="modal-header">'+
									                '<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>'+
									                '<h4 class="modal-title">Borrar</h4>'+
									            '</div>'+
									            '<div class="modal-body">'+
									                '<p>Esta seguro de querer borrar entrada a la historia clinica?</p>'+
									            '</div>'+
									            '<div class="modal-footer">'+
									                '<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>'+
									                '<a href="/can/dogs/list" class="btn btn-primary" role="button">Borrar</a>'+
									            '</div>'+
									        '</div>'+
									    '</div>'+
									'</div>';
		                        }
		                    }
		                 ]
	});
});