package cn.edu.sdut.softlab.threadlocal;

/**
 * Created by subaochen on 17-2-15.
 */
public class UnsafeThreadDemo {
    private static int sum = 0;

    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            TestThread thread = new TestThread(String.valueOf(i));
            thread.start();
        }
    }

    static class TestThread extends Thread {

        private String name;

        public TestThread(String name) {
            super(name);
            this.name = name;
        }

        @Override
        public void run() {
            sleep(50);
            for (int i = 0; i < 10; i++) {
                sum += 5;
            }
            System.out.println("unsafe thread " + name + ":" + sum);
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
