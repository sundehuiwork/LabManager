package com.sun.pub.utils;

import java.util.Map;

import com.sun.pub.frame.AppException;
import com.sun.pub.frame.BaseException;
import com.sun.pub.frame.SysException;


/**
 * @author sun
 * 应用异常
 */
public class ExceptionUtil {
	
	/**
	 * 业务异常
	 * @param expCode 异常代码
	 * @param expMsgs 异常描述
	 * @param ex 异常堆栈
	 * @throws BaseException 
	 */
	public static void appExp(String expCode, Map<String,String> expMsgs , Throwable ex)throws BaseException {
		throw new AppException(expCode,expMsgs,ex);
	}
	
	/**
	 *  业务异常
	 * @param expMsg 异常信息
	 * @param ex 异常堆栈
	 * @throws BaseException
	 */
	public static void appExp(String expMsg , Throwable ex)throws BaseException {
		throw new AppException(expMsg,ex);
	}
	
	/**
	 * 系统异常
	 * @param expCode 异常代码
	 * @param expMsgs 异常描述
	 * @param ex 异常堆栈
	 * @throws BaseException
	 */
	public static void sysExp(String expCode, Map<String,String> expMsgs , Throwable ex)throws BaseException {
		throw new SysException(expCode,expMsgs,ex);
	}
	
	/**
	 * 系统异常
	 * @param expMsg 异常信息
	 * @param ex 异常堆栈
	 * @throws BaseException
	 */
	public static void sysExp(String expMsg, Throwable ex)throws BaseException {
		throw new SysException(expMsg,ex);
	}

}
