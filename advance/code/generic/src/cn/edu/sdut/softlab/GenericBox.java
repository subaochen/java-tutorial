package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-23.
 */
public class GenericBox<T> {
    private T value;

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericBox<Integer> box = new GenericBox<Integer>();
        box.setValue(123); //|\longremark{这里利用了Java的自动装箱机制：整数123自动转换为Integer对象}|
        System.out.println("456 + box' value = " + (456 + box.getValue())); //|\longremark{box的value是一个整数，因此这里无须进行强制类型转换}|
        //box.setValue("123"); // |\longremark{box的value是整数类型的，因此在这里使用字符串123是非法的}|
        GenericBox<String> sbox = new GenericBox<String>(); //|\longremark{创建一个使用字符串的sbox对象}|
        sbox.setValue("123");
        System.out.println("456 + box' value = " + (456 + (Integer.valueOf(box.getValue()))));
    }
} //|\showremarks|
