package cn.edu.sdut.softlab.io;

import java.io.IOException;
import java.net.URI;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author subaochen.
 */
public class PathConversionTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/subaochen/");
        Path p2 = Paths.get("./test/myfile.txt");
        Path p4 = Paths.get(System.getProperty("user.home"),"logs","foo.log");

        // file:///home/subaochen
        System.out.println("Uri of /home/subaochen/ is: " + p1.toUri());
        // 转换为绝对路径
        System.out.println("absoluate path of ./test.myfile.txt:" + p2.toAbsolutePath());

        try {
            System.out.println("realpath of p1:" + p1.toRealPath());
            // 抛出NoSuchFileException
            System.out.println("realpath of p4:" + p4.toRealPath());
        } catch (NoSuchFileException e) {
            System.err.println("file " + e.getFile() + " not exists!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
