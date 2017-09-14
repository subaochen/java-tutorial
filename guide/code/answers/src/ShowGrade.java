import java.util.Scanner;

public class ShowGrade {
  public static void main(String[] args) {
    String gradeLevel = "";
    Scanner console = new Scanner(System.in);
    System.out.print("请输入成绩：");
    float grade = console.nextFloat();
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
