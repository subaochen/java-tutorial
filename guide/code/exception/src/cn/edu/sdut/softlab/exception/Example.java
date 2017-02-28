package cn.edu.sdut.softlab.exception;

/**
 * 本类演示了throw和throws的用法.
 * 本例原始版本来自：http://faculty.ycp.edu/~dhovemey/spring2007/cs201/info/exceptionsFileIO.html
 * @author subaochen
 */
public class Example {

  private int count = 0;

  public static void main(String[] argv) {
    try {
      Example ex = new Example();
      ex.f();
      System.out.println(ex.count);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void f() throws Exception {
    add(2);
    add(3);
  }

  public void add(int val) throws Exception {
    if (val == 2) {
      throw new Exception("就是这么二！");
    }
    count += val;
  }

  public void mult(int val) {
    count *= val;
  }
}
