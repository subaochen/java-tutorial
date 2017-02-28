package cn.edu.sdut.softlab.oopbasic.annnoymousinnerclass;

/**
 * 本类演示匿名内部类的用法 .
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
		// 匿名内部类，是Book的子类
		// 这里同时使用了匿名对象
		new Book("Learning Java Based on C") {
			private void edit() {
				System.out.println("edit the book before publishing");
			}

			@Override
			public void publish() {
				edit();
				super.publish();
			}
		}.publish();

	}

}
