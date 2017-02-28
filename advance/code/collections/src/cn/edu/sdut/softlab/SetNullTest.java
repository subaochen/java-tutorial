package cn.edu.sdut.softlab;

import java.util.HashSet;
import java.util.Set;

public class SetNullTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        System.out.println("add null:" + set.add(null));
        System.out.println("add null again:" + set.add(null));
        System.out.println("set size:" + set.size());
        System.out.println("remove null:" + set.remove(null));
        System.out.println("set size:" + set.size());
        System.out.println("remove null again:" + set.remove(null));
        System.out.println("set size:" + set.size());
    }
}
