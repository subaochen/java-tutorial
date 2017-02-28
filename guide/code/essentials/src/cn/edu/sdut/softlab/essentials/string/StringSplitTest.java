package cn.edu.sdut.softlab.essentials.string;

/**
 * 本类演示了split方法的用法.
 *
 * @author Su Baochen
 */
public class StringSplitTest {

	/**
	 * 程序执行入口.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		String str = "root:x:0:0:root:/root:/bin/bash";
		String[] result = str.split(":");
		for (String s : result) {
			System.out.println(s);
		}
	}
}
