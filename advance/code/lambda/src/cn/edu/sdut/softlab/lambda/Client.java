package cn.edu.sdut.softlab.lambda;

import static cn.edu.sdut.softlab.lambda.Student.testData;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 本类演示了lambda表达式的用法.
 *
 * @author subaochen
 */
public class Client {

  /**
   * 程序执行入口.
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    findStudentsOlderThan(20);
    System.out.println("-------------------");
    findStudentsAgeBetween(20, 25);
    System.out.println("-------------------");
    findStudents(new StudentCheckerOldThan());
    System.out.println("-------------------");
    findStudents(new CheckStudent() {
      public boolean test(Student stu) {
        return stu.getAge() > 18;
      }
    });
    System.out.println("-------------------");
    findStudents(stu -> stu.getAge() > 18);
    System.out.println("-------------------");
    findStudentsWithPredinedFunction(stu -> stu.getAge() > 20);
    System.out.println("-------------------");
    findStudentsEmailByAge(stu -> stu.getAge() > 20,
            stu -> stu.getEmail(),
            email -> System.out.println(email));
    System.out.println("-------------------");
    findStudents(
            stu -> stu.getAge() > 20,
            stu -> stu.getUsername(),
            username -> System.out.println(username.toUpperCase())
    );

    // 使用stream遍历集合数据
    testData.stream().forEach((stu) -> System.out.println(stu));
    System.out.println("-------------------");
    // 使用stream筛选集合数据
    testData.stream() // 包含所有数据的流
            .filter(stu -> stu.getAge() > 20) // 包含大于20岁学生的流
            .forEach(stu -> System.out.println(stu)); // 打印大于20岁的每一个学生
    System.out.println("-------------------");
    // 使用stream筛选集合数据并抽取部分数据处理
    testData.stream() // 包含所有数据的流
            .filter(stu -> stu.getAge() > 18) // 包含大于20岁学生的流
            .map(stu -> stu.getEmail())
            .forEach(email -> System.out.println(email)); // 打印大于20岁学生的Email
    System.out.println("-------------------");

    // 获得符合要求的数据子集
    List<Student> list = testData.stream()
            .filter(stu -> stu.getAge() > 18)
            .collect(Collectors.toList());
    System.out.println(list);
    System.out.println("-------------------");

    // 获得符合要求的数据子集的部分字段
    List<String> emails = testData.stream()
            .filter(stu -> stu.getAge() > 20)
            .map(stu -> stu.getEmail())
            .distinct() // 去除重复内容
            .collect(Collectors.toList());
    System.out.println(emails);
    System.out.println("-------------------");

    // 收集指定数据元素的感兴趣的字段到Map中
    Map<String, String> stuMap = testData.stream()
            .filter(stu -> stu.getAge() > 20)
            .distinct() // 去除重复内容
            .collect(Collectors.toMap(stu -> stu.getUsername(), stu -> stu.getEmail()));
    System.out.println(stuMap);
    System.out.println("-------------------");

    // 统计指定数据子集
    Map<Integer, Integer> r = testData.stream()
            .filter(stu -> stu.getAge() > 18)
            .map(stu -> new Integer(stu.getAge()))
            .collect(Collectors.groupingBy(p -> p, Collectors.summingInt(p -> 1)));
    System.out.println(r);
    System.out.println("-------------------");
  }

  /**
   * 找出大于指定年龄的学生.
   *
   * @param age 年龄
   */
  public static void findStudentsOlderThan(int age) {
    for (Student stu : testData) {
      if (stu.getAge() >= age) {
        stu.print();
      }
    }
  }

  /**
   * 找出年龄在指定范围的学生.
   *
   * @param minAge 年龄下限.
   * @param maxAge 年龄上限.
   */
  public static void findStudentsAgeBetween(int minAge, int maxAge) {
    for (Student stu : testData) {
      if (stu.getAge() > minAge && stu.getAge() < maxAge) {
        stu.print();
      }
    }
  }

  public static void findStudents(CheckStudent checker) {
    for (Student stu : testData) {
      if (checker.test(stu)) {
        stu.print();
      }
    }
  }

  public static void findStudentsWithPredinedFunction(Predicate<Student> checker) {
    for (Student stu : testData) {
      if (checker.test(stu)) {
        stu.print();
      }
    }
  }

  public static void findStudentsEmailByAge(
          Predicate<Student> checker,
          Function<Student, String> mapper,
          Consumer<String> action) {
    for (Student stu : testData) {
      if (checker.test(stu)) {
        String email = mapper.apply(stu);
        action.accept(email);
      }
    }
  }

  public static <X> void findStudents(
          Predicate<Student> checker,
          Function<Student, X> mapper,
          Consumer<X> action) {
    for (Student stu : testData) {
      if (checker.test(stu)) {
        X info = mapper.apply(stu);
        action.accept(info);
      }
    }
  }

}
