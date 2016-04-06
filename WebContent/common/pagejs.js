function NextPage(){
	var currentPage=$("#currentPage").val();
	var sumPage=$("#sumPage").val(); 
	if(currentPage<sumPage){
	var tcurrentPage=parseInt(currentPage)+1;
	$("#currentPage").val(tcurrentPage);
	doQry();
	}
}
function PreviPage(){
	var currentPage=$("#currentPage").val();
	if(currentPage>1){
		var tcurrentPage=parseInt(currentPage)-1;
		$("#currentPage").val(tcurrentPage);
		doQry();
		}
}
function FirstPage(){
		$("#currentPage").val("1");
		doQry();
}

function EndPage(){
	var sumPage=$("#sumPage").val();
	var currentPage=$("#currentPage").val(); 
	$("#currentPage").val(sumPage); 
	doQry();
}


function selecPageSize(){
	var pageSize=$("select[name=pageSize]").val();
	$("#pageSize").val(pageSize); 
	doQry();
}