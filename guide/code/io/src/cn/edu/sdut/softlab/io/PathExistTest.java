package cn.edu.sdut.softlab.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author subaochen.
 */
public class PathExistTest {
    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("user.home") + "myfile.txt");
        Path root = Paths.get("/root");
        System.out.println("myfile.txt exists? " + Files.exists(path));
        System.out.println("/root exists? " + Files.notExists(root));// |\longremark{如果是普通用户则无权查看root目录}|
    }
}
// |\showremarks|
