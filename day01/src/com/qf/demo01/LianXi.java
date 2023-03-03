package com.qf.demo01;

import java.util.Scanner;

public class LianXi {
	public static final double E = Math.E;
	public static final double PI = Math.PI;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int x = 9;
		// double y = Math.sqrt(x);
		// // System.out.println(y);
		Scanner sca = new Scanner(System.in);
		// System.out.println("请输入i:");
		// int i = sca.nextInt();
		System.out.println("请输入f:");
		float f = sca.nextFloat();
		int y = Math.round(f);//round 返回类型是long需要强制类型转换 还可以直接返回int
		System.out.println(f + "f+i");
		System.out.println(y);
	}

}
