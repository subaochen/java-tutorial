package cn.edu.sdut.softlab.threadlocal;

/**
 * Created by subaochen on 17-2-15.
 */
public class SafeThreadLocalDemo {
    static ThreadLocal<Integer> sum = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return new Integer(0);
        }
    };

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            TestThread thread = new TestThread(String.valueOf(i));
            thread.start();
        }
    }

    static class TestThread extends Thread {

        String name;

        public TestThread(String name) {
            super(name);
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                sleep(50);
                sum.set(sum.get() + 5);
            }
            System.out.println("safe thread " + name + ":" + sum.get());
        }

        private void sleep(int ms) {
            try {
                Thread.sleep((long) (Math.random() * ms));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
