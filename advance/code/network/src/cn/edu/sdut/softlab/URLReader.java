package cn.edu.sdut.softlab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by subaochen on 17-2-16.
 */
public class URLReader {
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://raw.githubusercontent.com/subaochen/java-tutorial-examples/master/network/sample/hello.txt");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
