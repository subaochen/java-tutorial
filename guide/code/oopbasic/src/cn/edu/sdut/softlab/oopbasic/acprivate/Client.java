package cn.edu.sdut.softlab.oopbasic.acprivate;

public class Client {

	public static void main(String[] args) {
		BankCard card = new BankCard();
		//card.username = "zhangsan";
		//card.password = "123456"; // 不可直接修改密码

		card.withdraw(); // 取钱畅通无阻！
		card.deposit(); // 除了爹妈，还有谁往我的卡里存钱呢？！
	}

}
