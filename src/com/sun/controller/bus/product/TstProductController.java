package com.sun.controller.bus.product;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.pub.frame.FrmController;
import com.sun.service.bus.special.ITstNetworkService;
import com.sun.vo.bus.special.TstNetworkVO;

/**
 * 产品管理Controller
 * 
 * @author sundehui
 *
 */
@Controller
@RequestMapping("/tstProduct")
public class TstProductController extends FrmController {

	@Resource(name = "tstNetworkService")
	private ITstNetworkService tstNetworkService;

	// 查询
	@RequestMapping("/index")
	public ModelAndView indexin(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
	

		modelView.setViewName("/business/product/copyright.jsp"); // 返回页面
		return modelView;
	}

	//入库修改
	@RequestMapping("/indexinedit")
	public ModelAndView indexinedit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		TstNetworkVO vo = new TstNetworkVO();
		vo.setId(id);
		if (StringUtils.isNotBlank(id)) {
			vo = tstNetworkService.queryOne(vo);
		}
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("frmvo", vo);// 返回页面参数
		modelView.setViewName("/business/equipment/equin/equin0001.jsp"); // 返回页面
		return modelView;
	}
	
	// 保存或更新入库
		@RequestMapping("/editin")
		public void editin(HttpServletRequest request, HttpServletResponse response)
				throws Exception {
			JSONObject jsonObj = new JSONObject();
			try {
				String jsonStr = request.getParameter("frmvalue");
				JSONObject jobj = JSONObject.fromObject(jsonStr);
				TstNetworkVO vo = (TstNetworkVO) JSONObject.toBean(jobj,
						TstNetworkVO.class);
				tstNetworkService.edit(vo);
				jsonObj.put("success", true);
			} catch (Exception e) {
				e.printStackTrace();
				jsonObj.put("success", false);
			} finally {
				setJson(response, jsonObj);
			}

		}
	


	
	@RequestMapping("/delele")
	public void delele(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		JSONObject jsonObj = new JSONObject();
		try {
			String id = request.getParameter("id");
			TstNetworkVO vo = new TstNetworkVO();
			if (StringUtils.isNotBlank(id)) {
				vo.setId(id);
				tstNetworkService.delete(vo);
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
