package com.sun.controller.frm;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.pub.frame.ETIPResultSet;
import com.sun.pub.frame.FrmController;
import com.sun.pub.utils.DelAllFile;
import com.sun.pub.utils.FileDownload;
import com.sun.pub.utils.FileZip;
import com.sun.pub.utils.Freemarker;
import com.sun.pub.utils.PathUtil;






/** 
 * 类名称：FreemarkerController
 * 创建人：FH 
 * 创建时间：2015年1月12日
 * @version
 */
@Controller
@RequestMapping(value="/createCode")
public class CreateCodeController extends FrmController {
	
	/**
	 * 生成代码
	 */
	@RequestMapping(value="/proCode")
	public void proCode(HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		ETIPResultSet pd = new ETIPResultSet();
		pd = super.getResultMap(request);
		
		/* ============================================================================================= */
		String packageName = pd.getString("packageName");  			//包名				========1
		String objectName = pd.getString("objectName");	   			//类名				========2
		String tabletop = pd.getString("tabletop");	   				//表前缀				========3
		tabletop = null == tabletop?"":tabletop.toUpperCase();		//表前缀转大写
		String zindext = pd.getString("zindex");	   	   			//属性总数
		int zindex = 0;
		if(null != zindext && !"".equals(zindext)){
			zindex = Integer.parseInt(zindext);
		}
		List<String[]> fieldList = new ArrayList<String[]>();   	//属性集合			========4
		for(int i=0; i< zindex; i++){
			fieldList.add(pd.getString("field"+i).split(",fh,"));	//属性放到集合里面
		}
		
		Map<String,Object> root = new HashMap<String,Object>();		//创建数据模型
		root.put("fieldList", fieldList);
		root.put("packageName", packageName);						//包名
		root.put("objectName", objectName);							//类名
		root.put("objectNameLower", objectName.toLowerCase());		//类名(全小写)
		root.put("objectNameUpper", objectName.toUpperCase());		//类名(全大写)
		root.put("tabletop", tabletop);								//表前缀	
		root.put("nowDate", new Date());							//当前日期
		
		DelAllFile.delFolder(PathUtil.getClasspath()+"admin/ftl"); //生成代码前,先清空之前生成的代码
		/* ============================================================================================= */
		
		String filePath = "admin/ftl/code/";						//存放路径
		String ftlPath = "createCode";								//ftl路径
		
		/*生成controller*/
		Freemarker.printFile("Template_List_Jsp.ftl", root, "jsp/"+objectName.toLowerCase()+"/"+objectName+"0000.jsp", filePath, ftlPath);
		Freemarker.printFile("Template_List_Js.ftl", root, "jsp/"+objectName.toLowerCase()+"/"+objectName+"0000.js", filePath, ftlPath);
//		
//		/*生成service*/
//		Freemarker.printFile("serviceTemplate.ftl", root, "service/"+packageName+"/"+objectName.toLowerCase()+"/"+objectName+"Service.java", filePath, ftlPath);
//
//		/*生成mybatis xml*/
//		Freemarker.printFile("mapperMysqlTemplate.ftl", root, "mybatis_mysql/"+packageName+"/"+objectName+"Mapper.xml", filePath, ftlPath);
//		Freemarker.printFile("mapperOracleTemplate.ftl", root, "mybatis_oracle/"+packageName+"/"+objectName+"Mapper.xml", filePath, ftlPath);
//		
//		/*生成SQL脚本*/
//		Freemarker.printFile("mysql_SQL_Template.ftl", root, "mysql数据库脚本/"+tabletop+objectName.toUpperCase()+".sql", filePath, ftlPath);
//		Freemarker.printFile("oracle_SQL_Template.ftl", root, "oracle数据库脚本/"+tabletop+objectName.toUpperCase()+".sql", filePath, ftlPath);
//		
//		/*生成jsp页面*/
//		Freemarker.printFile("jsp_list_Template.ftl", root, "jsp/"+packageName+"/"+objectName.toLowerCase()+"/"+objectName.toLowerCase()+"_list.jsp", filePath, ftlPath);
//		Freemarker.printFile("jsp_edit_Template.ftl", root, "jsp/"+packageName+"/"+objectName.toLowerCase()+"/"+objectName.toLowerCase()+"_edit.jsp", filePath, ftlPath);
//		
//		/*生成说明文档*/
//		Freemarker.printFile("docTemplate.ftl", root, "说明.doc", filePath, ftlPath);
//		
		//this.print("oracle_SQL_Template.ftl", root);  控制台打印
		
		/*生成的全部代码压缩成zip文件*/
		FileZip.zip(PathUtil.getClasspath()+"admin/ftl/code", PathUtil.getClasspath()+"admin/ftl/code.zip");
		
		/*下载代码*/
		FileDownload.fileDownload(response, PathUtil.getClasspath()+"admin/ftl/code.zip", "code.zip");
		
	}
	
}
