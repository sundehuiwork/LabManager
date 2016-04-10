package com.sun.service.bus.topology;

import com.sun.pub.frame.PageRoll;
import com.sun.vo.bus.topology.TstTopologyVO;




/**
 * 设备service 接口
 * 
 * @author sundehui
 *
 */
public interface ITstTopologyService {
	/**
	 * 根据ID查询单一对象
	 * 
	 * @param TstTopologyVO
	 */
	public TstTopologyVO queryOne(TstTopologyVO vo) throws Exception;

	/**
	 * 插入一新对象
	 * 
	 * @param TstTopologyVO
	 */
	public void insert(TstTopologyVO vo) throws Exception;

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param TstTopologyVO
	 */
	public void edit(TstTopologyVO vo) throws Exception;

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param TstTopologyVO
	 */
	public void update(TstTopologyVO vo) throws Exception;

	/**
	 * 根据ID删除对象
	 * 
	 * @param TstTopologyVO
	 */
	public void delete(TstTopologyVO vo) throws Exception;

	/**
	 * 分页查询列表
	 */
	public PageRoll queryPageList(PageRoll pageroll) throws Exception;

}