package cn.edu.sdut.softlab.oopbasic.inherit.step4;

import java.util.Date;

public class CreditCard extends BankCard {

	Date expired;

	CreditCard() {
		System.out.println("CreditCard constructor called");
	}

	public CreditCard(String cardNo) {
		super(); // |\longremark{通过super调用父类的不同构造方法来控制对象的创建过程：调用super()即调用父类的无参构造方法}|
		// super(cardNo); // |\longremark{通过super调用父类的不同构造方法来控制对象的创建过程：调用super(cardNo)即调用父类的参数类型和个数相同的构造方法}|
		System.out.println("CreditCard constructor called,cardNo=" + cardNo);
	}

	void overdraw() {
		// 透支消费
	}

}
// |\showremarks| 
