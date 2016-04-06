package com.sun.pub.frame;

import java.util.Map;

/**
 * @author sun
 * 系统异常
 */
public class SysException extends BaseException {
	
	public SysException(){
	}

	public SysException (String expMsg, Throwable ex){
	    super(expMsg,ex,0);
	}

	public SysException (String expCode,Map<String,String> expMsgs, Throwable ex){
	    super(expCode,expMsgs,ex,0);
	}

}
