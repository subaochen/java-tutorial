package cn.edu.sdut.softlab.oopm.polymorphism;

/**
 * 演示多态中的Client类.
 *
 * @author Su Baochen
 */
public class TestAnimal {

  /**
   * 程序执行入口.
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    Animal[] animals = new Animal[3];
    animals[0] = new Dog(); //|\longremark{向上塑型，将Dog对象转换为Animal对象}|
    animals[1] = new Cat(); //|\longremark{向上塑型，将Cat对象转换为Animal对象}|
    animals[2] = new Duke(); //|\longremark{向上塑型，将Duke对象转换为Animal对象}| 
    for (Animal animal : animals) {
      animal.hello();
    }
  }
}
//|\showremarks|
