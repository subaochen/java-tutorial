package cn.edu.sdut.softlab.oopbasic.multiinherit;

/**
 * 本类演示了使用内部类实现多继承的方法 .
 *
 * @author Su Baochen
 */
public class SmartPrinterClient {

	/**
	 * 程序执行入口.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		SmartPrinter sp = new SmartPrinter();
		sp.print();
		sp.copy();
	}

}
