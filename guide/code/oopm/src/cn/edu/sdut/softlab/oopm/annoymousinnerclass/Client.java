package cn.edu.sdut.softlab.oopm.annoymousinnerclass;

/**
 * 本类演示了接口上的匿名内部类的用法 .
 * @author Su Baochen
 */
public class Client {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    new Printer() {
      @Override
      public void print() {
        System.out.println("print called");
      }
      
    }.print();
    
    new Copier() {
      @Override
      public void copy() {
        System.out.println("copy called");
      }
      
    }.copy();
      
  }

}
