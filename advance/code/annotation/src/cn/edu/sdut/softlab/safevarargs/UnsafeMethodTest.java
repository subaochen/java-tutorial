package cn.edu.sdut.softlab.safevarargs;

import java.util.Arrays;
import java.util.List;

/**
 * Created by subaochen on 17-4-3.
 * 本例取自SafeVarargs的javadoc文档
 */
public class UnsafeMethodTest {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("abc", "def");
        unsafeMethod(str);
    }

    @SafeVarargs // 其实并不安全！
    static void unsafeMethod(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList; // 试图将一个List对象赋值给字符串，显然在语法上是错误的，但是由于使用了@SafeVarargs，编译器不做类型检查，能够编译通过
        String s = stringLists[0].get(0); // 运行时抛出ClassCastException！
    }
}
