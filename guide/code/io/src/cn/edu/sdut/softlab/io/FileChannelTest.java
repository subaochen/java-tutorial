package cn.edu.sdut.softlab.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 本例演示了Channel方式读取文件的方法.
 * 本例借鉴自：http://docs.oracle.com/javase/tutorial/essential/io/file.html
 * @author subaochen.
 */
public class FileChannelTest {
    public static void main(String[] args) {
        Path file = Paths.get(System.getProperty("user.home") + "/test/myfile.txt");

        try (SeekableByteChannel sbc = Files.newByteChannel(file)) { // |\longremark{newByteChannel默认返回只读的Channel}|
            ByteBuffer buf = ByteBuffer.allocate(10); // |\longremark{allocate创建一个指定字节的ByteBuffer，本例中，sbc这个Channel每次读取10个字节}|

            String encoding = System.getProperty("file.encoding"); // |\longremark{获得当前系统文件编码方式，以便读取文件字节后解码}|
            while (sbc.read(buf) > 0) { // |\longremark{从通道读数据到缓冲区}|
                buf.flip(); // |\longremark{切换缓冲区为读模式}|
                System.out.print(Charset.forName(encoding).decode(buf));
                buf.clear(); // |\longremark{清空缓冲区，准备写入下一轮数据}|
            }
        } catch (IOException x) {
            System.out.println("caught exception: " + x);
        }
    }
} // |\showremarks|
