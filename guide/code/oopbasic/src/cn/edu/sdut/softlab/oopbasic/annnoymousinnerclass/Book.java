package cn.edu.sdut.softlab.oopbasic.annnoymousinnerclass;

/**
 * 本类匿名内部类的父类.
 *
 * @author Su Baochen
 */
public class Book {
	private String title;

	public Book(String title) {
		this.title = title;
	}

	public void publish() {
		System.out.println("publish the book[" + title + "]");
	}
}
