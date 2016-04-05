package com.sun.pub.frame;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Map;

import org.apache.commons.collections.map.ListOrderedMap;
/**
 * MAP公用实体类
 * @author sundehui
 * @date 2016-01-15
 */
public class ETIPResultSet extends ListOrderedMap{

	private static final long serialVersionUID = 1L;

	public ETIPResultSet() {
	        super();
	    }
	 
	public ETIPResultSet(Map<?, ?> t) {
	        super(t);
	    }
	  
	    public String get(String key,String type){
		    if(type.equals("varchar"))
		    	return getString(key);
		    else
		    if (type.equals("int")||type.equals("tinyint"))
		    	return String.valueOf(getInt(key));
		    else
		    if(type.equals("datetime")){
			    Timestamp time = getTimestamp(key);
			    if(time!=null){
			    	return getTimestamp(key).toString();
			    }
			    else{
				    return "";
			    }	
		    }
		    else
		    if(type.equals("bit")){
				return String.valueOf(getBooleanValue(key));
		    }
			else
			if(type.equals("numeric")){
				return String.valueOf(getDouble(key));
			}
			else if(type.equals("nvarchar")){
				return getString(key);
			}
			else if(type.equals("smallmoney")){
				return String.valueOf(getDouble(key));
			}
			else if(type.equals("money")){
				return String.valueOf(getDouble(key));
			}
		    return key+":"+type;
	    }
	    
	    public boolean getBoolean(String key){
			Object value = get(key);
			if(value instanceof Boolean){
				Boolean bln = (Boolean)value;
				return bln.booleanValue();
			}
			return true;
		}
	    
	    public int getBooleanValue(String key){
			Object value = get(key);
			if(value instanceof Boolean){
				Boolean bln = (Boolean)value;
				
				if(bln.booleanValue()) return 1;
				else return 0;
			}
			return 1;
		}
	    
	    public byte getByte(String key) {
			Object temp = get(key);
			byte rv = -1;
			if(temp==null) rv = -1;
			else
			if(temp instanceof Integer){
				Integer i = (Integer)temp;
				int v = i.intValue();
				rv = (byte)v;
			}
			if(temp instanceof Long){
				Long l = (Long)temp;
				long v = l.longValue();
				rv = (byte)v;
			}
			else
			if(temp instanceof BigDecimal){
				BigDecimal bd = (BigDecimal)temp;
				int v = bd.intValue();
				rv = (byte)v;
			}
			else
			if(temp instanceof Double){
				Double d = (Double)temp;
				double v = d.doubleValue();
				rv = (byte)v;
			}
			else
			if(temp instanceof Float){
				Float f = (Float)temp;
				float v = f.floatValue();
				rv = (byte)v;
			}
			else
			if(temp instanceof Short){
				Short s = (Short)temp;
				short v = s.shortValue();
				rv = (byte)v;			
			}
			else
			if(temp instanceof Byte){
				Byte b = (Byte)temp;
				byte v = b.byteValue();
				rv = (byte)v;
			}
			return rv;
	    }
	    
	    public byte[] getBytes(String key){
		    byte[]  value = (byte[])get(key);
		    return value;
	    }
	    
	    public java.util.Date getDate(String key) {
		    Object temp = get(key);
		    java.util.Date rv = null;
		    if(temp==null);
		    else if(temp instanceof Time){
			    Time t = (Time)temp;
			    rv = (java.util.Date)t;
		    }
		    else if(temp instanceof Timestamp){
			    Timestamp ts = (Timestamp)temp;
			    rv = (java.util.Date)ts;
		    }
		    else if(temp instanceof Date)
		    {
		    	Date ts=(Date)temp;
		    	rv=(java.util.Date)ts;
		    }
		    return rv;
	    }
	    
	    public double getDouble(String key) {
			Object temp = get(key);
			double rv = 0.00;
			if(temp==null) ;
			else 
			if(temp instanceof Long){
				Long l = (Long)temp;
				long v = l.longValue();
				rv = (double)v;
			}
			else
			if(temp instanceof BigDecimal){
				BigDecimal bd = (BigDecimal)temp;
				rv = bd.doubleValue();
			}
			else
			if(temp instanceof Double){
				Double d = (Double)temp;
				rv = d.doubleValue();
			}
			else
			if(temp instanceof Float){
				Float f = (Float)temp;
				float v = f.floatValue();
				rv = (double)v;
			}
			else
			if(temp instanceof Short){
				Short s = (Short)temp;
				short v = s.shortValue();
				rv = (double)v;
			}
			else
			if(temp instanceof Byte){
				Byte b = (Byte)temp;
				byte v = b.byteValue();
				rv = (double)v;
			}
			else
			if(temp instanceof Integer){
				Integer i = (Integer)temp;
				int v = i.intValue();
				rv = (double)v;
			}
			return rv;    
	    }
	    
	    public float getFloat(String key) {
		    Object temp = get(key);
			float rv = (float)0.00;
			if(temp==null) ;
			else 
			if(temp instanceof Long){
				Long l = (Long)temp;
				long v = l.longValue();
				rv = (float)v;
			}
			else
			if(temp instanceof BigDecimal){
				BigDecimal bd = (BigDecimal)temp;
				rv = bd.floatValue();
			}
			else
			if(temp instanceof Double){
				Double d = (Double)temp;
				double v = d.doubleValue();
				rv = (float)v;
			}
			else
			if(temp instanceof Float){
				Float f = (Float)temp;
				rv = f.floatValue();
			}
			else
			if(temp instanceof Short){
				Short s = (Short)temp;
				short v = s.shortValue();
				rv = (float)v;
			}
			else
			if(temp instanceof Byte){
				Byte b = (Byte)temp;
				byte v = b.byteValue();
				rv = (float)v;
			}
			else
			if(temp instanceof Integer){
				Integer i = (Integer)temp;
				int v = i.intValue();
				rv = (float)v;
			}
			return rv;
	    }
	    
	    public int getInt(String key) {
			Object temp = get(key);
			int rv = -1;
			if(temp==null) rv = -1;
			else
			if(temp instanceof Integer){
				Integer i = (Integer)temp;
				rv = i.intValue();
			}
			if(temp instanceof Long){
				Long l = (Long)temp;
				long v = l.longValue();
				rv = (int)v;
			}
			else
			if(temp instanceof BigDecimal){
				BigDecimal bd = (BigDecimal)temp;
				rv = bd.intValue();
			}
			else
			if(temp instanceof Double){
				Double d = (Double)temp;
				double v = d.doubleValue();
				rv = (int)v;
			}
			else
			if(temp instanceof Float){
				Float f = (Float)temp;
				float v = f.floatValue();
				rv = (int)v;
			}
			else
			if(temp instanceof Short){
				Short s = (Short)temp;
				short v = s.shortValue();
				rv = (int)v;			
			}
			else
			if(temp instanceof Byte){
				Byte b = (Byte)temp;
				byte v = b.byteValue();
				rv = (int)v;
			}
			return rv;
	    }
	    
	    public short getShort(String key){
			Short value = (Short)get(key);
			return value.shortValue();
	    }
	    
	    public String getString(String key) {
		    Object temp = get(key);
		    if(temp!=null){
			    return temp.toString();
		    }
		    else
		    	return "";
	    }
	    
	    public Timestamp getTimestamp(String key) {
	    	Object temp = get(key);
	    	if (temp == null)
	        	return null;
	    	if (temp instanceof Timestamp)
	        	return (Timestamp) temp;
	    	return null;
		}
}
