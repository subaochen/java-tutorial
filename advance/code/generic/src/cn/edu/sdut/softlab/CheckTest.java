package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-25.
 */
public class CheckTest {
    public static void main(String[] args) {
        Check<String> checkStr = new Check<String>();
        System.out.println("check string: " + checkStr.check("a string"));
        System.out.println("echo string: " + checkStr.echo("a string"));

        Check<Integer> checkInt = new Check<Integer>();
        System.out.println("check int: " + checkInt.check(100));
        System.out.println("echo int: " + checkInt.echo(100));
    }
}
