package cn.edu.sdut.softlab.contention;

/**
 * Created by subaochen on 17-2-13.
 */
public class Client {
    private static int TIMES = 50; // 测试的次数
    private static int NUM_OF_THREAD = 1000;
    static Thread[] threads = new Thread[NUM_OF_THREAD];

    public static void main(String[] args){
        for(int time = 0; time < TIMES; time++) {
            final Account acc = new Account("John", 1000.0f);
            for (int i = 0; i < NUM_OF_THREAD; i++) {
                threads[i] = new Thread(new Runnable() {
                    public void run() {
                        acc.withdraw(100.0f);
                        acc.deposit(100.0f);

                    }
                });
                threads[i].start();
            }

            for (int i = 0; i < NUM_OF_THREAD; i++) {
                try {
                    threads[i].join(); //等待所有线程运行结束
                } catch (InterruptedException e) {
                    // ignore
                }
            }
            System.out.println("Finally, John's balance is:" + acc.getBalance());
        }
    }
}
