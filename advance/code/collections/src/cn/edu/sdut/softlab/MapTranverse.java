package cn.edu.sdut.softlab;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by subaochen on 17-1-30.
 */
public class MapTranverse {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");

        for(int key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));
        }

        // 通过Map.Entry可以在遍历Map时修改value的值
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            entry.setValue(entry.getValue() + " apple");
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
