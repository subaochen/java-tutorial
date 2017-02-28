package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-25.
 */
public class GenericMethodTest {
    public static <T, W>  T choise(W x, T y) {
        return y;
    }

    public static void main(String[] args) {
        System.out.println(choise(3,5));
        System.out.println(choise("1123",456));
        System.out.println(choise(123, "a string"));
        System.out.println(GenericMethodTest.<String, Integer>choise(123, "a string"));
    }
}
