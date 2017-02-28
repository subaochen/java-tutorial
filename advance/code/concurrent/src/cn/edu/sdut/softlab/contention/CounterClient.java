package cn.edu.sdut.softlab.contention;

import java.util.Random;

/**
 * Created by subaochen on 17-2-13.
 */
public class CounterClient {

    public static void main(String[] args) {
        final Counter counter = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter.increment();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter.decrement();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join(); // main线程要等待t1执行完毕才能继续执行
            t2.join(); // main线程要等待t2执行完毕才能继续执行
        } catch (InterruptedException e) {
            // ignore
        }

        System.out.println("finally, c is " + counter.value());
    }
}
