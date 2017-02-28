package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 17-2-12.
 */
public class ThreadInterruptDemo implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadInterruptDemo(), "My Thread");
        thread.start();
        Thread.sleep(5000); // |\longremark{主线程休眠5000ms}|
        System.out.println("in main - interrupt other thread");
        thread.interrupt(); // |\longremark{终止子线程My Thread}|
        System.out.println("in main - leaving");
    }

    @Override
    public void run() {
        while (true) {
            try {
                printDot();
            } catch (InterruptedException e) {
                System.out.println("in run() - " + Thread.currentThread().getName() + " is interrupted");
                break;
            }
        }

        System.out.println("in run() - thread done");
    }

    private void printDot() throws InterruptedException {// |\longremark{在run()方法中调用的方法，最好检测线程终止事件并抛出InterruptedException}|
        System.out.print(".");
        Thread.sleep(1000);
        if (Thread.interrupted()) throw new InterruptedException();
    }
} // |\showremarks|

