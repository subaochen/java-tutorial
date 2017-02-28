package cn.edu.sdut.softlab.essentials.string;

/**
 * 本类演示了String类的常见用法 .
 *
 * @author Su Baochen
 */
public class Client {

	/**
	 * 程序执行入口.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		String hello = "Hello World!";
		print(hello);
		print("Hello Java!");

		char[] data = {'a', 'b', 'c'};
		String str = new String(data);
		print(str);

		byte[] bytes = {97, 98, 99}; // ascii码表可查阅http://www.asciitable.com/
		String byteStr = new String(bytes);
		print(byteStr);
	}

	/**
	 * 打印字符串内容.
	 *
	 * @param str 字符串类型的输入参数
	 * @TODO 如何演示hello字符串是不变长度的？
	 */
	public static void print(String str) {
		System.out.println(str);
	}

}
