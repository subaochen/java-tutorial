package cn.edu.sdut.softlab;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by subaochen on 17-1-22.
 */
public class ListBasic {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            list1.add(i);
            list2.add(i + 20);
        }

        System.out.println("list1 elements:" + list1);
        System.out.println("list2 elements:" + list2);
        list1.addAll(list2);
        System.out.println("list1 + list2 elements:" + list1);

        for(int i = 0; i < 20; i = i + 3) {
            System.out.println("read from list1, index = " + i + ", value = " + list1.get(i));
        }

        for(int i = 0; i < 20; i = i + 5) {
            System.out.println("will replace the " + i + " elements with: " + list1.get(i) * 5);
            list1.set(i, list1.get(i) * 5);
        }
        System.out.println("list1 elements now:" + list1);

        // 在第10个元素后插入一个新元素33
        // @TODO 此种情况下使用ArrayList的效率没有LinkedList高，尝试使用LinkedList替代
        list1.add(10,33);
        System.out.println("list1 elements after added:" + list1);

        // 删除第11个元素
        list1.remove(11);
        System.out.println("list1 elements after removed:" + list1);
    }
}
