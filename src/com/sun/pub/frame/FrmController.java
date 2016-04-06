package com.sun.pub.frame;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sun.pub.utils.JsonUtil;
import com.sun.pub.utils.XmlUtil;


/**
 * controller基类
 * 
 * @author sundehui
 * @date 2016-01-15
 */
public class FrmController {

	private HttpSession session;

	public void checkUser(HttpServletRequest request,
			HttpServletResponse response) {
		HttpSession session = request.getSession();
		request.getSession().getAttribute("users");
	}

	// 获取前端参数(直接获取form表单)
	public ETIPResultSet getResultMap(HttpServletRequest request) {
		Map properties = request.getParameterMap();
		ETIPResultSet returnMap = new ETIPResultSet();
		Iterator entries = properties.entrySet().iterator();
		Map.Entry entry;
		String name = "";
		String value = "";
		while (entries.hasNext()) {
			entry = (Map.Entry) entries.next();
			name = (String) entry.getKey();
			Object valueObj = entry.getValue();
			if (null == valueObj) {
				value = "";
			} else if (valueObj instanceof String[]) {
				String[] values = (String[]) valueObj;
				for (int i = 0; i < values.length; i++) {
					value = values[i] + ",";
				}
				value = value.substring(0, value.length() - 1);
			} else {
				value = valueObj.toString();
			}
			returnMap.put(name, value);
		}
		return returnMap;
	}

	// 获取分页参数
	@SuppressWarnings("rawtypes")
	protected PageRoll getPageRoll() {
		PageRoll pageRoll = new PageRoll();
		ETIPResultSet set = new ETIPResultSet();
		try {
			String frmQry = this.getRequest().getParameter("frmQry");
			String PageRoll = this.getRequest().getParameter("PageRoll");
			if (StringUtils.isNotBlank(frmQry)) {
				JSONObject jobj = JSONObject.fromObject(frmQry);
				Map<?, ?> properties = (Map<?, ?>) jobj;
				Iterator<?> entries = properties.entrySet().iterator();
				Map.Entry entry;
				String name = "";
				String value = "";
				while (entries.hasNext()) {
					entry = (Map.Entry) entries.next();
					name = (String) entry.getKey();
					Object valueObj = entry.getValue();
					if (null == valueObj) {
						value = "";
					} else if (valueObj instanceof String[]) {
						String[] values = (String[]) valueObj;
						for (int i = 0; i < values.length; i++) {
							value = values[i] + ",";
						}
						value = value.substring(0, value.length() - 1);
					} else {
						value = valueObj.toString();
					}
					set.put(name, value);
				}
			}

			if (StringUtils.isNotBlank(PageRoll)) { // 分页信息
				JSONObject pagejobj = JSONObject.fromObject(PageRoll);
				String currpage = pagejobj.getString("currentPage");
				String pagesize = pagejobj.getString("pageSize");
				int curr = Integer.valueOf(currpage);
				int page = Integer.valueOf(pagesize);
				int first = 0;
				if (curr == 1) {
					first = 0;
				} else {
					first = (curr - 1) * page;
				}
				pageRoll.setStartRow(first);
				pageRoll.setPageSize(page);
			} else {
				pageRoll.setStartRow(0);
				pageRoll.setPageSize(10);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		pageRoll.setParameters(set);
		return pageRoll;
	}

	/**
	 * 
	 * @param frmQryid
	 *            查询条件参数
	 * @param PageRollid
	 *            分页参数
	 * @return
	 */
	protected PageRoll getPageRoll(String frmQryid, String PageRollid) {
		PageRoll pageRoll = new PageRoll();
		ETIPResultSet set = new ETIPResultSet();
		try {
			String frmQry = this.getRequest().getParameter("frmQry");
			if (frmQry != null) {
				frmQry = new String(frmQry.getBytes("ISO-8859-1"), "UTF-8");// 针对tomcat默认编码方式为ISO-8859-1
																			// 特殊处理字符编码特殊处理
			}
			String PageRoll = this.getRequest().getParameter(PageRollid);
			if (StringUtils.isNotBlank(frmQry)) {
				frmQry = frmQry.replace("q_", "");
				frmQry = frmQry.replace("a_", "");
				JSONObject jobj = JSONObject.fromObject(frmQry);
				Map<?, ?> properties = (Map<?, ?>) jobj;
				Iterator<?> entries = properties.entrySet().iterator();
				Map.Entry entry;
				String name = "";
				String value = "";
				while (entries.hasNext()) {
					entry = (Map.Entry) entries.next();
					name = (String) entry.getKey();
					Object valueObj = entry.getValue();
					if (null == valueObj) {
						value = "";
					} else if (valueObj instanceof String[]) {
						String[] values = (String[]) valueObj;
						for (int i = 0; i < values.length; i++) {
							value = values[i] + ",";
						}
						value = value.substring(0, value.length() - 1);
					} else {
						value = valueObj.toString();
					}
					set.put(name, value);
				}
			}

			if (StringUtils.isNotBlank(PageRoll) && !PageRoll.equals("{}")) { // 分页信息
				PageRoll = PageRoll.replace("q_", "");
				PageRoll = PageRoll.replace("a_", "");
				JSONObject pagejobj = JSONObject.fromObject(PageRoll);
				String currpage = pagejobj.getString("currentPage");
				String pagesize = pagejobj.getString("pageSize");
				int curr = 1;
				int page = 1;
				if (currpage != null && !currpage.equals("")) {
					curr = Integer.valueOf(currpage);
				}
				if (pagesize != null && !pagesize.equals("")) {
					page = Integer.valueOf(pagesize);
				}
				int first = 0;
				if (curr == 1) {
					first = 0;
				} else {
					first = (curr - 1) * page;
				}
				pageRoll.setCurrentPage(curr);
				pageRoll.setStartRow(first);
				pageRoll.setPageSize(page);
			} else {
				pageRoll.setCurrentPage(0);
				pageRoll.setStartRow(0);
				pageRoll.setPageSize(10);// 默认每页10条
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		pageRoll.setParameters(set);
		return pageRoll;
	}

	// 获取分页前端参数
	public ETIPResultSet getPageMap(HttpServletRequest request) {
		String frmQry = request.getParameter("frmQry");
		String PageRoll = request.getParameter("PageRoll");
		ETIPResultSet returnMap = new ETIPResultSet();
		if (StringUtils.isNotBlank(frmQry)) {
			JSONObject jobj = JSONObject.fromObject(frmQry);
			Map properties = (Map) jobj;
			Iterator entries = properties.entrySet().iterator();
			Map.Entry entry;
			String name = "";
			String value = "";
			while (entries.hasNext()) {
				entry = (Map.Entry) entries.next();
				name = (String) entry.getKey();
				Object valueObj = entry.getValue();
				if (null == valueObj) {
					value = "";
				} else if (valueObj instanceof String[]) {
					String[] values = (String[]) valueObj;
					for (int i = 0; i < values.length; i++) {
						value = values[i] + ",";
					}
					value = value.substring(0, value.length() - 1);
				} else {
					value = valueObj.toString();
				}
				returnMap.put(name, value);
			}
		}
		if (StringUtils.isNotBlank(PageRoll)) {
			JSONObject pagejobj = JSONObject.fromObject(PageRoll);
			String currpage = pagejobj.getString("currpage");
			String pagesize = pagejobj.getString("pagesize");
			int curr = Integer.valueOf(currpage);
			int page = Integer.valueOf(pagesize);
			int first = 0;
			if (curr == 1) {
				first = 0;
			} else {
				first = (curr - 1) * page;
			}
			returnMap.put("first", first);
			returnMap.put("pagesize", page);
		} else {
			returnMap.put("first", 0);
			returnMap.put("pagesize", 10);
		}
		return returnMap;
	}

	/**
	 * 得到request对象
	 */
	protected HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();

		return request;
	}

	protected void sendXml(HttpServletResponse response, Object obj)
			throws IOException {
		response.setContentType("text/xml; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(XmlUtil.dataToXml(obj));
		response.getWriter().close();
	}

	protected void sendJSON(HttpServletRequest request,
			HttpServletResponse response, Object obj) throws IOException {
		response.setContentType("text/html; charset=utf-8");
		// response.setCharacterEncoding("UTF-8");
		response.getWriter().write(
				JsonUtil.getJSONString(obj, "yyyy-MM-dd HH:mm:ss").toString());
		response.getWriter().close();
	}

	protected void send(HttpServletRequest request,
			HttpServletResponse response, String str) throws IOException {
		response.setContentType("text/html; charset=utf-8");
		// response.setCharacterEncoding("UTF-8");
		response.getWriter().write(str.toString());
		response.getWriter().close();
	}

	public void setJson(HttpServletResponse response, Object json)
			throws IOException {
		if (json instanceof String) {
			json = json.toString().replaceAll("\r\n", "");
		}
		response.setContentType("text/json; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json.toString());
		response.getWriter().close();
	}

	/************************************** 工具类 ***************************************************/
	// JSONObject转map
	public ETIPResultSet JsontoMap(JSONObject jsonObject) {
		ETIPResultSet data = new ETIPResultSet();
		// 将json字符串转换成jsonObject
		Iterator it = jsonObject.keys();
		// 遍历jsonObject数据，添加到Map对象
		while (it.hasNext()) {
			String key = String.valueOf(it.next());
			String value = (String) jsonObject.get(key);
			data.put(key, value);
		}
		return data;
	}

	protected void responseJson(HttpServletRequest request,
			HttpServletResponse response, String str) {
		try {
			response.setContentType("text/xml; charset=utf-8");
			response.setCharacterEncoding("UTF-8");
			if (str.toString().indexOf("[") == 0) {
				response.getWriter().write(str.toString());
			} else {
				response.getWriter().write("[" + str.toString() + "]");
			}
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
