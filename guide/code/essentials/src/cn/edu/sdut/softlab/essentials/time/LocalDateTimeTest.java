
package cn.edu.sdut.softlab.essentials.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * 本类演示了LocalDateTime类的用法 .
 *
 * @author Su Baochen
 */
public class LocalDateTimeTest {

	/**
	 * 程序执行入口.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {

		LocalDateTime today = LocalDateTime.now(); // |\longremark{获得当前的日期时间对象}|
		System.out.println("Current DateTime=" + today);

		//Current Date using LocalDate and LocalTime
		today = LocalDateTime.of(LocalDate.now(), LocalTime.now());// |\longremark{根据给定的LocalDate和LocalTime创建日期时间对象}|
		System.out.println("Current DateTime=" + today);

		LocalDateTime specificDate = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);// |\longremark{根据给定的日期和时间创建日期时间对象}|
		System.out.println("Specific Date=" + specificDate);

		LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));// |\longremark{根据给定的时区创建日期时间对象}|
		System.out.println("Current Date in IST=" + todayKolkata);

		LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);// |\longremark{从1970-1-1开始计算的日期时间对象}|
		System.out.println("10000th second time from 01/01/1970= " + dateFromBase);

	}
}
//|\showremarks|
