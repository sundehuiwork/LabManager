package com.sun.service.bus.special;

import com.sun.pub.frame.PageRoll;
import com.sun.vo.bus.special.TstNetworkVO;




/**
 * 设备service 接口
 * 
 * @author sundehui
 *
 */
public interface ITstNetworkService {
	/**
	 * 根据ID查询单一对象
	 * 
	 * @param TstNetworkVO
	 */
	public TstNetworkVO queryOne(TstNetworkVO vo) throws Exception;

	/**
	 * 插入一新对象
	 * 
	 * @param TstNetworkVO
	 */
	public void insert(TstNetworkVO vo) throws Exception;

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param TstNetworkVO
	 */
	public void edit(TstNetworkVO vo) throws Exception;

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param TstNetworkVO
	 */
	public void update(TstNetworkVO vo) throws Exception;

	/**
	 * 根据ID删除对象
	 * 
	 * @param TstNetworkVO
	 */
	public void delete(TstNetworkVO vo) throws Exception;

	/**
	 * 分页查询列表
	 */
	public PageRoll queryPageList(PageRoll pageroll) throws Exception;

}