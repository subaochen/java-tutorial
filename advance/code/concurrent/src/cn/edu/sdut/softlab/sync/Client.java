package cn.edu.sdut.softlab.sync;

/**
 * Created by subaochen on 17-2-13.
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer();
        Producer p = new Producer(buffer);
        Thread pt = new Thread(p);
        pt.start();

        Consumer c = new Consumer(buffer);
        Thread ct = new Thread(c);
        ct.start();

        Thread.sleep(5000); // 让两个线程最多运行5s
        pt.interrupt();
        ct.interrupt();
    }
}
