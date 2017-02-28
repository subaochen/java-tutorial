package cn.edu.sdut.softlab.oopbasic.ac;

public class BankCard {

	String username;
	String password;

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
