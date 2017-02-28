package cn.edu.sdut.softlab.oopm.pureabstract;

/**
 * 本类演示了如何实现接口.
 *
 * @author Su Baochen
 */
public class Dog implements Animal {

  @Override
  public void hello() {
    System.out.println("汪汪");
  }

  @Override
  public void eat() {
    System.out.println("Dog eat method");
  }

  @Override
  public void sleep() {
    System.out.println("Dog sleep method");
  }

}
