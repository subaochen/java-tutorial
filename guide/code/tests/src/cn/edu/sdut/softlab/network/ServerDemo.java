package cn.edu.sdut.softlab.network;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by subaochen on 17-2-21.
 */
public class ServerDemo {
    public static void main(String[] args) {
        try(
                ServerSocket serverSocket = new ServerSocket(2000);
                Socket clientSocket = serverSocket.accept();
                //PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
                FileOutputStream fis = new FileOutputStream("out.txt");
                Scanner in = new Scanner(clientSocket.getInputStream());
        ) {
            String inputLine;
            while((inputLine = in.nextLine()) != null) {
                System.out.println("接收到的数据：" + inputLine);
                // 写入文件
                fis.write(inputLine.getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
