package cn.edu.sdut.softlab.concurrency;

// IMPORTANT!  请根据不同的测试情形打开相应的import语句
// 用于无同步保护情形
//import cn.edu.sdut.softlab.concurrency.nosync.BankAccount;
// 用于同步锁定冲突方法情形
//import cn.edu.sdut.softlab.concurrency.syncMethod.BankAccount;
// 用于同步锁定对象情形
import cn.edu.sdut.softlab.concurrency.syncObject.BankAccount;

/**
 * 模拟朱丽叶取钱
 */
public class WithdrawThread implements Runnable{
    private BankAccount bankAccount;

    public WithdrawThread(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++)
            bankAccount.withdraw(10);
    }
}
