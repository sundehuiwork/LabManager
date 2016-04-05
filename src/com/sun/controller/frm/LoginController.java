package com.sun.controller.frm;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.pub.frame.ETIPResultSet;
import com.sun.pub.frame.FrmController;


@Controller
@RequestMapping(value="/login")
public class LoginController extends FrmController{
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String usercode=request.getParameter("Username");
		String password=request.getParameter("password");
		ModelAndView mv = new ModelAndView();
		ETIPResultSet set=new ETIPResultSet();
		if(StringUtils.isNotBlank(usercode)){
			if(usercode.contains("admin")){
				set.put("isadmin", 1);
				set.put("username", usercode);
				set.put("rolename", "系统管理员");
			}else{
				set.put("isadmin", 0);
				set.put("username", usercode);
				set.put("rolename", "普通用户");
			}
		}else{
			mv.setViewName("/error");
			return mv;
		}
		mv.addObject("vo", set);
		mv.setViewName("/main.jsp");
		return mv;
	}
	
}
