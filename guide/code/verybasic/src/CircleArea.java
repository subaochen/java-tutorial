import java.util.Scanner;

public class CircleArea {

	// 定义常量PAI
	public static final double PAI = 3.14; // |\longremark{如果去掉static会怎样？我们将在“类和对象”一章揭开谜底}|

	/**
	 * main函数是Java程序的执行入口，这一点和C语言很相似.
	 *
	 * @param args 命令行参数，和C语言的argv也很相似
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("请输入半径：");// |\longremark{print函数只输出内容，不会自动换行}|
		float radius = console.nextFloat();
		double area = PAI * radius * radius; // |\longremark{表达式的最终类型是double，和C语言的类型转换规则是相同的}|
		System.out.println("面积=" + area); // |\longremark{println输出内容后自动换行。请思考如何使得输出结果只精确到小数点后3位？ }|
	}
}
// |\showremarks|
