$(function(){
	$("#frmEdit :input").each(function(){
		var a=$(this);
	    alert($(this).text());
	  }); 
})
function doBack(){
	location.href = path+"/sysuser/getSearchPage.action";
}

function doSave() {

	if (validateForm("frmEdit")) {
		var frmvalue = formToJson($("#frmEdit"));
		$.ajax({   
		    url:path+'/sysuser/save.action',   
		    type:"POST",
		    data:'frmvalue='+frmvalue,   
		    async : false, //默认为true 异步   
		    success:function(data){
		    	if(data.success==true){
					var r = confirm("保存成功!")
					if (r == true) {
						location.href = path + "/sysuser/getSearchPage.action";
					}
		    		
		    		
		    	}
	        },
	        error:function(msg){
	        	alert("error");
	        }
		});
	}

}