package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 17-2-12.
 */
public class AnonThreadDemo {
    public static void main(String[] args) {
        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        }, "MyThread").start();
    }
}
