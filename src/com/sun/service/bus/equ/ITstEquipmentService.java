package com.sun.service.bus.equ;

import com.sun.pub.frame.PageRoll;
import com.sun.vo.bus.equ.TstEquipmentVO;




/**
 * 设备service 接口
 * 
 * @author sundehui
 *
 */
public interface ITstEquipmentService {
	/**
	 * 根据ID查询单一对象
	 * 
	 * @param TstEquipmentVO
	 */
	public TstEquipmentVO queryOne(TstEquipmentVO vo) throws Exception;

	/**
	 * 插入一新对象
	 * 
	 * @param TstEquipmentVO
	 */
	public void insert(TstEquipmentVO vo) throws Exception;

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param TstEquipmentVO
	 */
	public void edit(TstEquipmentVO vo) throws Exception;

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param TstEquipmentVO
	 */
	public void update(TstEquipmentVO vo) throws Exception;

	/**
	 * 根据ID删除对象
	 * 
	 * @param TstEquipmentVO
	 */
	public void delete(TstEquipmentVO vo) throws Exception;

	/**
	 * 分页查询列表
	 */
	public PageRoll queryPageList(PageRoll pageroll) throws Exception;

}