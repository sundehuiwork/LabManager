package com.sun.controller.bus.equ;

import java.util.Date;

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
import com.sun.service.bus.equ.TstEquipmentService;
import com.sun.vo.bus.equ.TstEquipmentVO;
import com.sun.vo.frm.Sys_UserVO;

/**
 * 设备管理Controller
 * 
 * @author sundehui
 *
 */
@Controller
@RequestMapping("/tstequipment")
public class TstEquipmentController extends FrmController {

	@Resource(name = "tstEquipmentService")
	private TstEquipmentService tstEquipmentService;

	// 入库查询
	@RequestMapping("/indexin")
	public ModelAndView indexin(HttpServletRequest request,
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
		PageRoll pg = tstEquipmentService.queryPageList(pageroll);// 分页查询

		modelView.addObject("PageRoll", pg);// 返回分页参数
		modelView.addObject("frmQry", pg.getParameters());// 返回页面查询参数
		modelView.addObject("frmList", pg.getList());// 返回查询列表
		modelView.setViewName("/business/equipment/equin/equin0000.jsp"); // 返回页面
		return modelView;
	}

	//入库修改
	@RequestMapping("/indexinedit")
	public ModelAndView indexinedit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		TstEquipmentVO vo = new TstEquipmentVO();
		vo.setId(id);
		if (StringUtils.isNotBlank(id)) {
			vo = tstEquipmentService.queryOne(vo);
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
				TstEquipmentVO vo = (TstEquipmentVO) JSONObject.toBean(jobj,
						TstEquipmentVO.class);
				vo.setStatus("1");//入库
				tstEquipmentService.edit(vo);
				jsonObj.put("success", true);
			} catch (Exception e) {
				e.printStackTrace();
				jsonObj.put("success", false);
			} finally {
				setJson(response, jsonObj);
			}

		}
	

	// 出库
	@RequestMapping("/indexout")
	public ModelAndView indexout(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
		/**
		 * 获取参数及分页信息
		 * 
		 * @param1 查询条件参数
		 * @param2 分页信息参数
		 */
		PageRoll pageroll = super.getPageRoll("frmQry", "PageRoll");
		 String[] ids={"1","2"};
		pageroll.getParameters().put("ids", ids);
		// pageroll.setPageSize(10);// 测试使用 ，设置每页显示2条便于测试多页

		PageRoll pg = tstEquipmentService.queryPageList(pageroll);// 分页查询
		
		modelView.addObject("PageRoll", pg);// 返回分页参数
		modelView.addObject("frmQry", pg.getParameters());// 返回页面查询参数
		modelView.addObject("frmList", pg.getList());// 返回查询列表
		modelView.setViewName("/business/equipment/equout/equout0000.jsp"); // 返回页面
		return modelView;
	}

	// 出库
	@RequestMapping("/indexoutedit")
	public ModelAndView indexoutedit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		TstEquipmentVO vo = new TstEquipmentVO();
		vo.setId(id);
		if (StringUtils.isNotBlank(id)) {
			vo = tstEquipmentService.queryOne(vo);
		}
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("frmvo", vo);// 返回页面参数
		modelView.setViewName("/business/equipment/equin/equin0001.jsp"); // 返回页面
		return modelView;
	}
	
	// 保存或更新
			@RequestMapping("/editout")
			public void editout(HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				JSONObject jsonObj = new JSONObject();
				try {
					String jsonStr = request.getParameter("frmvalue");
					JSONObject jobj = JSONObject.fromObject(jsonStr);
					TstEquipmentVO vo = (TstEquipmentVO) JSONObject.toBean(jobj,
							TstEquipmentVO.class);
					tstEquipmentService.edit(vo);
					jsonObj.put("success", true);
				} catch (Exception e) {
					e.printStackTrace();
					jsonObj.put("success", false);
				} finally {
					setJson(response, jsonObj);
				}

			}

	// 查询
	@RequestMapping("/indexquery")
	public ModelAndView indexquery(HttpServletRequest request,
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
		PageRoll pg = tstEquipmentService.queryPageList(pageroll);// 分页查询

		modelView.addObject("PageRoll", pg);// 返回分页参数
		modelView.addObject("frmQry", pg.getParameters());// 返回页面查询参数
		modelView.addObject("frmList", pg.getList());// 返回查询列表
		modelView.setViewName("/business/equipment/eququery/equqry0000.jsp"); // 返回页面
		return modelView;
	}

	// ModelAndView 获取新增修改页面
	@RequestMapping("/indexindexqueryedit")
	public ModelAndView indexindexqueryedit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		TstEquipmentVO vo = new TstEquipmentVO();
		vo.setId(id);
		if (StringUtils.isNotBlank(id)) {
			vo = tstEquipmentService.queryOne(vo);
		}
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("frmvo", vo);// 返回页面参数
		modelView.setViewName("/business/equipment/equin/equin0001.jsp"); // 返回页面
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
			TstEquipmentVO vo = (TstEquipmentVO) JSONObject.toBean(jobj,
					TstEquipmentVO.class);
			tstEquipmentService.edit(vo);
			jsonObj.put("success", true);
		} catch (Exception e) {
			e.printStackTrace();
			jsonObj.put("success", false);
		} finally {
			setJson(response, jsonObj);
		}

	}

	// 保存或更新
		@RequestMapping("/update")
		public void update(HttpServletRequest request, HttpServletResponse response)
				throws Exception {
			JSONObject jsonObj = new JSONObject();
			try {
				String id = request.getParameter("id");
				String status = request.getParameter("status");
				TstEquipmentVO vo = new TstEquipmentVO();
				if(status.equals("2")){//出库
					vo.setEquoutdate(new Date());
					Sys_UserVO user=(Sys_UserVO) request.getSession().getAttribute("LabManagerUser");
					vo.setEquoutperson(user.getUsername());
				}else{
					vo.setEquindate(new Date());
					Sys_UserVO user=(Sys_UserVO) request.getSession().getAttribute("LabManagerUser");
					vo.setEquinperson(user.getUsername());
				}
				vo.setId(id);
				vo.setStatus(status);
				tstEquipmentService.update(vo);
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
			TstEquipmentVO vo = new TstEquipmentVO();
			if (StringUtils.isNotBlank(id)) {
				vo.setId(id);
				tstEquipmentService.delete(vo);
			}
			jsonObj.put("success", true);
		} catch (Exception e) {
			e.printStackTrace();
			jsonObj.put("success", false);
		} finally {
			setJson(response, jsonObj);
		}

	}
	
	
	// 维修、报废查询
		@RequestMapping("/indexcheck")
		public ModelAndView indexcheck(HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			ModelAndView modelView = new ModelAndView();
			/**
			 * 获取参数及分页信息
			 * 
			 * @param1 查询条件参数
			 * @param2 分页信息参数
			 */
			PageRoll pageroll = super.getPageRoll("frmQry", "PageRoll");

			 String[] ids={"1"};
			pageroll.getParameters().put("ids", ids);
			PageRoll pg = tstEquipmentService.queryPageList(pageroll);// 分页查询
			
			modelView.addObject("PageRoll", pg);// 返回分页参数
			modelView.addObject("frmQry", pg.getParameters());// 返回页面查询参数
			modelView.addObject("frmList", pg.getList());// 返回查询列表
			modelView.setViewName("/business/equipment/equcheck/equcheck0000.jsp"); // 返回页面
			return modelView;
		}

		//维修、报废管理
		@RequestMapping("/indexcheckedit")
		public ModelAndView indexcheckedit(HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			String id = request.getParameter("id");
			TstEquipmentVO vo = new TstEquipmentVO();
			vo.setId(id);
			if (StringUtils.isNotBlank(id)) {
				vo = tstEquipmentService.queryOne(vo);
			}
			ModelAndView modelView = new ModelAndView();
			modelView.addObject("frmvo", vo);// 返回页面参数
			modelView.setViewName("/business/equipment/equcheck/equcheck0001.jsp"); // 返回页面
			return modelView;
		}

}
