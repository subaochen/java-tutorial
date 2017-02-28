package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-25.
 */
public class IntGeneratorTest {
    public static void main(String[] args) {
        IntGenerator ig = new IntGenerator();
        System.out.println("next int = " + ig.next());
        System.out.println("next int = " + ig.next());
        System.out.println("next int = " + ig.next());
        IntGenerator ig1 = new IntGenerator();
        System.out.println("next int = " + ig1.next());
        System.out.println("next int = " + ig1.next());
    }
}
