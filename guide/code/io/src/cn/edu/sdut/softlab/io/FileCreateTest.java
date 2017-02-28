package cn.edu.sdut.softlab.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author subaochen.
 */
public class FileCreateTest {
    public static void main(String[] args) {
        Path file = Paths.get(System.getProperty("user.home") + "/test/testcreate.txt");
        try {
            Files.createFile(file); // |\longremark{重复执行此程序会发现抛出了FileAlreadyExistsException，即createFile首先检查文件是否已经存在}|
        } catch (IOException e) {
            System.err.println(e);
        }
    }
} //|\showremarks|
