package com.sun.service.frm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.StringUtil;
import com.sun.mapper.frm.SysUserMapper;
import com.sun.pub.frame.ETIPResultSet;
import com.sun.pub.frame.PageRoll;
import com.sun.pub.utils.PageUtils;
import com.sun.pub.utils.UuidUtil;
import com.sun.vo.frm.Sys_UserVO;



/**
 * 样例 Service
 */
@Service("sysUserService")
public class SysUserService implements ISysUserService {
	/** 获取数据库接口 */
	@Autowired
	private SysUserMapper sysusermapper;

	/**
	 * 根据ID查询单一对象
	 * 
	 * @param Sys_UserVO
	 */
	public Sys_UserVO queryOne(Sys_UserVO vo) throws Exception {
		return sysusermapper.queryOne(vo);
	}

	/**
	 * 插入一新对象
	 * 
	 * @param Sys_UserVO
	 * @return insert(Sys_UserVO)
	 */
	public void insert(Sys_UserVO vo) throws Exception {
		vo.setId(UuidUtil.get32UUID());
		sysusermapper.insert(vo);
	}

	/**
	 * 更新对象
	 * 
	 * @param Sys_UserVO
	 */
	public void update(Sys_UserVO vo) throws Exception {
		sysusermapper.update(vo);
	}

	/**
	 * 更新对象，如果属性为空则不更新
	 * 
	 * @param Sys_UserVO
	 */
	public void edit(Sys_UserVO vo) throws Exception {
		if (StringUtil.isEmpty((vo.getId()))) {
			insert(vo);
		} else {
			update(vo);
		}
	}

	/**
	 * 根据ID删除对象
	 * 
	 * @param Sys_UserVO
	 */
	public void delete(Sys_UserVO vo) throws Exception {
		sysusermapper.delete(vo);
	}

	// 分页查询
	public PageRoll queryPageList(PageRoll pageroll) throws Exception {
		// 获取第page页，rows条内容，默认查询总数count
		Page<Object> p = PageHelper.startPage(pageroll.getCurrentPage(),pageroll.getPageSize());
		List<ETIPResultSet> list = sysusermapper.queryPageList(pageroll);
		// 返回总条数
		int listsize = (int) p.getTotal();
		// 返回分页信息
		PageRoll pg = PageUtils.backPageRoll(pageroll, list, listsize);
		return pg;
	}

}