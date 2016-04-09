package com.sun.controller.bus.special;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.pub.frame.FrmController;
import com.sun.service.bus.equ.TstEquipmentService;

/**
 * 虚拟机管理Controller
 * 
 * @author sundehui
 *
 */
@Controller
@RequestMapping("/tstVirtualization")
public class TstVirtualizationController extends FrmController {

	@Resource(name = "tstEquipmentService")
	private TstEquipmentService tstEquipmentService;

	// 查询
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
	

		modelView.setViewName("/business/special/virtualization/virtualization.jsp"); // 返回页面
		return modelView;
	}

	// 查询
		@RequestMapping("/index2")
		public ModelAndView index2(HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			ModelAndView modelView = new ModelAndView();
		

			modelView.setViewName("/business/special/virtualization/virtualization2.jsp"); // 返回页面
			return modelView;
		}
	
	

}
