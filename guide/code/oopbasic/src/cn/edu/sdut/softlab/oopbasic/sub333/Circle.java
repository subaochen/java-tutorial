package cn.edu.sdut.softlab.oopbasic.sub333;

public class Circle {

	static final double PI = 3.14159;
	Point origin = new Point(0, 0); //
	float radius;

	double area() {
		return PI * radius * radius;
	}

}
