package cn.edu.sdut.softlab.interview;

/**
 * Created by subaochen on 17-3-20.
 */
public class DynamicDispatch {
	static abstract class Human {
		protected void sayHello() {
			System.out.println("hello, guy!");
		}
	}

	static class Man extends Human {
		@Override
		protected void sayHello() {
			System.out.println("hello, man!");
		}
	}

	static class Woman extends Human {
		@Override
		protected void sayHello() {
			System.out.println("hello, woman!");
		}
	}

	public static void main(String[] args) {
		Human man = new Man();
		Human women = new Woman();
		man.sayHello();
		women.sayHello();
		man = new Woman();
		man.sayHello();
	}
}

