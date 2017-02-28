package cn.edu.sdut.softlab.contention.synced1;

import java.util.Random;

/**
 * Created by subaochen on 17-2-13.
 */
public class Counter {
    private int c = 0;

    public synchronized void increment() { // |\longremark{比较cn.edu.sdut.softlab.contention包中的Counter类，增加了synchronized修饰符是唯一的变化}|
        System.out.println("#increment()");
        sleep();
        int temp = c;
        System.out.println("#increment() - after get value from c to temp:" + c);
        sleep();
        temp++;
        System.out.println("#increment() - after temp++:" + temp);
        sleep();
        c = temp;
        sleep();
        System.out.println("#increment() - after store c to new value:" + temp);
    }

    public synchronized void decrement() { // |\longremark{同样的，decrement也需要使用synchronized修饰，这是decrement方法唯一的变化}|
        System.out.println("*decrement()");
        sleep();
        int temp = c;
        System.out.println("*decrement() - after get value from c to temp:" + temp);
        sleep();
        temp--;
        System.out.println("*decrement() - after temp--:" + temp);
        sleep();
        c = temp;
        sleep();
        System.out.println("*decrement() - after store c to new value:" + temp);
    }

    public int value() {
        return c;
    }

    private void sleep() {
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            return;
        }
    }
} // |\showremarks|
