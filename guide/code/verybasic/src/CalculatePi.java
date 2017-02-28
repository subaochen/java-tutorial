public class CalculatePi {

	public static void main(String[] args) {
		System.out.printf("pai = %.6f", pi());
		System.out.println();
	}

	/**
	 * 计算Pai的近似值.
	 *
	 * @return Pai的近似值
	 */
	public static double pi() {
		double result = 0; // 最终结果
		double item; // 保存每一项的结果
		int denominator = 1; // 每一项的分母
		int sign = 1; // 符号状态

		do {
			item = (double) sign / denominator;
			result += item;
			sign = -sign;
			denominator += 2;
		} while (Math.abs((double) sign / denominator) >= 1e-6);

		return result * 4;
	}

}
