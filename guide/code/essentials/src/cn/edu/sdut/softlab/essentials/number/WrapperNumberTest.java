package cn.edu.sdut.softlab.essentials.number;

/**
 * 本类演示了数字类型包裹类的用法 .
 * @author Su Baochen
 */
public class WrapperNumberTest {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    System.out.println("Integer max value=" + Integer.MAX_VALUE);
    System.out.println("Short max value=" + Short.MAX_VALUE);
    System.out.println("Long max value=" + Long.MAX_VALUE);
    System.out.println("Float max value=" + Float.MAX_VALUE);
    System.out.println("Double max value=" + Double.MAX_VALUE);
    
    Float num = 123.45f; // |\longremark{自动装箱，将数字123.45自动转换为一个Float类型的对象}|
    System.out.println("byteValue=" + num.byteValue());
    System.out.println("intValue=" + num.intValue());
    System.out.println("shortValue=" + num.shortValue());
    System.out.println("longValue=" + num.longValue());
    System.out.println("floatValue=" + num.floatValue());
    System.out.println("doubleValue=" + num.doubleValue());
  
    System.out.println("compareTo 123.45f=" + num.compareTo(123.45f)); // |\longremark{自动装箱，将数字123.45自动转换为一个Float类型的对象}|
    System.out.println("eqauls 123.45f=" + num.equals(new Float(123.45f))); // |\longremark{不建议这样写，利用Java的自动装箱机制即可}|  
      
  }

}
//|\showremarks|

