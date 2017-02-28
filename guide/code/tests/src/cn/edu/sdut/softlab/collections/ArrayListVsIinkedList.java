package cn.edu.sdut.softlab.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by subaochen on 17-1-22.
 */
public class ArrayListVsIinkedList {
    public static final int NUM_ADD = 200000; // add测试次数
    public static final int NUM_GET = 10000; // get测试次数
    public static final int NUM_REMOVE = 1000; // remove测试次数

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // ArrayList add
        long startTime = System.nanoTime();

        for (int i = 0; i < NUM_ADD; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add:  " + duration);

        // LinkedList add
        startTime = System.nanoTime();

        for (int i = 0; i < NUM_ADD; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add: " + duration);

        // ArrayList get
        startTime = System.nanoTime();

        for (int i = 0; i < NUM_GET; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get:  " + duration);

        // LinkedList get
        startTime = System.nanoTime();

        for (int i = 0; i < NUM_GET; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get: " + duration);


        // ArrayList remove
        startTime = System.nanoTime();

        for (int i = NUM_REMOVE; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove:  " + duration);


        // LinkedList remove
        startTime = System.nanoTime();

        for (int i = NUM_REMOVE; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove: " + duration);
    }
}
