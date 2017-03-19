package cn.edu.sdut.softlab.interview;

/**
 * Created by subaochen on 17-3-19.
 */
public class StaticDispatch {
	static abstract class Human {}
	static class Man extends Human {}
	static class Woman extends Human {}

	public void sayHello(Human guy) {
		System.out.println("hello, guy!");
	}

	public void sayHello(Man guy) {
		System.out.println("hello, man!");
	}

	public void sayHello(Woman guy) {
		System.out.println("hello, woman!");
	}

	public static void main(String[] args) {
		Human man = new Man();
		Human woman = new Woman();
		StaticDispatch sd = new StaticDispatch();
		sd.sayHello(man);
		sd.sayHello(woman);
		sd.sayHello((Man)man);
		//sd.sayHello((Woman)man); // 请说明这一行会发生什么现象？
	}
}
