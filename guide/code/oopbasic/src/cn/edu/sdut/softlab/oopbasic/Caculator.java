package cn.edu.sdut.softlab.oopbasic;

/**
 * Created by subaochen on 17-1-14.
 */
public class Caculator {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) { // |\longremark{参数个数不同}|
		System.out.println(a + b + c);
	}

	void sum(double a, double b) { // |\longremark{参数个数相同，但是参数类型不同}|
		System.out.println(a + b);
	}

	// void sum(int x, int y) {} // |\longremark{只是参数名字不同是不可以的！}|

	void sum(int a, double b) {
		System.out.println(a + b);
	}

	void sum(double a, int b) { // |\longremark{参数个数和类型相同，但是顺序不同是可以的}|
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Caculator cal = new Caculator();
		cal.sum(10, 10);
		cal.sum(10, 10, 10);
	}
} // |\showremarks|
