/**
 * 注意到类的名字要和文件名字完全一致。另外，在学习面向对象的
 * 概念之前，先“模仿”例子中的类的命名方式，不要随意命名类。养成
 * 好的编码习惯同样很重要。
 */
public class SimpleDataType {

    public static void main(String[] args) {
        char c = 'a'; // 不要录入为char c = "a"！双引号用于字符串。
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
