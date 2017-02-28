package cn.edu.sdut.softlab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by subaochen on 17-1-30.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("language");
        list.add("is");
        list.add("not");
        list.add("funny");

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            if(it.next().contains("not")) it.remove();
        }

        System.out.println(list);
    }
}
