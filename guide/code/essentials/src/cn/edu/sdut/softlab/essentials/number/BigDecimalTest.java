package cn.edu.sdut.softlab.essentials.number;

import java.math.BigDecimal;

/**
 * 本类演示了BigDecimal的构造方法的用法 .
 * @author Su Baochen
 */
public class BigDecimalTest {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    System.out.println(new BigDecimal("123").toBigInteger());
    System.out.println(new BigDecimal("-123").toBigInteger());
    System.out.println(new BigDecimal("1.23E3").toBigInteger());
    System.out.println(new BigDecimal("1.23E+3").toBigInteger());
    System.out.println(new BigDecimal("1.23E-3").toBigInteger());
    System.out.println(new BigDecimal("12.3E7").toBigInteger());
    System.out.println(new BigDecimal("0.00123").toBigInteger());
    System.out.println(new BigDecimal("-1.23E-3").toBigInteger());
    System.out.println(new BigDecimal("1234.5E-4").toBigInteger());
    System.out.println(new BigDecimal("0E+7").toBigInteger());
    System.out.println(new BigDecimal("-0").toBigInteger());
    char[] in = {'1','2'};
    System.out.println(new BigDecimal(in));
      
  }

}
