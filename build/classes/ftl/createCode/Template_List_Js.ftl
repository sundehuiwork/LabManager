

function doAdd(){
	location.href = path+"/business/frm/${objectNameLower}/${objectNameLower}0001.jsp";
}

function doEdit(){
	var chks=$("input:checked");
	if(chks.length==1){
		var id=chks[0].value;
		location.href = path+"/business/frm/${objectNameLower}/${objectNameLower}0002.jsp?uid="+id;
	}else{
		alert("请选择一条记录!");
	}
	var len = chks.length;

   }

function doDel(){
	var chks=$("input:checked");
	var ids = [];
	if(chks.length<1){
		alert("请选择一条记录!");
		return;
		
	}
	// 循环得到所需要删除的数据
	for ( var index = 0; index < chks.length; index++) {
		var id=chks[index].value;
		ids[index] = id;
	}
	var param = {};
	param["ids"] = ids;
	var str=JSON.stringify(ids);
	location.href = path+"/${objectNameLower}/delele.action?ids="+str;
}
function doQry(){
	var frmQry= formToJson($("#frmQry"));
	var PageRoll= formToJson($("#PageRoll"));
	location.href = path+"/${objectNameLower}/getSearchPage.action?frmQry="+frmQry+"&PageRoll="+PageRoll;
	
}




