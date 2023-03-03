package com.qf.demo01;

import java.util.Scanner;

public class MathQuYu {

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
