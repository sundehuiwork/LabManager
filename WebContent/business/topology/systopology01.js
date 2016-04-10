$().ready(function() {
$("#frmEdit").validate({//ajax提交校验
		submitHandler : function(form) {
			doSave();
		}
	});
});

function doBack(){
	location.href = path+"/tstTopology/index1.action";
}

function doSave() {
		var frmvalue = formToJson($("#frmEdit"));
		$.ajax({   
		    url:path+'/tstTopology/edit.action',   
		    type:"POST",
		    data:'frmvalue='+frmvalue,   
		    async : false, //默认为true 异步   
		    success:function(data){
		    	if(data.success==true){
		    		alert("保存成功!");
		    		location.href = path + "/tstTopology/index1.action";
		    	}
	        },
	        error:function(msg){
	        	alert("error");
	        }
		});
	

}

function doTest(){
	 $("#frmEdit").submit();
}