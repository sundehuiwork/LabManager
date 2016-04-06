package com.sun.pub.utils;

import java.io.File;
import java.io.Reader;
import java.sql.Clob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

/**
 * 字符串工具类
 * @author sundehui
 * @date 2016-01-15
 */
public class StringDealUtil {

	public static String planIdtoPartition(String planId) {
		String temp = "account_detail_part_";
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(planId);
		int planIdI;
		if (!isNum.matches()) {
			planIdI = 999999999;
		} else {
			planIdI = Integer.parseInt(planId);
		}
		if (planIdI < 3100000) {
			temp += 1;
		} else if (planIdI < 3200000) {
			temp += 2;
		} else if (planIdI < 3300000) {
			temp += 3;
		} else if (planIdI < 3400000) {
			temp += 4;
		} else if (planIdI < 3500000) {
			temp += 5;
		} else if (planIdI < 3600000) {
			temp += 6;
		} else if (planIdI < 3700000) {
			temp += 7;
		} else if (planIdI < 3800000) {
			temp += 8;
		} else if (planIdI < 3900000) {
			temp += 9;
		} else if (planIdI < 4000000) {
			temp += 10;
		} else if (planIdI < 5000000) {
			temp += 11;
		} else if (planIdI < 7000000) {
			temp += 12;
		} else if (planIdI < 10000000) {
			temp += 13;
		} else if (planIdI < 40000000) {
			temp += 14;
		} else {
			temp += 15;
		}

		return temp;
	}

	public static String password() {
		StringBuffer passworValue = new StringBuffer();
		while (passworValue.length() < 6)
			passworValue.append((int) (Math.random() * 10));
		return passworValue.toString();
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static Clob stringToClob(String str) {
		if (null == str)
			return null;
		else {
			try {
				java.sql.Clob c = new javax.sql.rowset.serial.SerialClob(str.toCharArray());
				return c;
			} catch (Exception e) {
				return null;
			}
		}
	}

	/**
	 * 
	 * @param clob
	 * @return
	 */
	public static String clobToString(Clob clob) {
		if (clob == null)
			return null;

		StringBuffer sb = new StringBuffer(65535);// 64K
		Reader clobStream = null;
		try {
			clobStream = clob.getCharacterStream();
			char[] b = new char[60000];// 每次获取60K
			int i = 0;
			while ((i = clobStream.read(b)) != -1) {
				sb.append(b, 0, i);
			}
		} catch (Exception ex) {
			sb = null;
		} finally {
			try {
				if (clobStream != null) {
					clobStream.close();
				}
			} catch (Exception e) {
			}
		}
		if (sb == null)
			return null;
		else
			return sb.toString();
	}

	/**
	 * list 转换成 string
	 * 
	 * @param list
	 * @return '2','44'
	 */
	public static String listToStr(List<String> list) {
		if (null == list || list.isEmpty()) {
			return "";
		}
		StringBuffer result = new StringBuffer("");
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if (i == (size - 1)) {
				result.append(" '" + list.get(i) + "' ");
			} else {
				result.append(" '" + list.get(i) + "' ,");
			}
		}
		return result.toString();
	}

	/**
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public static <T> T[] concat(T[] first, T[] second) {
		T[] result = Arrays.copyOf(first, first.length + second.length);
		System.arraycopy(second, 0, result, first.length, second.length);
		return result;
	}

	public static boolean isIncludeValue(String value, String reg) {
		if (StringUtils.isBlank(value))
			return false;
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}

	/**
	 * 此方法有两个参数，第一个是要查找的字符串数组，第二个是要查找的字符串,当数组中存在传入串时返回true，否则返回false
	 * 
	 * @param strs
	 * @param s
	 * @return
	 */
	public static boolean isHaveString(String[] strs, String s) {
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].indexOf(s) != -1) {//循环查找字符串数组中的每个字符串中是否包含所有查找的内容
				return true;//查找到了就返回真，不在继续查询
			}
		}
		return false;//没找到返回false
	}

	/**
	 * 此方法有两个参数，第一个是要查找的字符串数组，第二个是要查找的字符串,当数组中存在传入串时返回true，否则返回false
	 * 
	 * @param strs
	 * @param s
	 * @return
	 */
	public static boolean isHaveString(List<String> list, String s) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).indexOf(s) != -1) {//循环查找字符串数组中的每个字符串中是否包含所有查找的内容
				return true;//查找到了就返回真，不在继续查询
			}
		}
		return false;//没找到返回false
	}

	/**
	 * 
	 * @param pathName
	 * @param fileName
	 * @return
	 */
	public String getFileSN(String pathName, String fileName) {
		File filePath = new File(pathName);
		List<String> fileNameList = new ArrayList<String>();
		String[] fileArray = filePath.list();
		if (StringUtils.isNotBlank(fileName)) {

		} else {
			for (String name : fileArray) {
				fileNameList.add(name);
			}
		}

		return null;
	}

	public static char showNext(String s) {
		char c = s.charAt(0);
		return ++c;
	}

	/**
	 * 根据输入的字母算出下一个字母
	 * 
	 * @param value
	 * @return
	 * @throws StringOutIndexException
	 */
	public static String calculateNetCharacter(String value) throws Exception {
		if (StringUtils.isBlank(value))
			return "a";
		Scanner s = new Scanner(value);
		String str = s.nextLine();
		return str;
	}

	/**
	 * 根据当前的字母 算出下一个字母 例如： a->b,z->aa,az->ba; 如果不是字母 就抛出异常
	 * 
	 * @param value
	 * @return
	 */
	public static String calculateNetChar(String value) {
		if (StringUtils.isBlank(value)) {
			return "a";
		}
		value = value.trim();
		char[] charsValue = value.toCharArray();

		StringBuffer resultValue = new StringBuffer();
		for (int i = charsValue.length - 1; i >= 0; i--) {
			try {
				String result = calculateNetCharacter(charsValue[i] + "");
				resultValue.append(result);
			} catch (Exception e) {
				resultValue.append("a");
				if(i==0){
					resultValue.append("a");
				}
			}
		}
		return resultValue.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(calculateNetChar("ZZ"));
		//System.out.println(calculateNetChar("aa"));
	}

}
