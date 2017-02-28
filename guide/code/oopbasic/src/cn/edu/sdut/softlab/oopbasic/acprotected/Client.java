package cn.edu.sdut.softlab.oopbasic.acprotected;

import cn.edu.sdut.softlab.oopbasic.acprotected.other.CreditCard;

public class Client {

	public static void main(String[] args) {
		CreditCard card = new CreditCard();


		card.withdraw();
		card.deposit();
	}

}
