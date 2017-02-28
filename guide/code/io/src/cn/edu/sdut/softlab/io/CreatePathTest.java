package cn.edu.sdut.softlab.io;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author subaochen.
 */
public class CreatePathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/subaochen/");
        Path p2 = Paths.get(args[0]);
        Path p3 = Paths.get(URI.create("file:///home/subaochen/HelloWorld.java"));
        Path p4 = Paths.get(System.getProperty("user.home"),"logs","foo.log");
    }
}
