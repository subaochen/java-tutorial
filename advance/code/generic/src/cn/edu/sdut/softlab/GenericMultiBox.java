package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-24.
 */
public class GenericMultiBox<K, V> {
    private K key;
    private V value;

    public GenericMultiBox(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void info() {
        System.out.println(key + "=>" + value);
    }

    public static void main(String[] args) {
        GenericMultiBox<String,Integer> box = new GenericMultiBox<String, Integer>("age", 21);
        box.info();
    }
}
