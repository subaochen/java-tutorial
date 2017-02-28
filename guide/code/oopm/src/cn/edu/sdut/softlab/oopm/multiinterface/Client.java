package cn.edu.sdut.softlab.oopm.multiinterface;

/**
 * 本类演示了实现多个接口的类的用法 .
 *
 * @author Su Baochen
 */
public class Client {

  /**
   * 程序执行入口.
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    SmartPrinter sp = new SmartPrinter();
    sp.print();
    sp.copy();
  }

}
