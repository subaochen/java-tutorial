package cn.edu.sdut.softlab.concurrency;

// IMPORTANT!  请根据不同的测试情形打开相应的import语句
// 用于无同步保护情形
//import cn.edu.sdut.softlab.concurrency.nosync.BankAccount;
// 用于同步锁定冲突方法情形
//import cn.edu.sdut.softlab.concurrency.syncMethod.BankAccount;
// 用于同步锁定对象情形
import cn.edu.sdut.softlab.concurrency.syncObject.BankAccount;

/**
 * Created by subaochen on 17-2-21.
 */
public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("罗密欧与朱丽叶", "110", 1000);

        Thread withdrawThread = new Thread(new WithdrawThread(account), "罗密欧");
        Thread depositThread = new Thread(new DepositThread(account), "朱丽叶");
        withdrawThread.start();
        depositThread.start();

        try {
            withdrawThread.join();
            depositThread.join();
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

        System.out.println("Finally, balance=" + account.getBalance());
    }
}
