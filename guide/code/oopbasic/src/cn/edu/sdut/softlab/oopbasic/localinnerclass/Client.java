package cn.edu.sdut.softlab.oopbasic.localinnerclass;

/**
 * 本类演示了局部内部类的用法 .
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
		Book book = new Book();
		book.publish(); // |\longremark{不能直接创建局部内部类的对象}|
	}
}
// |\showremarks|
