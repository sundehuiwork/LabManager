package com.sun.pub.frame;
import java.lang.reflect.Method;

import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.JoinPoint;

import com.sun.pub.utils.UuidUtil;
/**
 * 新增对象时主动插入主键
 * @author 彭刚
 * 2016-3-2
 */
public class GenerateVOPK {

	public void insertVOPK(JoinPoint joinPoint) throws Exception{
		Class<? extends Object> vo = joinPoint.getArgs()[0].getClass();
		Method methodG = vo.getDeclaredMethod("getId");
		Object id = methodG.invoke(joinPoint.getArgs()[0]);
		if(StringUtils.isNotBlank((String) id)) {
			Method methodS = vo.getDeclaredMethod("setId", String.class);
			methodS.invoke(joinPoint.getArgs()[0], UuidUtil.get32UUID());
		}
	}
}
