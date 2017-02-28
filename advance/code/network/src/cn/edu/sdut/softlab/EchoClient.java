package cn.edu.sdut.softlab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by subaochen on 17-2-17.
 */
public class EchoClient {
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.err.println(
                    "Usage: java EchoClient <host name> <port number>");
            System.exit(1);
        }

        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        try (
                Socket echoSocket = new Socket(hostName, portNumber); // |\longremark{根据socket server的主机IP地址和端口号创建一个到socket server的socket对象}|
                PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true); // |\longremark{获得写入到服务器端的OutputStream}|
                BufferedReader in =
                        new BufferedReader(
                                new InputStreamReader(echoSocket.getInputStream())); // |\longremark{获得从服务器读取数据的InputStream}|
                Scanner stdIn = new Scanner(System.in); // |\longremark{标准输入}|
        ) {
            String userInput;
            while ((userInput = stdIn.nextLine()) != null) {
                out.println(userInput); // |\longremark{写入到服务器端}|
                System.out.println("echo: " + in.readLine()); // |\longremark{读取服务器端的响应并显示在屏幕上}|
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " + hostName);
            System.exit(1);
        }
    }
}//|\showremarks|
