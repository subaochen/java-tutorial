package cn.edu.sdut.softlab.oopbasic;

/**
 * Created by subaochen on 17-1-14.
 */
public class Dog extends Animal {
	public void hello() {
		System.out.println("dog say hello.");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.hello();
	}
}


class Animal {
	public void hello() {
		System.out.println("animal say hello.");
	}
}
