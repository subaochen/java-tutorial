package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 17-1-18.
 */
public class GenericSuperTest {
    public static void testSuper(GenericBox<? super Integer> box) {
        box.setValue(1);
        System.out.println("box.value = " + box.getValue());
    }

    public static void main(String[] args) {
        testSuper(new GenericBox<Object>());
    }
}
