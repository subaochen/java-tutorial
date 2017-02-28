package cn.edu.sdut.softlab.oopm.abstractclass;

/**
 * 本类演示了抽象类不能实例化 .
 * @author Su Baochen
 */
public class Client {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    // 抽象类不能实例化！
    //Animal animal = new Animal();
    Dog dog = new Dog();
    dog.hello(); // hello是继承自Animal的    
  }

}
