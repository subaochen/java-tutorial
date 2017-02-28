package cn.edu.sdut.softlab.oopbasic.objref;

/**
 * Created by subaochen on 17-2-26.
 */
public class Client1 {
	public static void main(String[] args) {
		Person zhangsan1 = new Person("zhangsan","123");
		Person zhangsan2 = new Person("zhangsan","123");
		Person zhangsan3 = zhangsan1;
		System.out.println("zhangsan1 == zhangsan2 ? " + (zhangsan1 == zhangsan2));
		System.out.println("zhangsan3 == zhangsan1 ? " + (zhangsan3 == zhangsan1));
	}
}
