package com.sun.pub.frame;

import java.util.List;

/**
 * Mapper接口
 * 
 * @author sundehui
 * @date 2015-01-28
 */
public interface FrmMapper<T> {
	/**
	 * 根据ID查询单一对象
	 * 
	 * @param T
	 */
	public T queryOne(T t) throws Exception;
	/**
	 * 查询列表不分页
	 */
	public List<T> queryList(ETIPResultSet resultSet) throws Exception;
	/**
	 * 插入一新对象
	 * 
	 * @param T
	 */
	public void insert(T t) throws Exception;

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param T
	 */
	public void update(T t) throws Exception;

	/**
	 * 根据ID删除对象
	 * 
	 * @param T
	 */
	public void delete(T t) throws Exception;

	

	/**
	 * 分页查询列表
	 */
	public List<ETIPResultSet> queryPageList(PageRoll pageroll)
			throws Exception;
}
