package cn.edu.sdut.softlab.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 本类演示了如何遍历一个目录.
 * @author subaochen.
 */
public class ListDirectoryTest {
    public static void main(String[] args) {
        Path dir = Paths.get(System.getProperty("user.home") + "/test");

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {//|\longremark{如果不使用try-with-resources结构需要调用stream.close方法}|
            for(Path p : stream) {
                System.out.println(p);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}//|\showremarks|
