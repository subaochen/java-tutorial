package cn.edu.sdut.softlab.interfacenum;

/**
 * Created by lisongyang on 17-3-6.
 */
public class EnumImpl implements EnumInterface {
    public static void main(String[] args) {
        System.out.println(ONE); // implement接口后，可以直接访问该变量
        System.out.println("接口中第二个变量："+TWO);
        System.out.print("第三个变量为："+ THREE);
    }
}
