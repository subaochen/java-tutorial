/**
 * @author subaochen.
 */
public class VarargsTest {
	public static void main(String[] args) {
		System.out.println("1 + 2 + 3 = " + add(1, 2, 3));
		System.out.println("1 + 2 + 3 + 4 = " + add(1, 2, 3, 4));
	}

	/**
	 *
	 * @param x
	 * @return
	 */
	public static int add(int... x) {
		int result = 0;
		for (int i = 0; i < x.length; i++)
			result += x[i];

		return result;
	}
}
