package cn.edu.sdut.softlab.contention;

import java.util.Random;

/**
 * Created by subaochen on 17-2-13.
 */
public class Account {
    private String name; // 储户姓名
    private float balance; // 储户银行余额

    public Account(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(float money) {
        float tmp = this.balance;
        tmp += money;
        try {
            Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException e) {
            // ignore
        }
        this.balance = tmp;
    }

    public void withdraw(float money) {
        float tmp = this.balance;
        tmp -= money;
        try {
            Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException e) {
            // ignore
        }
        this.balance = tmp;
    }

    public float getBalance() {
        return this.balance;
    }
}
