package com.qf.zuoye.zy03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 学生成绩分析
 * @author XC
 *
 */
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入学生数量：");
		int n = sca.nextInt();
		double[] sorces = insert(n);
		Arrays.sort(sorces);
		double maxSorce = sorces[n - 1];
		double minSorce = sorces[0];
		double sum = sum(sorces);
		double avg = sum/n;
		System.out.printf("%d位学生的总成绩是:%.2f,最高成绩是:%.2f,最低成绩是:%.2f,平均成绩是:%.2f",n,sum,maxSorce,minSorce,avg);
	}

	/**
	 * n位学生成绩录入
	 */
	public static double[] insert(int n) {
		Scanner sca = new Scanner(System.in);
		double[] a = new double[n];
		System.out.println("请输入" + n + "位同学的成绩");
		for (int i = 0; i < a.length; i++) {
			a[i] = sca.nextDouble();
		}
		return a;
	}

	/**
	 * 求n位学生成绩总和
	 */
	public static double sum(double[] ds) {
		double sum = 0;
		for (double d : ds) {
			sum+=d;
		}
		return sum;

	}
}
