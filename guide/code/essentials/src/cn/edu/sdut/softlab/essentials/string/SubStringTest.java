package cn.edu.sdut.softlab.essentials.string;

/**
 * 本类演示了substring方法的用法 .
 *
 * @author Su Baochen
 */
public class SubStringTest {

	/**
	 * 程序执行入口.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		String str = "java programming language,";
		System.out.println(str.substring(5)); // 输出programming language
		System.out.println(str.substring(5, 17)); // 输出programing
		// 输出java programming language
		System.out.println(str.substring(0, str.length() - 1));
	}
}
