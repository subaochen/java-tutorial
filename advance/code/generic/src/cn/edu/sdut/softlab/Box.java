package cn.edu.sdut.softlab;

public class Box {
    private Object value;

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setValue(123); //|\longremark{这里利用了Java的自动装箱机制：整数123自动转换为Integer对象}|
        System.out.println("456 + box' value = " + (456 + (Integer) box.getValue())); //|\longremark{我们知道box的value是一个整数，因此在这里进行了强制类型转换}|
        box.setValue("123"); // |\longremark{字符串123作为setValue的参数是可以的}|
        System.out.println("456 + box' value = " + (456 + (Integer.valueOf(box.getValue().toString()))));
        System.out.println("456 + box' value = " + (456 + (Integer) box.getValue())); //|\longremark{字符串对象无法自动转换为整数对象，因此运行时抛出异常}|
    }
} //|\showremarks|
