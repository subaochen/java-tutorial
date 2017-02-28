package cn.edu.sdut.softlab.io;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author subaochen.
 */
public class PathInfoTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/subaochen/");
        //Path p2 = Paths.get(args[0]); // 需要传入命令行参数才能正确执行
        Path p3 = Paths.get(URI.create("file:///home/subaochen/HelloWorld.java"));
        Path p4 = Paths.get(System.getProperty("user.home"),"logs","foo.log");

        pathInfo(p1);
        //pathInfo(p2);
        pathInfo(p3);
        pathInfo(p4);
    }

    // 打印path的信息
    // 注意，path对象表达的目录和文件不一定存在
    private static void pathInfo(Path path) {
        System.out.println("===path info for:" + path + "===");
        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getParent: %s%n", path.subpath(0,path.getNameCount() - 1));
        System.out.format("getRoot: %s%n", path.getRoot());
        // 使用lambda表达式
        //path.forEach(p->System.out.println(p));
    }
}
