package com.sun.controller.frm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;







import com.sun.pub.frame.FrmController;
import com.sun.pub.utils.DelAllFile;
import com.sun.pub.utils.Freemarker;
import com.sun.pub.utils.PathUtil;

import freemarker.template.Template;

@Controller
@RequestMapping(value="/freemarker")
public class FreemarkerController extends FrmController{
	
//	@Resource
//	private ITestService testService;
	
	
	@RequestMapping(value="/test1")
	public void test1(HttpServletRequest request, HttpServletResponse response) throws Exception{
		Map<String,Object> root = new HashMap<String,Object>();		//创建数据模型
//		root.put("fieldList", fieldList);
		root.put("test", "测试");						//变量
		root.put("person", "dehuiSun");							//类名
		root.put("company", "Richfit");		//类名(全小写)
		String ftlPath = "createCode";	
		PrintWriter out=response.getWriter();
		response.setContentType("text/xml; charset=utf-8");
		response.setCharacterEncoding("UTF-8");		
		Template template = Freemarker.getTemplate("TemplateTestHtml.ftl", ftlPath);
		template.process(root, out);					//模版输出
		out.flush();
		out.close();
	}
	
	@RequestMapping("/test2")
	public ModelAndView test2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
		Map<String,Object> root = new HashMap<String,Object>();		//创建数据模型
//		root.put("fieldList", fieldList);
		root.put("test", "测试");						//包名
		root.put("person", "dehuiSun");							//类名
		root.put("company", "Richfit");		//类名(全小写)
		DelAllFile.delFolder(PathUtil.getClasspath()+"WebContent/business/frm/freemarktest/test/"); //生成代码前,先清空之前生成的代码
		String filePath = "WebContent";						//存放路径
		String ftlPath = "createCode";								//ftl路径
		
		/*生成controller*/
		Freemarker.printFile("TemplateTestHtml.ftl", root, "/business/frm/freemarktest/test/test0000.html", filePath, ftlPath);
		
		modelView.setViewName("/business/frm/freemarktest/test/test0000.html"); // 返回页面
		return modelView;
	}
	
	@RequestMapping("/test3.do")
	public void test3(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		try {
//			List<ETIPResultSet> list=testService.selectListInfo("1");
			super.send(request, response, "");
		} catch (IOException e) {
			new Exception();
		}
	}
}
