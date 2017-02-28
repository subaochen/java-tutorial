package cn.edu.sdut.softlab.essentials.string;

/**
 * 本类演示了String类的字符串匹配相关方法 .
 *
 * @author Su Baochen
 */
public class StringMatchTest {

	/**
	 * 程序执行入口.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		String str = "Java programming language";
		System.out.println(str.startsWith("Java")); //true
		System.out.println(str.endsWith("language"));//true
		System.out.println(str.contains("prog"));//true
		System.out.println(str.matches("[Jj]ava.*")); //true，也能匹配java programming language
	}

}
