package cn.edu.sdut.softlab.lambda;

/**
 *
 * @author Su Baochen
 */
class StudentCheckerByAgeBetween implements CheckStudent {
  public boolean test (Student stu) {
    return stu.getAge() > 18 && stu.getAge() < 25;
  }
}
