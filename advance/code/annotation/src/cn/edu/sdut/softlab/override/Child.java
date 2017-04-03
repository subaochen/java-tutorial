package cn.edu.sdut.softlab.override;

/**
 * Created by subaochen on 17-4-3.
 */
public class Child extends Parent {
    //@Override // |\longremark{当启用此注解时，编译器会报告错误：没有实现父类的同名方法}|
    public void methodA() {}
}
//|\showremarks|
