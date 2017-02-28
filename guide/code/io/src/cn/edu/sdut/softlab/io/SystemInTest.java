package cn.edu.sdut.softlab.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author subaochen.
 */
public class SystemInTest {
    public static void main(String[] args) {
        try {
            // 直接使用InputStream
            byte[] b = new byte[20];
            int num = System.in.read(b);
            System.out.println("bytes num read:" + num);
            float f = Float.valueOf(new String(b));
            System.out.println(f);

            // 尝试使用InputStreamReader
            char[] c = new char[20];
            InputStreamReader sr = new InputStreamReader(System.in);
            sr.read(c);
            float x = Float.valueOf(new String(c));
            System.out.println(x);

            // 使用BufferedReader
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            float y = Float.valueOf(str);
            System.out.println(y);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
