package cn.edu.sdut.softlab.exception;

/**
 * 本类演示了ArrayIndexOutOfBoundsException .
 *
 * @author Su Baochen
 */
public class ArrayTest {

	/**
	 * 程序执行入口.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(arr[3]);
	}
}
