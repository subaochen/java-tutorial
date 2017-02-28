package cn.edu.sdut.softlab.sync;

import java.util.Random;

/**
 * Created by subaochen on 17-2-13.
 */
public class Consumer implements Runnable {
    private Buffer buffer;
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Random random = new Random();
        while(true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        return;
                    }
                }

                System.out.println("consumer value: " + buffer.get());
                buffer.setEmpty(true);
                buffer.notifyAll();
            }
        }
    }
}
