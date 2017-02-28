package cn.edu.sdut.softlab;

public class RunnableThread implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableThread());
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
