package cn.edu.sdut.softlab.io;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author subaochen.
 */
public class PathCompareTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/subaochen/myfile.txt");
        Path p2 = Paths.get(System.getProperty("user.home") + "/myfile.txt");
        System.out.println("p1 == p2 ? " + p1.equals(p2));
        // true
        System.out.println("p1 starts with home? " + p1.startsWith(Paths.get("/home")));
        // false
        System.out.println("p1 starts with home? " + p1.startsWith("home"));//|\longremark{home是相对路径，/home是绝对路径，是两个不同的路径对象}|
        // false
        System.out.println("p2 ends with txt? " + p2.endsWith("txt")); // |\longremark{txt不是p2路径数组中的元素}|
        // true
        System.out.println("p2 ends with myfile.txt? " + p2.endsWith("myfile.txt"));// |\longremark{myfile.txt是p2路径数组中的元素}|
        // true
        System.out.println("p2 ends with myfile.txt? " + p2.endsWith("subaochen/myfile.txt"));
    }
}
// |\showremarks|
