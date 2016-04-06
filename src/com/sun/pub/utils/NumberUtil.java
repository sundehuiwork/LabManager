package com.sun.pub.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * 数字工具类
 * @author sundehui
 * @date 2016-01-15
 */
public class NumberUtil {

	private static final Logger log = Logger.getLogger(NumberUtil.class);

	/**
	 * 判断当前值是否为整数
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isInteger(String value) {
		if (StringUtils.isEmpty(value)) {
			return false;
		}
		String mstr = value.toString();
		Pattern pattern = Pattern.compile("^-?\\d+{1}");
		return pattern.matcher(mstr).matches();
	}

	/**
	 * 判断当前值是否为数字(包括小数)
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isDigit(String value) {
		if (StringUtils.isEmpty(value)) {
			return false;
		}
		String mstr = value.toString();
		Pattern pattern = Pattern.compile("^-?[0-9]*.?[0-9]*{1}");
		return pattern.matcher(mstr).matches();
	}

	/**
	 * 将数字格式化输出
	 * 
	 * @param value
	 *            需要格式化的值
	 * @param precision
	 *            精度(小数点后的位数)
	 * @return
	 */
	public static String format(String value, Integer precision) {
		Double number = 0.0;
		if (NumberUtil.isDigit(value)) {
			number = new Double(value.toString());
		}
		precision = (precision == null || precision < 0) ? 2 : precision;
		BigDecimal bigDecimal = new BigDecimal(number);
		return bigDecimal.setScale(precision, BigDecimal.ROUND_HALF_UP).toString();
	}

	/**
	 * 
	 * @param money
	 * @return
	 */
	public static String formatMoney(Double money) {
		if (money == null) {
			return "0.00";
		}
		money = Double.parseDouble(format(money.toString()));
		NumberFormat nf = new DecimalFormat("#,###.##");
		return nf.format(money);

	}

	/**
	 * 
	 * @param money
	 * @return
	 * @throws Exception
	 */
	public static String formatMoney(String money) throws Exception {
		if (money == null) {
			return "0.00";
		}
		Double moneyValue = null;
		try {
			moneyValue = Double.parseDouble(money);
		} catch (NumberFormatException e) {
			log.error("string to double error,error:" + e.getMessage(), e);
			throw new RuntimeException("string to double error,error:" + e.getMessage(), e);
		}
		return formatMoney(moneyValue);

	}

	public static void main(String[] args) {
		System.out.println(formatMoney(12340000.55));
	}

	/**
	 * 小数转换整数
	 * 
	 * @param value
	 * @return
	 */
	public static int doubleCeil(double value) {
		return (int) Math.ceil(value);
	}

	/**
	 * 将数字格式化输出
	 * 
	 * @param value
	 * @return
	 */
	public static String format(String value) {
		return NumberUtil.format(value, 2);
	}

	/**
	 * 将值转成Integer型，如果不是整数，则返回0
	 * 
	 * @param value
	 * @param replace
	 *            如果为0或者null，替换值
	 * @return
	 */
	public static Integer parseInteger(String value, Integer replace) {
		if (!NumberUtil.isInteger(value)) {
			return replace;
		}
		return new Integer(value.toString());
	}

	/**
	 * 将值转成Integer型，如果不是整数，则返回0
	 * 
	 * @param value
	 * @return
	 */
	public static Integer parseInteger(String value) {
		return NumberUtil.parseInteger(value, 0);
	}

	/**
	 * 将值转成Long型
	 * 
	 * @param value
	 * @param replace
	 *            如果为0或者null，替换值
	 * @return
	 */
	public static Long parseLong(String value, Long replace) {
		if (!NumberUtil.isInteger(value)) {
			return replace;
		}
		return new Long(value.toString());
	}

	/**
	 * 将值转成Long型，如果不是整数，则返回0
	 * 
	 * @param value
	 * @return
	 */
	public static Long parseLong(String value) {
		return NumberUtil.parseLong(value, 0L);
	}

	/**
	 * 将值转成Double型
	 * 
	 * @param value
	 * @param replace
	 *            replace 如果为0或者null，替换值
	 * @return
	 */
	public static Double parseDouble(String value, Double replace) {
		if (!NumberUtil.isDigit(value)) {
			return replace;
		}
		return new Double(value.toString());
	}

	/**
	 * 将值转成Double型，如果不是整数，则返回0
	 * 
	 * @param value
	 * @return
	 */
	public static Double parseDouble(String value) {
		return NumberUtil.parseDouble(value, 0.0);
	}

	/**
	 * 将char型数据转成字节数组
	 * 
	 * @param value
	 * @return
	 */
	public static byte[] toBytes(char value) {
		byte[] bt = new byte[2];
		for (int i = 0; i < bt.length; i++) {
			bt[i] = (byte) (value >>> (i * 8));
		}
		return bt;
	}

	/**
	 * 将short型数据转成字节数组
	 * 
	 * @param value
	 * @return
	 */
	public static byte[] toBytes(short value) {
		byte[] bt = new byte[2];
		for (int i = 0; i < bt.length; i++) {
			bt[i] = (byte) (value >>> (i * 8));
		}
		return bt;
	}

	/**
	 * 将int型数据转成字节数组
	 * 
	 * @param value
	 * @return
	 */
	public static byte[] toBytes(int value) {
		byte[] bt = new byte[4];
		for (int i = 0; i < bt.length; i++) {
			bt[i] = (byte) (value >>> (i * 8));
		}
		return bt;
	}

	/**
	 * 将long型数据转成字节数组
	 * 
	 * @param value
	 * @return
	 */
	public static byte[] toBytes(long value) {
		byte[] bt = new byte[8];
		for (int i = 0; i < bt.length; i++) {
			bt[i] = (byte) (value >>> (i * 8));
		}
		return bt;
	}

	/**
	 * 将short型数据插入到指定索引的字节数组中
	 * 
	 * @param index
	 *            索引
	 * @param values
	 *            字节数组
	 * @param value
	 *            需要插入的值
	 */
	public static void insert(int index, byte[] values, short value) {
		byte[] bt = NumberUtil.toBytes(value);
		System.arraycopy(bt, 0, values, index, 2);
	}

	/**
	 * 将int型数据插入到指定索引的字节数组中
	 * 
	 * @param index
	 *            索引
	 * @param values
	 *            字节数组
	 * @param value
	 *            需要插入的值
	 */
	public static void insert(int index, byte[] values, int value) {
		byte[] bt = NumberUtil.toBytes(value);
		System.arraycopy(bt, 0, values, index, 4);
	}

	/**
	 * 将long型数据插入到指定索引的字节数组中
	 * 
	 * @param index
	 *            索引
	 * @param values
	 *            字节数组
	 * @param value
	 *            需要插入的值
	 */
	public static void insert(int index, byte[] values, long value) {
		byte[] bt = NumberUtil.toBytes(value);
		System.arraycopy(bt, 0, values, index, 8);
	}

	/**
	 * 将字节转换成整型
	 * 
	 * @param value
	 *            字节类型值
	 * @return
	 */
	public static int byteToInt(byte value) {
		if (value < 0) {
			return value + 256;
		}
		return value;
	}
}
