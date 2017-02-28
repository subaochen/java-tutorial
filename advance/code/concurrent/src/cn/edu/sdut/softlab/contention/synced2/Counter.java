package cn.edu.sdut.softlab.contention.synced2;

import java.util.Random;

/**
 * Created by subaochen on 17-2-13.
 */
public class Counter {
    private Integer c = 0;

    public void increment() {
        sleep();
        synchronized (c) {
            sleep();
            c++;
        }
        sleep();
    }

    public void decrement() {
        sleep();
        synchronized (c) {
            sleep();
            c--;
        }
        sleep();
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
