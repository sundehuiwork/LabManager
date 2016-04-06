package com.sun.pub.frame;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionHandlerFactory {
    
    /**
     *  外挂的自定义处理器,用于外部扩展
     */
    private static  Map<String , ExceptionHandler> handlerList = null;
    
    public static ExceptionHandler createExceptionhandler(Throwable ex){
        //这个是自定义的接口
        ExceptionHandler exceptionHandler=null;
        String packageName=ExceptionHandlerFactory.class.getName().replace(ExceptionHandlerFactory.class.getSimpleName(), "");
        String className = ex.getClass().getSimpleName();
        String classFullName = ex.getClass().getName();
 
        if(handlerList==null){
            handlerList = new HashMap<String, ExceptionHandler>();
        }
        if(handlerList.containsKey(classFullName)){
            return handlerList.get(classFullName);
        }
        
        //能走到这边,说明自定义的没有生效,走过之后,下面会将他缓存,也就是说,自定义的优先级永远大过系统自带的
        try {
//这里查找系统自带的,按照捕获的异常名称+ Handler进行查找,算是简单约定,因为框架开发中的内置我可以约定,扩展的使用配置文件进行
            exceptionHandler = (ExceptionHandler)Class.forName(packageName+ className+"Handler").newInstance(); 
        } catch (Exception e) { 
            e.printStackTrace();
        }   
        if(exceptionHandler==null){
//            exceptionHandler =  new ExceptionHandler();
        } 
        handlerList.put(classFullName, exceptionHandler);
         
        return exceptionHandler;
    }

    public Map<String, ExceptionHandler> getHandlerList() {
        return handlerList;
    }
    //这里有getset,用于spring注入
    public void setHandlerList(Map<String, ExceptionHandler> handlerList) {
        ExceptionHandlerFactory.handlerList = handlerList;
    }
    
    
    
    
    
    
}
