package cn.edu.sdut.softlab.io;

import java.util.Scanner;

/**
 * @author subaochen.
 */
public class MultiplyTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int product = num1 * num2;
        System.out.println("这两个整数的乘积为：" + product);
    }
}
