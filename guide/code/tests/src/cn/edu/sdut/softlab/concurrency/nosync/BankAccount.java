package cn.edu.sdut.softlab.concurrency.nosync;

import java.util.Random;

/**
 * 模拟银行账户
 * @TODO 忽略了余额<0时的处理
 */
public class BankAccount {
    private String name;
    private float balance;
    private String account;

    public BankAccount(String name, String account, float balance) {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    /**
     * 取钱
     *
     * @param money 取钱数额
     */
    public void withdraw(float money) {
        float temp = this.balance;
        temp -= money;
        sleep(); // 模拟银行繁复耗时的操作流程，注意在withdraw休眠期间，this.balance可能已经被deposit“悄悄”修改
        this.balance = temp;
        System.out.println("-" + Thread.currentThread().getName() + "取钱：" + money);
    }

    /**
     * 存钱
     *
     * @param money 存钱数额
     */
    public void deposit(float money) {
        float temp = this.balance;
        temp += money;
        sleep(); // 模拟银行繁复耗时的操作流程
        this.balance = temp;
        System.out.println("+" + Thread.currentThread().getName() + "存钱：" + money);
    }

    public float getBalance() {
        return this.balance;
    }

    private void sleep() {
        try {
            Thread.sleep(new Random().nextInt(500));
        } catch (InterruptedException e) {
            //
        }
    }
}
