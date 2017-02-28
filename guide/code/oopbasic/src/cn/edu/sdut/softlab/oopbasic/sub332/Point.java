package cn.edu.sdut.softlab.oopbasic.sub332;

/**
 * 这个例子演示了覆盖默认构造方法时的情形.
 *
 * @author SuBaochen:subaochen@126.com
 */
public class Point {

	int x;
	int y;

	Point() {
		x = 10;
		y = 10;
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
