package cn.edu.sdut.softlab.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author subaochen.
 */
public class PathCreateTest {
    public static void main(String[] args) {
        Path file = Paths.get(System.getProperty("user.home") + "/test/myfile1.txt");
        byte[] buf = "test string".getBytes();
        byte[] fileArray;
        try {
            Files.write(file, buf); // |\longremark{直接写入byte数组到文件。比较一下InputStream中的相关方法可见，Files.write更直观和方便。}|
            fileArray = Files.readAllBytes(file); // |\longremark{直接从Path读bytes数组。比较一下OutputStream中的相关方法可见，Files.readAllBytes更直观和方便。}|
            System.out.println(new String(fileArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//|\showremarks|
