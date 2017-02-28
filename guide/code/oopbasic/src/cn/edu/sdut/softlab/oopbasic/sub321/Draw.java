package cn.edu.sdut.softlab.oopbasic.sub321;


public class Draw {

	public static void main(String[] args) {
		Point one = new Point();
		Point two = new Point();

		one.setX(1);
		one.setY(1);
		two.setX(2);
		two.setY(2);

		printPoint(one, two);

		one.moveTo(3, 3);
		two.moveTo(5, 0);

		printPoint(one, two);
	}

	static void printPoint(Point one, Point two) {
		System.out.println("one.x=" + one.x + ",one.y=" + one.y);
		System.out.println("two.x=" + two.x + ",two.y=" + two.y);
	}

}
