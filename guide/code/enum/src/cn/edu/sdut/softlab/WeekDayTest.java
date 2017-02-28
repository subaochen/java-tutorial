package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-20.
 */
public class WeekDayTest {
    public static void main(String[] args) {
        WeekDay sunday = WeekDay.SUNDAY;

        System.out.println("sunday is " + sunday);
        System.out.println("sunday'name is " + sunday.name());
        System.out.println("sunday'ordinal is " + sunday.ordinal());

        for(WeekDay day : WeekDay.values()) {
            System.out.println("day[" + day.ordinal() + "] is " + day);
        }
    }
}
