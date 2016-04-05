package com.sun.pub.utils;

import java.util.List;

import com.sun.pub.frame.ETIPResultSet;
import com.sun.pub.frame.PageRoll;


/**
 * 分页工具类
 * @author sudehui
 *
 */
public class PageUtils {
	//返回展示信息
	public static PageRoll backPageRoll(PageRoll pageroll,List<ETIPResultSet> list,int totalRows){
		int currentPage=0;
		int sumPage=0;
		if(pageroll.getPageSize()!=0){
			 currentPage=pageroll.getStartRow()/pageroll.getPageSize()+1;
			 if(totalRows%pageroll.getPageSize()==0){
				 sumPage= (int) (totalRows/pageroll.getPageSize());
			 }else{
				 sumPage= (int) (totalRows/pageroll.getPageSize()+1);
			 }
			
		}
		
		pageroll.setCurrentPage(currentPage);
		pageroll.setTotalRows(new Long(totalRows).intValue());
		pageroll.setSumPage(sumPage);
		pageroll.setList(list);
		
		return pageroll;
	}
	
	
	//返回展示信息
	public static PageRoll backPageList(PageRoll pageroll,List list,int totalRows){
		int currentPage=0;
		int sumPage=0;
		if(pageroll.getPageSize()!=0){
			currentPage=pageroll.getStartRow()/pageroll.getPageSize()+1;
			if(totalRows%pageroll.getPageSize()==0){
				sumPage= (int) (totalRows/pageroll.getPageSize());
			}else{
				sumPage= (int) (totalRows/pageroll.getPageSize()+1);
			}
		}
			
		pageroll.setCurrentPage(currentPage);
		pageroll.setTotalRows(new Long(totalRows).intValue());
		pageroll.setSumPage(sumPage);
		pageroll.setObjectList(list);
		return pageroll;
	}
}
