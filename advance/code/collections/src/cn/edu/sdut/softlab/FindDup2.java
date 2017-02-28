package cn.edu.sdut.softlab;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by subaochen on 17-1-21.
 */
public class FindDup2 {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        for (String a : args)
            if (!uniques.add(a)) // 如果add方法返回false表明uniques中已经存在单词a，因此将a保存到dups中
                dups.add(a);

        uniques.removeAll(dups); // 在for循环中，uniques已经获取了所有的单词，因此和dups的差即只出现一次的单词集合

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}
