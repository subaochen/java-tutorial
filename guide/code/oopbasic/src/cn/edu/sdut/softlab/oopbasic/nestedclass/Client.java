package cn.edu.sdut.softlab.oopbasic.nestedclass;

/**
 * 本类演示了静态内部类对象的创建和使用方式 .
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
		Book book = new Book("Learning Java based on C");
		book.publish();
		Book.Editor editor = new Book.Editor("somebody");
		editor.usage();

	}
}
