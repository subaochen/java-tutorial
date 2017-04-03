package cn.edu.sdut.softlab.safevarargs;

import java.util.ArrayList;

/**
 * Created by subaochen on 17-4-3.
 */
public class SafeVarargsTest {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(new Integer(1));
        a1.add(2);

        showArgs(a1, 12);
    }

    //@SafeVarargs
    public static <T> void showArgs(T... array) {
        for (T arg : array) {
            System.out.println(arg.getClass().getName() + ":" + arg);
        }
    }

}
