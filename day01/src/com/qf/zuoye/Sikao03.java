package com.qf.zuoye;

import java.util.Scanner;

/**
 * 输⼊三⻆形的三条边，判断是否能构成三⻆形，如果能输出能够成三⻆形，如果不能输出不能 构成三⻆形
 * 
 * @author XC
 *
 */
public class Sikao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		System.out.println("请输入三条边的长度：");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		boolean flag = a + b > c && a + c > b && b + c > a;
		String result=flag?"能够构成三角型":"不能 构成三⻆形";
		System.out.println(result);

	}

}
