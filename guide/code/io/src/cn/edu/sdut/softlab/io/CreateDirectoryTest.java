package cn.edu.sdut.softlab.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author subaochen.
 */
public class CreateDirectoryTest {
    public static void main(String[] args) {
        Path dir = Paths.get(System.getProperty("user.home") + "/test/a");

        try {
            Files.createDirectory(dir);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
