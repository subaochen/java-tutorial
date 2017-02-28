package cn.edu.sdut.softlab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAllTest {

    public static void main(String[] args) {
        List<Number> nums = new ArrayList<Number>();
        List<Integer> ints = Arrays.asList(1, 2);
        List<Double> dbls = Arrays.asList(3.45, 1.78);
        nums.addAll(ints);
        nums.addAll(dbls);
        assert nums.toString().equals("[1, 2, 3.45, 1.78]");

        List<Integer> integers = new ArrayList<Integer>();
        List<Double> doubles = Arrays.asList(2.3,4.5);
        //integers.addAll(doubles);
    }
}
