import java.util.Scanner;

public class Ball {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入球体的半径：");
        float radius = console.nextFloat();
        System.out.println("球体的体积为=" + volume(radius));
    }

    private static double volume(float radius) {
        return 4 * Math.PI * Math.pow(radius,3) / 3;
    }
}
