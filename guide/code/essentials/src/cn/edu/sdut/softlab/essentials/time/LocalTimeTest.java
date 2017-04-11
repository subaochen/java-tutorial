
package cn.edu.sdut.softlab.essentials.time;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * 本类演示了LocalTime类的常见用法 .
 *
 * @author Su Baochen
 */
public class LocalTimeTest {

    /**
     * 程序执行入口.
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();// |\longremark{获取当前时间}|
        System.out.println("Current Time=" + time);

        LocalTime specificTime = LocalTime.of(12, 20, 25, 40); // |\longremark{根据给定时间创建时间对象}|
        System.out.println("Specific Time of Day=" + specificTime);

        LocalTime timeShanghai = LocalTime.now(ZoneId.of("Asia/Shanghai")); // |\longremark{根据给定时区创建时间对象}|
        System.out.println("Current Time in CST=" + timeShanghai);

        //Getting date from the base date i.e 01/01/1970
        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);// |\longremark{获得从1970-1-1开始计算的时间}|
        System.out.println("10000th second time= " + specificSecondTime);

        LocalTime one = LocalTime.parse("12:30:55"); //|\longremark{将字符串解析为LocalTime对象}|
        LocalTime two = LocalTime.parse("13:02:15");
        //LocalTime three = LocalTime.parse("2016-1-1 13:02:15"); // 格式错误
        System.out.println("12:30:55 parsed to LocalDate = " + one);
        System.out.println("12:30:55 < 13:02:15 ? " + one.isBefore(two));
        System.out.println("12:30:55 < 12:30:55 ? " + one.isBefore(one));
        System.out.println("13:02:15 > 12:30:55 ? " + two.isAfter(one));
    }
}
// |\showremarks|
