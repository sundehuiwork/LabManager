package com.sun.controller.bus.topology;


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
import com.sun.service.bus.topology.ITstTopologyService;
import com.sun.vo.bus.topology.TstTopologyVO;

/**
 * 虚拟机管理Controller
 * 
 * @author sundehui
 *
 */
@Controller
@RequestMapping("/tstTopology")
public class TstTopologyController extends FrmController {

	@Resource(name = "tstTopologyService")
	private ITstTopologyService tstTopologyService;
	
	// 查询
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("/business/topology/networktopology.jsp"); // 返回页面
		return modelView;
	}

	// 查询
		@RequestMapping("/index1")
		public ModelAndView index1(HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			ModelAndView modelView = new ModelAndView();
			/**
			 * 获取参数及分页信息
			 * 
			 * @param1 查询条件参数
			 * @param2 分页信息参数
			 */
			PageRoll pageroll = super.getPageRoll("frmQry", "PageRoll");

			PageRoll pg = tstTopologyService.queryPageList(pageroll);// 分页查询

			modelView.addObject("PageRoll", pg);// 返回分页参数
			modelView.addObject("frmQry", pg.getParameters());// 返回页面查询参数
			modelView.addObject("frmList", pg.getList());// 返回查询列表
			modelView.setViewName("/business/topology/systopology.jsp"); // 返回页面
			return modelView;
		}

	
		//入库修改
				@RequestMapping("/indexedit")
				public ModelAndView indexinedit(HttpServletRequest request,
						HttpServletResponse response) throws Exception {
					String id = request.getParameter("id");
					TstTopologyVO vo = new TstTopologyVO();
					vo.setId(id);
					if (StringUtils.isNotBlank(id)) {
						vo = tstTopologyService.queryOne(vo);
					}
					ModelAndView modelView = new ModelAndView();
					modelView.addObject("frmvo", vo);// 返回页面参数
					modelView.setViewName("/business/topology/systopology01.jsp"); // 返回页面
					return modelView;
				}
				
				// 保存或更新入库
					@RequestMapping("/edit")
					public void editin(HttpServletRequest request, HttpServletResponse response)
							throws Exception {
						JSONObject jsonObj = new JSONObject();
						try {
							String jsonStr = request.getParameter("frmvalue");
							JSONObject jobj = JSONObject.fromObject(jsonStr);
							TstTopologyVO vo = (TstTopologyVO) JSONObject.toBean(jobj,
									TstTopologyVO.class);
							tstTopologyService.edit(vo);
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
							TstTopologyVO vo = new TstTopologyVO();
							if (StringUtils.isNotBlank(id)) {
								vo.setId(id);
								tstTopologyService.delete(vo);
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
