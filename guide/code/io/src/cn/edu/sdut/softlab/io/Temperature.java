package cn.edu.sdut.softlab.io;

import java.io.*;

/**
 * Created by subaochen on 16-12-6.
 */
public class Temperature {
    public static final float[] temperatures = {17.1f, 24.2f, 18.9f, 22.3f, 17.3f, -2.3f, 15.6f};

    public static void main(String[] args) {
        try (DataOutputStream dos =
                new DataOutputStream(new BufferedOutputStream(new FileOutputStream("weather.dat")));
            DataInputStream dis =
                new DataInputStream(new BufferedInputStream(new FileInputStream("weather.dat")))) {
            for(int i = 0; i < temperatures.length; i++) {
                dos.writeFloat(temperatures[i]);
            }
            dos.flush(); // 如果不刷新的话，下面会读取不到数据

            double total = 0.0f;
            int count = 0;
            try {
                while (true) {
                    float current = dis.readFloat();
                    System.out.println(current);
                    total += current;
                    count++;
                }
            } catch (EOFException e) {
                // 这里捕获异常只是为了结束读取文件，因此不需要额外的处理
            }

            System.out.println("average temperature = " + total / count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
