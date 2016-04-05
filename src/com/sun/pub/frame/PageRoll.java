package com.sun.pub.frame;

import java.io.Serializable;
import java.util.List;


/**
 * 分页实体
 * @author sundehui
 * @date 2016-01-15
 */
public class PageRoll implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/*当前页数*/
	private int currentPage = 0;
	/*每页记录数*/
	private int pageSize = 0;
	/*总记录数*/
	private int totalRows = 0;
	/*开始记录数*/
	private int startRow = 0;
	/*总页数*/
	private int sumPage=0;
	// 结果列表
	private List<ETIPResultSet> list;
	// 结果列表
	private List<Object> objectList;
	// 参数
	private ETIPResultSet parameters;


	public int getSumPage() {
		return sumPage;
	}

	public void setSumPage(int sumPage) {
		this.sumPage = sumPage;
	}
	
	
	public ETIPResultSet getParameters() {
		return parameters;
	}

	public void setParameters(ETIPResultSet parameters) {
		this.parameters=parameters;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	
	public List<ETIPResultSet> getList() {
		return list;
	}
	public void setList(List<ETIPResultSet> list) {
		this.list = list;
	}

	public List<Object> getObjectList() {
		return objectList;
	}

	public void setObjectList(List<Object> objectList) {
		this.objectList = objectList;
	}
	
	
	
}
