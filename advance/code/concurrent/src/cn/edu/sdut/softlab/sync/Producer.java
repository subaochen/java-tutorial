package cn.edu.sdut.softlab.sync;

/**
 * Created by subaochen on 17-2-13.
 */
public class Producer implements Runnable {
    private Buffer buffer;
    private int counter = 0;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(counter < 5) {
            synchronized (buffer) {
                while (!buffer.isEmpty()) {
                    try {
                        buffer.wait(); // not producer.wait!
                    } catch (InterruptedException e) {
                        return;
                    }
                }

                buffer.set(counter++);
                buffer.setEmpty(false);
                System.out.println("producer value: " + buffer.get());
                buffer.notifyAll();
            }
        }
    }
}
