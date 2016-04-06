package com.sun.service.bus.equ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;







import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.StringUtil;
import com.sun.mapper.bus.equ.TstEquipmentMapper;
import com.sun.pub.frame.ETIPResultSet;
import com.sun.pub.frame.PageRoll;
import com.sun.pub.utils.PageUtils;
import com.sun.pub.utils.UuidUtil;
import com.sun.vo.bus.equ.TstEquipmentVO;



/**
 * 设备管理Service
 */
@Service("tstEquipmentService")
public class TstEquipmentService implements ITstEquipmentService {
	/** 获取数据库接口 */
	@Autowired
	private TstEquipmentMapper tstequipmentmapper;

	/**
	 * 根据ID查询单一对象
	 * 
	 * @param TstEquipmentVO
	 */
	public TstEquipmentVO queryOne(TstEquipmentVO vo) throws Exception {
		return tstequipmentmapper.queryOne(vo);
	}

	/**
	 * 插入一新对象
	 * 
	 * @param TstEquipmentVO
	 * @return insert(TstEquipmentVO)
	 */
	public void insert(TstEquipmentVO vo) throws Exception {
		vo.setId(UuidUtil.get32UUID());
		tstequipmentmapper.insert(vo);
	}

	/**
	 * 更新对象
	 * 
	 * @param TstEquipmentVO
	 */
	public void update(TstEquipmentVO vo) throws Exception {
		tstequipmentmapper.update(vo);
	}

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param TstEquipmentVO
	 */
	public void edit(TstEquipmentVO vo) throws Exception {
		if (StringUtil.isEmpty((vo.getId()))) {
			insert(vo);
		} else {
			update(vo);
		}
	}

	/**
	 * 根据ID删除对象
	 * 
	 * @param TstEquipmentVO
	 */
	public void delete(TstEquipmentVO vo) throws Exception {
		tstequipmentmapper.delete(vo);
	}

	// 分页查询
	public PageRoll queryPageList(PageRoll pageroll) throws Exception {
		// 获取第page页，rows条内容，默认查询总数count
		Page<Object> p = PageHelper.startPage(pageroll.getCurrentPage(),pageroll.getPageSize());
		List<ETIPResultSet> list = tstequipmentmapper.queryPageList(pageroll);
		// 返回总条数
		int listsize = (int) p.getTotal();
		// 返回分页信息
		PageRoll pg = PageUtils.backPageRoll(pageroll, list, listsize);
		return pg;
	}

}