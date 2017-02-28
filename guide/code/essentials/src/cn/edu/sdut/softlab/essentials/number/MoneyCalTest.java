package cn.edu.sdut.softlab.essentials.number;

/**
 * 本类 .
 * @author Su Baochen
 */
public class MoneyCalTest {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    System.out.println(10.03-4.36);
    
    double funds = 1.00;
    int itemsBought = 0;
    for(double price = .10; funds >= price; price += .10) {
      funds -= price;
      itemsBought++;
    }
    
    System.out.println(itemsBought + " items bought.");
    System.out.println("Change: ￥" + funds);
      
  }

}
