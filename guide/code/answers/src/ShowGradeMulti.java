import java.util.Scanner;

public class ShowGradeMulti {
  public static void main(String[] args) {
    float grade = 0; //  百分制成绩
    Scanner console = new Scanner(System.in);
    System.out.print("请输入成绩：");
    grade = console.nextFloat();
    while(grade >= 0) {
      showGrade(grade);
      grade = console.nextFloat();
    }
  }

  private static void showGrade(float grade) {
    String gradeLevel = ""; // 等级分
    int level = (int)grade / 10; // 转换为整数
    switch(level) {
      case 10:
      case 9:
        gradeLevel = "优秀";
        break;
      case 8:
        gradeLevel = "良好";
        break;
      case 7:
        gradeLevel = "中等";
        break;
      case 6:
        gradeLevel = "及格";
        break;
      default:
        gradeLevel = "不及格";
    }

    System.out.println("输入成绩为：" + grade + "，成绩等级为：" + gradeLevel);
  }
}
