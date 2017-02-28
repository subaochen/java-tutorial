package cn.edu.sdut.softlab.oopbasic.inherit.step4;


public class DebitCard extends BankCard {
	float balance;

	DebitCard() {
		System.out.println("DebitCard constuctor called");
	}

	public DebitCard(String cardNo) {
		super(cardNo);
		System.out.println("DebitCard constuctor called,cardNo=" + cardNo);
	}
}
