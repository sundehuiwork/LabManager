function NextPage(){
	
	var currpage=document.getElementById("currpage").value;
	var sumpage=document.getElementById("sumpage").value;
	if(currpage<sumpage){
	var tcurrpage=parseInt(currpage)+1;
	document.getElementById("currpage").value=tcurrpage;
	var frmQry= formToJson($("#frmQry"));
	var PageRoll= formToJson($("#PageRoll"));
	location.href = path+"/sysuser/getSearchPage.action?frmQry="+frmQry+"&PageRoll="+PageRoll;
	}
}
function PreviPage(){
	var sumpage=document.getElementById("sumpage").value;
	var currpage=document.getElementById("currpage").value;
	document.getElementById("currpage").value=sumpage;
	var frmQry= formToJson($("#frmQry"));
	var PageRoll= formToJson($("#PageRoll"));
	location.href = path+"/sysuser/getSearchPage.action?frmQry="+frmQry+"&PageRoll="+PageRoll;
}
function FirstPage(){
		document.getElementById("currpage").value="1";
		var frmQry= formToJson($("#frmQry"));
		var PageRoll= formToJson($("#PageRoll"));
		location.href = path+"/sysuser/getSearchPage.action?frmQry="+frmQry+"&PageRoll="+PageRoll;
}

function EndPage(){
	if(currpage>1){
		var currpage=document.getElementById("currpage").value;
		var tcurrpage=parseInt(currpage)-1;
		document.getElementById("currpage").value=tcurrpage;
		var frmQry= formToJson($("#frmQry"));
		var PageRoll= formToJson($("#PageRoll"));
		location.href = path+"/sysuser/getSearchPage.action?frmQry="+frmQry+"&PageRoll="+PageRoll;
		}
}
function selecPageSize(){
	var frmQry= formToJson($("#frmQry"));
	var PageRoll= formToJson($("#PageRoll"));
	location.href = path+"/sysuser/getSearchPage.action?frmQry="+frmQry+"&PageRoll="+PageRoll;
}