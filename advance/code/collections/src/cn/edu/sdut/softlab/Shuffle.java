package cn.edu.sdut.softlab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by subaochen on 17-1-23.
 * 本例来自java tutorial
 */
public class Shuffle {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 下面的for循环可以使用Arrays.asList替代，更简洁和高效
        // list = Arrays.asList(args);
        for (String a : args)
            list.add(a);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
