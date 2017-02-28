package cn.edu.sdut.softlab.oopbasic.sub322;

public class Draw {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		rect1.startPoint.x = 10;
		rect1.startPoint.y = 20;
		rect1.height = 10;
		rect1.width = 10;

		Circle circle1 = new Circle();
		circle1.origin.x = 10;
		circle1.origin.y = 20;
		circle1.radius = 10;

		System.out.println("rect1's area=" + rect1.area());
		System.out.println("circle1's area=" + circle1.area());

	}

}
