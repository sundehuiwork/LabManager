package com.sun.controller.frm;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.pub.frame.FrmController;
import com.sun.pub.frame.PageRoll;
import com.sun.service.frm.SysUserService;



/**
 * 用户Controller
 * 
 * @author sundehui
 *
 */
@Controller
@RequestMapping("/sysuser")
public class SysUserController extends FrmController {

	@Resource(name = "sysUserService")
	private SysUserService sysUserService;

	// 页面跳转
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
		/**
		 * 获取参数及分页信息
		 * @param1  查询条件参数
		 * @param2  分页信息参数
		 */
		PageRoll pageroll = super.getPageRoll("frmQry","PageRoll");
		
		pageroll.setPageSize(10);//测试使用 ，设置每页显示2条便于测试多页
		
		PageRoll pg = sysUserService.queryPageList(pageroll);// 分页查询

		modelView.addObject("PageRoll", pg);// 返回分页参数
		modelView.addObject("frmQry", pg.getParameters());// 返回页面查询参数
		modelView.addObject("frmList", pg.getList());// 返回查询列表
		modelView.setViewName("/business/frm/user/user0000.jsp"); // 返回页面
		return modelView;
	}

}
