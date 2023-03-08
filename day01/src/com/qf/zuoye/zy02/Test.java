package com.qf.zuoye.zy02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入两个要计算的值：");
		int a = sca.nextInt();
		int b = sca.nextInt();
		System.out.println("请输入要计算的类型：1：+\t2：-\t3：*\t4：/\t");
		int c = sca.nextInt();
		if (a < b) {
			if (a < c) {
				System.out.println(a);
			} else if (c < b) {
				System.out.println(c);
			} else {
				System.out.println(b);
			}
		} else {
			if (b < c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
		switch (c) {
		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println(a - b);
			break;
		case 3:
			System.out.println(a * b);
			break;
		case 4:
			System.out.println(a / b);
			break;
		default:
			System.out.println("不支持这种计算");
			break;
		}

	}

}
