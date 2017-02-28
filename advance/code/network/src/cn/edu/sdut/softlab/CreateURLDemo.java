package cn.edu.sdut.softlab;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by subaochen on 17-2-17.
 */
public class CreateURLDemo {
    public static void main(String[] args) {
        try {
            // 创建绝对URL
            URL url1 = new URL("http://www.example.com/doc/tutorial/networking.html?id=101");
            System.out.println("url1 = " + url1);

            // 创建相对URL
            URL url2 = new URL("http://www.example.com"); // 创建一个绝对URL
            URL tutUrl = new URL(url2, "/doc/tutorial/networking.html?id=101"); // 创建一个相对URL
            System.out.println("tutUrl = " + tutUrl);
            URL url3 = new URL(null, "http://www.example.com/doc"); // 创建一个绝对URL对象，要求第二个参数必须是一个绝对URL形式
            //URL url4 = new URL(null, "/doc/tutorial/networking.html?id=101"); // 错误！ 第二个参数不是绝对URL形式
            //URL url5 = new URL(null, "doc/tutorial/networking.html?id=101"); // 错误！ 第二个参数不是绝对URL形式
            URL url6 = new URL(url1, "http://www.example.com"); // 由于第二个参数是绝对URL，因此忽略第一个参数创建绝对URL
            System.out.println("url3 = " + url3);
            //System.out.println("url4 = " + url4);
            //System.out.println("url5 = " + url5);
            System.out.println("url6 = " + url6);

            // 根据协议、主机等创建URL
            URL url7 = new URL("http","www.example.com","doc/tutorial/networking.html?id=101");
            System.out.println("url7 = " + url7);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
