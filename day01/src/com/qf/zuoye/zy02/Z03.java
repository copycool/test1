package com.qf.zuoye.zy02;

import java.util.Scanner;

/**
 * ⽤⼾输⼊两个数a和b，如果a能被b整除或者a加b⼤于100，则输出a，否则输出b
 * 
 * @author XC
 *
 */
public class Z03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a;
		double  b;
		a = scanner.nextInt();
		b = scanner.nextDouble();
		String string;
		string = a % b == 0 || a + b > 100 ? "a:" + a : "b:" + b;
		System.out.println(string);
	}
	

}
