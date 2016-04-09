package com.sun.service.bus.special;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;









import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.StringUtil;
import com.sun.mapper.bus.special.TstNetworkMapper;
import com.sun.pub.frame.ETIPResultSet;
import com.sun.pub.frame.PageRoll;
import com.sun.pub.utils.PageUtils;
import com.sun.pub.utils.UuidUtil;
import com.sun.vo.bus.special.TstNetworkVO;



/**
 * 设备管理Service
 */
@Service("tstNetworkService")
public class TstNetworkService implements ITstNetworkService {
	/** 获取数据库接口 */
	@Autowired
	private TstNetworkMapper tstNetworkMapper;

	/**
	 * 根据ID查询单一对象
	 * 
	 * @param TstNetworkVO
	 */
	public TstNetworkVO queryOne(TstNetworkVO vo) throws Exception {
		return tstNetworkMapper.queryOne(vo);
	}

	/**
	 * 插入一新对象
	 * 
	 * @param TstNetworkVO
	 * @return insert(TstNetworkVO)
	 */
	public void insert(TstNetworkVO vo) throws Exception {
		vo.setId(UuidUtil.get32UUID());
		tstNetworkMapper.insert(vo);
	}

	/**
	 * 更新对象
	 * 
	 * @param TstNetworkVO
	 */
	public void update(TstNetworkVO vo) throws Exception {
		tstNetworkMapper.update(vo);
	}

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param TstNetworkVO
	 */
	public void edit(TstNetworkVO vo) throws Exception {
		if (StringUtil.isEmpty((vo.getId()))) {
			insert(vo);
		} else {
			update(vo);
		}
	}

	/**
	 * 根据ID删除对象
	 * 
	 * @param TstNetworkVO
	 */
	public void delete(TstNetworkVO vo) throws Exception {
		tstNetworkMapper.delete(vo);
	}

	// 分页查询
	public PageRoll queryPageList(PageRoll pageroll) throws Exception {
		// 获取第page页，rows条内容，默认查询总数count
		Page<Object> p = PageHelper.startPage(pageroll.getCurrentPage(),pageroll.getPageSize());
		List<ETIPResultSet> list = tstNetworkMapper.queryPageList(pageroll);
		// 返回总条数
		int listsize = (int) p.getTotal();
		// 返回分页信息
		PageRoll pg = PageUtils.backPageRoll(pageroll, list, listsize);
		return pg;
	}

}