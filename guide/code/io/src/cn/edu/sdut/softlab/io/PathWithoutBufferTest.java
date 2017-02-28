package cn.edu.sdut.softlab.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.*;

/**
 * @author subaochen.
 */
public class PathWithoutBufferTest {
    public static void main(String[] args) {
        Path file = Paths.get(System.getProperty("user.home") + "/test/myfile.txt"); // |\longremark{程序执行完可以cat myfile.txt查看文件内容是否有变化}|

        // 首先写入文件一部分内容
        String s = "Hello World! ";
        // 将字符串转换为byte数组
        byte data[] = s.getBytes();

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(file, CREATE, TRUNCATE_EXISTING))) {//|\longremark{在这里可以尝试其他的StandOpenOption选项，比如CREATE\_NEW，DELETE\_ON\_CLOSE}|
            out.write(data, 0, data.length);
        } catch (IOException x) {
            System.err.println(x);
        }
        // 读取文件内容
        try (InputStream in = Files.newInputStream(file);
             BufferedReader reader =
                new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }
} // |\showremarks|
