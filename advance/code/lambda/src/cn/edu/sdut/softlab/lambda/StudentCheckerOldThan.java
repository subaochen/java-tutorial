package cn.edu.sdut.softlab.lambda;

/**
 *
 * @author Su Baochen
 */
public class StudentCheckerOldThan implements CheckStudent {

  @Override
  public boolean test(Student stu) {
    return stu.getAge() > 18;
  }

}
