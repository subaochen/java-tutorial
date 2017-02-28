package cn.edu.sdut.softlab.essentials.number;

import java.math.BigDecimal;

/**
 * 本类 .
 *
 * @author Su Baochen
 */
public class BigDecimalMoneyTest {

  /**
   * 程序执行入口.
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    BigDecimal funds = new BigDecimal("1.00");
    final BigDecimal TEN_CENTS = new BigDecimal(".10");
    int itemsBought = 0;

    for (BigDecimal price = TEN_CENTS; 
            funds.compareTo(price) >= 0; 
            price = price.add(TEN_CENTS)) {
      itemsBought++;
      funds = funds.subtract(price);
    }

    System.out.println(itemsBought + " items bought.");
    System.out.println("Money left over: ￥" + funds);

  }

}
