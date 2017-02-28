package cn.edu.sdut.softlab.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 本例演示了如何使用FileVisitor类遍历目录.
 * 本例借鉴自：http://docs.oracle.com/javase/tutorial/essential/io/walk.html
 * @author subaochen.
 */
public class WalkFileTreeTest {
    public static void main(String[] args) {
        Path startingDir = Paths.get(System.getProperty("user.home") + "/test");
        PrintFiles pf = new PrintFiles();
        try {
            Files.walkFileTree(startingDir, pf); //|\longremark{递归的遍历目录并根据PrintFiles类中的相关方法处理每一个目录项}|
        } catch (IOException e) {
            System.err.println(e);
        }
    }
} //|\showremarks|
