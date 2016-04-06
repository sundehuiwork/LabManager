$().ready(function() {
$("#frmEdit").validate({//ajax提交校验
		submitHandler : function(form) {
			doSave();
		}
	});
});

function doBack(){
	location.href = path+"/sysuser/index.action";
}

function doSave() {
		var frmvalue = formToJson($("#frmEdit"));
		$.ajax({   
		    url:path+'/sysuser/edit.action',   
		    type:"POST",
		    data:'frmvalue='+frmvalue,   
		    async : false, //默认为true 异步   
		    success:function(data){
		    	if(data.success==true){
					var r = confirm("保存成功!")
					if (r == true) {
						location.href = path + "/sysuser/index.action";
					}
		    	}
	        },
	        error:function(msg){
	        	alert("error");
	        }
		});
	

}