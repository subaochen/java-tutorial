package cn.edu.sdut.softlab.oopbasic.nestedclass;

/**
 * 本类演示了静态内部类.
 *
 * @author Su Baochen
 */
public class Book {

	private int id;
	private String title;
	private float price;
	private static final int VERSION = 1;

	public Book(String title) {
		this.title = title;
	}

	public void publish() {
		new Editor("someone").edit(); // |\longremark{在外部包围类中可以调用静态内部类中的任何方法，包括private方法}|
		System.out.println("publish the book[" + title + "]");
	}

	static class Editor {

		private String editor;

		public Editor(String name) {
			this.editor = name;
		}

		// @TODO 尝试修改edit方法的访问控制修饰符看看？
		// private的内部类方法不能在Client中创建的Editor对象调用，
		// 但是可以在外部包围类中调用
		private void edit() {
			//System.out.println(title); // |\longremark{不允许访问包围类的非静态属性}|
			System.out.println("edit the book[version=" + VERSION + "] by " + editor); // |\longremark{VERSION在外部包围类中是静态属性，因此在静态内部类中可见}|
		}

		public void usage() {
			System.out.println("Book.Editor.usage() called");
		}

	}

}
// |\showremarks|
