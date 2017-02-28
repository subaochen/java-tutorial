
package cn.edu.sdut.softlab.essentials.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 本类演示了DateTimeFormatter的常见用法 .
 *
 * @author Su Baochen
 */
public class DateTimeFormatterTest {

	/**
	 * 程序执行入口.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {

		//Format examples
		LocalDate date = LocalDate.now();
		//default format
		System.out.println("Default format of LocalDate=" + date);
		//specific format
		System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
		System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

		LocalDateTime dateTime = LocalDateTime.now();
		//default format
		System.out.println("Default format of LocalDateTime=" + dateTime);
		//specific format
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
		System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

		//Parse examples
		LocalDateTime dt = LocalDateTime.parse("27::04::2014 21::39::48",
				DateTimeFormatter.ofPattern("d::MM::uuuu HH::mm::ss"));
		System.out.println("Default format after parsing = " + dt);
	}
}
