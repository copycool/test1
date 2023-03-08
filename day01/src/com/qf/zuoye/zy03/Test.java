package com.qf.zuoye.zy03;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5] ;
		int num =0;
		double avg =0;
		for (int j = 0; j < 5; j++) {
			System.out.println("请输入第"+(j+1)+"位同学的成绩");
			a[j] = sc.nextInt();
			num +=a[j];
		}
		Arrays.sort(a);
		avg = num/5.0;
		System.out.println("总分是："+num);
		System.out.printf("平均分是：%.2f\n",avg);
		System.out.println("最高分："+a[4]);
		System.out.println("最低分："+a[0]);
	}

}
