package cn.edu.sdut.softlab.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 利用标准输入输出
 */
public class StandardIO {
    public static void main(String[] args) {
        //IO操作必须捕获IO异常。
        try {
            //先使用System.in构造InputStreamReader，再构造BufferedReader。
            BufferedReader stdin =
                    new BufferedReader(new InputStreamReader(System.in));
            //读取并输出字符串。
            System.out.print("Enter a string: ");
            System.out.println(stdin.readLine());

            //读取并输出整型数据。
            System.out.print("Enter an integer: ");
            //将字符串解析为带符号的十进制整数。
            int number1 = Integer.parseInt(stdin.readLine());
            System.out.println(number1);

            //读取并输出double类型数据。
            System.out.print("Enter a double: ");
            //将字符串解析为带符号的double类型数据。
            double number2 = Double.parseDouble(stdin.readLine());
            System.out.println(number2);
        } catch (IOException e) {
            System.err.println("IOException");
        }
    }
}
