package cn.edu.sdut.softlab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by subaochen on 17-2-17.
 */
public class EchoServer {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.err.println("Usage: java EchoServer <port number>");
            System.exit(1);
        }

        int portNumber = Integer.parseInt(args[0]);

        try (
                ServerSocket serverSocket = new ServerSocket(portNumber); //|\longremark{创建ServerSocket对象}|
                Socket clientSocket = serverSocket.accept(); // |\longremark{等待客户端发起连接请求}|
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // |\longremark{获得写入客户端的outputStream}|
                Scanner in = new Scanner(clientSocket.getInputStream()); //|\longremark{获得从客户端读取数据的inputStream}|
        ) {
            String inputLine;
            while ((inputLine = in.nextLine()) != null) { // |\longremark{从客户端读取一行，如果存在的话}|
                System.out.println("from client:" + inputLine);
                out.println(inputLine); // |\longremark{将从客户端读取的一行字符串发送回客户端}|
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
} // |\showremarks|
