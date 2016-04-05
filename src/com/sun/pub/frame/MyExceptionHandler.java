package com.sun.pub.frame;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyExceptionHandler implements HandlerExceptionResolver {
    protected Log log = LogFactory.getLog(this.getClass());

    @Override
    public ModelAndView resolveException(HttpServletRequest request,
            HttpServletResponse response, Object handler, Exception ex) {
        log.error("异常捕获", ex);
        String requestURI = request.getRequestURI();
//        String fileExtName = StringUtils.getFileExtName(requestURI);
//        boolean isajax = "ajax".equals(fileExtName);
//        Throwable parseException = parseException(ex);
//        return ExceptionHandlerFactory.createExceptionhandler(parseException)
//                .resolveException(request, response, handler, parseException, isajax);
        return null;
    }
    //这里要获取到最内层的异常
    private static Throwable parseException(Throwable e){
        Throwable tmp = e;
        int breakPoint = 0;
        while(tmp.getCause()!=null){
            if(tmp.equals(tmp.getCause())){
                break;
            }
            tmp=tmp.getCause();
            breakPoint++;
            if(breakPoint>1000){
                break;
            }
        } 
        return tmp;
    }
}
