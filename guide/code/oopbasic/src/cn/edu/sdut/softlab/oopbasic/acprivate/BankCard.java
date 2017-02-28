package cn.edu.sdut.softlab.oopbasic.acprivate;

public class BankCard {

	private String username;
	private String password;

	BankCard() {
		System.out.println("BankCard constructor called");
	}

	void deposit() {
		// 存钱
	}

	void withdraw() {
		// 取钱
		System.out.println("钱被取走啦!");
	}
}
