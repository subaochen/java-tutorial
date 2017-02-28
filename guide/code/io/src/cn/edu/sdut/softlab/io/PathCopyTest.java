package cn.edu.sdut.softlab.io;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * 本类演示了Files.copy的用法.
 *
 * @author subaochen.
 */
public class PathCopyTest {
    public static void main(String[] args) {

        // 不带CopyOption参数复制文件
        // 请首先在家目录创建一个测试目录test和testdest，并创建测试文件myfile.txt
        // mkdir test testdest
        // touch test/myfile.txt
        Path src = Paths.get(System.getProperty("user.home") + "/test/myfile.txt");
        Path dest = Paths.get(System.getProperty("user.home") + "/testdest/myfile.txt"); // |\longremark{如果目的文件是目录会怎样？比如dest写为：Paths.get(System.getProperty("user.home") + "/testdest")，请自行测试并思考原因}|
        try {
            Files.copy(src,dest);
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("copy success ? " + Files.exists(dest));

        // 覆盖目的文件
        try {
            Files.copy(src,dest, REPLACE_EXISTING);//|\longremark{注意观察REPLACE\_EXISTING的作用：到testdest目录查看是否存在myfile.txt文件}|
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("copy replace existing success ? " + Files.exists(dest));

        // 带目录复制时的情形
        // 为了防止上面的操作干扰复制目录的效果，先删除testdest目录下的myfile.txt
        try {
            Files.delete(dest);
        } catch (IOException e) {
            System.err.println(e);
        }
        src = Paths.get(System.getProperty("user.home") + "/test");
        dest = Paths.get(System.getProperty("user.home") + "/testdest");
        try {
            Files.copy(src, dest, REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println(e);
        }
        // 应该打印出false
        System.out.println("copy directory success ? " + Files.exists(dest.resolve("/myfile.txt")));

        // 复制符号链接时的情形
        // 先在test目录创建一个符号链接: ln -s /etc/passwd test/passwd
        src = Paths.get(System.getProperty("user.home") + "/test/passwd");
        dest = Paths.get(System.getProperty("user.home") + "/testdest/passwd");
        try {
            Files.copy(src, dest, REPLACE_EXISTING, NOFOLLOW_LINKS);// |\longremark{可以尝试去掉REPLACE\_EXISTING和NOFOLLOW\_LINKS观察执行的结果}|
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("copy soft link success ? " + Files.exists(dest,NOFOLLOW_LINKS));

    }
}
//|\showremarks|
