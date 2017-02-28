package cn.edu.sdut.softlab.oopbasic.sub332;


public class Circle {
	static final double PI = 3.14159;
	Point origin = new Point(); //
	float radius;

	double area() {
		return PI * radius * radius;
	}

}
