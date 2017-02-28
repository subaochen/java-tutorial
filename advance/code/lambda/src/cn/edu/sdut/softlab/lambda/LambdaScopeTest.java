package cn.edu.sdut.softlab.lambda;

import java.util.function.Consumer;

/**
 * 本类演示了Lambda的作用域 .
 *
 * @author Su Baochen
 */
public class LambdaScopeTest {

  public int x = 0;

  class FirstLevel {

    public int x = 1;

    void methodInFirstLevel(int x) {

      // The following statement causes the compiler to generate
      // the error "local variables referenced from a lambda expression
      // must be final or effectively final" in statement A:
      //
      // x = 99;
      Consumer<Integer> myConsumer = (y)
              -> {
        System.out.println("x = " + x); // Statement A
        System.out.println("y = " + y);
        System.out.println("this.x = " + this.x);
        System.out.println("LambdaScopeTest.this.x = "
                + LambdaScopeTest.this.x);
      };

      myConsumer.accept(x);

    }
  }

  /**
   * 程序执行入口.
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    LambdaScopeTest st = new LambdaScopeTest();
    LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
    fl.methodInFirstLevel(23);

  }

}
