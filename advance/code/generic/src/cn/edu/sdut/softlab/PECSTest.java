package cn.edu.sdut.softlab;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类综合演示了PECS原则.
 * Created by subaochen on 17-1-8.
 */
public class PECSTest {
    public static void main(String[] args) {
        List<Number> listNumber_ListNumber = new ArrayList<Number>();
        //List<Number> listNumber_ListInteger = new ArrayList<Integer>(); // 错误 - ArrayList<Integer>不是List<Number>的子类
        //List<Number> listNumber_ListDouble  = new ArrayList<Double>();  // 错误 - ArrayList<Double>不是List<Number>的子类
        listNumber_ListNumber.add(3);             // ok - 对于List<Number>，可以添加整数数据

        List<? extends Number> listExtendsNumber_ListNumber = listNumber_ListNumber; // ok - ArrayList<Number>是List<? extends Number>的子类型
        List<? extends Number> listExtendsNumber_ListInteger = new ArrayList<Integer>();
        List<? extends Number> listExtendsNumber_ListDouble = new ArrayList<Double>();

        Number num1 = listExtendsNumber_ListNumber.get(0); // ok - List<? extends Number>的数据可以安全转型为Number
        Object num2 = listExtendsNumber_ListNumber.get(0); // ok - List<? extends Number>的数据可以安全转型为Object
        // Integer num3 = listExtendsNumber_ListNumber.get(0); // 错误 - List<? extends Number>的数据不可以安全转型为Integer
        // Double num4 = listExtendsNumber_ListNumber.get(0); 错误 - List<? extends Number>的数据不可以安全转型为Double


        List<? super Number> listSuperNumber_ListNumber = listNumber_ListNumber;
        //List<? super Number> listSuperNumber_ListInteger = new ArrayList<Integer>(); // 错误 - Integer不是Number的父类型
        //List<? super Number> listSuperNumber_ListDouble  = new ArrayList<Double>();  // 错误 - Double不是Number的父类型

        // Number n1 = listSuperNumber_ListNumber.get(0); // 错误 - listSuperNumber_ListNumber可能指向List<Object>
        // Integer n2 = listSuperNumber_ListNumber.get(0); // 错误 - listSuperNumber_ListNumber可能指向List<Object>
        // Double n3 = listSuperNumber_ListNumber.get(0); // 错误 - listSuperNumber_ListNumber可能指向List<Object>
        Object n4 = listSuperNumber_ListNumber.get(0); // ok - 但是，我们不知道n4到底是什么类型的，因此几无用处

        //List<Integer> listInteger_ListNumber  = new ArrayList<Number>(); // 错误 - ArrayList<Number>不是List<Integer>的子类
        List<Integer> listInteger_ListInteger = new ArrayList<Integer>();
        //List<Integer> listInteger_ListDouble  = new ArrayList<Double>(); // 错误 - ArrayList<Double>不是List<Integer>的子类

        //List<? extends Integer> listExtendsInteger_ListNumber  = new ArrayList<Number>(); // 错误 - Number不是Integer的子类型
        List<? extends Integer> listExtendsInteger_ListInteger = new ArrayList<Integer>();
        //List<? extends Integer> listExtendsInteger_ListDouble  = new ArrayList<Double>(); // 错误 - Double不是Integer的子类型

        List<? super Integer> listSuperInteger_ListNumber = new ArrayList<Number>();
        List<? super Integer> listSuperInteger_ListInteger = new ArrayList<Integer>();
        //List<? super Integer> listSuperInteger_ListDouble  = new ArrayList<Double>(); // 错误 - Double不是Integer的父类型


        // 下面三行都存在编译错误，原因是无法获知List<? extends Number>泛型变量真正指向的对象的数据类型。
        //listExtendsNumber_ListNumber.add(3); // 错误 - 不能添加整数到可能的List<Double>, 即使指向一个List<Number>也不行。
        //listExtendsNumber_ListInteger.add(3);// 错误 - 不能添加整数到可能的List<Double>, 即使指向一个List<Integer>也不行。
        //listExtendsNumber_ListDouble.add(3); // 错误 - 不能添加整数到List<Double>

        listSuperNumber_ListNumber.add(3);       // ok - 可以添加整数到 List<Number> 或者 List<Object>

        listInteger_ListInteger.add(3);          // ok - 可以添加整数到未使用通配符的 List<Integer>

        //listExtendsInteger_ListInteger.add(3);   // 错误 - 不能添加整数到可能的List<X>，无法获知X的数据类型

        listSuperInteger_ListNumber.add(3);      // ok - 允许添加整数到 List<Integer>, List<Number>, or List<Object>
        listSuperInteger_ListInteger.add(3);     // ok - 允许添加整数到 List<Integer>, List<Number>, or List<Object>
    }
}
