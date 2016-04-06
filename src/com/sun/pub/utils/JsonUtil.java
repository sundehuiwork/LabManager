package com.sun.pub.utils;

import java.util.Collection;
import java.util.List;
import java.util.Map;



import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * JSON工具类
 * @author sundehui
 * @date 2016-01-15
 */
public class JsonUtil {

	public static String getJSONString(Object object,String datePattern) {  
        String jsonString = null;  
        //日期值处理器  
        JsonConfig jsonConfig = new JsonConfig();  
//        jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor(datePattern));  
        //jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new DateJsonValueProcessor(datePattern)); 
        if(object != null){  
            if(object instanceof Collection || object instanceof Object[]){  
                jsonString = JSONArray.fromObject(object, jsonConfig).toString();  
            }else{  
                jsonString = JSONObject.fromObject(object, jsonConfig).toString();  
                
            }  
        }  
        return jsonString == null ? "{}" : jsonString;  
    }  
	

	public static JSONObject getJSONObj(Object object,String dateFormat){
		  
        JSONObject jsonObj = null;  
        //日期值处理器  
        JsonConfig jsonConfig = new JsonConfig();  
//        jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor(dateFormat));  
//        jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new DateJsonValueProcessor(dateFormat)); 
        if(object != null){  
           
        	jsonObj = JSONObject.fromObject(object, jsonConfig);  
            
        }  
        return jsonObj == null ? null : jsonObj;  
    
	}

	public static JSONArray getJSONArray(Object object,String dateFormat){
		JSONArray jsonArray = null;
		JsonConfig jsonConfig = new JsonConfig(); 
//		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor(dateFormat)); 
//		jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new DateJsonValueProcessor(dateFormat));
			if(object != null){
				if(object instanceof Collection || object instanceof Object[]||object instanceof Map){
					jsonArray = JSONArray.fromObject(object, jsonConfig);
				}
			}else{
				return null;
			}
			
			return jsonArray;
	}
	
	
	public static JSONObject getGridJSON(List list,int totalRows,String dateFormat){
		JSONArray array = null;
		if(dateFormat != null && dateFormat.trim().length()>0){
			array = getJSONArray(list, dateFormat);
		}else{
			array = JSONArray.fromObject(list);
		}
		JSONObject obj = new JSONObject();
		obj.put("results", totalRows);
		obj.put("items", array);
		return obj;
	}
	
	public static String delSE(String json){
		if(json!=null && !"".equals(json)&&json.length()>2){
			String str = json.substring(1,json.length()-1);
			return str;
		}
		return json;
	}
	
	
	public static String getJSONStr(List<Map<String, Object>> rootList){
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		for(Map<String, Object> root : rootList){
			sb.append("{");
			sb.append(" \"id\" : \"" + root.get("ID").toString() +"\",");
			sb.append(" \"text\" : \"" + (String)root.get("RES_NAME").toString() +"\",");
			String url = "";
			if(root.get("REFRENCE") != null){
				if(!root.get("REFRENCE").toString().startsWith("/")){
					url = "/"+root.get("REFRENCE").toString();
				}else{
					url = root.get("REFRENCE").toString();
				}
				
			}
			sb.append(" \"url\" : \"" + url +"\",");
			sb.append(" \"status\" : \"" + (root.get("STATUS") == null ?  "" : root.get("STATUS").toString()) +"\",");
			if("2".equals(root.get("IS_PARENT").toString()) || "0".equals(root.get("IS_PARENT").toString())){
				sb.append(" \"leaf\" : \"true\", ");
			}
			sb.append(" \"iconCls\" : \"images/tree/folder.gif\", ");
//			sb.append(" \"iconCls\" :\""+(root.get("ICON_CLS") == null ? "images/tree/folder.gif" : root.get("ICON_CLS").toString()) +"\",");
			sb.append(" \"subXml\" : \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?>\\r<Menus></Menus>\" ");
			sb.append("}");
			sb.append(",");
		}
		return "["+sb.substring(0, sb.length()-1).toString()+"]";
	} 

}
