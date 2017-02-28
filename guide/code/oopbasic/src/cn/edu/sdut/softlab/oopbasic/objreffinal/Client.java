package cn.edu.sdut.softlab.oopbasic.objreffinal;

public class Client {

	public static void main(String[] args) {
		Person person = new Person("zhangsan", "123456");
		person.seniority = 20;
		person.salary = 5000;
		System.out.println(person);

		adjustSalary(person); // |\longremark{对象作为函数的参数，实际上是将对象的引用（指针）传递给方法}|
		System.out.println(person);
	}

	public static void adjustSalary(Person person) {// |\longremark{形参和实参都是对象（引用），指向同一个对象}|
		if (person.seniority > 10) {
			person.salary += 1000; // |\longremark{这里修改的是形参引用指向的person对象的salary属性，但是记得形参和实参指向了同一个对象！}|
		}
	}
}
// |\showremarks|
