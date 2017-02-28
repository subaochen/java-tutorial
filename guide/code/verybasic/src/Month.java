
import java.util.Scanner;

public class Month {

	/**
	 * 根据月份的英文缩写输出给定月份的天数.// |\longremark{注意到这一行最后的小句点：这是google编码规范要求的}|
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		int days = 0;

		Scanner console = new Scanner(System.in);
		System.out.print("请输入月份的英文缩写："); //|\longremark{注意到，这里需要在紧跟着“：”后面输入月份的英文缩写，而不是回车再输入}|
		String month = console.next();//|\longremark{从键盘读入下一个标识符，使用空格、Tab或者回车隔开各个标识符}|
		switch (month) {
			case "FEB": // |\longremark{在这里故意忽略了闰年问题，你能修改一下这个程序，解决闰年问题吗？}|
				days = 28;
				break;
			case "JAN":
			case "MAR":
			case "MAY":
			case "JUL":
			case "AUG":
			case "OCT":
			case "DEC":
				days = 31;
				break;//|\longremark{这里的break不要忘记}|
			case "APR":
			case "JUN":
			case "SEPT":
			case "NOV":
				days = 30;
				break;
			default:
				System.out.println("输入错误，请检查月份英文缩写是否为全部大写");
		}

		System.out.println("月份" + month + "的天数为" + days);

	}

}
//|\showremarks|