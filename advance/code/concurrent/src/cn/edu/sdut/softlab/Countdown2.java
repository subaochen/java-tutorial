package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 17-2-10.
 */
public class Countdown2 {
    public static final int COUNTER = 10;
    public static void main(String[] args){
        for(int i = 0; i < COUNTER ; i++) {
            System.out.println(COUNTER - i);
            try {
                Thread.sleep(1000); // 暂停执行1000ms
            } catch (InterruptedException e) {
                return; // 简单return即可，不然呢？
            }
        }
    }
}
