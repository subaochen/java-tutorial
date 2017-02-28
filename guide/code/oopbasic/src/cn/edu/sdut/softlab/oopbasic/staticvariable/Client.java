package cn.edu.sdut.softlab.oopbasic.staticvariable;

/**
 * 演示如何使用静态属性.
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
		Book book1 = new Book();
		book1.title = "Thinking in Java";
		// 建议的静态属性使用方法
		book1.id = Book.nextId++;
		// 不建议的使用静态属性的方法
		//book1.id = book1.nextId++;
		System.out.println(book1);

		Book book2 = new Book();
		book2.title = "Design Patterns";
		book2.id = Book.nextId++;
		System.out.println(book2);
	}

}
