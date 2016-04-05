package com.sun.pub.frame;

import java.util.Map;

/**
 * @author sun
 * 应用异常
 */
public class AppException extends BaseException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AppException(){
		
	}
	
	public AppException(String expMsg,Throwable ex){
	    super(expMsg,ex,1);
	}

	public AppException (String expCode,Map<String,String> expMsgs, Throwable ex){
	    super(expCode,expMsgs,ex,1);
	}
}
