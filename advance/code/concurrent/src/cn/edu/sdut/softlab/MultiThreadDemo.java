package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 17-2-10.
 */
public class MultiThreadDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MultiThreadDemo());
            thread.setName("Thread" + i); // 为了区分线程
            thread.start();
        }
    }
}
