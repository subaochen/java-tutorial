package cn.edu.sdut.softlab;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by subaochen on 17-1-27.
 */
public class WordFreq {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        // 根据单词的自然顺序排序
        //Map<String, Integer> m = new TreeMap<>();
        // 根据添加的顺序排序
        //Map<String, Integer> m = new LinkedHashMap<>();

        // 从命令行解析字符串并保存到map中
        for (String a : args) {
            Integer freq = m.get(a); // 根据Key获得指向的对象
            m.put(a, (freq == null) ? 1 : freq + 1); // 根据key保存指向的对象（value）。如果对象已经存在则覆盖
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}
