package cn.edu.sdut.softlab.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.*;

/**
 * 本类演示了随机读写文件的方法.
 * 借鉴自：http://docs.oracle.com/javase/tutorial/essential/io/rafs.html
 * @author subaochen.
 */
public class FileRandomAccessTest {
    public static void main(String[] args) {
        Path file = Paths.get(System.getProperty("user.home") + "/test/myfile.txt");
        // 为了保证每次运行结果都一致，首先创建一个实验性的文件
        try {
            BufferedWriter bw = Files.newBufferedWriter(file,CREATE,TRUNCATE_EXISTING);
            bw.write("Java programming language is good!");
            bw.flush(); // |\longremark{如果没有flush会怎样？可以测试一下}|
        } catch (IOException e) {
            System.err.println(e);
        }

        String s = "I was here!\n";
        byte[] data = s.getBytes();

        ByteBuffer out = ByteBuffer.wrap(data);
        ByteBuffer copy = ByteBuffer.allocate(12);
        try (FileChannel fc = (FileChannel.open(file, READ, WRITE))) {
            int nread; //|\longremark{把文件开头的12个字节的数据保存到copy中}|
            do {
                nread = fc.read(copy);
            } while (nread != -1 && copy.hasRemaining());

            fc.position(0);
            while (out.hasRemaining()) //|\longremark{把"I was here!"（在变量out中）写入到文件的开头}|
                fc.write(out);


            out.rewind(); // |\longremark{将out的position重新重新置为0，以便下次从头开始操作}|

            long length = fc.size();
            fc.position(length); //|\longremark{将文件的position移动到文件末尾，以便从末尾开始追加数据}|
            copy.flip(); // |\longremark{将变量copy（其中存储了文件开头的12个字节的内容）的position置为0,以便从头开始读缓冲区内容}|
            while (copy.hasRemaining())
                fc.write(copy); //|\longremark{把copy的内容追加到文件最后}|
            while (out.hasRemaining())
                fc.write(out); // |\longremark{将"I was here！”继续追加到文件最后}|

            // 打印出文件的内容
            BufferedReader br = Files.newBufferedReader(file);
            // 这里可以使用lambda表达式简化代码
            //br.lines().forEach(p->System.out.println(p));
            while((s = br.readLine()) != null)
                System.out.println(s);
        } catch (IOException x) {
            System.err.println("I/O Exception: " + x);
        }
    }
} //|\showremarks|
