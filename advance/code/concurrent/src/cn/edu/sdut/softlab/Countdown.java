package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 17-2-10.
 */
public class Countdown {
    public static final int COUNTER = 10;
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < COUNTER ; i++) {
            System.out.println(COUNTER - i);
            Thread.sleep(1000); // 暂停执行1000ms
        }
    }
}
