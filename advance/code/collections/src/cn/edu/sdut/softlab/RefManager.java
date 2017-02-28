package cn.edu.sdut.softlab;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by subaochen on 17-1-30.
 */
public class RefManager {
    public static void main(String[] args) {
        Map<String, String> ref1 = new HashMap<>();
        ref1.put("java-effective", "Java Effective(2nd edition)");
        ref1.put("tij", "Thinking in Java(3th edition)");
        ref1.put("java-tutorial", "Oracle Java Torial");
        System.out.println("ref1 size:" + ref1.size() + "," + ref1);

        Map<String, String> ref2 = new HashMap<>();
        ref2.put("generics-collections", "Java Generics and Collections");
        ref2.put("tij", "Thinking in Java(4th edition");
        System.out.println("ref2 size:" + ref2.size() + "," + ref2);

        ref1.putAll(ref2); // 合并ref2到ref1中
        System.out.println("after putAll, ref1 size:" + ref1.size() + "," + ref1);
    }
}
