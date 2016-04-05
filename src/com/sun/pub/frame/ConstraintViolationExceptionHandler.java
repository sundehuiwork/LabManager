package com.sun.pub.frame;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConstraintViolationExceptionHandler  extends BaseExceptionHandler{

    @Override
    public Object processException(HttpServletRequest request,
            HttpServletResponse response, Object handler, Throwable ex,
            boolean isajax) {
//        ConstraintViolationException e=(ConstraintViolationException)ex;
//        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        //ValidateInfo包含当前出错的字段,错误信息,出错的字段所在的类型,等必要的信息
        // 在ajax特别是ajaxForm的提交中,只要前端约定好了命名规则,就可以根据返回的信息,进行界面提示,比如可渲染成和validate一样的风格
        // 也可以给出一个dialog提示,或者......

//         List<ValidateInfo> validateInfos =new ArrayList<ValidateInfo>();
//         if(constraintViolations!=null && !constraintViolations.isEmpty()){
//            for(ConstraintViolation<?> violation : constraintViolations){
//                ValidateInfo info = new ValidateInfo();
//                info.setField(violation.getPropertyPath().toString().replaceAll("\\.","_"));
//                info.setMessage(violation.getMessage());
//                Class<? extends Object> class1 = violation.getRootBean().getClass();
//                String simpleName =StringUtils.getSpringName(class1); 
//                if(simpleName.indexOf("$pcsubclass")>-1){  //这个判断是openjpa的代理类型,带$的不光是代理类型,内部类的名称同样有,所以编码上要约束
//                     String[] ss = simpleName.split("\\$");
//                     if(ss.length>1){
//                         simpleName = ss[ss.length-2];
//                         simpleName = simpleName.substring(0,1).toLowerCase()+simpleName.substring(1);
//                     }
//                }
//                
//                info.setClassName(simpleName);
//                Object ov =violation.getInvalidValue();
//                if(ov==null){
//                    info.setCurrentValue("");
//                }else{
//                    info.setCurrentValue(ov.toString());
//                }
//                
//                validateInfos.add(info);
//            }
//            
//         }
        return null; //返回经过封装的验证信息,用于jquery ajax error回调方法进行统一处理
    }

	@Override
	public Class<? extends Throwable>[] value() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}
}
