package com.qf.zuoye.zy02;

import java.util.Scanner;

/**
 * 如果年龄够7岁，或者年龄够5岁并且性别是“男”，就可以搬动桌⼦
 * 
 * @author XC
 *
 */
public class Z01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String gender, result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年龄：");
		age = scanner.nextInt();
		System.out.println("请输入性别：");
		gender = scanner.next();
		result = age >= 5 && gender.equals("男") ? "可以搬动桌子" : age >= 7 ? "可以搬动桌子" : "不可以搬动桌子";
		System.out.println(result);
	}

}
