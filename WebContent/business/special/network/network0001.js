$().ready(function() {
$("#frmEdit").validate({//ajax提交校验
		submitHandler : function(form) {
			doSave();
		}
	});
});

function doBack(){
	location.href = path+"/tstNetwork/index1.action";
}

function doSave() {
		var frmvalue = formToJson($("#frmEdit"));
		$.ajax({   
		    url:path+'/tstNetwork/edit.action',   
		    type:"POST",
		    data:'frmvalue='+frmvalue,   
		    async : false, //默认为true 异步   
		    success:function(data){
		    	if(data.success==true){
		    		alert("保存成功!");
		    		location.href = path + "/tstNetwork/index1.action";
		    	}
	        },
	        error:function(msg){
	        	alert("error");
	        }
		});
	

}