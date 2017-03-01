package cn.edu.sdut.softlab.exception;

import java.time.LocalDate;
import java.util.Scanner;

public class WhatIfNoException {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Please input date:");
		String str = console.nextLine();

		while (!str.equalsIgnoreCase("*")) { // 输入*表示结束
			System.out.println(LocalDate.parse(str));
			System.out.print("Please input date:");
			str = console.nextLine();
		}
	}
}
