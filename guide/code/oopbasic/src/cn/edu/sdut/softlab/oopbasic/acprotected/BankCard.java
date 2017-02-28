package cn.edu.sdut.softlab.oopbasic.acprotected;

public class BankCard {

	protected String username;
	protected String password;

	public BankCard() {
		System.out.println("BankCard constructor called");
	}

	protected void deposit() {
		// 存钱
	}

	protected void withdraw() {
		// 取钱
		System.out.println("钱被取走啦!");
	}
}
