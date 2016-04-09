//查询
function doQry(){
//	var frmQry= formToJson($("#frmQry"));
//	var PageRoll= formToJson($("#PageRoll"));
//	location.href = path+"/tstNetwork/indexin.action?frmQry="+frmQry+"&PageRoll="+PageRoll;
}
//新增
function doAdd(){
	location.href = path+"/business/special/network/network0001.jsp";
}
//修改
function doEdit(id){
	location.href = path+"/tstNetwork/indexedit.action?id="+id;
   }
//删除
function doDel(id){
	var r = confirm("是否确认删除!")
	if (r == true) {
		$.ajax({   
		    url:path+'/tstNetwork/delele.action',   
		    type:"POST",
		    data:'id='+id,   
		    async : false, //默认为true 异步   
		    success:function(data){
		    	if(data.success==true){
		    		alert("删除成功!");
		    		doQry();
		    	}
	        },
	        error:function(msg){
	        	alert("error");
	        }
		});
		
	}
}




function doReset(){
	 $(':input', '#frmQry').not(':button, :submit, :reset, :hidden').val('').removeAttr('checked').removeAttr('selected');
}



