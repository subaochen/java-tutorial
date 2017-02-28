package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 17-2-10.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread is running...");
    }

    public static void main(String[] args) {
        new MyThread().start();
    }
}
