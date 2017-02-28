package cn.edu.sdut.softlab.oopbasic.staticvariable;

/**
 * 本类示例静态属性的定义方式.
 *
 * @author Su Baochen
 */
public class Book {

	int id;
	String title;
	String author;
	float price;
	static int nextId; //|\longremark{类属性，在所有独享之间共享的变量}|

	// 初始化静态属性，这里设置id的起点值
	static { // |\longremark{初始化类属性，在整个应用程序运行期间只会调用一次}|
		nextId = 100;
	}

	@Override
	public String toString() {
		return "Book{" + "id=" + id + ", title=" + title + ", author=" + author
				+ ", price=" + price + '}';
	}

}
// |\showremarks|
