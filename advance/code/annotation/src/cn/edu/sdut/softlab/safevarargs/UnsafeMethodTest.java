package cn.edu.sdut.softlab.safevarargs;

import java.util.Arrays;
import java.util.List;

/**
 * Created by subaochen on 17-4-3.
 * 本例取自SafeVarargs的javadoc文档
 */
public class UnsafeMethodTest {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("one", "two");
        List<String> list2 = Arrays.asList("three","four");
        unsafeMethod(list1, list2);
    }

    @SafeVarargs // 其实并不安全！
    static void unsafeMethod(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42, 56);
        array[0] = tmpList; // tmpList是一个List对象（类型已经擦除），赋值给Object类型的对象是允许的（向上塑型），能够编译通过
        String s = stringLists[0].get(0); // 运行时抛出ClassCastException！
    }
}
