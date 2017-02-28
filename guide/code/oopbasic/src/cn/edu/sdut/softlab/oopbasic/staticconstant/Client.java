package cn.edu.sdut.softlab.oopbasic.staticconstant;

/**
 * 演示如何使用静态常量.
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
		// 常见用法
		System.out.println(Book.CHAPTER_ONE);
		// 下面是不建议的用法，尽量避免
		Book book = new Book();
		System.out.println(book.CHAPTER_ONE);
	}

}
