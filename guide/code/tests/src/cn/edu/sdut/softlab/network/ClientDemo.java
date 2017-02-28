package cn.edu.sdut.softlab.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by subaochen on 17-2-22.
 */
public class ClientDemo {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", Integer.parseInt("2000"));
             OutputStream out = socket.getOutputStream();
        ) {
            URL url = new URL("http://www.baidu.com");
            Scanner console = new Scanner(url.openStream());
            String inputLine;
            while(console.hasNext()) {
                inputLine = console.nextLine();
                System.out.println("准备发往服务器的数据：" + inputLine);
                out.write(inputLine.getBytes());
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
