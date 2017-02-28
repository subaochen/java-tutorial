package cn.edu.sdut.softlab.essentials.number;

/**
 * 本类以Integer为例，演示了数字之间的相互转换 .
 * @author Su Baochen
 */
public class NumberTest {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    System.out.println(Integer.decode("10")); // 10进制
    System.out.println(Integer.decode("0x10")); // 16进制
    System.out.println(Integer.decode("010")); // 8进制
    System.out.println(Integer.parseInt("123"));
    //System.out.println(Integer.parseInt("123.4")); // 格式错误
    Integer num = 123;
    System.out.println("num=" + num);
    System.out.println("num=" + num.toString());
    System.out.println(Integer.parseInt("10",8));
    System.out.println(Integer.valueOf(123)); // |\longremark{注意这里实际上分两步走：第一步根据数字123获得了一个Integer类型的对象，第二步调用了Integer类型对象的toString方法输出了“123”字符串}|
    System.out.println(Integer.valueOf("123"));
    //System.out.println(Integer.valueOf("123.4")); // 格式错误
    System.out.println(Integer.valueOf("10",2)); // |\longremark{根据2进制的“10”创建Integer类型的对象，整数值为2}|      
  }

}
// |\showremarks|
