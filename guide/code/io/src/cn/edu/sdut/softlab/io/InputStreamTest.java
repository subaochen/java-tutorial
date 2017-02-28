/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cn.edu.sdut.softlab.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * 本类演示了InputStream的用法 .
 *
 * @author Su Baochen
 */
public class InputStreamTest {

  /**
   * 程序执行入口.
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("test.dat")) {
      int b;
      while((b = fis.read()) != -1)
        System.out.print(b);
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
