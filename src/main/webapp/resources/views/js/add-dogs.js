$(document).ready(function() {
    $('#fecha-nac').datepicker({
    	format:"dd-mm-yyyy"
    }
    );
    $('#clinic-history-date').datepicker({
    	format:"dd-mm-yyyy"
    }
    );
    $('#add-clinic-history-element').on("click",addClinicHistoryElement);
    $('a[name=remove-clinic-history-element]').on("click",removeClinicHistoryElement);
    
});

function addClinicHistoryElement(){
	var observation = $("#clinic-history-description").val();
	var date = $("#clinic-history-date").val();
	if(observation && date){
		$("#clinic-history-description").val("");
		$("#clinic-history-date").val("");
		var div = '<div class="row" name="clinic-history-element"><div class="col-lg-6"><div class="form-group">'+
		'<textarea id="clinic-history-description" name="description"class="form-control" rows="3" readonly>'+observation+
		'</textarea></div></div><div class="col-lg-3"><div class="form-group">'+
		'<input  id="clinic-history-date" name="clinc-date" class="form-control" readonly value="'+date+'"></input></div>'+
		'<div class="form-group"><a name="remove-clinic-history-element" class="btn btn-danger">Eliminar</a></div></div></div>';
		
		$('#clinic-history').append(div);
	}
}
function removeClinicHistoryElement(){
	$(this).parent("div[name=clinic-history-element]").remove();
}