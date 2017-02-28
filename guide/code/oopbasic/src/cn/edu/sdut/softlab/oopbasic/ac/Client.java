package cn.edu.sdut.softlab.oopbasic.ac;

public class Client {

	public static void main(String[] args) {
		BankCard card = new BankCard();
		card.username = "zhangsan";
		card.password = "123456"; // 哇塞，可以直接修改密码啊！

		card.withdraw(); // 取钱畅通无阻！
		card.deposit(); // 除了爹妈，还有谁往我的卡里存钱呢？！
	}

}
