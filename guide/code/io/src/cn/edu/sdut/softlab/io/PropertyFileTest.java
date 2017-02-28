package cn.edu.sdut.softlab.io;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Properties;

/**
 * 本类演示了访问属性文件的方法.
 * @author subaochen.
 */
public class PropertyFileTest {
    private static final String CONF_FILE = "conf/database-config.properties";

    public static void main(String[] args) {
        createPropertyFile(CONF_FILE);
        readPropertyFile(CONF_FILE);

    }

    /**
     * 读取属性文件.
     * @param file 属性文件名
     */
    private static void readPropertyFile(String file) {
        Properties pro = new Properties();
        try (InputStream path = new FileInputStream(CONF_FILE)) {
            pro.load(path);
            for(Object key: pro.keySet()) {
                System.out.println(key.toString() + "=" + pro.getProperty(key.toString()));
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /**
     * 创建属性文件.
     * @param file 属性文件名
     */
    public static void createPropertyFile(String file) {
        Properties pro = new Properties();
        try (InputStream path = new FileInputStream(CONF_FILE);
             OutputStream fos = new FileOutputStream(CONF_FILE)) {
            pro.load(path);
            pro.setProperty("hostname", "localhost");
            pro.setProperty("username", "postgres");
            pro.setProperty("password", "password");
            pro.setProperty("database", "mydb");
            pro.store(fos, String.format("modified @ %s", LocalDateTime.now()));
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
