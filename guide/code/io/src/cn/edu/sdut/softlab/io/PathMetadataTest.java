package cn.edu.sdut.softlab.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * @author subaochen.
 */
public class PathMetadataTest {
    public static void main(String[] args) {
        Path file = Paths.get(System.getProperty("user.home") + "/test/myfile.txt");

        // 批量读取文件的基本属性
        BasicFileAttributes attr = null;
        try {
            attr = Files.readAttributes(file, BasicFileAttributes.class);
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("creationTime: " + attr.creationTime());
        System.out.println("lastAccessTime: " + attr.lastAccessTime());
        System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
        System.out.println("isDirectory: " + attr.isDirectory());
        // 不是目录，也不是文件，也不是符号链接的话（@TODO比如？）
        System.out.println("isOther: " + attr.isOther());
        System.out.println("isRegularFile: " + attr.isRegularFile());
        System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
        System.out.println("size: " + attr.size());

        // 设置文件的最后修改时间为当前时间
        long currentTime = System.currentTimeMillis();
        FileTime ft = FileTime.fromMillis(currentTime);
        try {
            Files.setLastModifiedTime(file, ft);
        } catch (IOException e) {
            System.err.println(e);
        }

        // 验证一下最后修改时间修改成功了吗？
        try {
            System.out.println("now lastModifiedTime is:" + Files.getLastModifiedTime(file));
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
