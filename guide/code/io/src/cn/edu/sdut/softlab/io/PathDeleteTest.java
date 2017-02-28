package cn.edu.sdut.softlab.io;

import java.io.IOException;
import java.nio.file.*;

/**
 * @author subaochen.
 */
public class PathDeleteTest {
    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("user.home") + "/testfile.txt");
        try {
            Files.delete(path);
        } catch (NoSuchFileException e) {
            System.err.println("no such file or directory:" + path);
        } catch (DirectoryNotEmptyException e) {
            System.err.println("directory is not empty: " + path);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
