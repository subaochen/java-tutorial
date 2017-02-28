package cn.edu.sdut.softlab;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by subaochen on 17-1-21.
 */
public class FinDups {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}
