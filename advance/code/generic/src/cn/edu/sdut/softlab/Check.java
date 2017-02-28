package cn.edu.sdut.softlab;

/**
 * 本类演示了在泛型方法中直接使用泛型类的类型参数.
 * Created by subaochen on 16-12-25.
 */
public class Check<T> {
    public boolean check(T value) {
        return true;
    }

    public <U> U echo(U value) {
        return value;
    }
}
