package com.sun.controller.frm;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.sun.pub.frame.FrmController;
import com.sun.pub.frame.PageRoll;
import com.sun.service.frm.SysUserService;
import com.sun.vo.frm.Sys_UserVO;

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
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
		/**
		 * 获取参数及分页信息
		 * 
		 * @param1 查询条件参数
		 * @param2 分页信息参数
		 */
		PageRoll pageroll = super.getPageRoll("frmQry", "PageRoll");

//		pageroll.setPageSize(10);// 测试使用 ，设置每页显示2条便于测试多页

		PageRoll pg = sysUserService.queryPageList(pageroll);// 分页查询

		modelView.addObject("PageRoll", pg);// 返回分页参数
		modelView.addObject("frmQry", pg.getParameters());// 返回页面查询参数
		modelView.addObject("frmList", pg.getList());// 返回查询列表
		modelView.setViewName("/business/frm/user/user0000.jsp"); // 返回页面
		return modelView;
	}

	// ModelAndView 获取新增修改页面
	@RequestMapping("/indexedit")
	public ModelAndView indexedit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		Sys_UserVO vo = new Sys_UserVO();
		vo.setId(id);
		if (StringUtils.isNotBlank(id)) {
			vo = sysUserService.queryOne(vo);
		}
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("frmvo", vo);// 返回页面参数
		modelView.setViewName("/business/frm/user/user0001.jsp"); // 返回页面
		return modelView;
	}

	// 保存或更新
	@RequestMapping("/edit")
	public void edit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		JSONObject jsonObj = new JSONObject();
		try {
			String jsonStr = request.getParameter("frmvalue");
			JSONObject jobj = JSONObject.fromObject(jsonStr);
			Sys_UserVO vo=(Sys_UserVO) JSONObject.toBean(jobj, Sys_UserVO.class);  
			sysUserService.edit(vo);
			jsonObj.put("success", true);
		} catch (Exception e) {
			e.printStackTrace();
			jsonObj.put("success", false);
		} finally {
			setJson(response, jsonObj);
		}

	}

	@RequestMapping("/delele")
	public void delele(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		JSONObject jsonObj = new JSONObject();
		try {
			String id = request.getParameter("id");
			Sys_UserVO vo = new Sys_UserVO();
			if (StringUtils.isNotBlank(id)) {
				vo.setId(id);
				sysUserService.delete(vo);
			}
			jsonObj.put("success", true);
		} catch (Exception e) {
			e.printStackTrace();
			jsonObj.put("success", false);
		} finally {
			setJson(response, jsonObj);
		}
		
	}

}
