package cn.edu.sdut.softlab.oopm.pureabstract;

/**
 * 本类演示了接口的用法 .
 * @author Su Baochen
 */
public class Client {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.hello();
    dog.eat();
    dog.sleep();
  }
}
