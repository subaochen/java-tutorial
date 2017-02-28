package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-23.
 */
public class GenericBoxExtended<T extends Number> { // |\longremark{T必须是Number类或者Number类的子类}|
    private T value;

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericBoxExtended<Integer> boxInt = new GenericBoxExtended<Integer>();
        boxInt.setValue(123); //|\longremark{这里利用了Java的自动装箱机制：整数123自动转换为Integer对象}|
        System.out.println("456 + box' value = " + (456 + boxInt.getValue())); //|\longremark{box的value是一个整数，因此这里无须进行强制类型转换}|
        GenericBoxExtended<Double> boxDouble = new GenericBoxExtended<Double>();
        boxDouble.setValue(123.4);

        //GenericBoxExtended<String> sbox = new GenericBoxExtended<String>(); //|\longremark{由于GenericBoxExtends的类型参数限定了必须是Number的子类，因此这里使用String是非法的}|
    }
} //|\showremarks|
