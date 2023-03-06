package com.qf.zuoye.zy01;

import java.util.Scanner;

/**
 * 从键盘输⼊三⻆形的底和⾼，并输出三⻆形的⾯积。
 * 
 * @author XC
 *
 */
public class ZuoYe05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a , b, s;
		System.out.println("请输入三角型的底：");
		a=scanner.nextDouble();
		System.out.println("请输入三角型的高：");
		b=scanner.nextDouble();
		s = a * b / 2;
		System.out.printf("三角形面积：%.2f",s);

	}

}
