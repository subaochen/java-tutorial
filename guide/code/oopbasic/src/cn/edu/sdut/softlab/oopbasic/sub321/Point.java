package cn.edu.sdut.softlab.oopbasic.sub321;

/**
 * 表达二维坐标的点.
 */
public class Point {

	int x;
	int y;

	/**
	 * 设置点的x坐标.
	 *
	 * @param newX
	 */
	void setX(int newX) {
		x = newX;
	}

	/**
	 * 设置点的y坐标.
	 *
	 * @param newY
	 */
	void setY(int newY) {
		y = newY;
	}

	/**
	 * 移动点(x,y)到(newX, newY).
	 *
	 * @param newX 新的x坐标
	 * @param newY 新的y坐标
	 */
	void moveTo(int newX, int newY) {
		setX(newX);
		setY(newY);
	}
}