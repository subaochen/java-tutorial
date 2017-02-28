package cn.edu.sdut.softlab.oopbasic.inherit.step4;

public class BankCard extends Card {

	String username;
	String password;

	BankCard() {
		System.out.println("BankCard constructor called");
	}

	public BankCard(String cardNo) {
		super(cardNo);
		System.out.println("BankCard constructor called,cardNo=" + cardNo);
	}

	void deposit() {
		// 存钱
	}

	void withdraw() {
		// 取钱
	}
}
