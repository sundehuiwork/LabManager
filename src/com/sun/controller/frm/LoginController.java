package com.sun.controller.frm;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.pub.frame.ETIPResultSet;
import com.sun.pub.frame.FrmController;
import com.sun.service.frm.SysUserService;
import com.sun.vo.frm.Sys_UserVO;


@Controller
@RequestMapping(value="/login")
public class LoginController extends FrmController{
	
	@Resource(name = "sysUserService")
	private SysUserService sysUserService;
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String usercode=request.getParameter("Username");
		String password=request.getParameter("password");
		Sys_UserVO vo=new Sys_UserVO();
		vo.setUsercode(usercode);
		vo=sysUserService.queryOne(vo);
		ModelAndView mv = new ModelAndView();
		ETIPResultSet set=new ETIPResultSet();
		if(vo!=null&&vo.getPassword()!=null&& vo.getPassword().equals(password)){
			if(vo.getType().equals("0")){
				set.put("isadmin", 1);
				set.put("username", usercode);
				set.put("rolename", "系统管理员");
			}else{
				set.put("isadmin", 0);
				set.put("username", usercode);
				set.put("rolename", "普通用户");
			}
			mv.addObject("vo", set);
			mv.setViewName("/main.jsp");
		}else{
			mv.setViewName("/error.jsp");
		}
		return mv;
	}
	
}
