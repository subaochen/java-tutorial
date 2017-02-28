package cn.edu.sdut.softlab.oopbasic.staticconstant;

/**
 * 本类示例静态常量的惯用定义方式.
 *
 * @author Su Baochen
 */
public class Book {
	public static final String CHAPTER_ONE = "第一章";
	public static final String CHAPTER_TWO = "第二章";

	String title;
	String author;
	float price;

	@Override
	public String toString() {
		return "Book{" + "title=" + title + ", author=" + author + ", price=" + price + '}';
	}

}
