package cn.edu.sdut.softlab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by subaochen on 17-1-30.
 */
public class MapIterator {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        for (Iterator<Integer> it = map.keySet().iterator(); it.hasNext(); ) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }

        System.out.println(map);
    }
}
