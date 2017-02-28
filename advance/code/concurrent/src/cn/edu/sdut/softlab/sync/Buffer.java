package cn.edu.sdut.softlab.sync;

/**
 * Created by subaochen on 17-2-13.
 */
public class Buffer {
    private int value;
    private boolean isEmpty = true;

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
