package cn.edu.sdut.softlab.unsynced;

import java.util.Random;

/**
 * Created by subaochen on 17-2-13.
 */
public class Counter {
    private int c = 0;

    public void increment() {
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

    public void decrement() {
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
}
