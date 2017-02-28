package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 17-1-7.
 */
public class GenericArrayTest {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        info(intArray);
        String[] sArray = {"java","language"};
        info(sArray);
    }

    public static <T> void info(T[] array) {
        for(T t : array) {
            System.out.println(t);
        }
    }
}
