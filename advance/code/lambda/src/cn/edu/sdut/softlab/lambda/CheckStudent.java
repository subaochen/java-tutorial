package cn.edu.sdut.softlab.lambda;

/**
 *
 * @author Su Baochen
 */
public interface CheckStudent {
  /**
   * 检查学生是否满足筛选条件.
   * 
   * @param stu 待检查的学生对象
   * @return 满足条件返回true，否则返回false
   */
  boolean test(Student stu);
  
}
