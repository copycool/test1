package com.qf.zuoye.zy01;

import java.util.Scanner;
/**
 * 定义⼀个四位整数，分别输出其个位、⼗位和百位、千位
 * 
 * @param args
 */
public class ZuoYe03 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int g, s, b, q;
		System.out.println("请输入num：");
		int num = scanner.nextInt();
		g = num % 10;
		s = num / 10 % 10;
		b = num / 100 % 10;
		q = num / 1000;
		System.out.printf("num的个位是%d，十位是%d,百位是%d，千位是%d", g, s, b, q);
	}

}
