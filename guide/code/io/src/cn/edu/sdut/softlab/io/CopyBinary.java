package cn.edu.sdut.softlab.io;

import java.io.*;

/**
 * 演示复制二进制文件的方法.
 *
 * @author Su Baochen
 */
public class CopyBinary {
    public static void main(String[] args) {
        copyWithBuffer("test.dat", "another.dat");
        copyWithoutBuffer("test.dat", "another.dat");
        copyWithBuffer("test.jpg", "another.jpg");
        copyWithoutBuffer("test.jpg", "another.jpg");
    }

    /**
     * 复制文件，带缓冲区.
     * @param orig 源文件路径
     * @param dest 目标文件路径
     */
    public static void copyWithBuffer(String orig, String dest) {
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(orig));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))
        ) {
            int b;
            while ((b = bis.read()) != -1) {
                System.out.print(b);
                bos.write(b);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 复制文件，不带缓冲区.
     * @param orig 源文件路径
     * @param dest 目标文件路径
     */
    public static void copyWithoutBuffer(String orig, String dest) {
        try (
            FileInputStream fis = new FileInputStream(orig);
            FileOutputStream fos = new FileOutputStream(dest)
        ) {
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print(b);
                fos.write(b);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
