package com.qf.zuoye.zy01;

import java.util.Scanner;

/**
 * 定义⼀个华⽒度，转换成相应的摄⽒度输出。（转换规则：摄⽒度＝5/9*(华⽒度−32)）
 * 
 * @param args
 */
public class ZuoYe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f;
		double c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个华氏度：");
		f = scanner.nextInt();
		c = 5.0 / 9.0 * (f - 32);
//		c = (f - 32) * 5 / 9;
		System.out.printf("对应的摄氏度是：%.1f", c);
	}

}
