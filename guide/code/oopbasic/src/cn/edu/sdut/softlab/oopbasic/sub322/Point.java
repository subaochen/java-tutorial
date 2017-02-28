package cn.edu.sdut.softlab.oopbasic.sub322;

public class Point {

	int x;
	int y;

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
