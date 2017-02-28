package cn.edu.sdut.softlab;

import java.util.Comparator;

/**
 * Created by subaochen on 16-12-27.
 */
public class GenericExtendsComparableTest {
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) { //|\longremark{限定类型参数必须是实现了Comparable接口的类}|
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0) // |\longremark{借助于Comparable接口的compareTo方法判断两个对象的大小}|
                ++count;
        return count;
    }
} //|\showremarks|
