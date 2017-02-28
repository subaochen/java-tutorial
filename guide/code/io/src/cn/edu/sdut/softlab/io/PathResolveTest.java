package cn.edu.sdut.softlab.io;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author subaochen.
 */
public class PathResolveTest {
    public static void  main(String[] args) {
        Path path = Paths.get("/home/subaochen/test");
        // /home/subaochen/test/myfile.txt
        System.out.println("myfile.txt resloved:" + path.resolve("myfile.txt"));
        // /home/suboachen/test/list/myfile.txt
        System.out.println("myfile.txt resloved:" + path.resolve("list/myfile.txt"));
        // /myfile.txt
        System.out.println("myfile.txt resloved:" + path.resolve("/myfile.txt"));
    }
}
