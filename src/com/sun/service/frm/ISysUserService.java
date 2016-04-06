package com.sun.service.frm;

import com.sun.pub.frame.PageRoll;
import com.sun.vo.frm.Sys_UserVO;




/**
 * 样例service 接口
 * 
 * @author sundehui
 *
 */
public interface ISysUserService {
	/**
	 * 根据ID查询单一对象
	 * 
	 * @param Sys_UserVO
	 */
	public Sys_UserVO queryOne(Sys_UserVO vo) throws Exception;

	/**
	 * 插入一新对象
	 * 
	 * @param Sys_UserVO
	 */
	public void insert(Sys_UserVO vo) throws Exception;

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param Sys_UserVO
	 */
	public void edit(Sys_UserVO vo) throws Exception;

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param Sys_UserVO
	 */
	public void update(Sys_UserVO vo) throws Exception;

	/**
	 * 根据ID删除对象
	 * 
	 * @param Sys_UserVO
	 */
	public void delete(Sys_UserVO vo) throws Exception;

	/**
	 * 分页查询列表
	 */
	public PageRoll queryPageList(PageRoll pageroll) throws Exception;

}