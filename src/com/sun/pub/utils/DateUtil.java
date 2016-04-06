package com.sun.pub.utils;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
/**
 * 日期工具类
 * @author sundehui
 * @date 2016-01-15
 */
public class DateUtil {

	private static final Logger log = Logger.getLogger(DateUtil.class);

	public static String DEFAULTFORMAT_NO_FORMAT = "yyyyMMdd HH:mm:ss";
	public static String DATEFORMAT_NO_FORMAT = "yyyyMMdd";
	public static String MONTHFORMAT_NO_FORMAT = "yyyyMM";

	public static String DEFAULTFORMAT = "yyyy-MM-dd HH:mm:ss";
	public static String DATEFORMAT = "yyyy-MM-dd";
	public static String MONTHFORMAT = "yyyy-MM";
	public static String YESFORMAT = "yyyy";

	public static String DEFAULTFORMAT_SLASH = "yyyy/MM/dd HH:mm:ss";
	public static String DATEFORMAT_SLASH = "yyyy/MM/dd";
	public static String MONTHFORMAT_SLASH = "yyyy/MM";
	public static String DEFAULTFORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

	public static String getCurDateString() {
		SimpleDateFormat format = new SimpleDateFormat(DEFAULTFORMAT);
		
		return format.format(new Date());
	}
	
	/**
	 * 获取年份
	 */
	public static int getCurYear() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy");
		return Integer.parseInt(format.format(new Date()));
	}
	
	/**
	 * 获取月份
	 */
	public static int getCurMonth() {
		SimpleDateFormat format = new SimpleDateFormat("MM");
		return Integer.parseInt(format.format(new Date()));
	}
	
	/**
	 * 
	 * 字符串日期格式化成日期格式
	 * @param date
	 * @param format
	 * @return
	 * @throws Exception
	 */
	public static Date strToDate(String date, String format) throws Exception {
		SimpleDateFormat fm;
		if (StringUtils.isBlank(date))
			return null;
		if (StringUtils.isBlank(format)) {
			fm = new SimpleDateFormat(DATEFORMAT);
		} else {
			fm = new SimpleDateFormat(format);
		}

		try {
			return fm.parse(date);
		} catch (Exception e) {
			log.error("String to Date error,error" + e.getMessage(), e);
			throw new Exception("String to Date error,error" + e.getMessage(), e);
		}
	}
	
	/**
	 * 
	 * 日期格式化成字符串格式
	 * @param date
	 * @param format
	 * @return
	 */
	public static String dateToStr(Date date, String format) {
		SimpleDateFormat fm;
		if (format == null || format.equals("")) {
			fm = new SimpleDateFormat(DATEFORMAT);
		} else {
			fm = new SimpleDateFormat(format);
		}

		return fm.format(date);
	}

	public static long getAge(String date) throws Exception {
		Date birthday = strToDate(date, "");
		Date now = new Date();
		long day = (now.getTime() - birthday.getTime()) / (24 * 60 * 60 * 1000) + 1;
		//String year=new java.text.DecimalFormat("#.00").format(day/365f);
		long year = day / 365;
		return year;
	}

	//  格式化日期为字符串   "yyyy-MM-dd   hh:mm"  
	public String formatDateTime(Date basicDate, String strFormat) {
		SimpleDateFormat df = new SimpleDateFormat(strFormat);
		return df.format(basicDate);
	}

	//   格式化日期为字符串   "yyyy-MM-dd   hh:mm"  
	public String formatDateTime(String basicDate, String strFormat) {
		SimpleDateFormat df = new SimpleDateFormat(strFormat);
		Date tmpDate = null;
		try {
			tmpDate = df.parse(basicDate);
		} catch (Exception e) {
			//   日期型字符串格式错误  
		}
		return df.format(tmpDate);
	}

	//   当前日期加减n天后的日期，返回String   (yyyy-mm-dd)  
	public String nDaysAftertoday(int n) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar rightNow = Calendar.getInstance();
		//rightNow.add(Calendar.DAY_OF_MONTH,-1);  
		rightNow.add(Calendar.DAY_OF_MONTH, +n);
		return df.format(rightNow.getTime());
	}

	//   当前日期加减n天后的日期，返回String   (yyyy-mm-dd)  
	public Date nDaysAfterNowDate(int n) {
		Calendar rightNow = Calendar.getInstance();
		//rightNow.add(Calendar.DAY_OF_MONTH,-1);  
		rightNow.add(Calendar.DAY_OF_MONTH, +n);
		return rightNow.getTime();
	}

	//   给定一个日期型字符串，返回加减n天后的日期型字符串  
	public String nDaysAfterOneDateString(String basicDate, int n) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date tmpDate = null;
		try {
			tmpDate = df.parse(basicDate);
		} catch (Exception e) {
			//   日期型字符串格式错误  
		}
		long nDay = (tmpDate.getTime() / (24 * 60 * 60 * 1000) + 1 + n) * (24 * 60 * 60 * 1000);
		tmpDate.setTime(nDay);

		return df.format(tmpDate);
	}

	//   给定一个日期，返回加减n天后的日期  
	public Date nDaysAfterOneDate(Date basicDate, int n) {
		long nDay = (basicDate.getTime() / (24 * 60 * 60 * 1000) + 1 + n) * (24 * 60 * 60 * 1000);
		basicDate.setTime(nDay);

		return basicDate;
	}

	//   计算两个日期相隔的天数  
	public int nDaysBetweenTwoDate(Date firstDate, Date secondDate) {
		int nDay = (int) ((secondDate.getTime() - firstDate.getTime()) / (24 * 60 * 60 * 1000));
		return nDay;
	}

	//   计算两个日期相隔的天数  
	public int nDaysBetweenTwoDate(String firstString, String secondString) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date firstDate = null;
		Date secondDate = null;
		try {
			firstDate = df.parse(firstString);
			secondDate = df.parse(secondString);
		} catch (Exception e) {
			//   日期型字符串格式错误  
		}

		int nDay = (int) ((secondDate.getTime() - firstDate.getTime()) / (24 * 60 * 60 * 1000));
		return nDay;
	}

	public static Date getNow() {
		return Calendar.getInstance().getTime();
	}

	public static String getDate() {
		return getDateTime("yyyy-MM-dd");
	}

	public static String getDateNum() {
		return getDateTime("yyyyMMdd");
	}

	public static String getYM() {
		return getDateTime("yyyy-MM");
	}
	public static String getY() {
		return getDateTime("yyyy");
	}

	public static String getDateTime() {
		return getDateTime("yyyy-MM-dd HH:mm:ss");
	}

	public static String getDateTimeNum() {
		return getDateTime("yyyyMMddHHmmss");
	}
	
	public static String getChinaDate(Date date){
		String chinaDate = "";
		if(!"".equals(date.toString()) && null!=date.toString()){
			String time = format(date,"yyyyMMdd");
			chinaDate = time.substring(0,4)+"年"+time.substring(4,6)+"月"+time.substring(6)+"日";
		}
		return chinaDate;
	}

	// 获得当前月的上一月
	public static String getLastMonth(String str, String format) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		Date date = df.parse(str);
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, -1);
		return df.format(calendar.getTime());
	}

	// 获得当前月的前两个月
	public static String getLastMonth1(String str, String format) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(df.parse(str));
		calendar.add(Calendar.MONTH, -2);
		return df.format(calendar.getTime());
	}

	// 获得当前月的下一个月
	public static String getLastMonth2(String str, String format) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(df.parse(str));
		calendar.add(Calendar.MONTH, +1);
		return df.format(calendar.getTime());
	}

	// 获得当前日期前一天
	public static String getPreDate() {
		Date cur = Calendar.getInstance().getTime();
		Date pre = new Date(cur.getTime() - 24 * 60 * 60 * 1000);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(pre);
	}

	/**
	 * 获得当前时间的前一天
	 * 
	 * @param curr
	 * @return
	 */
	public static Date getPreDate(Date curr) {
		return new Date(curr.getTime() - 24 * 60 * 60 * 1000);
	}

	// 获得后一天
	public static String getNextDate(String datestr, String pattern) {
		Date cur = parse(datestr, pattern);
		Date next = new Date(cur.getTime() + 24 * 60 * 60 * 1000);
		return format(next, pattern);
	}

	// 获得后15天
	public static String getNext15Date(String datestr, String pattern) {
		Date cur = parse(datestr, pattern);
		Date next = new Date(cur.getTime() + 24 * 60 * 60 * 1000 * 15);
		return format(next, pattern);
	}

	// 获得后90天  一个季度
	public static String getNext90Date(String datestr, String pattern) {
		Date cur = parse(datestr, pattern);
		Date next = new Date(cur.getTime() + (long) 24 * 60 * 60 * 1000 * 90);
		return format(next, pattern);
	}

	/**
	 * 获得当前时间的后一天
	 * 
	 * @return
	 */
	public static Date getNextDate(Date curr) {
		return new Date(curr.getTime() + 24 * 60 * 60 * 1000);
	}

	// 获得当前月的第一天
	public static String getFirstDayOfMonth() {
		Calendar c = Calendar.getInstance();
		Calendar calfirst = Calendar.getInstance();
		int now = c.get(c.DAY_OF_MONTH);
		calfirst.add(calfirst.DATE, 1 - now);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(calfirst.getTime());
	}

	/**
	 * 获得月的第一天
	 */
	public static String getFirstDayOfMonth(String date) {
		Calendar c = Calendar.getInstance();
		c.setTime(parse(date, null));
		c.set(c.DATE, 1);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(c.getTime());
	}

	/**
	 * 获得月的最后一天
	 */
	public static String getLastDayOfMonth(String date) {
		Calendar c = Calendar.getInstance();
		c.setTime(parse(date, null));
		c.add(c.MONTH, 1);
		c.set(c.DATE, 1);
		c.add(c.DATE, -1);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(c.getTime());
	}

	public static String getDateTime(String pattern) {
		Date datetime = Calendar.getInstance().getTime();
		return getDateTime(datetime, pattern);
	}

	public static String getDateTime(Date date, String pattern) {
		if (pattern == null || "".equals(pattern))
			pattern = "yyyy-MM-dd HH:mm:ss";
		// 如果date==null,也会抛错误。
		if (date == null) {
			System.out.println("DateUtil.getDateTime Error");
			date = new Date();
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}

	public static int getCurrentYear() {
		return Calendar.getInstance().get(1);
	}

	public static int getCurrentMonth() {
		return Calendar.getInstance().get(2) + 1;
	}

	public static int getCurrentDay() {
		return Calendar.getInstance().get(5);
	}

	public static Date addDays(int days) {
		return add(getNow(), days, 5);
	}

	public static Date addDays(Date date, int days) {
		return add(date, days, 5);
	}

	public static Date addMonths(int months) {
		return add(getNow(), months, 2);
	}

	public static Date addMonths(Date date, int months) {
		return add(date, months, 2);
	}

	public static int getYear(String date) {
		String[] str = date.split("-");
		return Integer.parseInt(str[0]);
	}

	public static String getMonth(String date) {
		String[] str = date.split("-");
		return str[1];
	}

	// 2007-11 to 2007-11-30
	public static String getDay(String date) {
		if (date == null || date.equals("")) {
			return null;
		}
		try {
			String[] str = date.split("-");
			int month = Integer.parseInt(str[1]);
			if (month == 2) {
				return "-28";
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				return "-31";
			} else {
				return "-30";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// 2007-01-01 to 【>=2007-01-01 00:00:00 and <=2007-01-01 23:59:59】
	public static String getDayAll(String date, String flag) {
		if (flag == null || flag.equals(""))
			return null;

		try {
			if (flag.equals("start")) {
				return date + " 00:00:00";
			} else if (flag.equals("end")) {
				return date + " 23:59:59";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 获取前一年
	 * 
	 * @param curYear
	 * @return
	 */
	public static String getPreYear(String curYear) {
		int curY = Integer.parseInt(curYear);
		int preY = curY - 1;
		return preY + "";
	}

	private static Date add(Date date, int amount, int field) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(field, amount);
		return calendar.getTime();
	}

	public static int diffMinutes(String one, String two) {
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			long oneT = inputFormat.parse(one).getTime();
			long twoT = inputFormat.parse(two).getTime();

			long ss = (oneT - twoT) / (1000); // 共计秒数

			int MM = (int) ss / 60; // 共计分钟数
			// int hh=(int)ss/3600; //共计小时数
			// int dd=(int)hh/24; //共计天数
			return MM;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public static double diffHours(Date one, Date two) {
		try {
			return ((((one.getTime() - two.getTime()) / 1000) / 60) / 60);
		} catch (Exception e) {
			return -1;
		}
	}

	public static long diffDays(Date one, Date two) {
		try {
			return (one.getTime() - two.getTime()) / 0x5265c00L;
		} catch (Exception e) {
			return -1;
		}
	}

	public static int diffMonths(Date one, Date two) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(one);
		int yearOne = calendar.get(1);
		int monthOne = calendar.get(2);
		calendar.setTime(two);
		int yearTwo = calendar.get(1);
		int monthTwo = calendar.get(2);
		return (yearOne - yearTwo) * 12 + (monthOne - monthTwo);
	}

	public static Date parse(String datestr, String pattern) {
		if (datestr == null || "".equals(datestr))
			return null;
		Date date = null;
		String p = pattern;
		if (pattern == null || "".equals(pattern))
			p = "yyyy-MM-dd";
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(p);
			date = dateFormat.parse(datestr);
		} catch (ParseException parseexception) {
		}
		return date;
	}

	public static String format(Date date, String pattern) {
		String p;
		p = pattern;
		if (pattern == null || "".equals(pattern))
			p = "yyyy-MM-dd";
		SimpleDateFormat dateFormat = new SimpleDateFormat(p);
		try {
			return dateFormat.format(date);
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * 构造文件名获得当前时间
	 * 
	 * @return
	 */
	public static String getConstructionTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		Calendar cal = Calendar.getInstance();
		Long time = System.currentTimeMillis();
		cal.setTimeInMillis(time);
		return sdf.format(cal.getTime());
	}

	public static Date getMonthLastDay() {
		return getMonthLastDay(getNow());
	}

	public static Date getMonthLastDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.get(1), calendar.get(2) + 1, 1);
		calendar.add(5, -1);
		return calendar.getTime();
	}

	// add by txc for ext,未完成，适用于记录内所有日期字段统一格式
	public static void setDateFormatForData(Object object, String dateFormat) {
		Field[] fields = object.getClass().getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			Object o = field.getType();
			if (o instanceof java.util.Date) {

			}
		}
	}
	
	/**
	 * 将指定的日期字符串转化为日期对象
	 * 
	 * @param dateStr 日期字符串
	 * @return java.util.Date
	 */
	public static Date getDate(String dateStr, String format) {
		if (dateStr == null) {
			return new Date();
		}
		if (format == null) {
			format = "yyyy-MM-dd";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date date = sdf.parse(dateStr);
			return date;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 根据日期获取下一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date getNetDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		return cal.getTime();
	}
	
	/**
	 * 根据日期获取下一天年
	 * 
	 * @param date
	 * @return
	 */
	public static Date getNetYes(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.YEAR, 1);
		return cal.getTime();
	}
	
	/**
	 * 获取上一年
	 * @param date
	 * @return
	 */
	public static Date getPreviousYesr(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.YEAR, -1);
		return cal.getTime();
	}

	/**
	 * 判断日期是否是当天
	 * @param date
	 * @return
	 */
	public static boolean isTotay(Date date){
		Calendar current = Calendar.getInstance();
		current.setTime(date);
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		start.set(Calendar.HOUR_OF_DAY, 0);
		start.set(Calendar.MINUTE, 0);
		start.set(Calendar.SECOND, 0);
		
		end.set(Calendar.DAY_OF_MONTH, end.get(Calendar.DAY_OF_MONTH)+1);
		end.set(Calendar.HOUR_OF_DAY, 0);
		end.set(Calendar.MINUTE, 0);
		end.set(Calendar.SECOND, 0);
		
		if(current.after(start) && current.before(end)){
			return true;
		}
		return false;
	}
	public static void main(String args[]) {
		//		String star = DateUtil.getStar("2002-12-25");
		//		DateUtil.getAge("2002-12-25");
		System.out.println(getCurMonth());
	}

	//返回yyyy/MM/dd格式的日期
	public static Date getFormatDate(String date) throws ParseException {
		Date originalDate = new SimpleDateFormat(DATEFORMAT).parse(date);
		String now = new SimpleDateFormat(DATEFORMAT_SLASH).format(originalDate);
		Date formatDate = new SimpleDateFormat(DATEFORMAT_SLASH).parse(now);
		return formatDate;
	}
}
