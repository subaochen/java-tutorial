package cn.edu.sdut.softlab.oopbasic.sub332;

/**
 * 本例演示了Point类覆盖了默认的构造方法时的情形.
 * 可以看出，长方形的左上角和圆的圆心坐标虽然在Draw中没有设置，
 * 但是由于Point类的无参构造方法设置了默认值（10,10），从程序的
 * 输出我们可以看到无参构造方法的效果。
 *
 * @author SuBaochen:subaochen@126.com
 */
public class Draw {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		rect1.height = 10;
		rect1.width = 10;

		Circle circle1 = new Circle();
		circle1.radius = 10;

		System.out.println("rect1的左上角坐标：(" + rect1.startPoint.x + ","
				+ rect1.startPoint.y + "),width=" + rect1.width + ",height="
				+ rect1.height + ",面积=" + rect1.area());
		System.out.println("circle1的原点坐标：(" + circle1.origin.x + ","
				+ circle1.origin.y + "),radius=" + circle1.radius + "面积="
				+ circle1.area());

	}

}
