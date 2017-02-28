
public class SimpleDataType {

	public static void main(String[] args) {
		char c = 'a';
		byte b = 20;
		int n = 10;
		short s = 2;
		long l = 100L; // |\longremark{使用L声明long型数据是个好习惯}|
		double d = 2.5D;
		float f = 2.5F;

		System.out.println("c(char) = " + c + ",size of c = " + Character.SIZE / 8);
		System.out.println("b(byte) = " + b + ",size of n = " + Byte.SIZE / 8);
		System.out.println("n(int) = " + n + ",size of n = " + Integer.SIZE / 8);
		System.out.println("s(short) = " + s + ",size of s = " + Short.SIZE / 8);
		System.out.println("l(long) = " + l + ",size of l = " + Long.SIZE / 8);
		System.out.println("f(float) = " + f + ",size of f = " + Float.SIZE / 8);
		System.out.println("d(double) = " + d + ",size of d = " + Double.SIZE / 8);
	}
}

// |\showremarks|
