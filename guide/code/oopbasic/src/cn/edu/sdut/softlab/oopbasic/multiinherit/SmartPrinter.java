package cn.edu.sdut.softlab.oopbasic.multiinherit;

/**
 * 多功能一体机类.
 *
 * @author Su Baochen
 */
public class SmartPrinter extends Printer {

	@Override
	public void print() {
		super.print();
		System.out.println("SmartPrinter print");
	}

	public void copy() {
		new MultiCopier().copy();
	}

	class MultiCopier extends Copier {

		@Override
		public void copy() {
			super.copy();
			System.out.println("SmartPrinter copy");
		}
	}

}
