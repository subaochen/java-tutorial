package cn.edu.sdut.softlab.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * 本类演示了Files.move方法的用法.
 * @author subaochen.
 */
public class PathMoveTest {
    public static void main(String[] args) {
        Path src = Paths.get(System.getProperty("user.home") + "myfile.txt");
        Path dest = Paths.get(System.getProperty("user.home") + "/test/myfile.txt");

        try {
            // 如果目标文件存在则先删除，防止干扰move的结果
            Files.delete(dest);
            Files.move(src, dest, REPLACE_EXISTING); // |\longremark{可以尝试去掉REPLACE\_EXISTING参数看看运行结果有什么不同？}|
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("move file success? " + Files.exists(dest));
    }
} // |\showremarks|
