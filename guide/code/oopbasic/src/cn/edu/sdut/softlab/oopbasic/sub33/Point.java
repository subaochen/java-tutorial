package cn.edu.sdut.softlab.oopbasic.sub33;

public class Point {

	int x;
	int y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int newX, int newY) {
		x = newX;
		y = newY;
	}

	void setX(int newX) {
		x = newX;
	}

	void setY(int newY) {
		y = newY;
	}

	void moveTo(int newX, int newY) {
		setX(newX);
		setY(newY);
	}
}
