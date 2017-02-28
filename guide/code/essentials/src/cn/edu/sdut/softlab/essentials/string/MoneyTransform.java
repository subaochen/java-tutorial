package cn.edu.sdut.softlab.essentials.string;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 本类将数字货币转换为中文货币形式 .
 *
 * @author Su Baochen
 */
public class MoneyTransform {

	private static final Map<String, String> digitDict = new HashMap<String, String>();

	static {
		digitDict.put("0", "零");
		digitDict.put("1", "壹");
		digitDict.put("2", "贰");
		digitDict.put("3", "叁");
		digitDict.put("4", "肆");
		digitDict.put("5", "伍");
		digitDict.put("6", "陆");
		digitDict.put("7", "柒");
		digitDict.put("8", "捌");
		digitDict.put("9", "玖");
		digitDict.put("10", "拾");
	}

	/**
	 * 转换
	 *
	 * @param obj
	 * @return
	 */
	public static String upper(String obj) {
		if (obj.length() > 17) {
			return "Can not process it!";
		}
		if (obj.length() <= 17 && obj.length() > 16) {
			StringBuffer sb = new StringBuffer();
			BigDecimal db10000 = new BigDecimal("10000000000000000");
			BigDecimal bd = new BigDecimal(obj);
			BigDecimal yushu = bd.remainder(db10000);
			BigDecimal shang = bd.divideToIntegralValue(db10000);
			if (yushu.toString().equals("0")) {
				return sb.append(getYuanzi(shang.toString())).append("亿").append("亿").toString();
			}
			if (yushu.toString().length() < 12) {
				return sb.append(getYuanzi(shang.toString())).append("亿").append("亿").append(upper(yushu.toString()))
						.toString();
			}
			return sb.append(getYuanzi(shang.toString())).append("亿").append(upper(yushu.toString())).toString();
		}
		if (obj.length() <= 16 && obj.length() > 12) {
			StringBuffer sb = new StringBuffer();
			BigDecimal db10000 = new BigDecimal("1000000000000");
			BigDecimal bd = new BigDecimal(obj);
			BigDecimal yushu = bd.remainder(db10000);
			BigDecimal shang = bd.divideToIntegralValue(db10000);
			if (yushu.toString().equals("0")) {
				return sb.append(getYuanzi(shang.toString())).append("万").append("亿").toString();
			}
			if (yushu.toString().length() < 8) {
				return sb.append(getYuanzi(shang.toString())).append("万").append("亿").append(upper(yushu.toString()))
						.toString();
			}
			return sb.append(getYuanzi(shang.toString())).append("万").append(upper(yushu.toString())).toString();
		}
		if (obj.length() <= 12 && obj.length() > 8) {
			StringBuffer sb = new StringBuffer();
			BigDecimal db10000 = new BigDecimal("100000000");
			BigDecimal bd = new BigDecimal(obj);
			BigDecimal yushu = bd.remainder(db10000);
			BigDecimal shang = bd.divideToIntegralValue(db10000);
			if (yushu.toString().length() == 1 && !yushu.toString().equals("0")) {
				return sb.append(getYuanzi(shang.toString())).append("亿").append("零").append(upper(yushu.toString()))
						.toString();
			}
			return sb.append(getYuanzi(shang.toString())).append("亿").append(upper(yushu.toString())).toString();
		}
		if (obj.length() <= 8 && obj.length() > 4) {
			StringBuffer sb = new StringBuffer();
			BigDecimal db10000 = new BigDecimal("10000");
			BigDecimal bd = new BigDecimal(obj);
			BigDecimal yushu = bd.remainder(db10000);
			BigDecimal shang = bd.divideToIntegralValue(db10000);
			if (yushu.toString().length() == 1 && !yushu.toString().equals("0")) {
				return sb.append(getYuanzi(shang.toString())).append("万").append("零").append(upper(yushu.toString()))
						.toString();
			}
			return sb.append(getYuanzi(shang.toString())).append("万").append(upper(yushu.toString())).toString();
		}
		if (obj.length() <= 4) {
			StringBuffer sb = new StringBuffer();
			return sb.append(getYuanzi(obj)).toString();
		}
		String result = "";
		return result;
	}

	/**
	 * 格式化字符串中的零
	 *
	 * @param obj
	 * @return
	 */
	public static String format(String obj) {
		if (!obj.startsWith("0")) {
			return obj;
		}
		Pattern p = Pattern.compile("^0*");
		Matcher m = p.matcher(obj);
		String result = null;
		if (m.find()) {
			result = obj.substring(m.start() + 1);
			m.replaceFirst("");
		}
		if (result.startsWith("0")) {
			return format(result);
		}
		return result;
	}

	/**
	 * 递归调用的原子方法，以万位进位
	 *
	 * @param obj
	 * @return
	 */
	public static String getYuanzi(String obj) {
		String format = format(obj);
		StringBuffer sb = new StringBuffer();
		if (format.length() == 0) {
			return sb.toString();
		}
		if (obj.equals("0") && obj.length() == 1) {
			return sb.toString();
		}
		if (format.length() != obj.length()) {
			sb.append("零");
		}
		if (format.length() == 4) {
			String qian = format.substring(0, 1);
			String shengxia = format.substring(1);
			return sb.append(digitDict.get(qian)).append("千").append(getYuanzi(shengxia)).toString();
		}
		if (format.length() == 3) {
			String qian = format.substring(0, 1);
			String shengxia = format.substring(1);
			return sb.append(digitDict.get(qian)).append("佰").append(getYuanzi(shengxia)).toString();
		}
		if (format.length() == 2) {
			String qian = format.substring(0, 1);
			String shengxia = format.substring(1);
			return sb.append(digitDict.get(qian)).append("拾").append(getYuanzi(shengxia)).toString();
		}
		if (format.length() == 1) {
			String qian = format.substring(0, 1);
			if (qian.equals("0")) {
				return sb.toString();
			}
			String shengxia = format.substring(1);
			return sb.append(digitDict.get(qian)).append(getYuanzi(shengxia)).toString();
		}
		return sb.toString();
	}

	/**
	 * 程序执行入口. 此处的main方法相当于一个测试主体。如果懂junit，使用junit等测试工具写 测试用例更好一些。
	 *
	 * @param args 命令行参数
	 */

	public static void main(String[] args) {
		System.out.println(upper("45678123410000010"));
		System.out.println(upper("40000100000100001"));
		System.out.println(upper("40000000000000000"));
		System.out.println(upper("4000000000000"));
		System.out.println(upper("4000000000001"));
		System.out.println(upper("4000001000101"));
		System.out.println(upper("400000000"));
		System.out.println(upper("400000001"));
		System.out.println(upper("400010001"));
		System.out.println(upper("411110001"));
		System.out.println(upper("40000"));
		System.out.println(upper("40001"));
		System.out.println(upper("40101"));
	}

}
