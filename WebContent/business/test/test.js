function test(){
	var str = document.getElementById('a_id').value.trim();    
    if(str.length!=0){    
        var reg = /^[a-zA-Z]{1,30}$/;     
        var r = str.match(reg);     
        if(r==null) {
        	alert('对不起，您输入的日期格式不正确!'); //请将“日期”改成你需要验证的属性名称!  
        }
    }  
}

function ajaxexception(){
//	alert();
	$.ajax({   
	    url:path+'/test/testajax.action',   
	    type:"POST",
	    data:'frmvalue=aa',   
	    async : false, // 默认为true 异步
	    success:function(data,a,b,c){
			alert("success");
        },
        error:function(XMLHttpRequest, textStatus, errorThrown,a,b){
        	alert(XMLHttpRequest.responseText);
        }
	});
}

//
function error(){
	location.href = path+'/test/testajax.action';
}