
package cn.edu.sdut.softlab.essentials.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * 本类演示了Java8的LocalDate的用法 .
 *
 * @author 参考了： http://www.importnew.com/14140.html
 */
public class LocalDateTest {

	/**
	 * 程序执行入口.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {

		LocalDate today = LocalDate.now(); // |\longremark{获取当前日期}|
		System.out.println("Current Date=" + today);

		LocalDate firstDay2016 = LocalDate.of(2016, Month.JANUARY, 1); // |\longremark{给定年月日创建特定日期对象}|
		System.out.println("Specific Date=" + firstDay2016);


		//LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29); // |\longremark{给定日期不合法}|
		//Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata")); // |\longremark{根据时区获取当前日期}|
		System.out.println("Current Date in IST=" + todayKolkata);


		//LocalDate todayIST = LocalDate.now(ZoneId.of("IST")); // |\longremark{给定时区不合法}|
		LocalDate dateFromBase = LocalDate.ofEpochDay(365); // |\longremark{从1970-1-1开始计算}|
		System.out.println("365th day from base date= " + dateFromBase);

		LocalDate hundredDay2016 = LocalDate.ofYearDay(2016, 100); // |\longremark{从给定年份开始计算}|
		System.out.println("100th day of 2016=" + hundredDay2016);

		LocalDate one = LocalDate.parse("2016-11-21"); //|\longremark{将字符串解析为LocalDate对象}|
		LocalDate two = LocalDate.parse("2016-11-22");
		System.out.println("2016-11-21 parsed to LocalDate = " + one);
		System.out.println("2016-11-21 < 2016-11-22 ? " + one.isBefore(two));
		System.out.println("2016-11-21 < 2016-11-21 ? " + one.isBefore(one));
		System.out.println("2016-11-22 > 2016-11-21 ? " + two.isAfter(one));
	}
}
// |\showremarks|
