package cn.edu.sdut.softlab.exception;

/**
 * Created by subaochen on 17-2-20.
 */
public class Client {
    public static void main(String[] args) {
        try {
            new Demo().test();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
