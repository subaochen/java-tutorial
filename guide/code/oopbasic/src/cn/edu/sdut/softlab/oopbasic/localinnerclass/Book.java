package cn.edu.sdut.softlab.oopbasic.localinnerclass;

/**
 * 本类演示了局部内部类的用法.
 *
 * @author Su Baochen
 */
public class Book {

	int version = 1;
	static int nextId;

	/**
	 * 发布图书.
	 */
	public void publish() {

		class Publisher {
			private void edit() {
				System.out.println("edit the book before publish");
			}

			public void publish() {
				edit();
				System.out.println("publish book[version=" + version + ",id=" + nextId++);
			}
		}

		new Publisher().publish();
	}

}
