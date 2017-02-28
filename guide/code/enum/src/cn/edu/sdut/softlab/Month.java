package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-22.
 */
public enum Month {
    JAN(31),FEB(28),MAR(31);

    private int days;
    Month(int days) {
        this.days = days;
    }

    public int days() {
        return this.days;
    }
}
