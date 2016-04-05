package com.sun.pub.frame;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

public abstract class BaseExceptionHandler implements ExceptionHandler{

    /**
     * 用于传递到页面的值
     */
    protected Map<String, Object> data = new HashMap<String, Object>();
    
    /**
     * 写到输出流
     */
    protected ModelAndView write(HttpServletRequest request,
            HttpServletResponse response, Object handler, Throwable ex,
            boolean isajax,Object dt){
        int responseCode=500;
        if(ex instanceof Exception){
            responseCode=19999;
        }
//        if(ex instanceof ConstraintViolationException){
//            responseCode=5001;
//        }
        response.setStatus(responseCode);
        if(!isajax){//非ajax,直接跳转的,这里的是否ajax很简单,我们约定,ajax请求全部使用.ajax扩展.当然通过httpheader也能,jquery还支持preFilter,可以在这里统一加参数
            ModelAndView modelAndView = new ModelAndView("/error/error");
            modelAndView.addObject("__exception__", ex);
            modelAndView.addAllObjects(data);
            if(dt!=null){
            modelAndView.addObject(dt);
            }
            return modelAndView;
        }
        //这个是封装的标准返回值模版,包含相应code,错误信息和响应数据等字段
//        ResultTemplate createFailResult = ResultTemplate.createFailResult(ex.getMessage());
//        createFailResult.setData(dt);
//        WebUtils.renderJson(createFailResult); 
        return null;
    }

    public abstract Object processException(HttpServletRequest request,
            HttpServletResponse response, Object handler, Throwable ex,
            boolean isajax);
    
    
    public ModelAndView resolveException(HttpServletRequest request,HttpServletResponse response, Object handler, Throwable ex,boolean isajax) { 
        Object d = processException(request,  response,   handler,   ex,  isajax); 
        return write(request,
                  response,   handler,   ex,
                  isajax,d);
    }
    
    
    
}
