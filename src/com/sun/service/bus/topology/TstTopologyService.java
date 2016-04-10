package com.sun.service.bus.topology;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;











import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.StringUtil;
import com.sun.mapper.bus.topology.TstTopologyMapper;
import com.sun.pub.frame.ETIPResultSet;
import com.sun.pub.frame.PageRoll;
import com.sun.pub.utils.PageUtils;
import com.sun.pub.utils.UuidUtil;
import com.sun.vo.bus.topology.TstTopologyVO;



/**
 * 设备管理Service
 */
@Service("tstTopologyService")
public class TstTopologyService implements ITstTopologyService {
	/** 获取数据库接口 */
	@Autowired
	private TstTopologyMapper tstTopologyMapper;

	/**
	 * 根据ID查询单一对象
	 * 
	 * @param TstTopologyVO
	 */
	public TstTopologyVO queryOne(TstTopologyVO vo) throws Exception {
		return tstTopologyMapper.queryOne(vo);
	}

	/**
	 * 插入一新对象
	 * 
	 * @param TstTopologyVO
	 * @return insert(TstTopologyVO)
	 */
	public void insert(TstTopologyVO vo) throws Exception {
		vo.setId(UuidUtil.get32UUID());
		tstTopologyMapper.insert(vo);
	}

	/**
	 * 更新对象
	 * 
	 * @param TstTopologyVO
	 */
	public void update(TstTopologyVO vo) throws Exception {
		tstTopologyMapper.update(vo);
	}

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param TstTopologyVO
	 */
	public void edit(TstTopologyVO vo) throws Exception {
		if (StringUtil.isEmpty((vo.getId()))) {
			insert(vo);
		} else {
			update(vo);
		}
	}

	/**
	 * 根据ID删除对象
	 * 
	 * @param TstTopologyVO
	 */
	public void delete(TstTopologyVO vo) throws Exception {
		tstTopologyMapper.delete(vo);
	}

	// 分页查询
	public PageRoll queryPageList(PageRoll pageroll) throws Exception {
		// 获取第page页，rows条内容，默认查询总数count
		Page<Object> p = PageHelper.startPage(pageroll.getCurrentPage(),pageroll.getPageSize());
		List<ETIPResultSet> list = tstTopologyMapper.queryPageList(pageroll);
		// 返回总条数
		int listsize = (int) p.getTotal();
		// 返回分页信息
		PageRoll pg = PageUtils.backPageRoll(pageroll, list, listsize);
		return pg;
	}

}