//表单数据转成json格式
function formToJson(formObj){
   var o={};
   var a=formObj.serializeArray();
   $.each(a, function() {

       if(this.value){
           if (o[this.name]) {
               if (!o[this.name].push) {
                   o[this.name]=[ o[this.name] ];
               }
                   o[this.name].push(this.value || null);
           }else {
               if($("[name='"+this.name+"']:checkbox",formObj).length){
                   o[this.name]=[this.value];
               }else{
                   o[this.name]=this.value || null;
               }
           }
       }
   });
   return JSON.stringify(o);
};

//初始化下拉
function setSelectChecked(selectId, checkValue){  
    var select = document.getElementById(selectId);  
    for(var i=0; i<select.options.length; i++){  
        if(select.options[i].innerHTML == checkValue){  
            select.options[i].selected = true;  
            break;  
        }  
    }  
};

//校验表单
function validateForm(formid) {  
	   //validate方法参数可选  
	   return $("#"+formid).validate({  
		   //预留
//	       rules: {  
//	       },  
//	       messages:{  
//	       }
//	       showErrors:showErrors  
	   }).form();  
	}  