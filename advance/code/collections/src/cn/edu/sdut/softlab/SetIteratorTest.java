package cn.edu.sdut.softlab;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by subaochen on 17-1-30.
 */
public class SetIteratorTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("language");
        set.add("is");
        set.add("not");
        set.add("good");

        // 使用Iterator遍历set，并将包含not的元素删除
        for (Iterator<String> it = set.iterator(); it.hasNext(); ) { //|\longremark{使用for循环，注意初始化Iterator对象it的方法；也需要注意for循环的第三个表达式是空的}|
            String item = it.next(); // |\longremark{读取游标右边的元素，并将游标移动到下一个位置}|
            if (item.contains("not")) {
                it.remove(); // |\longremark{删除游标左边的元素：注意，通常此时游标已经通过next移动到了下一个位置！}|
            }
        }

        System.out.println(set);
    }
} // |\showremarks|

