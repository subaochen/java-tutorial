package cn.edu.sdut.softlab.exception;

/**
 * 本类演示了多个catch块的情形 .
 *
 * @author 《疯狂Java讲义（第二版）》P350
 */
public class DivTest {

    /**
     * 程序执行入口.
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("a/b = " + a / b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界，运行程序时输入的参数个数不对。应该输入2个参数，您输入的参数个数是：" + args.length);
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("数字格式异常，程序只能接受整数形式的参数");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("数学异常，除数不能为0");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("天知道发生了什么，总之情况不对");
            e.printStackTrace();
        }
    }
}
