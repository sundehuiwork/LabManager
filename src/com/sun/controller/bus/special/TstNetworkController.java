package com.sun.controller.bus.special;


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
import com.sun.service.bus.special.ITstNetworkService;
import com.sun.vo.bus.special.TstNetworkVO;

/**
 * 网络管理Controller
 * 
 * @author sundehui
 *
 */
@Controller
@RequestMapping("/tstNetwork")
public class TstNetworkController extends FrmController {

	@Resource(name = "tstNetworkService")
	private ITstNetworkService tstNetworkService;

	// 查询
	@RequestMapping("/index")
	public ModelAndView indexin(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
	
	
		modelView.setViewName("/business/special/network/net0000.jsp"); // 返回页面
		return modelView;
	}

	
	
	
	

	
	
	
		// 查询
		@RequestMapping("/index1")
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

			// pageroll.setPageSize(10);// 测试使用 ，设置每页显示2条便于测试多页
			 String[] ids={"1","2","3","4"};
			pageroll.getParameters().put("ids", ids);
			PageRoll pg = tstNetworkService.queryPageList(pageroll);// 分页查询

			modelView.addObject("PageRoll", pg);// 返回分页参数
			modelView.addObject("frmQry", pg.getParameters());// 返回页面查询参数
			modelView.addObject("frmList", pg.getList());// 返回查询列表
		
			modelView.setViewName("/business/special/network/network0000.jsp"); // 返回页面
			return modelView;
		}

		//入库修改
		@RequestMapping("/indexedit")
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
			modelView.setViewName("/business/special/network/network0001.jsp"); // 返回页面
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
