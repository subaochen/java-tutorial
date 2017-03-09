package cn.edu.sdut.softlab.essentials;

import java.util.Scanner;

/**
 * Created by subaochen on 17-3-9.
 * @TODO 无法处理任意位数数字
 * @TODO 改用循环处理
 * @TODO 使用递归处理
 * @TODO 在集合类中，再次编写此程序
 */
public class Money {

	public static final String[] CHINESE_NUMBER = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "扒", "玖"};

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("请在光标处输入待转换的数字(小于10000000)，保留1位小数：");
		String input = console.nextLine();

		int dotPos = input.indexOf('.'); // 小数点位位置
		StringBuffer buf;//StringBuffer功能强于String,字符串的长度可以改度。
		if ((dotPos + 1) == input.length())
			buf = new StringBuffer("元零角零分");
		else {
			if ((dotPos + 2) == input.length())
				buf = new StringBuffer("元" + translate(input.substring(dotPos + 1, dotPos + 2)) + "角" + "零分");
			else
				buf = new StringBuffer("元" + translate(input.substring(dotPos + 1, dotPos + 2)) + "角" + translate(input.substring(dotPos + 2, dotPos + 3)) + "分");
		}

		buf.ensureCapacity(25);
		buf.insert(0, translate(input.substring(dotPos - 1, dotPos)));
		if ((dotPos - 2) >= 0) {
			if (translate(input.substring(dotPos - 2, dotPos - 1)) != "零")
				buf.insert(0, translate(input.substring(dotPos - 2, dotPos - 1)) + "拾");
			else
				buf.insert(0, translate(input.substring(dotPos - 2, dotPos - 1)));
		}
		if ((dotPos - 3) >= 0) {
			if (translate(input.substring(dotPos - 3, dotPos - 2)) != "零")
				buf.insert(0, translate(input.substring(dotPos - 3, dotPos - 2)) + "佰");
			else
				buf.insert(0, translate(input.substring(dotPos - 3, dotPos - 2)));
		}
		if ((dotPos - 4) >= 0) {
			if (translate(input.substring(dotPos - 4, dotPos - 3)) != "零")
				buf.insert(0, translate(input.substring(dotPos - 4, dotPos - 3)) + "仟");
			else
				buf.insert(0, translate(input.substring(dotPos - 4, dotPos - 3)));
		}
		if ((dotPos - 5) >= 0) {
			if (translate(input.substring(dotPos - 5, dotPos - 4)) != "零")
				buf.insert(0, translate(input.substring(dotPos - 5, dotPos - 4)) + "万");
			else
				buf.insert(0, translate(input.substring(dotPos - 5, dotPos - 4)));
		}
		if ((dotPos - 6) >= 0) {
			if (translate(input.substring(dotPos - 6, dotPos - 5)) != "零")
				buf.insert(0, translate(input.substring(dotPos - 6, dotPos - 5)) + "拾");
			else
				buf.insert(0, translate(input.substring(dotPos - 6, dotPos - 5)));
		}
		if ((dotPos - 7) >= 0) {
			if (translate(input.substring(dotPos - 7, dotPos - 6)) != "零")
				buf.insert(0, translate(input.substring(dotPos - 7, dotPos - 6)) + "佰");
			else
				buf.insert(0, translate(input.substring(dotPos - 7, dotPos - 6)));
		}
		if ((dotPos - 8) >= 0) {
			if (translate(input.substring(dotPos - 8, dotPos - 7)) != "零")
				buf.insert(0, translate(input.substring(dotPos - 8, dotPos - 7)) + "仟");
			else
				buf.insert(0, translate(input.substring(dotPos - 8, dotPos - 7)));
		}
		//处理可能出现两个零的情况
		for (int i = buf.indexOf("零"); i < buf.indexOf("元") - 1; i++) {
			if (i > 0 && buf.charAt(i) == '零' && buf.charAt(i + 1) == '零')
				buf.deleteCharAt(i);
		}
		System.out.println(buf);
	}

	public static String translate(String number) {
		return CHINESE_NUMBER[Integer.parseInt(number.substring(0,1))];
	}

}
