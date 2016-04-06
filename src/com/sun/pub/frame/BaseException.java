package com.sun.pub.frame;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public abstract class BaseException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String expCode;//异常代码
	
	public String expMsg = "";//异常信息
	
	public Throwable ex;//异常体
	
	public Map<String, String> expMsgs = new HashMap<String, String>();//造成业务异常的参数
	
	public String expCause = "";//异常原因
	
	public Integer expType;//异常类型   0：系统;1：应用;2:未知异常。 //1为BaseException; 2为Excepton,Throwable
	
	public Properties props = new Properties();
	

	public void setProps(Properties props) {
		this.props = props;
	}

	public Integer getExpType() {
		return expType;
	}

	public void setExpType(Integer expType) {
		this.expType = expType;
	}

	public String getExpCode() {
		return expCode;
	}

	public String getExpMsg() {
		return expMsg;
	}

	public Throwable getEx() {
		return ex;
	}

	public Map<String, String> getExpMsgs() {
		return expMsgs;
	}

	public String getExpCause() {
		return expCause;
	}
	
	/**
	 * 异常
	 */
	public BaseException (){
		
	}

	/**
	 * 异常
	 * @param message 异常信息，没有定义异常代码
	 * @param ex  异常体
	 */
	public BaseException (String expMsg, Throwable ex, int expType){
		this.expMsg = expMsg;
		this.expType = expType;
		if(ex!=null){
			this.ex = ex;
			this.setCause();
		}
	}
	
	/**
	 * 异常
	 * @param code 异常代码
	 * @param expMsgs  异常描述，自定义
	 * @param ex  异常体
	 */
	public BaseException (String expCode,Map<String, String> expMsgs, Throwable ex, int expType){
		this.expCode = expCode;
		expMsg = getMsg(expCode);
		expCause = getMsgs(expMsgs);
		if(expCause.length()==0 && ex!=null){
			this.ex = ex;
			this.setCause();
		}
	}

	public void setCause(){
		StringWriter sw = new StringWriter();   
		ex.printStackTrace(new PrintWriter(sw,true));   
		expCause = sw.toString();
	}
	
	public String getMsg(String expCode){
		return (String)props.getProperty(expCode);
	}
	
	public String getMsgs(Map<String, String> expMsgs){
		String str = "";
		if(expMsgs != null){
			Set<String> keySet = expMsgs.keySet();
			for(Iterator iter = keySet.iterator();iter.hasNext();){
				str += (String)props.getProperty((String)iter.next())+",";
			}
			str = str.substring(0,str.length()-1);
		}
		return str;
	}
	
}
