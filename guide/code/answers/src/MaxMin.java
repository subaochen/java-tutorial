import java.util.Scanner;

public class MaxMin {
  public static void main(String[] args) {
    int n = 0; // 整数的个数
    Scanner console = new Scanner(System.in);
    System.out.println("请输入整数的个数：");
    n = console.nextInt();
    int[] array = new int[n];
    System.out.println("请输入" + n + "个整数，使用空格隔开：");
    for(int i = 0; i < n; i++) {
      array[i] = console.nextInt();
    }

    System.out.println("最大值是：" + max(array) + ", 最小值是: " + min(array));
  }

  /**
   * 
   * @param array
   * @return
   * @// TODO: 17-9-13 如何优化这两个方法，整合为一个？
   */
  public static int max(int[] array) {
    int result = array[0];
    for(int a : array){
      if(result < a) result = a;
    }

    return result;
  }

  public static int min(int[] array) {
    int result = array[0];
    for(int a : array){
      if(result > a) result = a;
    }

    return result;
  }

  /**
   * 求给定整数数组中的最大值和最小值
   * @param array 整数数组
   * @param isMax 如果isMax为true则求最大值，否则求最小值
   * @return 根据isMax的值不同返回数组中的最大值和最小值
   */
  public static int maxmin(int[] array, boolean isMax) {
    int result = array[0];
    for(int a : array){
      if(isMax) {
        if(result < a) result = a;
      } else {
        if(result > a) result = a;
      }
    }

    return result;
  }
}
