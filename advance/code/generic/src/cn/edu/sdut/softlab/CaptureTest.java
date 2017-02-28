package cn.edu.sdut.softlab;

import java.util.Arrays;
import java.util.List;

/**
 * Created by subaochen on 17-1-12.
 */
public class CaptureTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "string");
        foo(list);
    }

    static void foo(List<?> list) {
        //list.set(0, list.get(0));
        fooHelper(list);
    }

    private static <T> void fooHelper(List<T> list) {
        list.set(0, list.get(0));
    }
}
