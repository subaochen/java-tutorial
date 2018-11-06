package cn.edu.sdut.softlab.exception;

/**
 * 本类演示了多个catch块的情形 .
 *
 * @author 《疯狂Java讲义（第二版）》P350
 */
public class DivTestNoException {

	/**
	 * 程序执行入口.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("a/b = " +  a/b);
	}
}
