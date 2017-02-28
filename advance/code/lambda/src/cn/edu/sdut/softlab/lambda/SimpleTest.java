package cn.edu.sdut.softlab.lambda;



/**
 * 本类 .
 * @author Su Baochen
 */
import java.util.function.Supplier;
public class SimpleTest {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    //System.out.println(()->10);
    System.out.println((Supplier)()->10);
    System.out.println(((Supplier)()->10).get());
      
  }

}
