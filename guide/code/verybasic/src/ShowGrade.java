import java.util.Scanner;

public class ShowGrade {

	/**
	 * 根据成绩计算成绩等级.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) { // |\longremark{自动生成main函数的小技巧：输入psvm然后按下tab键即可}|
		Scanner console = new Scanner(System.in);
		System.out.print("请输入成绩："); // |\longremark{在光标闪烁处输入成绩}|
		float grade = console.nextFloat();
		System.out.print("成绩" + grade + "的等级为：");
		if (grade >= 90) {
			System.out.println("优秀");
		} else if (grade >= 80) {
			System.out.println("良好");
		} else if (grade >= 70) {
			System.out.println("中等");
		} else if (grade >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
}
// |\showremarks|
